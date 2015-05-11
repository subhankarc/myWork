package com.sap.casestudy.subhankar.ui.views;

import org.eclipse.swt.graphics.Image;

public interface ITreeNode {
	
	public String getNodeLabel();
	public Object[] getChildren();
	public Image getImage();
	public boolean hasChildren();


}
