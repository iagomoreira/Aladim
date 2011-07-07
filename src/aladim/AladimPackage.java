/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see aladim.AladimFactory
 * @model kind="package"
 * @generated
 */
public interface AladimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aladim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "aladim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aladim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AladimPackage eINSTANCE = aladim.impl.AladimPackageImpl.init();

	/**
	 * The meta object id for the '{@link aladim.impl.interfaceModelImpl <em>interface Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.interfaceModelImpl
	 * @see aladim.impl.AladimPackageImpl#getinterfaceModel()
	 * @generated
	 */
	int INTERFACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Interaction Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__INTERACTION_SPACES = 1;

	/**
	 * The feature id for the '<em><b>Domain Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__DOMAIN_FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__REACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Navigations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL__NAVIGATIONS = 5;

	/**
	 * The number of structural features of the '<em>interface Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link aladim.impl.interactionSpaceImpl <em>interaction Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.interactionSpaceImpl
	 * @see aladim.impl.AladimPackageImpl#getinteractionSpace()
	 * @generated
	 */
	int INTERACTION_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPACE__INTERACTIONS = 1;

	/**
	 * The number of structural features of the '<em>interaction Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aladim.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.InteractionImpl
	 * @see aladim.impl.AladimPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 13;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link aladim.impl.compositeInteractionImpl <em>composite Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.compositeInteractionImpl
	 * @see aladim.impl.AladimPackageImpl#getcompositeInteraction()
	 * @generated
	 */
	int COMPOSITE_INTERACTION = 2;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERACTION__BASIC_INTERACTIONS = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERACTION__COMPOSITES = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>composite Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aladim.impl.basicInteractionImpl <em>basic Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.basicInteractionImpl
	 * @see aladim.impl.AladimPackageImpl#getbasicInteraction()
	 * @generated
	 */
	int BASIC_INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERACTION__NAME = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>basic Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aladim.impl.enterInformationImpl <em>enter Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.enterInformationImpl
	 * @see aladim.impl.AladimPackageImpl#getenterInformation()
	 * @generated
	 */
	int ENTER_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_INFORMATION__NAME = BASIC_INTERACTION__NAME;

	/**
	 * The number of structural features of the '<em>enter Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTER_INFORMATION_FEATURE_COUNT = BASIC_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.selectInformationImpl <em>select Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.selectInformationImpl
	 * @see aladim.impl.AladimPackageImpl#getselectInformation()
	 * @generated
	 */
	int SELECT_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INFORMATION__NAME = BASIC_INTERACTION__NAME;

	/**
	 * The number of structural features of the '<em>select Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INFORMATION_FEATURE_COUNT = BASIC_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.perceiveInforrmationImpl <em>perceive Inforrmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.perceiveInforrmationImpl
	 * @see aladim.impl.AladimPackageImpl#getperceiveInforrmation()
	 * @generated
	 */
	int PERCEIVE_INFORRMATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEIVE_INFORRMATION__NAME = BASIC_INTERACTION__NAME;

	/**
	 * The number of structural features of the '<em>perceive Inforrmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEIVE_INFORRMATION_FEATURE_COUNT = BASIC_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.activateImpl <em>activate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.activateImpl
	 * @see aladim.impl.AladimPackageImpl#getactivate()
	 * @generated
	 */
	int ACTIVATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE__NAME = BASIC_INTERACTION__NAME;

	/**
	 * The number of structural features of the '<em>activate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_FEATURE_COUNT = BASIC_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.joinImpl <em>join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.joinImpl
	 * @see aladim.impl.AladimPackageImpl#getjoin()
	 * @generated
	 */
	int JOIN = 8;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__BASIC_INTERACTIONS = COMPOSITE_INTERACTION__BASIC_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COMPOSITES = COMPOSITE_INTERACTION__COMPOSITES;

	/**
	 * The number of structural features of the '<em>join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = COMPOSITE_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.sequenceImpl <em>sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.sequenceImpl
	 * @see aladim.impl.AladimPackageImpl#getsequence()
	 * @generated
	 */
	int SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BASIC_INTERACTIONS = COMPOSITE_INTERACTION__BASIC_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPOSITES = COMPOSITE_INTERACTION__COMPOSITES;

	/**
	 * The number of structural features of the '<em>sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = COMPOSITE_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.chooseImpl <em>choose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.chooseImpl
	 * @see aladim.impl.AladimPackageImpl#getchoose()
	 * @generated
	 */
	int CHOOSE = 10;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE__BASIC_INTERACTIONS = COMPOSITE_INTERACTION__BASIC_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE__COMPOSITES = COMPOSITE_INTERACTION__COMPOSITES;

	/**
	 * The number of structural features of the '<em>choose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_FEATURE_COUNT = COMPOSITE_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.repeatImpl <em>repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.repeatImpl
	 * @see aladim.impl.AladimPackageImpl#getrepeat()
	 * @generated
	 */
	int REPEAT = 11;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__BASIC_INTERACTIONS = COMPOSITE_INTERACTION__BASIC_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COMPOSITES = COMPOSITE_INTERACTION__COMPOSITES;

	/**
	 * The number of structural features of the '<em>repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = COMPOSITE_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.combineImpl <em>combine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.combineImpl
	 * @see aladim.impl.AladimPackageImpl#getcombine()
	 * @generated
	 */
	int COMBINE = 12;

	/**
	 * The feature id for the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__BASIC_INTERACTIONS = COMPOSITE_INTERACTION__BASIC_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__COMPOSITES = COMPOSITE_INTERACTION__COMPOSITES;

	/**
	 * The number of structural features of the '<em>combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_FEATURE_COUNT = COMPOSITE_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.domainFunctionImpl <em>domain Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.domainFunctionImpl
	 * @see aladim.impl.AladimPackageImpl#getdomainFunction()
	 * @generated
	 */
	int DOMAIN_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FUNCTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>domain Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link aladim.impl.transitionActionImpl <em>transition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.transitionActionImpl
	 * @see aladim.impl.AladimPackageImpl#gettransitionAction()
	 * @generated
	 */
	int TRANSITION_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Ta From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__TA_FROM = 0;

	/**
	 * The feature id for the '<em><b>Ta To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__TA_TO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aladim.impl.transitionReactionImpl <em>transition Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.transitionReactionImpl
	 * @see aladim.impl.AladimPackageImpl#gettransitionReaction()
	 * @generated
	 */
	int TRANSITION_REACTION = 16;

	/**
	 * The feature id for the '<em><b>Tr From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION__TR_FROM = 0;

	/**
	 * The feature id for the '<em><b>Tr To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION__TR_TO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>transition Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aladim.impl.transitionReactionSuccessImpl <em>transition Reaction Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.transitionReactionSuccessImpl
	 * @see aladim.impl.AladimPackageImpl#gettransitionReactionSuccess()
	 * @generated
	 */
	int TRANSITION_REACTION_SUCCESS = 17;

	/**
	 * The feature id for the '<em><b>Tr From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_SUCCESS__TR_FROM = TRANSITION_REACTION__TR_FROM;

	/**
	 * The feature id for the '<em><b>Tr To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_SUCCESS__TR_TO = TRANSITION_REACTION__TR_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_SUCCESS__NAME = TRANSITION_REACTION__NAME;

	/**
	 * The number of structural features of the '<em>transition Reaction Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_SUCCESS_FEATURE_COUNT = TRANSITION_REACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aladim.impl.transitionReactionFailImpl <em>transition Reaction Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.transitionReactionFailImpl
	 * @see aladim.impl.AladimPackageImpl#gettransitionReactionFail()
	 * @generated
	 */
	int TRANSITION_REACTION_FAIL = 18;

	/**
	 * The feature id for the '<em><b>Tr From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_FAIL__TR_FROM = TRANSITION_REACTION__TR_FROM;

	/**
	 * The feature id for the '<em><b>Tr To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_FAIL__TR_TO = TRANSITION_REACTION__TR_TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_FAIL__NAME = TRANSITION_REACTION__NAME;

	/**
	 * The number of structural features of the '<em>transition Reaction Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REACTION_FAIL_FEATURE_COUNT = TRANSITION_REACTION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link aladim.impl.transitionNavigationImpl <em>transition Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.transitionNavigationImpl
	 * @see aladim.impl.AladimPackageImpl#gettransitionNavigation()
	 * @generated
	 */
	int TRANSITION_NAVIGATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NAVIGATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tn From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NAVIGATION__TN_FROM = 1;

	/**
	 * The feature id for the '<em><b>Tn To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NAVIGATION__TN_TO = 2;

	/**
	 * The number of structural features of the '<em>transition Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NAVIGATION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link aladim.impl.navigateImpl <em>navigate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aladim.impl.navigateImpl
	 * @see aladim.impl.AladimPackageImpl#getnavigate()
	 * @generated
	 */
	int NAVIGATE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE__NAME = BASIC_INTERACTION__NAME;

	/**
	 * The number of structural features of the '<em>navigate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATE_FEATURE_COUNT = BASIC_INTERACTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aladim.interfaceModel <em>interface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interface Model</em>'.
	 * @see aladim.interfaceModel
	 * @generated
	 */
	EClass getinterfaceModel();

	/**
	 * Returns the meta object for the attribute '{@link aladim.interfaceModel#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see aladim.interfaceModel#getApplication()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EAttribute getinterfaceModel_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interfaceModel#getInteractionSpaces <em>Interaction Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Spaces</em>'.
	 * @see aladim.interfaceModel#getInteractionSpaces()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EReference getinterfaceModel_InteractionSpaces();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interfaceModel#getDomainFunctions <em>Domain Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Functions</em>'.
	 * @see aladim.interfaceModel#getDomainFunctions()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EReference getinterfaceModel_DomainFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interfaceModel#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see aladim.interfaceModel#getReactions()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EReference getinterfaceModel_Reactions();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interfaceModel#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see aladim.interfaceModel#getActions()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EReference getinterfaceModel_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interfaceModel#getNavigations <em>Navigations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigations</em>'.
	 * @see aladim.interfaceModel#getNavigations()
	 * @see #getinterfaceModel()
	 * @generated
	 */
	EReference getinterfaceModel_Navigations();

	/**
	 * Returns the meta object for class '{@link aladim.interactionSpace <em>interaction Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interaction Space</em>'.
	 * @see aladim.interactionSpace
	 * @generated
	 */
	EClass getinteractionSpace();

	/**
	 * Returns the meta object for the attribute '{@link aladim.interactionSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.interactionSpace#getName()
	 * @see #getinteractionSpace()
	 * @generated
	 */
	EAttribute getinteractionSpace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.interactionSpace#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see aladim.interactionSpace#getInteractions()
	 * @see #getinteractionSpace()
	 * @generated
	 */
	EReference getinteractionSpace_Interactions();

	/**
	 * Returns the meta object for class '{@link aladim.compositeInteraction <em>composite Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>composite Interaction</em>'.
	 * @see aladim.compositeInteraction
	 * @generated
	 */
	EClass getcompositeInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.compositeInteraction#getBasicInteractions <em>Basic Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Interactions</em>'.
	 * @see aladim.compositeInteraction#getBasicInteractions()
	 * @see #getcompositeInteraction()
	 * @generated
	 */
	EReference getcompositeInteraction_BasicInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link aladim.compositeInteraction#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see aladim.compositeInteraction#getComposites()
	 * @see #getcompositeInteraction()
	 * @generated
	 */
	EReference getcompositeInteraction_Composites();

	/**
	 * Returns the meta object for class '{@link aladim.enterInformation <em>enter Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>enter Information</em>'.
	 * @see aladim.enterInformation
	 * @generated
	 */
	EClass getenterInformation();

	/**
	 * Returns the meta object for class '{@link aladim.selectInformation <em>select Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>select Information</em>'.
	 * @see aladim.selectInformation
	 * @generated
	 */
	EClass getselectInformation();

	/**
	 * Returns the meta object for class '{@link aladim.perceiveInforrmation <em>perceive Inforrmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>perceive Inforrmation</em>'.
	 * @see aladim.perceiveInforrmation
	 * @generated
	 */
	EClass getperceiveInforrmation();

	/**
	 * Returns the meta object for class '{@link aladim.basicInteraction <em>basic Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>basic Interaction</em>'.
	 * @see aladim.basicInteraction
	 * @generated
	 */
	EClass getbasicInteraction();

	/**
	 * Returns the meta object for the attribute '{@link aladim.basicInteraction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.basicInteraction#getName()
	 * @see #getbasicInteraction()
	 * @generated
	 */
	EAttribute getbasicInteraction_Name();

	/**
	 * Returns the meta object for class '{@link aladim.activate <em>activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>activate</em>'.
	 * @see aladim.activate
	 * @generated
	 */
	EClass getactivate();

	/**
	 * Returns the meta object for class '{@link aladim.join <em>join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>join</em>'.
	 * @see aladim.join
	 * @generated
	 */
	EClass getjoin();

	/**
	 * Returns the meta object for class '{@link aladim.sequence <em>sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sequence</em>'.
	 * @see aladim.sequence
	 * @generated
	 */
	EClass getsequence();

	/**
	 * Returns the meta object for class '{@link aladim.choose <em>choose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>choose</em>'.
	 * @see aladim.choose
	 * @generated
	 */
	EClass getchoose();

	/**
	 * Returns the meta object for class '{@link aladim.repeat <em>repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>repeat</em>'.
	 * @see aladim.repeat
	 * @generated
	 */
	EClass getrepeat();

	/**
	 * Returns the meta object for class '{@link aladim.combine <em>combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>combine</em>'.
	 * @see aladim.combine
	 * @generated
	 */
	EClass getcombine();

	/**
	 * Returns the meta object for class '{@link aladim.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see aladim.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link aladim.domainFunction <em>domain Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>domain Function</em>'.
	 * @see aladim.domainFunction
	 * @generated
	 */
	EClass getdomainFunction();

	/**
	 * Returns the meta object for the attribute '{@link aladim.domainFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.domainFunction#getName()
	 * @see #getdomainFunction()
	 * @generated
	 */
	EAttribute getdomainFunction_Name();

	/**
	 * Returns the meta object for class '{@link aladim.transitionAction <em>transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition Action</em>'.
	 * @see aladim.transitionAction
	 * @generated
	 */
	EClass gettransitionAction();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionAction#getTaFrom <em>Ta From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ta From</em>'.
	 * @see aladim.transitionAction#getTaFrom()
	 * @see #gettransitionAction()
	 * @generated
	 */
	EReference gettransitionAction_TaFrom();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionAction#getTaTo <em>Ta To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ta To</em>'.
	 * @see aladim.transitionAction#getTaTo()
	 * @see #gettransitionAction()
	 * @generated
	 */
	EReference gettransitionAction_TaTo();

	/**
	 * Returns the meta object for the attribute '{@link aladim.transitionAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.transitionAction#getName()
	 * @see #gettransitionAction()
	 * @generated
	 */
	EAttribute gettransitionAction_Name();

	/**
	 * Returns the meta object for class '{@link aladim.transitionReaction <em>transition Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition Reaction</em>'.
	 * @see aladim.transitionReaction
	 * @generated
	 */
	EClass gettransitionReaction();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionReaction#getTrFrom <em>Tr From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr From</em>'.
	 * @see aladim.transitionReaction#getTrFrom()
	 * @see #gettransitionReaction()
	 * @generated
	 */
	EReference gettransitionReaction_TrFrom();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionReaction#getTrTo <em>Tr To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr To</em>'.
	 * @see aladim.transitionReaction#getTrTo()
	 * @see #gettransitionReaction()
	 * @generated
	 */
	EReference gettransitionReaction_TrTo();

	/**
	 * Returns the meta object for the attribute '{@link aladim.transitionReaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.transitionReaction#getName()
	 * @see #gettransitionReaction()
	 * @generated
	 */
	EAttribute gettransitionReaction_Name();

	/**
	 * Returns the meta object for class '{@link aladim.transitionReactionSuccess <em>transition Reaction Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition Reaction Success</em>'.
	 * @see aladim.transitionReactionSuccess
	 * @generated
	 */
	EClass gettransitionReactionSuccess();

	/**
	 * Returns the meta object for class '{@link aladim.transitionReactionFail <em>transition Reaction Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition Reaction Fail</em>'.
	 * @see aladim.transitionReactionFail
	 * @generated
	 */
	EClass gettransitionReactionFail();

	/**
	 * Returns the meta object for class '{@link aladim.transitionNavigation <em>transition Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transition Navigation</em>'.
	 * @see aladim.transitionNavigation
	 * @generated
	 */
	EClass gettransitionNavigation();

	/**
	 * Returns the meta object for the attribute '{@link aladim.transitionNavigation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aladim.transitionNavigation#getName()
	 * @see #gettransitionNavigation()
	 * @generated
	 */
	EAttribute gettransitionNavigation_Name();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionNavigation#getTnFrom <em>Tn From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tn From</em>'.
	 * @see aladim.transitionNavigation#getTnFrom()
	 * @see #gettransitionNavigation()
	 * @generated
	 */
	EReference gettransitionNavigation_TnFrom();

	/**
	 * Returns the meta object for the reference '{@link aladim.transitionNavigation#getTnTo <em>Tn To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tn To</em>'.
	 * @see aladim.transitionNavigation#getTnTo()
	 * @see #gettransitionNavigation()
	 * @generated
	 */
	EReference gettransitionNavigation_TnTo();

	/**
	 * Returns the meta object for class '{@link aladim.navigate <em>navigate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>navigate</em>'.
	 * @see aladim.navigate
	 * @generated
	 */
	EClass getnavigate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AladimFactory getAladimFactory();

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
		 * The meta object literal for the '{@link aladim.impl.interfaceModelImpl <em>interface Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.interfaceModelImpl
		 * @see aladim.impl.AladimPackageImpl#getinterfaceModel()
		 * @generated
		 */
		EClass INTERFACE_MODEL = eINSTANCE.getinterfaceModel();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_MODEL__APPLICATION = eINSTANCE.getinterfaceModel_Application();

		/**
		 * The meta object literal for the '<em><b>Interaction Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__INTERACTION_SPACES = eINSTANCE.getinterfaceModel_InteractionSpaces();

		/**
		 * The meta object literal for the '<em><b>Domain Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__DOMAIN_FUNCTIONS = eINSTANCE.getinterfaceModel_DomainFunctions();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__REACTIONS = eINSTANCE.getinterfaceModel_Reactions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__ACTIONS = eINSTANCE.getinterfaceModel_Actions();

		/**
		 * The meta object literal for the '<em><b>Navigations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MODEL__NAVIGATIONS = eINSTANCE.getinterfaceModel_Navigations();

		/**
		 * The meta object literal for the '{@link aladim.impl.interactionSpaceImpl <em>interaction Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.interactionSpaceImpl
		 * @see aladim.impl.AladimPackageImpl#getinteractionSpace()
		 * @generated
		 */
		EClass INTERACTION_SPACE = eINSTANCE.getinteractionSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_SPACE__NAME = eINSTANCE.getinteractionSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPACE__INTERACTIONS = eINSTANCE.getinteractionSpace_Interactions();

		/**
		 * The meta object literal for the '{@link aladim.impl.compositeInteractionImpl <em>composite Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.compositeInteractionImpl
		 * @see aladim.impl.AladimPackageImpl#getcompositeInteraction()
		 * @generated
		 */
		EClass COMPOSITE_INTERACTION = eINSTANCE.getcompositeInteraction();

		/**
		 * The meta object literal for the '<em><b>Basic Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INTERACTION__BASIC_INTERACTIONS = eINSTANCE.getcompositeInteraction_BasicInteractions();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INTERACTION__COMPOSITES = eINSTANCE.getcompositeInteraction_Composites();

		/**
		 * The meta object literal for the '{@link aladim.impl.enterInformationImpl <em>enter Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.enterInformationImpl
		 * @see aladim.impl.AladimPackageImpl#getenterInformation()
		 * @generated
		 */
		EClass ENTER_INFORMATION = eINSTANCE.getenterInformation();

		/**
		 * The meta object literal for the '{@link aladim.impl.selectInformationImpl <em>select Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.selectInformationImpl
		 * @see aladim.impl.AladimPackageImpl#getselectInformation()
		 * @generated
		 */
		EClass SELECT_INFORMATION = eINSTANCE.getselectInformation();

		/**
		 * The meta object literal for the '{@link aladim.impl.perceiveInforrmationImpl <em>perceive Inforrmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.perceiveInforrmationImpl
		 * @see aladim.impl.AladimPackageImpl#getperceiveInforrmation()
		 * @generated
		 */
		EClass PERCEIVE_INFORRMATION = eINSTANCE.getperceiveInforrmation();

		/**
		 * The meta object literal for the '{@link aladim.impl.basicInteractionImpl <em>basic Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.basicInteractionImpl
		 * @see aladim.impl.AladimPackageImpl#getbasicInteraction()
		 * @generated
		 */
		EClass BASIC_INTERACTION = eINSTANCE.getbasicInteraction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERACTION__NAME = eINSTANCE.getbasicInteraction_Name();

		/**
		 * The meta object literal for the '{@link aladim.impl.activateImpl <em>activate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.activateImpl
		 * @see aladim.impl.AladimPackageImpl#getactivate()
		 * @generated
		 */
		EClass ACTIVATE = eINSTANCE.getactivate();

		/**
		 * The meta object literal for the '{@link aladim.impl.joinImpl <em>join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.joinImpl
		 * @see aladim.impl.AladimPackageImpl#getjoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getjoin();

		/**
		 * The meta object literal for the '{@link aladim.impl.sequenceImpl <em>sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.sequenceImpl
		 * @see aladim.impl.AladimPackageImpl#getsequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getsequence();

		/**
		 * The meta object literal for the '{@link aladim.impl.chooseImpl <em>choose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.chooseImpl
		 * @see aladim.impl.AladimPackageImpl#getchoose()
		 * @generated
		 */
		EClass CHOOSE = eINSTANCE.getchoose();

		/**
		 * The meta object literal for the '{@link aladim.impl.repeatImpl <em>repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.repeatImpl
		 * @see aladim.impl.AladimPackageImpl#getrepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getrepeat();

		/**
		 * The meta object literal for the '{@link aladim.impl.combineImpl <em>combine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.combineImpl
		 * @see aladim.impl.AladimPackageImpl#getcombine()
		 * @generated
		 */
		EClass COMBINE = eINSTANCE.getcombine();

		/**
		 * The meta object literal for the '{@link aladim.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.InteractionImpl
		 * @see aladim.impl.AladimPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '{@link aladim.impl.domainFunctionImpl <em>domain Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.domainFunctionImpl
		 * @see aladim.impl.AladimPackageImpl#getdomainFunction()
		 * @generated
		 */
		EClass DOMAIN_FUNCTION = eINSTANCE.getdomainFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FUNCTION__NAME = eINSTANCE.getdomainFunction_Name();

		/**
		 * The meta object literal for the '{@link aladim.impl.transitionActionImpl <em>transition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.transitionActionImpl
		 * @see aladim.impl.AladimPackageImpl#gettransitionAction()
		 * @generated
		 */
		EClass TRANSITION_ACTION = eINSTANCE.gettransitionAction();

		/**
		 * The meta object literal for the '<em><b>Ta From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ACTION__TA_FROM = eINSTANCE.gettransitionAction_TaFrom();

		/**
		 * The meta object literal for the '<em><b>Ta To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ACTION__TA_TO = eINSTANCE.gettransitionAction_TaTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_ACTION__NAME = eINSTANCE.gettransitionAction_Name();

		/**
		 * The meta object literal for the '{@link aladim.impl.transitionReactionImpl <em>transition Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.transitionReactionImpl
		 * @see aladim.impl.AladimPackageImpl#gettransitionReaction()
		 * @generated
		 */
		EClass TRANSITION_REACTION = eINSTANCE.gettransitionReaction();

		/**
		 * The meta object literal for the '<em><b>Tr From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REACTION__TR_FROM = eINSTANCE.gettransitionReaction_TrFrom();

		/**
		 * The meta object literal for the '<em><b>Tr To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REACTION__TR_TO = eINSTANCE.gettransitionReaction_TrTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_REACTION__NAME = eINSTANCE.gettransitionReaction_Name();

		/**
		 * The meta object literal for the '{@link aladim.impl.transitionReactionSuccessImpl <em>transition Reaction Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.transitionReactionSuccessImpl
		 * @see aladim.impl.AladimPackageImpl#gettransitionReactionSuccess()
		 * @generated
		 */
		EClass TRANSITION_REACTION_SUCCESS = eINSTANCE.gettransitionReactionSuccess();

		/**
		 * The meta object literal for the '{@link aladim.impl.transitionReactionFailImpl <em>transition Reaction Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.transitionReactionFailImpl
		 * @see aladim.impl.AladimPackageImpl#gettransitionReactionFail()
		 * @generated
		 */
		EClass TRANSITION_REACTION_FAIL = eINSTANCE.gettransitionReactionFail();

		/**
		 * The meta object literal for the '{@link aladim.impl.transitionNavigationImpl <em>transition Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.transitionNavigationImpl
		 * @see aladim.impl.AladimPackageImpl#gettransitionNavigation()
		 * @generated
		 */
		EClass TRANSITION_NAVIGATION = eINSTANCE.gettransitionNavigation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_NAVIGATION__NAME = eINSTANCE.gettransitionNavigation_Name();

		/**
		 * The meta object literal for the '<em><b>Tn From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NAVIGATION__TN_FROM = eINSTANCE.gettransitionNavigation_TnFrom();

		/**
		 * The meta object literal for the '<em><b>Tn To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_NAVIGATION__TN_TO = eINSTANCE.gettransitionNavigation_TnTo();

		/**
		 * The meta object literal for the '{@link aladim.impl.navigateImpl <em>navigate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aladim.impl.navigateImpl
		 * @see aladim.impl.AladimPackageImpl#getnavigate()
		 * @generated
		 */
		EClass NAVIGATE = eINSTANCE.getnavigate();

	}

} //AladimPackage
