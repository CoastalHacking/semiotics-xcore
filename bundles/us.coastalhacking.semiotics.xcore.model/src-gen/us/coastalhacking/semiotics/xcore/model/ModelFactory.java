/**
 */
package us.coastalhacking.semiotics.xcore.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = us.coastalhacking.semiotics.xcore.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sink Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Catalog</em>'.
	 * @generated
	 */
	SinkCatalog createSinkCatalog();

	/**
	 * Returns a new object of class '<em>Sink Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Category</em>'.
	 * @generated
	 */
	SinkCategory createSinkCategory();

	/**
	 * Returns a new object of class '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink</em>'.
	 * @generated
	 */
	Sink createSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
