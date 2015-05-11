package com.sap.casestudy.subhankar.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.IAdtObject;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.util.ImageUtilityClass;

public class MTSLabelProvider implements ILabelProvider {
	
	@Override
	public Image getImage(Object element) {
		Image image = null;
		if (element instanceof IProject) {
			image = ImageUtilityClass.getImage(ImageUtilityClass.ICON_MTS_PROJECT);
		} else if (element instanceof ITreeNode) {
			return ((ITreeNode) element).getImage();
		} else if (element instanceof DeploymentUnit) {
			image = ImageUtilityClass.getImage(ImageUtilityClass.ICON_DEPLOYMENT_UNIT);
		} else if (element instanceof ProcessComponent) {
			image = ImageUtilityClass.getImage(ImageUtilityClass.ICON_PROCESS_COMPONENT);
		} else if (element instanceof BusinessObject) {
			image = ImageUtilityClass.getImage(ImageUtilityClass.ICON_BUSINESS_OBJECT);
		}
		return image;
	}
	@Override
	public String getText(Object element) {
		if (element instanceof IProject) {
			return ((IProject) element).getName();
		} else if (element instanceof IAdtObject) {
			return ((IAdtMainObject) element).getTechnicalName();
		} else if (element instanceof ITreeNode) {
			return ((ITreeNode) element).getNodeLabel();
		}
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

}
