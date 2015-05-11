package com.sap.casestudy.subhankar.ui.util;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ImageUtilityClass {
	public static final String ICON_PATH = "icons";
	public static final String ICON_MTS_PROJECT = "abap_project.gif";
	public static final String ICON_DEPLOYMENT_UNITS = "deployment_units.gif";
	public static final String ICON_DEPLOYMENT_UNIT = "deployment_unit.gif";
	public static final String ICON_PROCESS_COMPONENTS = "process_components.gif";
	public static final String ICON_PROCESS_COMPONENT = "process_component.gif";
	public static final String ICON_BUSINESS_OBJECTS = "business_objects.gif";
	public static final String ICON_BUSINESS_OBJECT = "business_object.gif";
	
	private static final ImageRegistry IMAGE_CACHE = new ImageRegistry();
	private static final String FILE_SEPARATOR = IPath.SEPARATOR + "";
	
	public static Image getImage(String imageFileName) {
		Image image = IMAGE_CACHE.get(imageFileName);
		if(image==null){
			image = getImageDescriptor(imageFileName).createImage();
			IMAGE_CACHE.put(imageFileName, image);
		}
		return image;
	}
	
	public static ImageDescriptor getImageDescriptor(String imageFileName){
		return AbstractUIPlugin.imageDescriptorFromPlugin("com.sap.casestudy.subhankar.ui", ICON_PATH + FILE_SEPARATOR + imageFileName);
	}
}


