/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.AladimPackage;
import aladim.interactionSpace;
import aladim.transitionNavigation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>transition Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aladim.impl.transitionNavigationImpl#getName <em>Name</em>}</li>
 *   <li>{@link aladim.impl.transitionNavigationImpl#getTnFrom <em>Tn From</em>}</li>
 *   <li>{@link aladim.impl.transitionNavigationImpl#getTnTo <em>Tn To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class transitionNavigationImpl extends EObjectImpl implements transitionNavigation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTnFrom() <em>Tn From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTnFrom()
	 * @generated
	 * @ordered
	 */
	protected interactionSpace tnFrom;

	/**
	 * The cached value of the '{@link #getTnTo() <em>Tn To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTnTo()
	 * @generated
	 * @ordered
	 */
	protected interactionSpace tnTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected transitionNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AladimPackage.Literals.TRANSITION_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_NAVIGATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace getTnFrom() {
		if (tnFrom != null && tnFrom.eIsProxy()) {
			InternalEObject oldTnFrom = (InternalEObject)tnFrom;
			tnFrom = (interactionSpace)eResolveProxy(oldTnFrom);
			if (tnFrom != oldTnFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_NAVIGATION__TN_FROM, oldTnFrom, tnFrom));
			}
		}
		return tnFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace basicGetTnFrom() {
		return tnFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTnFrom(interactionSpace newTnFrom) {
		interactionSpace oldTnFrom = tnFrom;
		tnFrom = newTnFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_NAVIGATION__TN_FROM, oldTnFrom, tnFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace getTnTo() {
		if (tnTo != null && tnTo.eIsProxy()) {
			InternalEObject oldTnTo = (InternalEObject)tnTo;
			tnTo = (interactionSpace)eResolveProxy(oldTnTo);
			if (tnTo != oldTnTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_NAVIGATION__TN_TO, oldTnTo, tnTo));
			}
		}
		return tnTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace basicGetTnTo() {
		return tnTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTnTo(interactionSpace newTnTo) {
		interactionSpace oldTnTo = tnTo;
		tnTo = newTnTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_NAVIGATION__TN_TO, oldTnTo, tnTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AladimPackage.TRANSITION_NAVIGATION__NAME:
				return getName();
			case AladimPackage.TRANSITION_NAVIGATION__TN_FROM:
				if (resolve) return getTnFrom();
				return basicGetTnFrom();
			case AladimPackage.TRANSITION_NAVIGATION__TN_TO:
				if (resolve) return getTnTo();
				return basicGetTnTo();
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
			case AladimPackage.TRANSITION_NAVIGATION__NAME:
				setName((String)newValue);
				return;
			case AladimPackage.TRANSITION_NAVIGATION__TN_FROM:
				setTnFrom((interactionSpace)newValue);
				return;
			case AladimPackage.TRANSITION_NAVIGATION__TN_TO:
				setTnTo((interactionSpace)newValue);
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
			case AladimPackage.TRANSITION_NAVIGATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AladimPackage.TRANSITION_NAVIGATION__TN_FROM:
				setTnFrom((interactionSpace)null);
				return;
			case AladimPackage.TRANSITION_NAVIGATION__TN_TO:
				setTnTo((interactionSpace)null);
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
			case AladimPackage.TRANSITION_NAVIGATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AladimPackage.TRANSITION_NAVIGATION__TN_FROM:
				return tnFrom != null;
			case AladimPackage.TRANSITION_NAVIGATION__TN_TO:
				return tnTo != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //transitionNavigationImpl
