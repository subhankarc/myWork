package com.sap.casestudy.ui.editor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchWindow;

public class LaunchEditor implements IWorkbenchWindowActionDelegate {
	
	private WorkbenchWindow window;

	@Override
	public void run(IAction action) {
IEditorInput input = null;
try {
	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, "com.sap.casestudy.subhankar.ui.business_object_editor");
} catch (PartInitException e) {
	e.printStackTrace();
}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}

}
