package com.sap.casestudy.subhankar.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class MTSPerspective implements IPerspectiveFactory {

	private static final String ID_PROJECT_EXPLORER = "org.eclipse.ui.navigator.ProjectExplorer";
	private static final String ID_CONSOLE_VIEW = "org.eclipse.ui.console.ConsoleView";
	public void createInitialLayout(IPageLayout layout) {
		defineLayout(layout);
		defineActions(layout);
		//layout.setEditorAreaVisible(false);
		//layout.setFixed(true);
	}

	public void defineActions(IPageLayout layout) {
		layout.addShowViewShortcut(ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(ID_CONSOLE_VIEW);
	}

	public void defineLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		IFolderLayout bottomRight = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.7f, editorArea);
		bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomRight.addView(IPageLayout.ID_TASK_LIST);
		bottomRight.addView(ID_CONSOLE_VIEW);
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		
	}
}
