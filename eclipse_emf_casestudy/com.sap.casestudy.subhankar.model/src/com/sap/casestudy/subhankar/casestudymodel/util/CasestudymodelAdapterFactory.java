/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.util;

import com.sap.casestudy.subhankar.casestudymodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage
 * @generated
 */
public class CasestudymodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CasestudymodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasestudymodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CasestudymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasestudymodelSwitch<Adapter> modelSwitch =
		new CasestudymodelSwitch<Adapter>() {
			@Override
			public Adapter caseIAdtObject(IAdtObject object) {
				return createIAdtObjectAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseIAdtMainObject(IAdtMainObject object) {
				return createIAdtMainObjectAdapter();
			}
			@Override
			public Adapter caseBusinessObject(BusinessObject object) {
				return createBusinessObjectAdapter();
			}
			@Override
			public Adapter caseProcessComponent(ProcessComponent object) {
				return createProcessComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentUnit(DeploymentUnit object) {
				return createDeploymentUnitAdapter();
			}
			@Override
			public Adapter caseBusinessObjectNode(BusinessObjectNode object) {
				return createBusinessObjectNodeAdapter();
			}
			@Override
			public Adapter caseRootBusinessObjectNode(RootBusinessObjectNode object) {
				return createRootBusinessObjectNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject <em>IAdt Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject
	 * @generated
	 */
	public Adapter createIAdtObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject <em>IAdt Main Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject
	 * @generated
	 */
	public Adapter createIAdtMainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject
	 * @generated
	 */
	public Adapter createBusinessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent
	 * @generated
	 */
	public Adapter createProcessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit <em>Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit
	 * @generated
	 */
	public Adapter createDeploymentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode <em>Business Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode
	 * @generated
	 */
	public Adapter createBusinessObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode <em>Root Business Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode
	 * @generated
	 */
	public Adapter createRootBusinessObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CasestudymodelAdapterFactory
