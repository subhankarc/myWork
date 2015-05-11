/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;

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
 * An implementation of the model object '<em><b>Business Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.BusinessObjectNodeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessObjectNodeImpl extends EObjectImpl implements BusinessObjectNode {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BuObjectNodeCategoryEnum CATEGORY_EDEFAULT = BuObjectNodeCategoryEnum.TRANSFORMATION_NODE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected BuObjectNodeCategoryEnum category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildNodes() <em>Child Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObjectNode> childNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.BUSINESS_OBJECT_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__TECHNICAL_NAME, oldTechnicalName, technicalName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION, oldDocumentation, documentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuObjectNodeCategoryEnum getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(BuObjectNodeCategoryEnum newCategory) {
		BuObjectNodeCategoryEnum oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObjectNode> getChildNodes() {
		if (childNodes == null) {
			childNodes = new EObjectContainmentWithInverseEList.Resolving<BusinessObjectNode>(BusinessObjectNode.class, this, CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES, CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT);
		}
		return childNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectNode getParent() {
		if (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT) return null;
		return (BusinessObjectNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectNode basicGetParent() {
		if (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT) return null;
		return (BusinessObjectNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BusinessObjectNode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BusinessObjectNode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES, BusinessObjectNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT, newParent, newParent));
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				if (documentation != null)
					msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION, null, msgs);
				return basicSetDocumentation((Documentation)otherEnd, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildNodes()).basicAdd(otherEnd, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BusinessObjectNode)otherEnd, msgs);
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				return ((InternalEList<?>)getChildNodes()).basicRemove(otherEnd, msgs);
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				return basicSetParent(null, msgs);
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES, BusinessObjectNode.class, msgs);
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID:
				return getId();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__TECHNICAL_NAME:
				return getTechnicalName();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CATEGORY:
				return getCategory();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				return getChildNodes();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID:
				setId((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CATEGORY:
				setCategory((BuObjectNodeCategoryEnum)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection<? extends BusinessObjectNode>)newValue);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				setParent((BusinessObjectNode)newValue);
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID:
				unsetId();
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				getChildNodes().clear();
				return;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				setParent((BusinessObjectNode)null);
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
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__ID:
				return isSetId();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__DOCUMENTATION:
				return documentation != null;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE__PARENT:
				return basicGetParent() != null;
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
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //BusinessObjectNodeImpl
