package com.sap.casestudy.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum;
import com.sap.casestudy.subhankar.ui.views.MTSContentProvider;
import com.sap.casestudy.subhankar.ui.views.MTSLabelProvider;

public class BusinessObjectDesignPage extends EditorPart implements ModifyListener {

	private FormToolkit toolkit;
	private ScrolledForm form;
	// private IEditorInput input;
	BusinessObject businessObject;
	IProject project;
	private CCombo boCategory;
	private Text proIntText;
	private Text proClass;
    boolean isDirty = false;

	@Override
	public void doSave(IProgressMonitor monitor) {

	}
	@Override
	public void doSaveAs() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// input = getEditorInput();
		setSite(site);
		setInput(input);
		businessObject = ((MTSEditorInput) input).getBusinessObject();
		project = ((MTSEditorInput) input).getProject();

	}

	@Override
	public boolean isDirty() {
		return isDirty;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.getBody().setLayout(GridLayoutFactory.fillDefaults().numColumns(1).create());

		Section overviewSection = createOverviewSection();
		overviewSection.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		Section nodesSection = createNodesSection();
		nodesSection.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		setDirty(false);
	}

	public void setDirty(boolean status) {
		this.isDirty = status;
        firePropertyChange(PROP_DIRTY);		
	}
	private Section createNodesSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		GridLayout gridLayout = GridLayoutFactory.fillDefaults().numColumns(2).create();

		section.setText("Business Object");
		section.setDescription("Business Object properties");
		Composite sectionClient = toolkit.createComposite(section);
		sectionClient.setLayout(gridLayout);
		section.setClient(sectionClient);

		Table tab = toolkit.createTable(sectionClient, SWT.NULL);
		tab.setLayoutData(GridDataFactory.fillDefaults().create());
		toolkit.paintBordersFor(sectionClient);
		Button b = toolkit.createButton(sectionClient, "Do something", SWT.PUSH); //$NON-NLS-1$
		GridData gridData2 = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b.setLayoutData(gridData2);
		TableViewer viewer;
		viewer = new TableViewer(tab);
		viewer.setContentProvider(new MTSContentProvider());

		TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
		viewerColumn.getColumn().setWidth(100);
		viewer.setLabelProvider(new MTSLabelProvider());
		viewer.setInput(ResourcesPlugin.getWorkspace());

		return section;
	}

	private Section createOverviewSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		GridLayout gridLayout = GridLayoutFactory.fillDefaults().numColumns(2).create();

		section.setText("Business Object");
		section.setDescription("Business Object properties");
		Composite sectionClient = toolkit.createComposite(section);
		sectionClient.setLayout(gridLayout);
		section.setClient(sectionClient);

		Label technicalNameLabel = toolkit.createLabel(sectionClient, "Technical name");
		technicalNameLabel.setLayoutData(GridDataFactory.fillDefaults().create());
		Text technicalNameText = toolkit.createText(sectionClient, null);
		technicalNameText.setText(businessObject.getTechnicalName());
		technicalNameText.setEnabled(false);
		technicalNameText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		Label providerClass = toolkit.createLabel(sectionClient, "Provider Class");
		providerClass.setLayoutData(GridDataFactory.fillDefaults().create());
		proClass = toolkit.createText(sectionClient, null);
		proClass.setText(businessObject.getProviderClass());
		proClass.addModifyListener(this);
		proClass.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		Label proInt = toolkit.createLabel(sectionClient, "Provider Interface");
		proIntText = toolkit.createText(sectionClient, null);
		proIntText.setText(businessObject.getProviderInterface());
		proIntText.addModifyListener(this);
		proIntText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		Label objCat = toolkit.createLabel(sectionClient, "Object Category");
	    boCategory = new CCombo(sectionClient, SWT.FLAT | SWT.DROP_DOWN | SWT.READ_ONLY);
		boCategory.setItems(getBOCat());
		boCategory.addModifyListener(this);
		boCategory.select(businessObject.getObjectCategory().getValue());
		toolkit.adapt(boCategory);
		return section;
	}

	private String[] getBOCat() {
		List<String> busObjCategoryList = new ArrayList<String>();
		for (BusinessObjectCategoryEnum busObjCategory : BusinessObjectCategoryEnum.VALUES) {
			busObjCategoryList.add(busObjCategory.toString());
		}
		return (String[]) busObjCategoryList.toArray(new String[0]);
	}

	@Override
	public void setFocus() {

	}
	public BusinessObjectCategoryEnum getBoCategory() {
		return BusinessObjectCategoryEnum.get(boCategory.getSelectionIndex());
	}
	public String getProIntText() {
		return proIntText.getText();
	}
	
	public String getProClass() {
		return proClass.getText();
	}
	@Override
	public void modifyText(ModifyEvent e) {
		// TODO Auto-generated method stub
		setDirty(true);
	}

}
