/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.util;

import com.sap.casestudy.subhankar.casestudymodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage
 * @generated
 */
public class CasestudymodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CasestudymodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasestudymodelSwitch() {
		if (modelPackage == null) {
			modelPackage = CasestudymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CasestudymodelPackage.IADT_OBJECT: {
				IAdtObject iAdtObject = (IAdtObject)theEObject;
				T result = caseIAdtObject(iAdtObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = caseIAdtObject(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.IADT_MAIN_OBJECT: {
				IAdtMainObject iAdtMainObject = (IAdtMainObject)theEObject;
				T result = caseIAdtMainObject(iAdtMainObject);
				if (result == null) result = caseIAdtObject(iAdtMainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.BUSINESS_OBJECT: {
				BusinessObject businessObject = (BusinessObject)theEObject;
				T result = caseBusinessObject(businessObject);
				if (result == null) result = caseIAdtMainObject(businessObject);
				if (result == null) result = caseIAdtObject(businessObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.PROCESS_COMPONENT: {
				ProcessComponent processComponent = (ProcessComponent)theEObject;
				T result = caseProcessComponent(processComponent);
				if (result == null) result = caseIAdtMainObject(processComponent);
				if (result == null) result = caseIAdtObject(processComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.DEPLOYMENT_UNIT: {
				DeploymentUnit deploymentUnit = (DeploymentUnit)theEObject;
				T result = caseDeploymentUnit(deploymentUnit);
				if (result == null) result = caseIAdtMainObject(deploymentUnit);
				if (result == null) result = caseIAdtObject(deploymentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE: {
				BusinessObjectNode businessObjectNode = (BusinessObjectNode)theEObject;
				T result = caseBusinessObjectNode(businessObjectNode);
				if (result == null) result = caseIAdtObject(businessObjectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE: {
				RootBusinessObjectNode rootBusinessObjectNode = (RootBusinessObjectNode)theEObject;
				T result = caseRootBusinessObjectNode(rootBusinessObjectNode);
				if (result == null) result = caseBusinessObjectNode(rootBusinessObjectNode);
				if (result == null) result = caseIAdtObject(rootBusinessObjectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdt Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdt Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAdtObject(IAdtObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAdt Main Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAdt Main Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAdtMainObject(IAdtMainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessObject(BusinessObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessComponent(ProcessComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentUnit(DeploymentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessObjectNode(BusinessObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Business Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Business Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootBusinessObjectNode(RootBusinessObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CasestudymodelSwitch
