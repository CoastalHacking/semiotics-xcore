/**
 */
package us.coastalhacking.semiotics.xcore.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.Sink#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSink()
 * @model
 * @generated
 */
public interface Sink extends Labeled, Describable {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link us.coastalhacking.semiotics.xcore.model.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see us.coastalhacking.semiotics.xcore.model.Language
	 * @see #setLanguage(Language)
	 * @see us.coastalhacking.semiotics.xcore.model.ModelPackage#getSink_Language()
	 * @model unique="false"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.xcore.model.Sink#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see us.coastalhacking.semiotics.xcore.model.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // Sink
