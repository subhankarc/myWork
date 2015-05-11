/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelFactory
 * @model kind="package"
 * @generated
 */
public interface CasestudymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "casestudymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://casestudy/subhankar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "casestudymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CasestudymodelPackage eINSTANCE = com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject <em>IAdt Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getIAdtObject()
	 * @generated
	 */
	int IADT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_OBJECT__TECHNICAL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_OBJECT__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>IAdt Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ID = IADT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TECHNICAL_NAME = IADT_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DOCUMENTATION = IADT_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Short Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SHORT_TEXT = IADT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LONG_TEXT = IADT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__CONTAINING_OBJECT = IADT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = IADT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject <em>IAdt Main Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getIAdtMainObject()
	 * @generated
	 */
	int IADT_MAIN_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_MAIN_OBJECT__ID = IADT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_MAIN_OBJECT__TECHNICAL_NAME = IADT_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_MAIN_OBJECT__DOCUMENTATION = IADT_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_MAIN_OBJECT__FILE_EXTENSION = IADT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IAdt Main Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADT_MAIN_OBJECT_FEATURE_COUNT = IADT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ID = IADT_MAIN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__TECHNICAL_NAME = IADT_MAIN_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__DOCUMENTATION = IADT_MAIN_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__FILE_EXTENSION = IADT_MAIN_OBJECT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PROVIDER_CLASS = IADT_MAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PROVIDER_INTERFACE = IADT_MAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__OBJECT_CATEGORY = IADT_MAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PROCESS_COMPONENT = IADT_MAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ROOT_NODE = IADT_MAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = IADT_MAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl <em>Process Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getProcessComponent()
	 * @generated
	 */
	int PROCESS_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__ID = IADT_MAIN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__TECHNICAL_NAME = IADT_MAIN_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__DOCUMENTATION = IADT_MAIN_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__FILE_EXTENSION = IADT_MAIN_OBJECT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Deployment Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__DEPLOYMENT_UNIT = IADT_MAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__CODE = IADT_MAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__NAME_KEY_NAME = IADT_MAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name Key Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__NAME_KEY_NAMESPACE = IADT_MAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__CATEGORY = IADT_MAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT__BUSINESS_OBJECTS = IADT_MAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Process Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_COMPONENT_FEATURE_COUNT = IADT_MAIN_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl <em>Deployment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getDeploymentUnit()
	 * @generated
	 */
	int DEPLOYMENT_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__ID = IADT_MAIN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__TECHNICAL_NAME = IADT_MAIN_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__DOCUMENTATION = IADT_MAIN_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__FILE_EXTENSION = IADT_MAIN_OBJECT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Abbreviaton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__ABBREVIATON_NAME = IADT_MAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__SEMANTIC_NAME = IADT_MAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT__PROCESS_COMPONENTS = IADT_MAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_FEATURE_COUNT = IADT_MAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl <em>Business Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObjectNode()
	 * @generated
	 */
	int BUSINESS_OBJECT_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__ID = IADT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__TECHNICAL_NAME = IADT_OBJECT__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__DOCUMENTATION = IADT_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__CATEGORY = IADT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__CHILD_NODES = IADT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE__PARENT = IADT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_NODE_FEATURE_COUNT = IADT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.RootBusinessObjectNodeImpl <em>Root Business Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.RootBusinessObjectNodeImpl
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getRootBusinessObjectNode()
	 * @generated
	 */
	int ROOT_BUSINESS_OBJECT_NODE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__ID = BUSINESS_OBJECT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__TECHNICAL_NAME = BUSINESS_OBJECT_NODE__TECHNICAL_NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__DOCUMENTATION = BUSINESS_OBJECT_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__CATEGORY = BUSINESS_OBJECT_NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Child Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__CHILD_NODES = BUSINESS_OBJECT_NODE__CHILD_NODES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__PARENT = BUSINESS_OBJECT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT = BUSINESS_OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Business Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BUSINESS_OBJECT_NODE_FEATURE_COUNT = BUSINESS_OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum <em>File Extension Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getFileExtensionEnum()
	 * @generated
	 */
	int FILE_EXTENSION_ENUM = 8;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum <em>Process Component Category Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getProcessComponentCategoryEnum()
	 * @generated
	 */
	int PROCESS_COMPONENT_CATEGORY_ENUM = 9;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum <em>Business Object Category Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObjectCategoryEnum()
	 * @generated
	 */
	int BUSINESS_OBJECT_CATEGORY_ENUM = 10;

	/**
	 * The meta object id for the '{@link com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum <em>Bu Object Node Category Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum
	 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBuObjectNodeCategoryEnum()
	 * @generated
	 */
	int BU_OBJECT_NODE_CATEGORY_ENUM = 11;


	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject <em>IAdt Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdt Object</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject
	 * @generated
	 */
	EClass getIAdtObject();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId()
	 * @see #getIAdtObject()
	 * @generated
	 */
	EAttribute getIAdtObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getTechnicalName <em>Technical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Name</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getTechnicalName()
	 * @see #getIAdtObject()
	 * @generated
	 */
	EAttribute getIAdtObject_TechnicalName();

	/**
	 * Returns the meta object for the containment reference '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation()
	 * @see #getIAdtObject()
	 * @generated
	 */
	EReference getIAdtObject_Documentation();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getShortText <em>Short Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation#getShortText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ShortText();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getLongText <em>Long Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Text</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation#getLongText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_LongText();

	/**
	 * Returns the meta object for the container reference '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject <em>Containing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Object</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_ContainingObject();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject <em>IAdt Main Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdt Main Object</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject
	 * @generated
	 */
	EClass getIAdtMainObject();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject#getFileExtension()
	 * @see #getIAdtMainObject()
	 * @generated
	 */
	EAttribute getIAdtMainObject_FileExtension();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderClass <em>Provider Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Class</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderClass()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_ProviderClass();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderInterface <em>Provider Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Interface</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderInterface()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_ProviderInterface();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getObjectCategory <em>Object Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Category</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getObjectCategory()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_ObjectCategory();

	/**
	 * Returns the meta object for the container reference '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process Component</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_ProcessComponent();

	/**
	 * Returns the meta object for the reference '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_RootNode();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Component</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent
	 * @generated
	 */
	EClass getProcessComponent();

	/**
	 * Returns the meta object for the container reference '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit <em>Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployment Unit</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EReference getProcessComponent_DeploymentUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCode()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EAttribute getProcessComponent_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyName <em>Name Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Key Name</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyName()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EAttribute getProcessComponent_NameKeyName();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyNamespace <em>Name Key Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Key Namespace</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyNamespace()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EAttribute getProcessComponent_NameKeyNamespace();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCategory()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EAttribute getProcessComponent_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getBusinessObjects <em>Business Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Objects</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getBusinessObjects()
	 * @see #getProcessComponent()
	 * @generated
	 */
	EReference getProcessComponent_BusinessObjects();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit <em>Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Unit</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit
	 * @generated
	 */
	EClass getDeploymentUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getAbbreviatonName <em>Abbreviaton Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviaton Name</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getAbbreviatonName()
	 * @see #getDeploymentUnit()
	 * @generated
	 */
	EAttribute getDeploymentUnit_AbbreviatonName();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getSemanticName <em>Semantic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Name</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getSemanticName()
	 * @see #getDeploymentUnit()
	 * @generated
	 */
	EAttribute getDeploymentUnit_SemanticName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getProcessComponents <em>Process Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Components</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getProcessComponents()
	 * @see #getDeploymentUnit()
	 * @generated
	 */
	EReference getDeploymentUnit_ProcessComponents();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode <em>Business Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object Node</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode
	 * @generated
	 */
	EClass getBusinessObjectNode();

	/**
	 * Returns the meta object for the attribute '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getCategory()
	 * @see #getBusinessObjectNode()
	 * @generated
	 */
	EAttribute getBusinessObjectNode_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Nodes</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getChildNodes()
	 * @see #getBusinessObjectNode()
	 * @generated
	 */
	EReference getBusinessObjectNode_ChildNodes();

	/**
	 * Returns the meta object for the container reference '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent()
	 * @see #getBusinessObjectNode()
	 * @generated
	 */
	EReference getBusinessObjectNode_Parent();

	/**
	 * Returns the meta object for class '{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode <em>Root Business Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Business Object Node</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode
	 * @generated
	 */
	EClass getRootBusinessObjectNode();

	/**
	 * Returns the meta object for the reference '{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Object</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject()
	 * @see #getRootBusinessObjectNode()
	 * @generated
	 */
	EReference getRootBusinessObjectNode_BusinessObject();

	/**
	 * Returns the meta object for enum '{@link com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum <em>File Extension Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Extension Enum</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum
	 * @generated
	 */
	EEnum getFileExtensionEnum();

	/**
	 * Returns the meta object for enum '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum <em>Process Component Category Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Component Category Enum</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum
	 * @generated
	 */
	EEnum getProcessComponentCategoryEnum();

	/**
	 * Returns the meta object for enum '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum <em>Business Object Category Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Business Object Category Enum</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum
	 * @generated
	 */
	EEnum getBusinessObjectCategoryEnum();

	/**
	 * Returns the meta object for enum '{@link com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum <em>Bu Object Node Category Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bu Object Node Category Enum</em>'.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum
	 * @generated
	 */
	EEnum getBuObjectNodeCategoryEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CasestudymodelFactory getCasestudymodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject <em>IAdt Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getIAdtObject()
		 * @generated
		 */
		EClass IADT_OBJECT = eINSTANCE.getIAdtObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IADT_OBJECT__ID = eINSTANCE.getIAdtObject_Id();

		/**
		 * The meta object literal for the '<em><b>Technical Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IADT_OBJECT__TECHNICAL_NAME = eINSTANCE.getIAdtObject_TechnicalName();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IADT_OBJECT__DOCUMENTATION = eINSTANCE.getIAdtObject_Documentation();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Short Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SHORT_TEXT = eINSTANCE.getDocumentation_ShortText();

		/**
		 * The meta object literal for the '<em><b>Long Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LONG_TEXT = eINSTANCE.getDocumentation_LongText();

		/**
		 * The meta object literal for the '<em><b>Containing Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION__CONTAINING_OBJECT = eINSTANCE.getDocumentation_ContainingObject();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject <em>IAdt Main Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getIAdtMainObject()
		 * @generated
		 */
		EClass IADT_MAIN_OBJECT = eINSTANCE.getIAdtMainObject();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IADT_MAIN_OBJECT__FILE_EXTENSION = eINSTANCE.getIAdtMainObject_FileExtension();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl <em>Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObject()
		 * @generated
		 */
		EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

		/**
		 * The meta object literal for the '<em><b>Provider Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__PROVIDER_CLASS = eINSTANCE.getBusinessObject_ProviderClass();

		/**
		 * The meta object literal for the '<em><b>Provider Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__PROVIDER_INTERFACE = eINSTANCE.getBusinessObject_ProviderInterface();

		/**
		 * The meta object literal for the '<em><b>Object Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__OBJECT_CATEGORY = eINSTANCE.getBusinessObject_ObjectCategory();

		/**
		 * The meta object literal for the '<em><b>Process Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__PROCESS_COMPONENT = eINSTANCE.getBusinessObject_ProcessComponent();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__ROOT_NODE = eINSTANCE.getBusinessObject_RootNode();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl <em>Process Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getProcessComponent()
		 * @generated
		 */
		EClass PROCESS_COMPONENT = eINSTANCE.getProcessComponent();

		/**
		 * The meta object literal for the '<em><b>Deployment Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT__DEPLOYMENT_UNIT = eINSTANCE.getProcessComponent_DeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_COMPONENT__CODE = eINSTANCE.getProcessComponent_Code();

		/**
		 * The meta object literal for the '<em><b>Name Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_COMPONENT__NAME_KEY_NAME = eINSTANCE.getProcessComponent_NameKeyName();

		/**
		 * The meta object literal for the '<em><b>Name Key Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_COMPONENT__NAME_KEY_NAMESPACE = eINSTANCE.getProcessComponent_NameKeyNamespace();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_COMPONENT__CATEGORY = eINSTANCE.getProcessComponent_Category();

		/**
		 * The meta object literal for the '<em><b>Business Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_COMPONENT__BUSINESS_OBJECTS = eINSTANCE.getProcessComponent_BusinessObjects();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl <em>Deployment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getDeploymentUnit()
		 * @generated
		 */
		EClass DEPLOYMENT_UNIT = eINSTANCE.getDeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Abbreviaton Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_UNIT__ABBREVIATON_NAME = eINSTANCE.getDeploymentUnit_AbbreviatonName();

		/**
		 * The meta object literal for the '<em><b>Semantic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_UNIT__SEMANTIC_NAME = eINSTANCE.getDeploymentUnit_SemanticName();

		/**
		 * The meta object literal for the '<em><b>Process Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT__PROCESS_COMPONENTS = eINSTANCE.getDeploymentUnit_ProcessComponents();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl <em>Business Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObjectNode()
		 * @generated
		 */
		EClass BUSINESS_OBJECT_NODE = eINSTANCE.getBusinessObjectNode();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT_NODE__CATEGORY = eINSTANCE.getBusinessObjectNode_Category();

		/**
		 * The meta object literal for the '<em><b>Child Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT_NODE__CHILD_NODES = eINSTANCE.getBusinessObjectNode_ChildNodes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT_NODE__PARENT = eINSTANCE.getBusinessObjectNode_Parent();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.impl.RootBusinessObjectNodeImpl <em>Root Business Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.RootBusinessObjectNodeImpl
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getRootBusinessObjectNode()
		 * @generated
		 */
		EClass ROOT_BUSINESS_OBJECT_NODE = eINSTANCE.getRootBusinessObjectNode();

		/**
		 * The meta object literal for the '<em><b>Business Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT = eINSTANCE.getRootBusinessObjectNode_BusinessObject();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum <em>File Extension Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getFileExtensionEnum()
		 * @generated
		 */
		EEnum FILE_EXTENSION_ENUM = eINSTANCE.getFileExtensionEnum();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum <em>Process Component Category Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getProcessComponentCategoryEnum()
		 * @generated
		 */
		EEnum PROCESS_COMPONENT_CATEGORY_ENUM = eINSTANCE.getProcessComponentCategoryEnum();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum <em>Business Object Category Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBusinessObjectCategoryEnum()
		 * @generated
		 */
		EEnum BUSINESS_OBJECT_CATEGORY_ENUM = eINSTANCE.getBusinessObjectCategoryEnum();

		/**
		 * The meta object literal for the '{@link com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum <em>Bu Object Node Category Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum
		 * @see com.sap.casestudy.subhankar.casestudymodel.impl.CasestudymodelPackageImpl#getBuObjectNodeCategoryEnum()
		 * @generated
		 */
		EEnum BU_OBJECT_NODE_CATEGORY_ENUM = eINSTANCE.getBuObjectNodeCategoryEnum();

	}

} //CasestudymodelPackage
