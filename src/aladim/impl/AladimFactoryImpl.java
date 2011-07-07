/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AladimFactoryImpl extends EFactoryImpl implements AladimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AladimFactory init() {
		try {
			AladimFactory theAladimFactory = (AladimFactory)EPackage.Registry.INSTANCE.getEFactory("aladim"); 
			if (theAladimFactory != null) {
				return theAladimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AladimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AladimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AladimPackage.INTERFACE_MODEL: return createinterfaceModel();
			case AladimPackage.INTERACTION_SPACE: return createinteractionSpace();
			case AladimPackage.ENTER_INFORMATION: return createenterInformation();
			case AladimPackage.SELECT_INFORMATION: return createselectInformation();
			case AladimPackage.PERCEIVE_INFORRMATION: return createperceiveInforrmation();
			case AladimPackage.ACTIVATE: return createactivate();
			case AladimPackage.JOIN: return createjoin();
			case AladimPackage.SEQUENCE: return createsequence();
			case AladimPackage.CHOOSE: return createchoose();
			case AladimPackage.REPEAT: return createrepeat();
			case AladimPackage.COMBINE: return createcombine();
			case AladimPackage.DOMAIN_FUNCTION: return createdomainFunction();
			case AladimPackage.TRANSITION_ACTION: return createtransitionAction();
			case AladimPackage.TRANSITION_REACTION_SUCCESS: return createtransitionReactionSuccess();
			case AladimPackage.TRANSITION_REACTION_FAIL: return createtransitionReactionFail();
			case AladimPackage.TRANSITION_NAVIGATION: return createtransitionNavigation();
			case AladimPackage.NAVIGATE: return createnavigate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceModel createinterfaceModel() {
		interfaceModelImpl interfaceModel = new interfaceModelImpl();
		return interfaceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace createinteractionSpace() {
		interactionSpaceImpl interactionSpace = new interactionSpaceImpl();
		return interactionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public enterInformation createenterInformation() {
		enterInformationImpl enterInformation = new enterInformationImpl();
		return enterInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public selectInformation createselectInformation() {
		selectInformationImpl selectInformation = new selectInformationImpl();
		return selectInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public perceiveInforrmation createperceiveInforrmation() {
		perceiveInforrmationImpl perceiveInforrmation = new perceiveInforrmationImpl();
		return perceiveInforrmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activate createactivate() {
		activateImpl activate = new activateImpl();
		return activate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public join createjoin() {
		joinImpl join = new joinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sequence createsequence() {
		sequenceImpl sequence = new sequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public choose createchoose() {
		chooseImpl choose = new chooseImpl();
		return choose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public repeat createrepeat() {
		repeatImpl repeat = new repeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public combine createcombine() {
		combineImpl combine = new combineImpl();
		return combine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domainFunction createdomainFunction() {
		domainFunctionImpl domainFunction = new domainFunctionImpl();
		return domainFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transitionAction createtransitionAction() {
		transitionActionImpl transitionAction = new transitionActionImpl();
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transitionReactionSuccess createtransitionReactionSuccess() {
		transitionReactionSuccessImpl transitionReactionSuccess = new transitionReactionSuccessImpl();
		return transitionReactionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transitionReactionFail createtransitionReactionFail() {
		transitionReactionFailImpl transitionReactionFail = new transitionReactionFailImpl();
		return transitionReactionFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transitionNavigation createtransitionNavigation() {
		transitionNavigationImpl transitionNavigation = new transitionNavigationImpl();
		return transitionNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public navigate createnavigate() {
		navigateImpl navigate = new navigateImpl();
		return navigate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AladimPackage getAladimPackage() {
		return (AladimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AladimPackage getPackage() {
		return AladimPackage.eINSTANCE;
	}

} //AladimFactoryImpl
