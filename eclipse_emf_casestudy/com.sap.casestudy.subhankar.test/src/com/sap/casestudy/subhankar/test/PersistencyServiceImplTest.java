package com.sap.casestudy.subhankar.test;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.Before;
import org.junit.Test;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelFactory;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;
public class PersistencyServiceImplTest {
	
	
	private CasestudymodelFactory fac = null;
	private IPersistencyService per = null;
	
	
	@Before
	public void setUp() throws Exception {
		CasestudymodelPackage.eINSTANCE.eClass();
		fac = CasestudymodelFactory.eINSTANCE;
		per = IPersistenceFactory.implinstance.getInstance("C:\\temp");
		//per.setParentPath("C:\\temp");
	}

	 @Test
		public void testDUSave() {
			DeploymentUnit du = fac.createDeploymentUnit();
			setModelData(du, "deploy1", "deploy1",
					FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
			assertTrue(per.save(du, new Path("/project")));

		}

		@Test
		public void testPCSave() {
			DeploymentUnit du = fac.createDeploymentUnit();
			setModelData(du, "deploy2", "deploy2",
					FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
			ProcessComponent pc = fac.createProcessComponent();
			pc.setDeploymentUnit(du);
			setModelData(pc, "pc1", "pc1",
					FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
			ProcessComponent pc2 = fac.createProcessComponent();
			pc2.setDeploymentUnit(du);
			setModelData(pc2, "pc2", "pc2",
					FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
			//per.saveAll(du, new Path("/project"));

		}
		@Test
		public void testBOSave() {
			DeploymentUnit du1 = fac.createDeploymentUnit();
			setModelData(du1, "deploy3", "deploy3",
					FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
			ProcessComponent pc1 = fac.createProcessComponent();
			pc1.setDeploymentUnit(du1);
			setModelData(pc1, "process1", "process1",
					FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
			BusinessObject bo1 = fac.createBusinessObject();
			bo1.setProcessComponent(pc1);
			setModelData(bo1, "bo1", "bo1",
					FileExtensionEnum.BUSINESS_OBJECT_EXTENSION);
			//per.saveAll(du1, new Path("/project"));

		}

		
		@Test
		public void testload() {
			List<DeploymentUnit> list = per.load(new Path(
					"/project"));
			Iterator<DeploymentUnit> itr = list.iterator();
			while (itr.hasNext()) {
				assertTrue(itr.next() instanceof DeploymentUnit);
			}

		}

		private void setModelData(IAdtMainObject obj, String id, String name,
				FileExtensionEnum extension) {
			obj.setId(id);
			obj.setTechnicalName(name);
			obj.setFileExtension(extension);
		}
}
