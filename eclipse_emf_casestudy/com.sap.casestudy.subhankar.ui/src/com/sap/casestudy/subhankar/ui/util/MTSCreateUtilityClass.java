package com.sap.casestudy.subhankar.ui.util;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelFactory;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum;
import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;
import com.sap.casestudy.subhankar.ui.views.DUTreeNode;
import com.sap.casestudy.subhankar.ui.views.PCTreeNode;

public final class MTSCreateUtilityClass {
	private static MTSCreateUtilityClass instance;

	private MTSTreeUtilityClass treeUtil;
	ProcessComponent processComponent;
	PCTreeNode processComponentTreeNode;
	DeploymentUnit du;

	private MTSCreateUtilityClass() {

	}

	public static MTSCreateUtilityClass getCreateUtilClass() {
		if (instance == null) {
			instance = new MTSCreateUtilityClass();
		}
		return instance;
	}

	public MTSTreeUtilityClass getTreeUtil() {
		if (treeUtil == null) {
			treeUtil = new MTSTreeUtilityClass();
		}
		return treeUtil;
	}

	public List<DeploymentUnit> getDeploymentUnits(IProject project) {
		CasestudymodelPackage.eINSTANCE.eClass();
		IPersistencyService persistService = IPersistenceFactory.implinstance
				.getInstance(project.getLocation().toOSString());
		return persistService.load(project.getFullPath());

	}


	public boolean refreshWorkspace() {
		try {
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, null);
			return true;
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public boolean createDU(IProject project, String technicalName,
			String abbreviationName, String semanticName) {
		CasestudymodelFactory casestudyFactory = CasestudymodelFactory.eINSTANCE;
		IPersistencyService persistService = IPersistenceFactory.implinstance
				.getInstance(project.getLocation().toOSString());
		DeploymentUnit deploymentUnit = casestudyFactory.createDeploymentUnit();
		deploymentUnit
				.setFileExtension(FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
		deploymentUnit.setTechnicalName(technicalName);
		deploymentUnit.setAbbreviatonName(abbreviationName);
		deploymentUnit.setSemanticName(semanticName);
		DUTreeNode deploymentUnitTreeNode = ((DUTreeNode) getTreeUtil()
				.getDUTreeNodes(project)[0]);
		if (deploymentUnitTreeNode.isDeploymentUnitExist(deploymentUnit)) {
			return false;
		}
		persistService.save(deploymentUnit, project.getFullPath());
		deploymentUnitTreeNode.addDeplomentUnit(deploymentUnit);
		return true;
	}

	public boolean createBO(IProject project, ProcessComponent processComponent, String technicalName,
			int objectCategory,
			String providerInterface, String providerClass) {
		CasestudymodelFactory casestudyFactory = CasestudymodelFactory.eINSTANCE;
		IPersistencyService persistService = IPersistenceFactory.implinstance
				.getInstance(project.getLocation().toOSString());
		BusinessObject businessObject = casestudyFactory.createBusinessObject();
		businessObject
				.setFileExtension(FileExtensionEnum.BUSINESS_OBJECT_EXTENSION);
		businessObject.setTechnicalName(technicalName);
		businessObject.setObjectCategory(BusinessObjectCategoryEnum.get(objectCategory));
		businessObject.setProviderInterface(providerInterface);
		businessObject.setProviderClass(providerClass);
		businessObject.setProcessComponent(processComponent);

		persistService.save(businessObject, project.getFullPath());
		persistService.save(processComponent, project.getFullPath());
		return true;
	}

	public boolean createPC(IProject project, DeploymentUnit du,
			String technicalName, String code, String namekeyName,
			String namekeyNamespace, int category) {
		CasestudymodelFactory casestudyFactory = CasestudymodelFactory.eINSTANCE;
		IPersistencyService persistService = IPersistenceFactory.implinstance
				.getInstance(project.getLocation().toOSString());
		ProcessComponent processComponent = casestudyFactory.createProcessComponent();
		processComponent
				.setFileExtension(FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
		processComponent.setTechnicalName(technicalName);
		processComponent.setCode(code);
		processComponent.setNameKeyName(namekeyName);
		processComponent.setNameKeyNamespace(namekeyNamespace);
		processComponent.setCategory(ProcessComponentCategoryEnum.get(category));
		processComponent.setDeploymentUnit(du);
		
		persistService.save(processComponent, project.getFullPath());
		persistService.save(du, project.getFullPath());
		return true;
	}


}
