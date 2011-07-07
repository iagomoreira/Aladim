/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.util;

import aladim.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see aladim.AladimPackage
 * @generated
 */
public class AladimSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AladimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AladimSwitch() {
		if (modelPackage == null) {
			modelPackage = AladimPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AladimPackage.INTERFACE_MODEL: {
				interfaceModel interfaceModel = (interfaceModel)theEObject;
				T result = caseinterfaceModel(interfaceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.INTERACTION_SPACE: {
				interactionSpace interactionSpace = (interactionSpace)theEObject;
				T result = caseinteractionSpace(interactionSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.COMPOSITE_INTERACTION: {
				compositeInteraction compositeInteraction = (compositeInteraction)theEObject;
				T result = casecompositeInteraction(compositeInteraction);
				if (result == null) result = caseInteraction(compositeInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.ENTER_INFORMATION: {
				enterInformation enterInformation = (enterInformation)theEObject;
				T result = caseenterInformation(enterInformation);
				if (result == null) result = casebasicInteraction(enterInformation);
				if (result == null) result = caseInteraction(enterInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.SELECT_INFORMATION: {
				selectInformation selectInformation = (selectInformation)theEObject;
				T result = caseselectInformation(selectInformation);
				if (result == null) result = casebasicInteraction(selectInformation);
				if (result == null) result = caseInteraction(selectInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.PERCEIVE_INFORRMATION: {
				perceiveInforrmation perceiveInforrmation = (perceiveInforrmation)theEObject;
				T result = caseperceiveInforrmation(perceiveInforrmation);
				if (result == null) result = casebasicInteraction(perceiveInforrmation);
				if (result == null) result = caseInteraction(perceiveInforrmation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.BASIC_INTERACTION: {
				basicInteraction basicInteraction = (basicInteraction)theEObject;
				T result = casebasicInteraction(basicInteraction);
				if (result == null) result = caseInteraction(basicInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.ACTIVATE: {
				activate activate = (activate)theEObject;
				T result = caseactivate(activate);
				if (result == null) result = casebasicInteraction(activate);
				if (result == null) result = caseInteraction(activate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.JOIN: {
				join join = (join)theEObject;
				T result = casejoin(join);
				if (result == null) result = casecompositeInteraction(join);
				if (result == null) result = caseInteraction(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.SEQUENCE: {
				sequence sequence = (sequence)theEObject;
				T result = casesequence(sequence);
				if (result == null) result = casecompositeInteraction(sequence);
				if (result == null) result = caseInteraction(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.CHOOSE: {
				choose choose = (choose)theEObject;
				T result = casechoose(choose);
				if (result == null) result = casecompositeInteraction(choose);
				if (result == null) result = caseInteraction(choose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.REPEAT: {
				repeat repeat = (repeat)theEObject;
				T result = caserepeat(repeat);
				if (result == null) result = casecompositeInteraction(repeat);
				if (result == null) result = caseInteraction(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.COMBINE: {
				combine combine = (combine)theEObject;
				T result = casecombine(combine);
				if (result == null) result = casecompositeInteraction(combine);
				if (result == null) result = caseInteraction(combine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.DOMAIN_FUNCTION: {
				domainFunction domainFunction = (domainFunction)theEObject;
				T result = casedomainFunction(domainFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.TRANSITION_ACTION: {
				transitionAction transitionAction = (transitionAction)theEObject;
				T result = casetransitionAction(transitionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.TRANSITION_REACTION: {
				transitionReaction transitionReaction = (transitionReaction)theEObject;
				T result = casetransitionReaction(transitionReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.TRANSITION_REACTION_SUCCESS: {
				transitionReactionSuccess transitionReactionSuccess = (transitionReactionSuccess)theEObject;
				T result = casetransitionReactionSuccess(transitionReactionSuccess);
				if (result == null) result = casetransitionReaction(transitionReactionSuccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.TRANSITION_REACTION_FAIL: {
				transitionReactionFail transitionReactionFail = (transitionReactionFail)theEObject;
				T result = casetransitionReactionFail(transitionReactionFail);
				if (result == null) result = casetransitionReaction(transitionReactionFail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.TRANSITION_NAVIGATION: {
				transitionNavigation transitionNavigation = (transitionNavigation)theEObject;
				T result = casetransitionNavigation(transitionNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AladimPackage.NAVIGATE: {
				navigate navigate = (navigate)theEObject;
				T result = casenavigate(navigate);
				if (result == null) result = casebasicInteraction(navigate);
				if (result == null) result = caseInteraction(navigate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interface Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interface Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinterfaceModel(interfaceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interaction Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interaction Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinteractionSpace(interactionSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>composite Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>composite Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompositeInteraction(compositeInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>enter Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>enter Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseenterInformation(enterInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>select Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>select Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseselectInformation(selectInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>perceive Inforrmation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>perceive Inforrmation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseperceiveInforrmation(perceiveInforrmation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>basic Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>basic Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebasicInteraction(basicInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>activate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>activate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseactivate(activate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejoin(join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesequence(sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>choose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>choose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechoose(choose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserepeat(repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>combine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>combine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecombine(combine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>domain Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>domain Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedomainFunction(domainFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransitionAction(transitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransitionReaction(transitionReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition Reaction Success</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition Reaction Success</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransitionReactionSuccess(transitionReactionSuccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition Reaction Fail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition Reaction Fail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransitionReactionFail(transitionReactionFail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transition Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transition Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransitionNavigation(transitionNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>navigate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>navigate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenavigate(navigate object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //AladimSwitch
