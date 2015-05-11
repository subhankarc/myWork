package com.sap.casestudy.subhankar.ui.wizard.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.views.BOTreeNode;
import com.sap.casestudy.subhankar.ui.views.MTSContentProvider;
import com.sap.casestudy.subhankar.ui.views.MTSLabelProvider;

public class BusinessObjectWizardPage extends MTSWizardPage implements
		ModifyListener {
	private IProject project;
	private Text techName;
	private Combo cmbObj_Cat;
	private Text pro_int;
	private Text pro_Class;
	private Button browse;
	private Text selectpc;
	boolean flag = true;
	private DeploymentUnit du;
	private IStructuredSelection selection;
	private ProcessComponent pc;
	private Object firstSelection;
	Iterator<BusinessObject> itr;

	public BusinessObjectWizardPage(String pageName, String title,
			ImageDescriptor titleImage, IStructuredSelection selection) {
		super(pageName, title, titleImage);
		this.selection = selection;
	}

	private static IStatus fgErrorStatus = new Status(IStatus.ERROR,
			"com.sap.casestudy.subhankar.ui", "");
	private static IStatus fgOKStatus = new Status(IStatus.OK,
			"com.sap.casestudy.subhankar.ui", "");

	@Override
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		composite.setLayout(gridLayout);

		Label lbl1 = new Label(composite, SWT.RIGHT);
		lbl1.setText("Select Process Component");
		lbl1.setAlignment(SWT.RIGHT);
		selectpc = new Text(composite, SWT.BORDER);
		selectpc.setEditable(false);
		if (pc != null) {
			selectpc.setText(pc.getTechnicalName());
			extractProject();
		}
		if (selection != null) {
			firstSelection = selection.getFirstElement();
		}
		if (firstSelection instanceof ProcessComponent) {
			pc = (ProcessComponent) firstSelection;
			selectpc.setText(pc.getTechnicalName());
			extractProject();
		}
		
		if (firstSelection instanceof BOTreeNode){
			pc =(((BOTreeNode) firstSelection).getProcessComponent());
			selectpc.setText(pc.getTechnicalName());
			extractProject();
		}
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		// gridData.verticalIndent = 20;
		gridData.grabExcessHorizontalSpace = true;
		selectpc.setLayoutData(gridData);

		browse = new Button(composite, SWT.PUSH);
		browse.setText("Browse");
		browse.setLayoutData(gridData);
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				MTSLabelProvider lp = new MTSLabelProvider();
				MTSContentProvider cp = new MTSContentProvider();
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						Display.getDefault().getActiveShell(), lp, cp);
				dialog.setMessage("Choose the Process Component");
				dialog.setTitle("Process Component Choice");
				dialog.setInput(ResourcesPlugin.getWorkspace());
				dialog.setAllowMultiple(false);
				dialog.setValidator(new ISelectionStatusValidator() {
					public IStatus validate(Object[] selection) {
						// IStatus ret = Status.CANCEL_STATUS;
						if (selection.length == 1) {
							if (selection[0] instanceof ProcessComponent) {
								return fgOKStatus;
							}
						}
						return fgErrorStatus;
					}
				});
				if (dialog.open() == IStatus.OK) {
					pc = (ProcessComponent) dialog.getFirstResult();
					selectpc.setText(pc.getTechnicalName());
					extractProject();
				}

			}

		});

		selectpc.setEnabled(false);
		selectpc.addModifyListener(this);
		browse.forceFocus();
		Label lbl2 = new Label(composite, SWT.RIGHT);
		lbl2.setText("Technical Name *: ");
		lbl2.setAlignment(SWT.RIGHT);
		techName = new Text(composite, SWT.BORDER);
		techName.setEditable(true);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		techName.addModifyListener(this);
		// gridData.verticalIndent = 20;
		techName.setLayoutData(gridData);

		Label lbl3 = new Label(composite, SWT.RIGHT);
		lbl3.setText("Provider Interface: ");
		lbl3.setAlignment(SWT.RIGHT);
		pro_int = new Text(composite, SWT.BORDER);
		pro_int.setEditable(true);
		pro_int.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		// gridData.verticalIndent = 20;
		pro_int.setLayoutData(gridData);

		Label lbl4 = new Label(composite, SWT.RIGHT);
		lbl4.setText("Provider Class: ");
		lbl4.setAlignment(SWT.RIGHT);
		pro_Class = new Text(composite, SWT.BORDER);
		pro_Class.setEditable(true);
		pro_Class.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		// gridData.verticalIndent = 20;
		gridData.horizontalSpan = 2;
		pro_Class.setLayoutData(gridData);

		Label lbl5 = new Label(composite, SWT.RIGHT);
		lbl5.setText("Object Category: ");
		lbl5.setAlignment(SWT.RIGHT);
		cmbObj_Cat = new Combo(composite, SWT.READ_ONLY);
		cmbObj_Cat.setItems(getBO_Cat());
		cmbObj_Cat.select(0);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = false;
		cmbObj_Cat.setLayoutData(gridData);
		setPageComplete(checkFinish());
		setControl(composite);

	}

	/**
	 * 
	 */
	private void extractProject() {
		du = pc.getDeploymentUnit();
		IPath path = new Path(du.eResource().getURI().toFileString());

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		String locationInWS = path.toString().substring(
				root.getLocation().toString().length());

		IResource resource = root.findMember(locationInWS);

		project = resource.getProject();
	}

	public static String[] getBO_Cat() {
		List<String> busObjCategoryList = new ArrayList<String>();
		for (BusinessObjectCategoryEnum busObjCategory : BusinessObjectCategoryEnum.VALUES) {
			busObjCategoryList.add(busObjCategory.toString());
		}
		return (String[]) busObjCategoryList.toArray(new String[0]);
	}

	public IProject getProject() {
		return project;
	}

	public ProcessComponent getPC() {
		return pc;
	}

	public String getTechnicalName() {
		return techName.getText();
	}

	public int getObjectCategory() {
		return cmbObj_Cat.getSelectionIndex();
	}

	public String getProviderInterface() {
		return pro_int.getText();
	}

	public String getProviderClass() {
		return pro_Class.getText();
	}

	@Override
	public boolean canFlipToNextPage() {
		return super.canFlipToNextPage() && isValid(false);
	}

	@Override
	public boolean isValid(boolean displayMessage) {
		boolean isValid = true;
		if (getTechnicalName().isEmpty()) {
			setErrorMessage(IMTSConstants.MSG_TECHNICAL_NAME_EMPTY);
			isValid = false;
		}

		if (flag = false) {
			isValid = false;
		}
		return isValid;
	}

	@Override
	public boolean isCurrentPage() {
		return super.isCurrentPage();
	}

	@Override
	public void modifyText(ModifyEvent e) {
		getWizard().getContainer().updateButtons();
		this.setPageComplete(checkFinish());
	}

	private boolean checkFinish() {
		setErrorMessage(null);
		if (getPC() == null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getProviderClass().isEmpty()
					|| !getProviderInterface().isEmpty()) {
				setErrorMessage("Enter a valid process component name and technical name");
			}
		}
		if (getPC() == null && !getTechnicalName().isEmpty()
				&& !getTechnicalName().trim().isEmpty()) {
			setErrorMessage("Process component name can not be empty");
		}
		if (getPC() != null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getProviderClass().isEmpty()
					|| !getProviderInterface().isEmpty()) {
				setErrorMessage("Technical name can not be empty");
			}
		}
		if (getPC() != null && !getTechnicalName().isEmpty()
				&& !patternMatcher(getTechnicalName())) {
			setErrorMessage("Special character not allowed");
			return false;
		}
		if (getPC() != null && !getTechnicalName().isEmpty()) {
			Iterator<DeploymentUnit> duItr = MTSCreateUtilityClass
					.getCreateUtilClass().getDeploymentUnits(project)
					.iterator();
			while (duItr.hasNext()) {
				Iterator<ProcessComponent> pcItr = duItr.next()
						.getProcessComponents().iterator();
				while (pcItr.hasNext()) {
					Iterator<BusinessObject> itr = pcItr.next()
							.getBusinessObjects().iterator();
					while (itr.hasNext()) {
						if (itr.next().getTechnicalName()
								.equals(getTechnicalName())) {
							setErrorMessage("Business Object with Same Technical name Exists.");

							return false;
						}
					}
				}
			}
		}

		return getTechnicalName() != null && getPC() != null
				&& !getTechnicalName().trim().isEmpty()
				&& !getPC().toString().trim().isEmpty();
	}

	boolean patternMatcher(String string) {
		if (string != null && string.matches(IMTSConstants.pattern)) {
			return true;
		} else {
			return false;
		}
	}

	public void setPC(ProcessComponent processComponent) {
		pc = processComponent;
	}

}
