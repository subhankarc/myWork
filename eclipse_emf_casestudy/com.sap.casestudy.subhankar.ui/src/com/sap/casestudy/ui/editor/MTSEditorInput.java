package com.sap.casestudy.ui.editor;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.ui.util.ImageUtilityClass;

public class MTSEditorInput implements IEditorInput {
	private IProject project;
	private BusinessObject businessObject;
	
	public MTSEditorInput(IProject project, BusinessObject businessObject) {
		this.project = project;
		this.businessObject = businessObject;
		}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return ImageUtilityClass.getImageDescriptor(ImageUtilityClass.ICON_BUSINESS_OBJECT);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return businessObject.getTechnicalName();
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "Business Object Editor";
	}
	
	public BusinessObject getBusinessObject() {
		return businessObject;
	}

	public IProject getProject() {
		return project;
	}
	

}
