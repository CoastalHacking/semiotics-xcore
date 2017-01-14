package us.coastalhacking.semiotics.xcore.editor.dnd;

import java.util.Collection;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;

import us.coastalhacking.semiotics.xcore.model.presentation.SemioticsEditorPlugin;
import us.coastalhacking.semiotics.xcore.model.transformation.Controller;

public class OsgiEditingDomainViewerDropAdapter extends EditingDomainViewerDropAdapter {

	DropTargetEvent tempEvent;;

	public OsgiEditingDomainViewerDropAdapter(EditingDomain domain, Viewer viewer) {
		super(domain, viewer);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#dragEnter(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void dragEnter(DropTargetEvent event) {
		// If the event can support copy, but is trying to move, change to copy.
		// If the drop source disallows DROP_MOVE and the drag source prefers DROP_MOVE
		// the event detail will then be DROP_NONE, which disallows dropping :-/
		// Modified from org.eclipse.emf.edit.command.DragAndDropCommand.prepareDropInsert()
		if (event.detail != DND.DROP_COPY && event.detail != DND.DROP_LINK && (event.operations & DND.DROP_COPY) != 0) {
			event.detail = DND.DROP_COPY;
		}

		super.dragEnter(event);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#drop(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public void drop(DropTargetEvent event) {

		// Cache event (thread safe?)
		tempEvent = event;
		
		// Call super as normal
		super.drop(event);
		
		// remove cache
		tempEvent = null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#extractDragSource(java.lang.Object)
	 */
	@Override
	protected Collection<?> extractDragSource(Object object) {
		
		Controller controller = SemioticsEditorPlugin.getPlugin().getController();
		if (controller != null) {
			return controller.transform(object, extractDropTarget(tempEvent.item));
		}

		return super.extractDragSource(object);
	}

}
