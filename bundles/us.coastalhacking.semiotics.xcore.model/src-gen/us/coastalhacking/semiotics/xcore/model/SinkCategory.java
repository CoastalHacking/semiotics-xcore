/**
 */
package us.coastalhacking.semiotics.xcore.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getSinks <em>Sinks</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getCWES <em>CWES</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCategory()
 * @model
 * @generated
 */
public interface SinkCategory extends Labeled, Describable {
	/**
	 * Returns the value of the '<em><b>Sinks</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.xcore.model.Sink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sinks</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCategory_Sinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sink> getSinks();

	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.xcore.model.SinkCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCategory_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<SinkCategory> getSubCategories();

	/**
	 * Returns the value of the '<em><b>CWES</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CWES</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CWES</em>' attribute list.
	 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCategory_CWES()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getCWES();

} // SinkCategory
