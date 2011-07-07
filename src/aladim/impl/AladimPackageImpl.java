/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.AladimFactory;
import aladim.AladimPackage;
import aladim.Interaction;
import aladim.activate;
import aladim.basicInteraction;
import aladim.choose;
import aladim.combine;
import aladim.compositeInteraction;
import aladim.domainFunction;
import aladim.enterInformation;
import aladim.interactionSpace;
import aladim.interfaceModel;
import aladim.join;
import aladim.navigate;
import aladim.perceiveInforrmation;
import aladim.repeat;
import aladim.selectInformation;
import aladim.sequence;
import aladim.transitionAction;
import aladim.transitionNavigation;
import aladim.transitionReaction;
import aladim.transitionReactionFail;
import aladim.transitionReactionSuccess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AladimPackageImpl extends EPackageImpl implements AladimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perceiveInforrmationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chooseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionReactionSuccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionReactionFailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aladim.AladimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AladimPackageImpl() {
		super(eNS_URI, AladimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AladimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AladimPackage init() {
		if (isInited) return (AladimPackage)EPackage.Registry.INSTANCE.getEPackage(AladimPackage.eNS_URI);

		// Obtain or create and register package
		AladimPackageImpl theAladimPackage = (AladimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AladimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AladimPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAladimPackage.createPackageContents();

		// Initialize created meta-data
		theAladimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAladimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AladimPackage.eNS_URI, theAladimPackage);
		return theAladimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinterfaceModel() {
		return interfaceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinterfaceModel_Application() {
		return (EAttribute)interfaceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceModel_InteractionSpaces() {
		return (EReference)interfaceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceModel_DomainFunctions() {
		return (EReference)interfaceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceModel_Reactions() {
		return (EReference)interfaceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceModel_Actions() {
		return (EReference)interfaceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceModel_Navigations() {
		return (EReference)interfaceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinteractionSpace() {
		return interactionSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinteractionSpace_Name() {
		return (EAttribute)interactionSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinteractionSpace_Interactions() {
		return (EReference)interactionSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompositeInteraction() {
		return compositeInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompositeInteraction_BasicInteractions() {
		return (EReference)compositeInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompositeInteraction_Composites() {
		return (EReference)compositeInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getenterInformation() {
		return enterInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getselectInformation() {
		return selectInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getperceiveInforrmation() {
		return perceiveInforrmationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbasicInteraction() {
		return basicInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getbasicInteraction_Name() {
		return (EAttribute)basicInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getactivate() {
		return activateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchoose() {
		return chooseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcombine() {
		return combineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdomainFunction() {
		return domainFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdomainFunction_Name() {
		return (EAttribute)domainFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransitionAction() {
		return transitionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionAction_TaFrom() {
		return (EReference)transitionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionAction_TaTo() {
		return (EReference)transitionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettransitionAction_Name() {
		return (EAttribute)transitionActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransitionReaction() {
		return transitionReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionReaction_TrFrom() {
		return (EReference)transitionReactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionReaction_TrTo() {
		return (EReference)transitionReactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettransitionReaction_Name() {
		return (EAttribute)transitionReactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransitionReactionSuccess() {
		return transitionReactionSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransitionReactionFail() {
		return transitionReactionFailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransitionNavigation() {
		return transitionNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettransitionNavigation_Name() {
		return (EAttribute)transitionNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionNavigation_TnFrom() {
		return (EReference)transitionNavigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransitionNavigation_TnTo() {
		return (EReference)transitionNavigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnavigate() {
		return navigateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AladimFactory getAladimFactory() {
		return (AladimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interfaceModelEClass = createEClass(INTERFACE_MODEL);
		createEAttribute(interfaceModelEClass, INTERFACE_MODEL__APPLICATION);
		createEReference(interfaceModelEClass, INTERFACE_MODEL__INTERACTION_SPACES);
		createEReference(interfaceModelEClass, INTERFACE_MODEL__DOMAIN_FUNCTIONS);
		createEReference(interfaceModelEClass, INTERFACE_MODEL__REACTIONS);
		createEReference(interfaceModelEClass, INTERFACE_MODEL__ACTIONS);
		createEReference(interfaceModelEClass, INTERFACE_MODEL__NAVIGATIONS);

		interactionSpaceEClass = createEClass(INTERACTION_SPACE);
		createEAttribute(interactionSpaceEClass, INTERACTION_SPACE__NAME);
		createEReference(interactionSpaceEClass, INTERACTION_SPACE__INTERACTIONS);

		compositeInteractionEClass = createEClass(COMPOSITE_INTERACTION);
		createEReference(compositeInteractionEClass, COMPOSITE_INTERACTION__BASIC_INTERACTIONS);
		createEReference(compositeInteractionEClass, COMPOSITE_INTERACTION__COMPOSITES);

		enterInformationEClass = createEClass(ENTER_INFORMATION);

		selectInformationEClass = createEClass(SELECT_INFORMATION);

		perceiveInforrmationEClass = createEClass(PERCEIVE_INFORRMATION);

		basicInteractionEClass = createEClass(BASIC_INTERACTION);
		createEAttribute(basicInteractionEClass, BASIC_INTERACTION__NAME);

		activateEClass = createEClass(ACTIVATE);

		joinEClass = createEClass(JOIN);

		sequenceEClass = createEClass(SEQUENCE);

		chooseEClass = createEClass(CHOOSE);

		repeatEClass = createEClass(REPEAT);

		combineEClass = createEClass(COMBINE);

		interactionEClass = createEClass(INTERACTION);

		domainFunctionEClass = createEClass(DOMAIN_FUNCTION);
		createEAttribute(domainFunctionEClass, DOMAIN_FUNCTION__NAME);

		transitionActionEClass = createEClass(TRANSITION_ACTION);
		createEReference(transitionActionEClass, TRANSITION_ACTION__TA_FROM);
		createEReference(transitionActionEClass, TRANSITION_ACTION__TA_TO);
		createEAttribute(transitionActionEClass, TRANSITION_ACTION__NAME);

		transitionReactionEClass = createEClass(TRANSITION_REACTION);
		createEReference(transitionReactionEClass, TRANSITION_REACTION__TR_FROM);
		createEReference(transitionReactionEClass, TRANSITION_REACTION__TR_TO);
		createEAttribute(transitionReactionEClass, TRANSITION_REACTION__NAME);

		transitionReactionSuccessEClass = createEClass(TRANSITION_REACTION_SUCCESS);

		transitionReactionFailEClass = createEClass(TRANSITION_REACTION_FAIL);

		transitionNavigationEClass = createEClass(TRANSITION_NAVIGATION);
		createEAttribute(transitionNavigationEClass, TRANSITION_NAVIGATION__NAME);
		createEReference(transitionNavigationEClass, TRANSITION_NAVIGATION__TN_FROM);
		createEReference(transitionNavigationEClass, TRANSITION_NAVIGATION__TN_TO);

		navigateEClass = createEClass(NAVIGATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeInteractionEClass.getESuperTypes().add(this.getInteraction());
		enterInformationEClass.getESuperTypes().add(this.getbasicInteraction());
		selectInformationEClass.getESuperTypes().add(this.getbasicInteraction());
		perceiveInforrmationEClass.getESuperTypes().add(this.getbasicInteraction());
		basicInteractionEClass.getESuperTypes().add(this.getInteraction());
		activateEClass.getESuperTypes().add(this.getbasicInteraction());
		joinEClass.getESuperTypes().add(this.getcompositeInteraction());
		sequenceEClass.getESuperTypes().add(this.getcompositeInteraction());
		chooseEClass.getESuperTypes().add(this.getcompositeInteraction());
		repeatEClass.getESuperTypes().add(this.getcompositeInteraction());
		combineEClass.getESuperTypes().add(this.getcompositeInteraction());
		transitionReactionSuccessEClass.getESuperTypes().add(this.gettransitionReaction());
		transitionReactionFailEClass.getESuperTypes().add(this.gettransitionReaction());
		navigateEClass.getESuperTypes().add(this.getbasicInteraction());

		// Initialize classes and features; add operations and parameters
		initEClass(interfaceModelEClass, interfaceModel.class, "interfaceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinterfaceModel_Application(), ecorePackage.getEString(), "application", null, 0, 1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceModel_InteractionSpaces(), this.getinteractionSpace(), null, "interactionSpaces", null, 1, -1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceModel_DomainFunctions(), this.getdomainFunction(), null, "domainFunctions", null, 1, -1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceModel_Reactions(), this.gettransitionReaction(), null, "reactions", null, 0, -1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceModel_Actions(), this.gettransitionAction(), null, "actions", null, 0, -1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceModel_Navigations(), this.gettransitionNavigation(), null, "navigations", null, 0, -1, interfaceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionSpaceEClass, interactionSpace.class, "interactionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinteractionSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1, interactionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinteractionSpace_Interactions(), this.getInteraction(), null, "interactions", null, 1, -1, interactionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeInteractionEClass, compositeInteraction.class, "compositeInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcompositeInteraction_BasicInteractions(), this.getbasicInteraction(), null, "basicInteractions", null, 1, -1, compositeInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcompositeInteraction_Composites(), this.getcompositeInteraction(), null, "composites", null, 0, -1, compositeInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterInformationEClass, enterInformation.class, "enterInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectInformationEClass, selectInformation.class, "selectInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perceiveInforrmationEClass, perceiveInforrmation.class, "perceiveInforrmation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicInteractionEClass, basicInteraction.class, "basicInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getbasicInteraction_Name(), ecorePackage.getEString(), "name", null, 1, 1, basicInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activateEClass, activate.class, "activate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinEClass, join.class, "join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, sequence.class, "sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chooseEClass, choose.class, "choose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatEClass, repeat.class, "repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combineEClass, combine.class, "combine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainFunctionEClass, domainFunction.class, "domainFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdomainFunction_Name(), ecorePackage.getEString(), "name", null, 1, 1, domainFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionActionEClass, transitionAction.class, "transitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettransitionAction_TaFrom(), this.getinteractionSpace(), null, "taFrom", null, 1, 1, transitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettransitionAction_TaTo(), this.getdomainFunction(), null, "taTo", null, 1, 1, transitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettransitionAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, transitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionReactionEClass, transitionReaction.class, "transitionReaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettransitionReaction_TrFrom(), this.getdomainFunction(), null, "trFrom", null, 1, 1, transitionReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettransitionReaction_TrTo(), this.getinteractionSpace(), null, "trTo", null, 1, 1, transitionReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettransitionReaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, transitionReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionReactionSuccessEClass, transitionReactionSuccess.class, "transitionReactionSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionReactionFailEClass, transitionReactionFail.class, "transitionReactionFail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionNavigationEClass, transitionNavigation.class, "transitionNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettransitionNavigation_Name(), ecorePackage.getEString(), "name", null, 0, 1, transitionNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettransitionNavigation_TnFrom(), this.getinteractionSpace(), null, "tnFrom", null, 1, 1, transitionNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettransitionNavigation_TnTo(), this.getinteractionSpace(), null, "tnTo", null, 1, 1, transitionNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigateEClass, navigate.class, "navigate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AladimPackageImpl
