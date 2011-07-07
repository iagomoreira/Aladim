/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.util;

import aladim.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aladim.AladimPackage
 * @generated
 */
public class AladimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AladimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AladimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AladimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AladimSwitch<Adapter> modelSwitch =
		new AladimSwitch<Adapter>() {
			@Override
			public Adapter caseinterfaceModel(interfaceModel object) {
				return createinterfaceModelAdapter();
			}
			@Override
			public Adapter caseinteractionSpace(interactionSpace object) {
				return createinteractionSpaceAdapter();
			}
			@Override
			public Adapter casecompositeInteraction(compositeInteraction object) {
				return createcompositeInteractionAdapter();
			}
			@Override
			public Adapter caseenterInformation(enterInformation object) {
				return createenterInformationAdapter();
			}
			@Override
			public Adapter caseselectInformation(selectInformation object) {
				return createselectInformationAdapter();
			}
			@Override
			public Adapter caseperceiveInforrmation(perceiveInforrmation object) {
				return createperceiveInforrmationAdapter();
			}
			@Override
			public Adapter casebasicInteraction(basicInteraction object) {
				return createbasicInteractionAdapter();
			}
			@Override
			public Adapter caseactivate(activate object) {
				return createactivateAdapter();
			}
			@Override
			public Adapter casejoin(join object) {
				return createjoinAdapter();
			}
			@Override
			public Adapter casesequence(sequence object) {
				return createsequenceAdapter();
			}
			@Override
			public Adapter casechoose(choose object) {
				return createchooseAdapter();
			}
			@Override
			public Adapter caserepeat(repeat object) {
				return createrepeatAdapter();
			}
			@Override
			public Adapter casecombine(combine object) {
				return createcombineAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter casedomainFunction(domainFunction object) {
				return createdomainFunctionAdapter();
			}
			@Override
			public Adapter casetransitionAction(transitionAction object) {
				return createtransitionActionAdapter();
			}
			@Override
			public Adapter casetransitionReaction(transitionReaction object) {
				return createtransitionReactionAdapter();
			}
			@Override
			public Adapter casetransitionReactionSuccess(transitionReactionSuccess object) {
				return createtransitionReactionSuccessAdapter();
			}
			@Override
			public Adapter casetransitionReactionFail(transitionReactionFail object) {
				return createtransitionReactionFailAdapter();
			}
			@Override
			public Adapter casetransitionNavigation(transitionNavigation object) {
				return createtransitionNavigationAdapter();
			}
			@Override
			public Adapter casenavigate(navigate object) {
				return createnavigateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aladim.interfaceModel <em>interface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.interfaceModel
	 * @generated
	 */
	public Adapter createinterfaceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.interactionSpace <em>interaction Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.interactionSpace
	 * @generated
	 */
	public Adapter createinteractionSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.compositeInteraction <em>composite Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.compositeInteraction
	 * @generated
	 */
	public Adapter createcompositeInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.enterInformation <em>enter Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.enterInformation
	 * @generated
	 */
	public Adapter createenterInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.selectInformation <em>select Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.selectInformation
	 * @generated
	 */
	public Adapter createselectInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.perceiveInforrmation <em>perceive Inforrmation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.perceiveInforrmation
	 * @generated
	 */
	public Adapter createperceiveInforrmationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.basicInteraction <em>basic Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.basicInteraction
	 * @generated
	 */
	public Adapter createbasicInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.activate <em>activate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.activate
	 * @generated
	 */
	public Adapter createactivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.join <em>join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.join
	 * @generated
	 */
	public Adapter createjoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.sequence <em>sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.sequence
	 * @generated
	 */
	public Adapter createsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.choose <em>choose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.choose
	 * @generated
	 */
	public Adapter createchooseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.repeat <em>repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.repeat
	 * @generated
	 */
	public Adapter createrepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.combine <em>combine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.combine
	 * @generated
	 */
	public Adapter createcombineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.domainFunction <em>domain Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.domainFunction
	 * @generated
	 */
	public Adapter createdomainFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.transitionAction <em>transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.transitionAction
	 * @generated
	 */
	public Adapter createtransitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.transitionReaction <em>transition Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.transitionReaction
	 * @generated
	 */
	public Adapter createtransitionReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.transitionReactionSuccess <em>transition Reaction Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.transitionReactionSuccess
	 * @generated
	 */
	public Adapter createtransitionReactionSuccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.transitionReactionFail <em>transition Reaction Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.transitionReactionFail
	 * @generated
	 */
	public Adapter createtransitionReactionFailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.transitionNavigation <em>transition Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.transitionNavigation
	 * @generated
	 */
	public Adapter createtransitionNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aladim.navigate <em>navigate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aladim.navigate
	 * @generated
	 */
	public Adapter createnavigateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AladimAdapterFactory
