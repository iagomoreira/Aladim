/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.AladimPackage;
import aladim.domainFunction;
import aladim.interactionSpace;
import aladim.interfaceModel;
import aladim.transitionAction;
import aladim.transitionNavigation;
import aladim.transitionReaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aladim.impl.interfaceModelImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link aladim.impl.interfaceModelImpl#getInteractionSpaces <em>Interaction Spaces</em>}</li>
 *   <li>{@link aladim.impl.interfaceModelImpl#getDomainFunctions <em>Domain Functions</em>}</li>
 *   <li>{@link aladim.impl.interfaceModelImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link aladim.impl.interfaceModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link aladim.impl.interfaceModelImpl#getNavigations <em>Navigations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interfaceModelImpl extends EObjectImpl implements interfaceModel {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteractionSpaces() <em>Interaction Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<interactionSpace> interactionSpaces;

	/**
	 * The cached value of the '{@link #getDomainFunctions() <em>Domain Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<domainFunction> domainFunctions;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<transitionReaction> reactions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<transitionAction> actions;

	/**
	 * The cached value of the '{@link #getNavigations() <em>Navigations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigations()
	 * @generated
	 * @ordered
	 */
	protected EList<transitionNavigation> navigations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected interfaceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AladimPackage.Literals.INTERFACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.INTERFACE_MODEL__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<interactionSpace> getInteractionSpaces() {
		if (interactionSpaces == null) {
			interactionSpaces = new EObjectContainmentEList<interactionSpace>(interactionSpace.class, this, AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES);
		}
		return interactionSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<domainFunction> getDomainFunctions() {
		if (domainFunctions == null) {
			domainFunctions = new EObjectContainmentEList<domainFunction>(domainFunction.class, this, AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS);
		}
		return domainFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<transitionReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<transitionReaction>(transitionReaction.class, this, AladimPackage.INTERFACE_MODEL__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<transitionAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<transitionAction>(transitionAction.class, this, AladimPackage.INTERFACE_MODEL__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<transitionNavigation> getNavigations() {
		if (navigations == null) {
			navigations = new EObjectContainmentEList<transitionNavigation>(transitionNavigation.class, this, AladimPackage.INTERFACE_MODEL__NAVIGATIONS);
		}
		return navigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES:
				return ((InternalEList<?>)getInteractionSpaces()).basicRemove(otherEnd, msgs);
			case AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS:
				return ((InternalEList<?>)getDomainFunctions()).basicRemove(otherEnd, msgs);
			case AladimPackage.INTERFACE_MODEL__REACTIONS:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case AladimPackage.INTERFACE_MODEL__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case AladimPackage.INTERFACE_MODEL__NAVIGATIONS:
				return ((InternalEList<?>)getNavigations()).basicRemove(otherEnd, msgs);
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
			case AladimPackage.INTERFACE_MODEL__APPLICATION:
				return getApplication();
			case AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES:
				return getInteractionSpaces();
			case AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS:
				return getDomainFunctions();
			case AladimPackage.INTERFACE_MODEL__REACTIONS:
				return getReactions();
			case AladimPackage.INTERFACE_MODEL__ACTIONS:
				return getActions();
			case AladimPackage.INTERFACE_MODEL__NAVIGATIONS:
				return getNavigations();
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
			case AladimPackage.INTERFACE_MODEL__APPLICATION:
				setApplication((String)newValue);
				return;
			case AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES:
				getInteractionSpaces().clear();
				getInteractionSpaces().addAll((Collection<? extends interactionSpace>)newValue);
				return;
			case AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS:
				getDomainFunctions().clear();
				getDomainFunctions().addAll((Collection<? extends domainFunction>)newValue);
				return;
			case AladimPackage.INTERFACE_MODEL__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends transitionReaction>)newValue);
				return;
			case AladimPackage.INTERFACE_MODEL__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends transitionAction>)newValue);
				return;
			case AladimPackage.INTERFACE_MODEL__NAVIGATIONS:
				getNavigations().clear();
				getNavigations().addAll((Collection<? extends transitionNavigation>)newValue);
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
			case AladimPackage.INTERFACE_MODEL__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES:
				getInteractionSpaces().clear();
				return;
			case AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS:
				getDomainFunctions().clear();
				return;
			case AladimPackage.INTERFACE_MODEL__REACTIONS:
				getReactions().clear();
				return;
			case AladimPackage.INTERFACE_MODEL__ACTIONS:
				getActions().clear();
				return;
			case AladimPackage.INTERFACE_MODEL__NAVIGATIONS:
				getNavigations().clear();
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
			case AladimPackage.INTERFACE_MODEL__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case AladimPackage.INTERFACE_MODEL__INTERACTION_SPACES:
				return interactionSpaces != null && !interactionSpaces.isEmpty();
			case AladimPackage.INTERFACE_MODEL__DOMAIN_FUNCTIONS:
				return domainFunctions != null && !domainFunctions.isEmpty();
			case AladimPackage.INTERFACE_MODEL__REACTIONS:
				return reactions != null && !reactions.isEmpty();
			case AladimPackage.INTERFACE_MODEL__ACTIONS:
				return actions != null && !actions.isEmpty();
			case AladimPackage.INTERFACE_MODEL__NAVIGATIONS:
				return navigations != null && !navigations.isEmpty();
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
		result.append(" (application: ");
		result.append(application);
		result.append(')');
		return result.toString();
	}

} //interfaceModelImpl
