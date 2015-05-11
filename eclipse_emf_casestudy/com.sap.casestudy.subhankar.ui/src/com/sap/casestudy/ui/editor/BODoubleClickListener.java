package com.sap.casestudy.ui.editor;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.PlatformUI;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;

public class BODoubleClickListener implements IDoubleClickListener {
	public static HashMap<BusinessObject, BusinessObjectEditor> openEditors = new HashMap<BusinessObject, BusinessObjectEditor>();
	MTSEditorInput input;

	@Override
	public void doubleClick(DoubleClickEvent event) {
		BusinessObject businessObject = null;
		ITreeSelection treeSelection = (ITreeSelection) event.getSelection();
		IProject project = null;
		if (treeSelection != null && treeSelection.getFirstElement() instanceof BusinessObject) {
			businessObject = (BusinessObject) treeSelection.getFirstElement();
			project = (IProject) treeSelection.getPaths()[0].getSegment(0);
			input = new MTSEditorInput(project, businessObject);
			try {
				if (openEditors.containsKey(businessObject)) {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(openEditors.get(businessObject));
				} else {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, "com.sap.casestudy.subhankar.ui.business_object_editor");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
