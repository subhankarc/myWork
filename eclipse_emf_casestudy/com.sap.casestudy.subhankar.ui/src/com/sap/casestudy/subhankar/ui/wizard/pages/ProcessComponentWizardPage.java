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

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.views.MTSContentProvider;
import com.sap.casestudy.subhankar.ui.views.MTSLabelProvider;
import com.sap.casestudy.subhankar.ui.views.PCTreeNode;

public class ProcessComponentWizardPage extends MTSWizardPage implements
		ModifyListener {
	private Text tech_Name;
	private Text code;
	private Text namekeyName;
	private Text namekeyNamespace;
	private Combo cmbCat;
	private Text selectdu;
	private Button browse;
	private Object firstSelection;
	private IProject project;
	private DeploymentUnit du;
	private IStructuredSelection selection;
	boolean flag = true;
	Iterator<ProcessComponent> itr;

	public ProcessComponentWizardPage(String pageName, String title,
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
		lbl1.setText("Select Deployment Unit");
		lbl1.setAlignment(SWT.RIGHT);
		selectdu = new Text(composite, SWT.BORDER);
		selectdu.setEditable(false);
		if (du != null) {
			selectdu.setText(du.getTechnicalName());
			extractProject();
		}
		if (selection != null) {
			firstSelection = selection.getFirstElement();
		}
		if (firstSelection instanceof DeploymentUnit) {
			du = (DeploymentUnit) firstSelection;
			selectdu.setText(du.getTechnicalName());
			extractProject();
		}
		if (firstSelection instanceof PCTreeNode){
			du =(((PCTreeNode) firstSelection).getDeploymentUnit());
			selectdu.setText(du.getTechnicalName());
			extractProject();
		}
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		// gridData.verticalIndent = 20;
		gridData.grabExcessHorizontalSpace = true;
		selectdu.setLayoutData(gridData);

		browse = new Button(composite, SWT.PUSH);
		browse.setText("Browse");
		browse.setLayoutData(gridData);
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				MTSLabelProvider lp = new MTSLabelProvider();
				MTSContentProvider cp = new MTSContentProvider();
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						Display.getDefault().getActiveShell(), lp, cp);
				dialog.setMessage("Choose the Deployment Unit");
				dialog.setTitle("Deployment Unit Choice");
				dialog.setInput(ResourcesPlugin.getWorkspace());
				dialog.setAllowMultiple(false);
				dialog.setValidator(new ISelectionStatusValidator() {
					public IStatus validate(Object[] selection) {
						// IStatus ret = Status.CANCEL_STATUS;
						if (selection.length == 1) {
							if (selection[0] instanceof DeploymentUnit) {
								return fgOKStatus;
							}
						}
						return fgErrorStatus;
					}
				});
				if (dialog.open() == IStatus.OK) {
					du = (DeploymentUnit) dialog.getFirstResult();
					selectdu.setText(du.getTechnicalName());
					extractProject();
				}

			}

		});

		selectdu.setEnabled(false);
		selectdu.addModifyListener(this);
		browse.forceFocus();
		Label lbl2 = new Label(composite, SWT.RIGHT);
		lbl2.setText("Technical Name *: ");
		lbl2.setAlignment(SWT.RIGHT);
		tech_Name = new Text(composite, SWT.BORDER);
		tech_Name.setEditable(true);
		tech_Name.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		// gridData.verticalIndent = 20;
		tech_Name.setLayoutData(gridData);

		Label lbl3 = new Label(composite, SWT.RIGHT);
		lbl3.setText("Code: ");
		lbl3.setAlignment(SWT.RIGHT);
		code = new Text(composite, SWT.BORDER);
		code.setEditable(true);
		code.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		// gridData.verticalIndent = 20;
		code.setLayoutData(gridData);

		Label lbl4 = new Label(composite, SWT.RIGHT);
		lbl4.setText("Namekey Name: ");
		lbl4.setAlignment(SWT.RIGHT);
		namekeyName = new Text(composite, SWT.BORDER);
		namekeyName.setEditable(true);
		namekeyName.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		// gridData.verticalIndent = 20;
		gridData.horizontalSpan = 2;
		namekeyName.setLayoutData(gridData);

		Label lbl5 = new Label(composite, SWT.RIGHT);
		lbl5.setText("Namekey Namespace: ");
		lbl5.setAlignment(SWT.RIGHT);
		namekeyNamespace = new Text(composite, SWT.BORDER);
		namekeyNamespace.setEditable(true);
		namekeyNamespace.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		// gridData.verticalIndent = 20;
		gridData.horizontalSpan = 2;
		namekeyNamespace.setLayoutData(gridData);

		Label lbl6 = new Label(composite, SWT.RIGHT);
		lbl6.setText("Category: ");
		lbl6.setAlignment(SWT.RIGHT);
		cmbCat = new Combo(composite, SWT.READ_ONLY);
		cmbCat.setItems(getProcessComponentCategories());
		cmbCat.select(0);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = false;
		cmbCat.setLayoutData(gridData);
		setPageComplete(checkFinish());
		setControl(composite);
	}

	/**
	 * 
	 */
	private void extractProject() {
		IPath path = new Path(du.eResource().getURI().toFileString());

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		String locationInWS = path.toString().substring(
				root.getLocation().toString().length());

		IResource resource = root.findMember(locationInWS);

		project = resource.getProject();
	}

	public IProject getProject() {
		return project;
	}

	public DeploymentUnit getDU() {
		return du;
	}

	public void setDU(DeploymentUnit du) {
		this.du = du;
	}

	public String getTechnicalName() {
		return tech_Name.getText();
	}

	public String getCode() {
		return code.getText();
	}

	public String getNamekeyName() {
		return namekeyName.getText();
	}

	public String getNamekeyNamespace() {
		return namekeyNamespace.getText();
	}

	public int getCategory() {
		return cmbCat.getSelectionIndex();
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

	private String[] getProcessComponentCategories() {
		List<String> procCompCategoryList = new ArrayList<String>();
		for (ProcessComponentCategoryEnum procCompCategory : ProcessComponentCategoryEnum.VALUES) {
			procCompCategoryList.add(procCompCategory.toString());
		}
		return (String[]) procCompCategoryList.toArray(new String[0]);
	}

	@Override
	public void modifyText(ModifyEvent e) {
		// getWizard().getContainer().updateButtons();
		this.setPageComplete(checkFinish());
	}

	private boolean checkFinish() {
		setErrorMessage(null);
		if (getDU() == null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getCode().isEmpty() || !getNamekeyName().isEmpty()
					|| !getNamekeyNamespace().isEmpty()) {
				setErrorMessage("Enter a valid deployment unit name and technical name");
			}
		}
		if (getDU() == null && !getTechnicalName().isEmpty()
				&& !getTechnicalName().trim().isEmpty()) {
			setErrorMessage("Deployment unit name can not be empty");
		}
		if (getDU() != null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getCode().isEmpty() || !getNamekeyName().isEmpty()
					|| !getNamekeyNamespace().isEmpty()) {
				setErrorMessage("Technical name can not be empty");
			}
		}
		if (getDU() != null && !getTechnicalName().isEmpty()
				&& !patternMatcher(getTechnicalName())) {
			setErrorMessage("Special character not allowed");
			return false;
		}
		if (getDU() != null && !getTechnicalName().isEmpty()) {
			Iterator<DeploymentUnit> duItr = MTSCreateUtilityClass
					.getCreateUtilClass().getDeploymentUnits(project)
					.iterator();

			while (duItr.hasNext()) {
				Iterator<ProcessComponent> itr = duItr.next()
						.getProcessComponents().iterator();
				while (itr.hasNext()) {
					if (itr.next().getTechnicalName()
							.equals(getTechnicalName())) {
						setErrorMessage("Process Component with Same Technical name Exists.");

						return false;
					}
				}
			}
		}

		return getTechnicalName() != null && getDU() != null
				&& !getTechnicalName().trim().isEmpty()
				&& !getDU().toString().trim().isEmpty();
	}

	boolean patternMatcher(String string) {
		if (string != null && string.matches(IMTSConstants.pattern)) {
			return true;
		} else {
			return false;
		}
	}

}
