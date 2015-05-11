/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage
 * @generated
 */
public interface CasestudymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CasestudymodelFactory eINSTANCE = com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

	/**
	 * Returns a new object of class '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Object</em>'.
	 * @generated
	 */
	BusinessObject createBusinessObject();

	/**
	 * Returns a new object of class '<em>Process Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Component</em>'.
	 * @generated
	 */
	ProcessComponent createProcessComponent();

	/**
	 * Returns a new object of class '<em>Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Unit</em>'.
	 * @generated
	 */
	DeploymentUnit createDeploymentUnit();

	/**
	 * Returns a new object of class '<em>Business Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Object Node</em>'.
	 * @generated
	 */
	BusinessObjectNode createBusinessObjectNode();

	/**
	 * Returns a new object of class '<em>Root Business Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Business Object Node</em>'.
	 * @generated
	 */
	RootBusinessObjectNode createRootBusinessObjectNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CasestudymodelPackage getCasestudymodelPackage();

} //CasestudymodelFactory
