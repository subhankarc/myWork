package com.sap.casestudy.ui.editor;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelFactory;
import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.persistence.IPersistencyService;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;

public class BusinessObjectEditor extends MultiPageEditorPart {
	private IProject project;
	private BusinessObject businessObject;

	private BusinessObjectDesignPage overViewPage;
	private BusinessObjectSourcePage detailsPage;

	private IEditorInput input;

	@Override
	public void dispose() {
		super.dispose();
		BODoubleClickListener.openEditors.remove(businessObject);
	}

	public BusinessObjectEditor() {

	}

	@SuppressWarnings("deprecation")
	@Override
	protected void createPages() {

		input = getEditorInput();
		MTSEditorInput input1 = (MTSEditorInput) input;
		businessObject = input1.getBusinessObject();
		project = input1.getProject();
		this.setTitle(businessObject.getTechnicalName());
		BODoubleClickListener.openEditors.put(businessObject, this);
		overViewPage = new BusinessObjectDesignPage();
		detailsPage = new BusinessObjectSourcePage(input);
		try {
			addPage(0, overViewPage, input);
			IEditorInput sourceInput = detailsPage.getEditorFile();
			addPage(1, detailsPage, sourceInput);

			setPageText(0, "Design");
			setPageText(1, "Source");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {

		@SuppressWarnings("unused")
		CasestudymodelFactory casestudyFactory = CasestudymodelFactory.eINSTANCE;
		IPersistencyService persistService = IPersistenceFactory.implinstance
				.getInstance(project.getLocation().toOSString());
		businessObject.setProviderClass(overViewPage.getProClass());
		businessObject.setProviderInterface(overViewPage.getProIntText());
		businessObject.setObjectCategory(overViewPage.getBoCategory());
		persistService.save(businessObject,project.getFullPath());
		overViewPage.setDirty(false);
		MTSCreateUtilityClass.getCreateUtilClass().refreshWorkspace();
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	public BusinessObject getBusinessObject() {
		return businessObject;
	}

	public IProject getProject() {
		return project;
	}

}
