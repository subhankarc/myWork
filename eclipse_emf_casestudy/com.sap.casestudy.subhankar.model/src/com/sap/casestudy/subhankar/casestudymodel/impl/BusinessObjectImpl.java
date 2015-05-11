/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getProviderClass <em>Provider Class</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getProviderInterface <em>Provider Interface</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getObjectCategory <em>Object Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getProcessComponent <em>Process Component</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectImpl extends EObjectImpl implements BusinessObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected String technicalName = TECHNICAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Documentation documentation;

	/**
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final FileExtensionEnum FILE_EXTENSION_EDEFAULT = FileExtensionEnum.NAMESPACE_EXTENSION;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected FileExtensionEnum fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderClass() <em>Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderClass() <em>Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderClass()
	 * @generated
	 * @ordered
	 */
	protected String providerClass = PROVIDER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderInterface() <em>Provider Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderInterface() <em>Provider Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderInterface()
	 * @generated
	 * @ordered
	 */
	protected String providerInterface = PROVIDER_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectCategory() <em>Object Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BusinessObjectCategoryEnum OBJECT_CATEGORY_EDEFAULT = BusinessObjectCategoryEnum.META_OBJECT;

	/**
	 * The cached value of the '{@link #getObjectCategory() <em>Object Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCategory()
	 * @generated
	 * @ordered
	 */
	protected BusinessObjectCategoryEnum objectCategory = OBJECT_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected RootBusinessObjectNode rootNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.BUSINESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CasestudymodelPackage.BUSINESS_OBJECT__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalName() {
		return technicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalName(String newTechnicalName) {
		String oldTechnicalName = technicalName;
		technicalName = newTechnicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__TECHNICAL_NAME, oldTechnicalName, technicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (Documentation)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				InternalEObject newDocumentation = (InternalEObject)documentation;
				NotificationChain msgs =  oldDocumentation.eInverseRemove(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, null);
				if (newDocumentation.eInternalContainer() == null) {
					msgs =  newDocumentation.eInverseAdd(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
		Documentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExtensionEnum getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(FileExtensionEnum newFileExtension) {
		FileExtensionEnum oldFileExtension = fileExtension;
		fileExtension = newFileExtension == null ? FILE_EXTENSION_EDEFAULT : newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__FILE_EXTENSION, oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderClass() {
		return providerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderClass(String newProviderClass) {
		String oldProviderClass = providerClass;
		providerClass = newProviderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_CLASS, oldProviderClass, providerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderInterface() {
		return providerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderInterface(String newProviderInterface) {
		String oldProviderInterface = providerInterface;
		providerInterface = newProviderInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_INTERFACE, oldProviderInterface, providerInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectCategoryEnum getObjectCategory() {
		return objectCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectCategory(BusinessObjectCategoryEnum newObjectCategory) {
		BusinessObjectCategoryEnum oldObjectCategory = objectCategory;
		objectCategory = newObjectCategory == null ? OBJECT_CATEGORY_EDEFAULT : newObjectCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__OBJECT_CATEGORY, oldObjectCategory, objectCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent getProcessComponent() {
		if (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT) return null;
		return (ProcessComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent basicGetProcessComponent() {
		if (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT) return null;
		return (ProcessComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessComponent(ProcessComponent newProcessComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessComponent, CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessComponent(ProcessComponent newProcessComponent) {
		if (newProcessComponent != eInternalContainer() || (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT && newProcessComponent != null)) {
			if (EcoreUtil.isAncestor(this, newProcessComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessComponent != null)
				msgs = ((InternalEObject)newProcessComponent).eInverseAdd(this, CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS, ProcessComponent.class, msgs);
			msgs = basicSetProcessComponent(newProcessComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT, newProcessComponent, newProcessComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBusinessObjectNode getRootNode() {
		if (rootNode != null && rootNode.eIsProxy()) {
			InternalEObject oldRootNode = (InternalEObject)rootNode;
			rootNode = (RootBusinessObjectNode)eResolveProxy(oldRootNode);
			if (rootNode != oldRootNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, oldRootNode, rootNode));
			}
		}
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBusinessObjectNode basicGetRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootNode(RootBusinessObjectNode newRootNode, NotificationChain msgs) {
		RootBusinessObjectNode oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, oldRootNode, newRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(RootBusinessObjectNode newRootNode) {
		if (newRootNode != rootNode) {
			NotificationChain msgs = null;
			if (rootNode != null)
				msgs = ((InternalEObject)rootNode).eInverseRemove(this, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, RootBusinessObjectNode.class, msgs);
			if (newRootNode != null)
				msgs = ((InternalEObject)newRootNode).eInverseAdd(this, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, RootBusinessObjectNode.class, msgs);
			msgs = basicSetRootNode(newRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, newRootNode, newRootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				if (documentation != null)
					msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION, null, msgs);
				return basicSetDocumentation((Documentation)otherEnd, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessComponent((ProcessComponent)otherEnd, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				if (rootNode != null)
					msgs = ((InternalEObject)rootNode).eInverseRemove(this, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, RootBusinessObjectNode.class, msgs);
				return basicSetRootNode((RootBusinessObjectNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				return basicSetProcessComponent(null, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				return basicSetRootNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				return eInternalContainer().eInverseRemove(this, CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS, ProcessComponent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__ID:
				return getId();
			case CasestudymodelPackage.BUSINESS_OBJECT__TECHNICAL_NAME:
				return getTechnicalName();
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case CasestudymodelPackage.BUSINESS_OBJECT__FILE_EXTENSION:
				return getFileExtension();
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_CLASS:
				return getProviderClass();
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_INTERFACE:
				return getProviderInterface();
			case CasestudymodelPackage.BUSINESS_OBJECT__OBJECT_CATEGORY:
				return getObjectCategory();
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				if (resolve) return getProcessComponent();
				return basicGetProcessComponent();
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				if (resolve) return getRootNode();
				return basicGetRootNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__ID:
				setId((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__FILE_EXTENSION:
				setFileExtension((FileExtensionEnum)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_CLASS:
				setProviderClass((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_INTERFACE:
				setProviderInterface((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__OBJECT_CATEGORY:
				setObjectCategory((BusinessObjectCategoryEnum)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				setProcessComponent((ProcessComponent)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				setRootNode((RootBusinessObjectNode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__ID:
				unsetId();
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__FILE_EXTENSION:
				setFileExtension(FILE_EXTENSION_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_CLASS:
				setProviderClass(PROVIDER_CLASS_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_INTERFACE:
				setProviderInterface(PROVIDER_INTERFACE_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__OBJECT_CATEGORY:
				setObjectCategory(OBJECT_CATEGORY_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				setProcessComponent((ProcessComponent)null);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				setRootNode((RootBusinessObjectNode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CasestudymodelPackage.BUSINESS_OBJECT__ID:
				return isSetId();
			case CasestudymodelPackage.BUSINESS_OBJECT__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case CasestudymodelPackage.BUSINESS_OBJECT__DOCUMENTATION:
				return documentation != null;
			case CasestudymodelPackage.BUSINESS_OBJECT__FILE_EXTENSION:
				return fileExtension != FILE_EXTENSION_EDEFAULT;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_CLASS:
				return PROVIDER_CLASS_EDEFAULT == null ? providerClass != null : !PROVIDER_CLASS_EDEFAULT.equals(providerClass);
			case CasestudymodelPackage.BUSINESS_OBJECT__PROVIDER_INTERFACE:
				return PROVIDER_INTERFACE_EDEFAULT == null ? providerInterface != null : !PROVIDER_INTERFACE_EDEFAULT.equals(providerInterface);
			case CasestudymodelPackage.BUSINESS_OBJECT__OBJECT_CATEGORY:
				return objectCategory != OBJECT_CATEGORY_EDEFAULT;
			case CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT:
				return basicGetProcessComponent() != null;
			case CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE:
				return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", technicalName: ");
		result.append(technicalName);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(", providerClass: ");
		result.append(providerClass);
		result.append(", providerInterface: ");
		result.append(providerInterface);
		result.append(", objectCategory: ");
		result.append(objectCategory);
		result.append(')');
		return result.toString();
	}

} //BusinessObjectImpl
