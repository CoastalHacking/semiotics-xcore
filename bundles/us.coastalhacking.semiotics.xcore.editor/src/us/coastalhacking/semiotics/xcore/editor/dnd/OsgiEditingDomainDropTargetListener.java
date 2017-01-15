package us.coastalhacking.semiotics.xcore.editor.dnd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

import us.coastalhacking.semiotics.xcore.model.presentation.SemioticsEditorPlugin;
import us.coastalhacking.semiotics.xcore.model.service.Controller;

public class OsgiEditingDomainDropTargetListener implements DropTargetListener {

	public OsgiEditingDomainDropTargetListener(EditingDomain domain) {
		this.domain = domain;
	}

	/*
	 * Editing domain used when creating edit commands
	 */
	protected EditingDomain domain;

	/*
	 * Preferred transfer, reset when drag leave is called
	 */
	protected int preferred = Integer.MAX_VALUE;

	/*
	 * Ordered list of preferred Transfers
	 */
	protected Transfer[] preferredTransfers = new Transfer[]{
			LocalTransfer.getInstance(),
			LocalSelectionTransfer.getTransfer(),
			TextTransfer.getInstance(),
			FileTransfer.getInstance()
	};

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dragEnter(org.eclipse.swt.dnd.DropTargetEvent)
	 * 
	 * Currently support copy operations only.
	 */
	@Override
	public void dragEnter(DropTargetEvent event) {
		switch (event.detail) {
		case DND.DROP_COPY:
			break;
		default:
			event.detail = ((event.operations & DND.DROP_COPY) != 0) ? DND.DROP_COPY : DND.DROP_NONE;
		}
		if (event.detail == DND.DROP_NONE) return;

		// Set the current data type now
		setCurrentDataType(event);

		Controller controller = SemioticsEditorPlugin.getPlugin().getController();
		Object source = extractSourceViaTransfer(event);
		if (controller != null) {
			if (!controller.isSourceSupported(source))
				event.detail = DND.DROP_NONE;
		} else {
			event.detail = DND.DROP_NONE;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dragLeave(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dragLeave(DropTargetEvent event) {
		this.preferred = Integer.MAX_VALUE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dragOperationChanged(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dragOperationChanged(DropTargetEvent event) {}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dragOver(org.eclipse.swt.dnd.DropTargetEvent)
	 * 
	 * Drag over events are the first (and many of) events to contain a potential target 
	 * 
	 */
	@Override
	public void dragOver(DropTargetEvent event) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#drop(org.eclipse.swt.dnd.DropTargetEvent)
	 * 
	 * 
	 */
	@Override
	public void drop(DropTargetEvent event) {
		Controller controller = SemioticsEditorPlugin.getPlugin().getController();
		if (controller != null) {
			Object target = extractDropTarget(event.item);
			Collection<?> sources = controller.transform(event.data, target);
			Command command = DragAndDropCommand.create(domain, target, getLocation(event), event.operations, event.detail, sources);
			if (command.canExecute()) {
				domain.getCommandStack().execute(command);
			} else {
				event.detail = DND.DROP_NONE;
				command.dispose();
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dropAccept(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dropAccept(DropTargetEvent event) {

	}

	/**
	 * Sets the current data type on the event based on the preferred ordering
	 * 
	 * @param event
	 */
	public void setCurrentDataType(DropTargetEvent event) {
		int selected = Integer.MIN_VALUE;
		for (int i=0; i < event.dataTypes.length; i++) {
			for (int j=0; j < preferredTransfers.length; j++) {
				// We already hit a more preferred type on this or a previous loop
				if (preferred <= j)
					break;

				// We have a new preference
				if (preferredTransfers[j].isSupportedType(event.dataTypes[i]) && j < preferred) {
					preferred = j;
					selected = i;
				}
			}
		}
		if (selected != Integer.MIN_VALUE)
			event.currentDataType = event.dataTypes[selected];
	}

	/*
	 * Silly helper method since ByteArrayTransfer.nativeToJava is not public
	 */
	protected Object extractSourceViaTransfer(DropTargetEvent event) {
		Object result = null;
		Transfer transfer = preferredTransfers[preferred];
		try {
			Method nativeToJava = transfer.getClass().getDeclaredMethod("nativeToJava", TransferData.class);
			nativeToJava.setAccessible(true);
			result = nativeToJava.invoke(transfer, event.currentDataType);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 
	 * !!!CODE COPY, UPDATE LICENSE!!!
	 * Copied from org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter.extractDropTarget(Widget)
	 * 
	 * This extracts an object from the given item widget, providing the special
	 * support required by an 
	 * {@link org.eclipse.emf.common.ui.viewer.ExtendedTableTreeViewer.ExtendedTableTreeItem}.
	 */
	@SuppressWarnings("deprecation")
	protected Object extractDropTarget(Widget item)
	{
		if (item == null) return null;
		return item.getData(org.eclipse.emf.common.ui.viewer.ExtendedTableTreeViewer.ITEM_ID) instanceof Item ?
				((Item)item.getData(org.eclipse.emf.common.ui.viewer.ExtendedTableTreeViewer.ITEM_ID)).getData() :
					item.getData();
	}

	/**
	 * 
	 * !!!CODE COPY, UPDATE LICENSE!!!
	 * Copied from org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter.getLocation(DropTargetEvent)
	 * 
	 * This returns the location of the mouse in the vertical direction, relative
	 * to the item widget, from 0 (top) to 1 (bottom).
	 */
	protected float getLocation(DropTargetEvent event) 
	{
		if (event.item instanceof TreeItem)
		{
			TreeItem treeItem = (TreeItem)event.item;
			Control control = treeItem.getParent();
			Point point = control.toControl(new Point(event.x, event.y));
			Rectangle bounds = treeItem.getBounds();
			return (float)(point.y - bounds.y) / (float)bounds.height;
		}
		else if (event.item instanceof TableItem)
		{
			TableItem tableItem = (TableItem)event.item;
			Control control = tableItem.getParent();
			Point point = control.toControl(new Point(event.x, event.y));
			Rectangle bounds = tableItem.getBounds(0);
			return (float)(point.y - bounds.y) / (float)bounds.height;
		}
		else
		{
			return 0.0F;
		}
	}

}
