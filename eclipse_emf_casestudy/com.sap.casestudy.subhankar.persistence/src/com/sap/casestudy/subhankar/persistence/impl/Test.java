/*package com.sap.casestudy.subhankar.persistence.impl;

import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.casestudymodelFactory;
import com.sap.casestudy.subhankar.casestudymodel.casestudymodelPackage;
import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;

public class Test {
	
	
	private static void setModelData ( IAdtMainObject obj, String id, String name,
			FileExtensionEnum extension) {
		obj.setId(id);
		obj.setTechnicalName(name);
		obj.setFileExtension(extension);
	}
	
	
	public static void main(String[] args) {

		casestudymodelPackage.eINSTANCE.eClass();
		casestudymodelFactory factory = casestudymodelFactory.eINSTANCE;

		

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("du", new XMIResourceFactoryImpl());
		m.put("pc", new XMIResourceFactoryImpl());
		m.put("bo", new XMIResourceFactoryImpl());
		
		
		
		
		IPersistencyService per = IPersistenceFactory.implinstance.getInstance("C:/project");
		//per.setParentPath("C:/project");
		
		
		
		

		DeploymentUnit du = factory.createDeploymentUnit();
		setModelData(du, "deploy2", "deploy2",
				FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
		ProcessComponent pc = factory.createProcessComponent();
		pc.setDeploymentUnit(du);
		setModelData(pc, "pc1", "pc1",
				FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
		ProcessComponent pc2 = factory.createProcessComponent();
		pc2.setDeploymentUnit(du);
		setModelData(pc2, "pc2", "pc2",
				FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
		per.saveAll(du, new Path("/project"));
	}	
		
		
		
		
//		ResourceSet resSet = new ResourceSetImpl();
//		Resource resource = resSet.createResource(URI
//				.createFileURI("c:/temp/du/my2.du"));
//		resource.getContents().add(du);
//		try {
//			resource.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	

}
*/