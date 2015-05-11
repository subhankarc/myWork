package com.sap.casestudy.subhankar.ui.views;

import org.eclipse.swt.graphics.Image;

import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.ImageUtilityClass;

public class BOTreeNode implements ITreeNode {
	private ProcessComponent processComponent;
	private final String nodeLabel = IMTSConstants.BUSINESS_OBJECTS;

	public BOTreeNode(ProcessComponent processComponent) {
		this.processComponent = processComponent;
	}

	@Override
	public String getNodeLabel() {
		return nodeLabel;
	}

	public Object[] getBusinessObjects() {
		return processComponent.getBusinessObjects().toArray();
	}

	public ProcessComponent getProcessComponent() {
		return processComponent;
	}

	@Override
	public Object[] getChildren() {
		return getBusinessObjects();
	}

	@Override
	public Image getImage() {
		return ImageUtilityClass.getImage(ImageUtilityClass.ICON_BUSINESS_OBJECTS);
	}

	@Override
	public boolean hasChildren() {
		return !(getBusinessObjects().length == 0);
	}

	@Override
	public String toString() {
		return "";
	}
	

}
