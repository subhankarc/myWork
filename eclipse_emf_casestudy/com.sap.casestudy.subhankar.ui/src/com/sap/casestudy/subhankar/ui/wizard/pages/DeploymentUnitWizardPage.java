package com.sap.casestudy.subhankar.ui.wizard.pages;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.views.DUTreeNode;
import com.sap.casestudy.subhankar.ui.views.MTSContentProvider;
import com.sap.casestudy.subhankar.ui.views.MTSLabelProvider;

public class DeploymentUnitWizardPage extends WizardPage implements
		ModifyListener {
	private Object firstSelection;
	private Text tech_Name;
	private Text abb_Name;
	private Text sem_Name;
	private Button browse;
	private Text duLocation;
	IProject project;
	boolean flag = true;
	private IStructuredSelection selection;
	Iterator<DeploymentUnit> itr;

	public DeploymentUnitWizardPage(String pageName, String title,
			ImageDescriptor titleImage, IStructuredSelection selection) {
		super(pageName, title, titleImage);
		this.setTitle(title);
		this.selection = selection;
	}

	private static IStatus fgErrorStatus = new Status(IStatus.ERROR,
			"com.sap.casestudy.subhankar.ui", "");
	private static IStatus fgOKStatus = new Status(IStatus.OK,
			"com.sap.casestudy.subhankar.ui", "");

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		composite.setLayout(gridLayout);

		Label lbl = new Label(composite, SWT.RIGHT);
		lbl.setText("Select Project");
		lbl.setAlignment(SWT.RIGHT);
		duLocation = new Text(composite, SWT.BORDER);
		duLocation.setEditable(false);
		if (project != null) {
			duLocation.setText(project.getName().toString());
		}
		if (selection != null) {
			firstSelection = selection.getFirstElement();
		}
		if (firstSelection instanceof IProject) {
			project = (IProject) firstSelection;
			duLocation.setText(project.getName());
		}
		if (firstSelection instanceof DUTreeNode){
			project =(((DUTreeNode) firstSelection).getProject());
			duLocation.setText(project.getName());
		}
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		// gridData.verticalIndent = 20;
		gridData.grabExcessHorizontalSpace = true;
		duLocation.setLayoutData(gridData);

		browse = new Button(composite, SWT.PUSH);
		browse.setText("Browse");
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				MTSLabelProvider lp = new MTSLabelProvider();
				MTSContentProvider cp = new MTSContentProvider();
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
						getShell(), lp, cp);
				dialog.setMessage("Choose the Project for the Deployment Unit");
				dialog.setTitle("Project Choice");
				dialog.setInput(ResourcesPlugin.getWorkspace());
				dialog.setAllowMultiple(false);
				dialog.setValidator(new ISelectionStatusValidator() {
					public IStatus validate(Object[] selection) {
						// IStatus ret = Status.CANCEL_STATUS;
						if (selection.length == 1) {
							if (selection[0] instanceof IProject) {
								return fgOKStatus;
							}
						}
						return fgErrorStatus;
					}
				});
				if (dialog.open() == IStatus.OK) {
					project = (IProject) dialog.getFirstResult();
					duLocation.setText(project.getName().toString());
				}

			}

		});
		duLocation.setEnabled(false);
		duLocation.addModifyListener(this);
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
		lbl3.setText("Abbreviation Name: ");
		lbl3.setAlignment(SWT.RIGHT);
		abb_Name = new Text(composite, SWT.BORDER);
		abb_Name.setEditable(true);
		abb_Name.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		// gridData.verticalIndent = 20;
		abb_Name.setLayoutData(gridData);

		Label lbl4 = new Label(composite, SWT.RIGHT);
		lbl4.setText("Semantic Name: ");
		lbl4.setAlignment(SWT.RIGHT);
		sem_Name = new Text(composite, SWT.BORDER);
		sem_Name.setEditable(true);
		sem_Name.addModifyListener(this);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		// gridData.verticalIndent = 20;
		gridData.horizontalSpan = 2;
		sem_Name.setLayoutData(gridData);
		setPageComplete(checkFinish());
		setControl(composite);
	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

	public String getTechnicalName() {
		return tech_Name.getText();
	}

	public String getAbbreviationName() {
		return abb_Name.getText();
	}

	public String getSemanticName() {
		return sem_Name.getText();
	}

	public boolean isValid(boolean displayMessage) {
		boolean isValid = true;
		if ((getTechnicalName().isEmpty())) {
			setErrorMessage(IMTSConstants.MSG_TECHNICAL_NAME_EMPTY);
			isValid = false;
		}

		if (flag = false) {

			isValid = false;
		}
		return isValid;
	}

	@Override
	public void modifyText(ModifyEvent e) {
		setPageComplete(checkFinish());

	}

	/**
	 * @return
	 */
	private boolean checkFinish() {
		setErrorMessage(null);
		if (getProject() == null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getAbbreviationName().isEmpty()
					|| !getSemanticName().isEmpty()) {
				setErrorMessage("Enter a valid project name and technical name");
			}
		}
		if (getProject() == null && !getTechnicalName().isEmpty()
				&& !getTechnicalName().trim().isEmpty()) {
			setErrorMessage("Project name can not be empty");
		}
		if (getProject() != null && getTechnicalName().isEmpty()
				&& getTechnicalName().trim().isEmpty()) {
			if (!getAbbreviationName().isEmpty()
					|| !getSemanticName().isEmpty()) {
				setErrorMessage("Technical name can not be empty");
			}
		}
		if(getProject() != null && !getTechnicalName().isEmpty() && !patternMatcher(getTechnicalName())){
			setErrorMessage("Special character not allowed");
			return false;
		}
		if(getProject() != null && !getTechnicalName().isEmpty()){
			Iterator<DeploymentUnit> itr = MTSCreateUtilityClass
					.getCreateUtilClass().getDeploymentUnits(getProject())
					.iterator();
			while (itr.hasNext()) {
				if (itr.next().getTechnicalName()
						.equals(getTechnicalName())) {
					setErrorMessage("Deployment Unit with Same Technical name Exists.");

					return false;
				}
			}

		}

		return !getTechnicalName().isEmpty() && getProject() != null
				&& !getTechnicalName().trim().isEmpty()
				&& !getProject().toString().trim().isEmpty();
	}

	boolean patternMatcher(String string) {
		if (string != null && string.matches(IMTSConstants.pattern)) {
			return true;
		} else {
			return false;
		}
	}
}