package us.coastalhacking.semiotics.xcore.editor.dnd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

import us.coastalhacking.semiotics.xcore.model.presentation.SemioticsEditorPlugin;
import us.coastalhacking.semiotics.xcore.model.transformation.Controller;

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

	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.DropTargetAdapter#dropAccept(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dropAccept(DropTargetEvent event) {
		Controller controller = SemioticsEditorPlugin.getPlugin().getController();
		if (controller != null) {
			// final Collection<?> results = controller.transform(source, target);
		}
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
}
