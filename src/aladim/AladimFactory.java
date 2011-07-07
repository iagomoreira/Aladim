/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aladim.AladimPackage
 * @generated
 */
public interface AladimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AladimFactory eINSTANCE = aladim.impl.AladimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>interface Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>interface Model</em>'.
	 * @generated
	 */
	interfaceModel createinterfaceModel();

	/**
	 * Returns a new object of class '<em>interaction Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>interaction Space</em>'.
	 * @generated
	 */
	interactionSpace createinteractionSpace();

	/**
	 * Returns a new object of class '<em>enter Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>enter Information</em>'.
	 * @generated
	 */
	enterInformation createenterInformation();

	/**
	 * Returns a new object of class '<em>select Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>select Information</em>'.
	 * @generated
	 */
	selectInformation createselectInformation();

	/**
	 * Returns a new object of class '<em>perceive Inforrmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>perceive Inforrmation</em>'.
	 * @generated
	 */
	perceiveInforrmation createperceiveInforrmation();

	/**
	 * Returns a new object of class '<em>activate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>activate</em>'.
	 * @generated
	 */
	activate createactivate();

	/**
	 * Returns a new object of class '<em>join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>join</em>'.
	 * @generated
	 */
	join createjoin();

	/**
	 * Returns a new object of class '<em>sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sequence</em>'.
	 * @generated
	 */
	sequence createsequence();

	/**
	 * Returns a new object of class '<em>choose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>choose</em>'.
	 * @generated
	 */
	choose createchoose();

	/**
	 * Returns a new object of class '<em>repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>repeat</em>'.
	 * @generated
	 */
	repeat createrepeat();

	/**
	 * Returns a new object of class '<em>combine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>combine</em>'.
	 * @generated
	 */
	combine createcombine();

	/**
	 * Returns a new object of class '<em>domain Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>domain Function</em>'.
	 * @generated
	 */
	domainFunction createdomainFunction();

	/**
	 * Returns a new object of class '<em>transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition Action</em>'.
	 * @generated
	 */
	transitionAction createtransitionAction();

	/**
	 * Returns a new object of class '<em>transition Reaction Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition Reaction Success</em>'.
	 * @generated
	 */
	transitionReactionSuccess createtransitionReactionSuccess();

	/**
	 * Returns a new object of class '<em>transition Reaction Fail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition Reaction Fail</em>'.
	 * @generated
	 */
	transitionReactionFail createtransitionReactionFail();

	/**
	 * Returns a new object of class '<em>transition Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transition Navigation</em>'.
	 * @generated
	 */
	transitionNavigation createtransitionNavigation();

	/**
	 * Returns a new object of class '<em>navigate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>navigate</em>'.
	 * @generated
	 */
	navigate createnavigate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AladimPackage getAladimPackage();

} //AladimFactory
