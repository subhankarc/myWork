package com.sap.casestudy.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;

public class BusinessObjectSourcePage extends TextEditor {
	IEditorSite site;
	IEditorInput input;

	public BusinessObjectSourcePage() {
		// TODO Auto-generated constructor stub
	}

	public BusinessObjectSourcePage(IEditorInput input) {
		this.input = input;

	}

	public IEditorInput getEditorFile() {

		IEditorInput inputFile = null;

		BusinessObject object = ((MTSEditorInput) input).getBusinessObject();
		if (object instanceof BusinessObject) {

			BusinessObject bobj = (BusinessObject) object;

			IPath path = new Path(bobj.eResource().getURI().toFileString());
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

			IFile ifile = root.getFileForLocation(path);

			if (ifile.exists()) {
				inputFile = new FileEditorInput(ifile);
			}
		}

		return inputFile;
	}

	@Override
	public boolean isEditable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		// TODO Auto-generated method stub
		super.doSetInput(input);
	}

}
