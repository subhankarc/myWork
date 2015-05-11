package com.sap.casestudy.subhankar.ui.views;

import org.eclipse.swt.graphics.Image;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.ImageUtilityClass;

public class PCTreeNode implements ITreeNode{

	private DeploymentUnit deploymentUnit;
	private final String nodeLabel = IMTSConstants.PROCESS_COMPONENTS;
	

	public PCTreeNode(DeploymentUnit deploymentUnit) {
		this.deploymentUnit = deploymentUnit;
	}

	@Override
	public String getNodeLabel() {
		return nodeLabel;
	}

	public Object[] getProcessComponents() {
		return deploymentUnit.getProcessComponents().toArray();
	}

	public DeploymentUnit getDeploymentUnit() {
		return deploymentUnit;
	}

	@Override
	public Object[] getChildren() {
		return getProcessComponents();
	}

	@Override
	public Image getImage() {
		return ImageUtilityClass.getImage(ImageUtilityClass.ICON_PROCESS_COMPONENTS);
	}

	@Override
	public boolean hasChildren() {
		return !(getProcessComponents().length == 0);
	}
	
	@Override
	public String toString() {
		return "";
	}


}
