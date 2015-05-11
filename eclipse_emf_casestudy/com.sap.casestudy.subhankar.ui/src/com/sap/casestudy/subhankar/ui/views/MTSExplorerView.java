package com.sap.casestudy.subhankar.ui.views;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;

import com.sap.casestudy.ui.editor.BODoubleClickListener;

public class MTSExplorerView extends ViewPart {

	private TreeViewer treeViewer;

	public MTSExplorerView() {

	}

	@Override
	public void createPartControl(Composite composite) {

		setTreeViewer(composite);
		addListeners();
		setContextMenuForTreeViewer();
	}

	private void setTreeViewer(Composite composite) {
		treeViewer = new TreeViewer(composite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		treeViewer.setContentProvider(new MTSContentProvider());
		treeViewer.setLabelProvider(new MTSLabelProvider());
		treeViewer.setInput(ResourcesPlugin.getWorkspace());
	}

	private void addListeners() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				new IResourceChangeListener() {

					@Override
					public void resourceChanged(IResourceChangeEvent event) {
						treeViewer.refresh();
					}
				});
		treeViewer.addDoubleClickListener(new BODoubleClickListener());
	}

	@Override
	public void setFocus() {

	}

	private void setContextMenuForTreeViewer() {
		MenuManager menuManager = new MenuManager();
		menuManager.setRemoveAllWhenShown(true);
		menuManager.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {

			}
		});
		Menu menu = menuManager.createContextMenu(treeViewer.getControl());
		// Set the MenuManager
		treeViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, treeViewer);
		getSite().setSelectionProvider(treeViewer);
	}

}
