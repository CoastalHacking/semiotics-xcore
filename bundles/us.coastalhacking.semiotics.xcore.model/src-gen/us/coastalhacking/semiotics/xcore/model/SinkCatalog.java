/**
 */
package us.coastalhacking.semiotics.xcore.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.SinkCatalog#getSinkCategories <em>Sink Categories</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCatalog()
 * @model
 * @generated
 */
public interface SinkCatalog extends Labeled, Describable {
	/**
	 * Returns the value of the '<em><b>Sink Categories</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.semiotics.xcore.model.SinkCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Categories</em>' containment reference list.
	 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSinkCatalog_SinkCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<SinkCategory> getSinkCategories();

} // SinkCatalog
