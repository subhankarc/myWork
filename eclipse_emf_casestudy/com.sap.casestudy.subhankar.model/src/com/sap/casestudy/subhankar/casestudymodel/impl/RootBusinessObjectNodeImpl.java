/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Business Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.RootBusinessObjectNodeImpl#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootBusinessObjectNodeImpl extends BusinessObjectNodeImpl implements RootBusinessObjectNode {
	/**
	 * The cached value of the '{@link #getBusinessObject() <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessObject()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject businessObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootBusinessObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.ROOT_BUSINESS_OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessObject() {
		if (businessObject != null && businessObject.eIsProxy()) {
			InternalEObject oldBusinessObject = (InternalEObject)businessObject;
			businessObject = (BusinessObject)eResolveProxy(oldBusinessObject);
			if (businessObject != oldBusinessObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, oldBusinessObject, businessObject));
			}
		}
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessObject() {
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessObject(BusinessObject newBusinessObject, NotificationChain msgs) {
		BusinessObject oldBusinessObject = businessObject;
		businessObject = newBusinessObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, oldBusinessObject, newBusinessObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessObject(BusinessObject newBusinessObject) {
		if (newBusinessObject != businessObject) {
			NotificationChain msgs = null;
			if (businessObject != null)
				msgs = ((InternalEObject)businessObject).eInverseRemove(this, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, BusinessObject.class, msgs);
			if (newBusinessObject != null)
				msgs = ((InternalEObject)newBusinessObject).eInverseAdd(this, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, BusinessObject.class, msgs);
			msgs = basicSetBusinessObject(newBusinessObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT, newBusinessObject, newBusinessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				if (businessObject != null)
					msgs = ((InternalEObject)businessObject).eInverseRemove(this, CasestudymodelPackage.BUSINESS_OBJECT__ROOT_NODE, BusinessObject.class, msgs);
				return basicSetBusinessObject((BusinessObject)otherEnd, msgs);
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
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				return basicSetBusinessObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				if (resolve) return getBusinessObject();
				return basicGetBusinessObject();
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
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)newValue);
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
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)null);
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
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT:
				return businessObject != null;
		}
		return super.eIsSet(featureID);
	}

} //RootBusinessObjectNodeImpl
