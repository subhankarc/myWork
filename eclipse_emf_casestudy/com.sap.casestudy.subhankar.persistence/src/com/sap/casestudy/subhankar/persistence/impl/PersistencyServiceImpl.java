package com.sap.casestudy.subhankar.persistence.impl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;

public class PersistencyServiceImpl implements IPersistencyService {

	
	private static final String dot = ".";

	public String parentPath;

	
	
	public PersistencyServiceImpl(String parentPath) {
		this.setParentPath(parentPath);
	}

	private ResourceSet createResourceSet() {
		ResourceSet resSet = new ResourceSetImpl();
		for (FileExtensionEnum fileExtension : FileExtensionEnum.values()) {
			resSet.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(fileExtension.getLiteral(),
							new XMIResourceFactoryImpl());
		}
		return resSet;
	}

	@Override
	public List<DeploymentUnit> load(IPath path) {
		ResourceSet resourceSet = createResourceSet();
		List<DeploymentUnit> list = new ArrayList<DeploymentUnit>();
		File[] filesInPath = getInternalFiles(path);
		Resource resource = null;
		if(filesInPath !=null){
		try {
			for (File file : filesInPath) {
				resource = resourceSet.getResource(
						URI.createFileURI(file.getAbsolutePath()), true);
				list.add((DeploymentUnit) resource.getContents().get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

		return list;
	}

	private File[] getInternalFiles(IPath path) {
		File projectFile = new File(getParentPath());
		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(dot
						+ FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION
								.getLiteral());
			}
		};
		return projectFile.listFiles(filter);
	}

	@Override
	public boolean save(IAdtMainObject object, IPath relativeParentPath) {
		ResourceSet resourceSet = createResourceSet();
		createResource(object, resourceSet, relativeParentPath);
		saveResource(resourceSet);
		return true;
	}

	

	public void setParentPath(String path) {
		this.parentPath = path;
	}

	public String getParentPath() {
		return parentPath;
	}

	private void createResource(IAdtMainObject object, ResourceSet resourceSet,
			IPath relativeParentPath) {
		Resource resource = getResource(object, relativeParentPath, resourceSet);
		if (resource == null) {
			resource = resourceSet.createResource(URI
					.createFileURI(getParentPath() 
							+ IPath.SEPARATOR + object.getTechnicalName()
							+ dot + object.getFileExtension().getLiteral()));
		}
		if (!resource.getContents().contains(object)){
			resource.getContents().clear();
			resource.getContents().add(object);	
		}
	}

	private Resource getResource(IAdtMainObject object,
			IPath relativeParentPath, ResourceSet resourceSet) {
		try {
			return resourceSet.getResource(
					URI.createFileURI(getParentPath()
							+ IPath.SEPARATOR + object.getTechnicalName()
							+ dot + object.getFileExtension().getLiteral()),
					true);
		} catch (Exception e) {
			return null;
		}
	}

	
	private boolean saveResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

}
