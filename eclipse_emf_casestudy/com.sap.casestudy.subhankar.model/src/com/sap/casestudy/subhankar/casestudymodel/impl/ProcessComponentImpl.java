/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getDeploymentUnit <em>Deployment Unit</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getNameKeyName <em>Name Key Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getNameKeyNamespace <em>Name Key Namespace</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.ProcessComponentImpl#getBusinessObjects <em>Business Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessComponentImpl extends EObjectImpl implements ProcessComponent {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameKeyName() <em>Name Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameKeyName() <em>Name Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKeyName()
	 * @generated
	 * @ordered
	 */
	protected String nameKeyName = NAME_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameKeyNamespace() <em>Name Key Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKeyNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_KEY_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameKeyNamespace() <em>Name Key Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKeyNamespace()
	 * @generated
	 * @ordered
	 */
	protected String nameKeyNamespace = NAME_KEY_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessComponentCategoryEnum CATEGORY_EDEFAULT = ProcessComponentCategoryEnum.APPLICATION_PROCESS_COMPONENT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ProcessComponentCategoryEnum category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessObjects() <em>Business Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObject> businessObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.PROCESS_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CasestudymodelPackage.PROCESS_COMPONENT__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__TECHNICAL_NAME, oldTechnicalName, technicalName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION, oldDocumentation, documentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION, oldDocumentation, newDocumentation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION, newDocumentation, newDocumentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__FILE_EXTENSION, oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnit getDeploymentUnit() {
		if (eContainerFeatureID() != CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT) return null;
		return (DeploymentUnit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnit basicGetDeploymentUnit() {
		if (eContainerFeatureID() != CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT) return null;
		return (DeploymentUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentUnit(DeploymentUnit newDeploymentUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeploymentUnit, CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentUnit(DeploymentUnit newDeploymentUnit) {
		if (newDeploymentUnit != eInternalContainer() || (eContainerFeatureID() != CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT && newDeploymentUnit != null)) {
			if (EcoreUtil.isAncestor(this, newDeploymentUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeploymentUnit != null)
				msgs = ((InternalEObject)newDeploymentUnit).eInverseAdd(this, CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS, DeploymentUnit.class, msgs);
			msgs = basicSetDeploymentUnit(newDeploymentUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT, newDeploymentUnit, newDeploymentUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameKeyName() {
		return nameKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameKeyName(String newNameKeyName) {
		String oldNameKeyName = nameKeyName;
		nameKeyName = newNameKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAME, oldNameKeyName, nameKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameKeyNamespace() {
		return nameKeyNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameKeyNamespace(String newNameKeyNamespace) {
		String oldNameKeyNamespace = nameKeyNamespace;
		nameKeyNamespace = newNameKeyNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAMESPACE, oldNameKeyNamespace, nameKeyNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentCategoryEnum getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(ProcessComponentCategoryEnum newCategory) {
		ProcessComponentCategoryEnum oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.PROCESS_COMPONENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObject> getBusinessObjects() {
		if (businessObjects == null) {
			businessObjects = new EObjectContainmentWithInverseEList.Resolving<BusinessObject>(BusinessObject.class, this, CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS, CasestudymodelPackage.BUSINESS_OBJECT__PROCESS_COMPONENT);
		}
		return businessObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				if (documentation != null)
					msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION, null, msgs);
				return basicSetDocumentation((Documentation)otherEnd, msgs);
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeploymentUnit((DeploymentUnit)otherEnd, msgs);
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessObjects()).basicAdd(otherEnd, msgs);
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
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				return basicSetDeploymentUnit(null, msgs);
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				return ((InternalEList<?>)getBusinessObjects()).basicRemove(otherEnd, msgs);
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
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				return eInternalContainer().eInverseRemove(this, CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS, DeploymentUnit.class, msgs);
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
			case CasestudymodelPackage.PROCESS_COMPONENT__ID:
				return getId();
			case CasestudymodelPackage.PROCESS_COMPONENT__TECHNICAL_NAME:
				return getTechnicalName();
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case CasestudymodelPackage.PROCESS_COMPONENT__FILE_EXTENSION:
				return getFileExtension();
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				if (resolve) return getDeploymentUnit();
				return basicGetDeploymentUnit();
			case CasestudymodelPackage.PROCESS_COMPONENT__CODE:
				return getCode();
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAME:
				return getNameKeyName();
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAMESPACE:
				return getNameKeyNamespace();
			case CasestudymodelPackage.PROCESS_COMPONENT__CATEGORY:
				return getCategory();
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				return getBusinessObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CasestudymodelPackage.PROCESS_COMPONENT__ID:
				setId((String)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__FILE_EXTENSION:
				setFileExtension((FileExtensionEnum)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				setDeploymentUnit((DeploymentUnit)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__CODE:
				setCode((String)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAME:
				setNameKeyName((String)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAMESPACE:
				setNameKeyNamespace((String)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__CATEGORY:
				setCategory((ProcessComponentCategoryEnum)newValue);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				getBusinessObjects().clear();
				getBusinessObjects().addAll((Collection<? extends BusinessObject>)newValue);
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
			case CasestudymodelPackage.PROCESS_COMPONENT__ID:
				unsetId();
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__FILE_EXTENSION:
				setFileExtension(FILE_EXTENSION_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				setDeploymentUnit((DeploymentUnit)null);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAME:
				setNameKeyName(NAME_KEY_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAMESPACE:
				setNameKeyNamespace(NAME_KEY_NAMESPACE_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				getBusinessObjects().clear();
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
			case CasestudymodelPackage.PROCESS_COMPONENT__ID:
				return isSetId();
			case CasestudymodelPackage.PROCESS_COMPONENT__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case CasestudymodelPackage.PROCESS_COMPONENT__DOCUMENTATION:
				return documentation != null;
			case CasestudymodelPackage.PROCESS_COMPONENT__FILE_EXTENSION:
				return fileExtension != FILE_EXTENSION_EDEFAULT;
			case CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT:
				return basicGetDeploymentUnit() != null;
			case CasestudymodelPackage.PROCESS_COMPONENT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAME:
				return NAME_KEY_NAME_EDEFAULT == null ? nameKeyName != null : !NAME_KEY_NAME_EDEFAULT.equals(nameKeyName);
			case CasestudymodelPackage.PROCESS_COMPONENT__NAME_KEY_NAMESPACE:
				return NAME_KEY_NAMESPACE_EDEFAULT == null ? nameKeyNamespace != null : !NAME_KEY_NAMESPACE_EDEFAULT.equals(nameKeyNamespace);
			case CasestudymodelPackage.PROCESS_COMPONENT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CasestudymodelPackage.PROCESS_COMPONENT__BUSINESS_OBJECTS:
				return businessObjects != null && !businessObjects.isEmpty();
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
		result.append(", code: ");
		result.append(code);
		result.append(", nameKeyName: ");
		result.append(nameKeyName);
		result.append(", nameKeyNamespace: ");
		result.append(nameKeyNamespace);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ProcessComponentImpl
