/**
 */
package us.coastalhacking.semiotics.xcore.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import us.coastalhacking.semiotics.xcore.model.*;

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
 * @see us.coastalhacking.semiotics.xcore.model.SemioticsPackage
 * @generated
 */
public class SemioticsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemioticsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemioticsSwitch() {
		if (modelPackage == null) {
			modelPackage = SemioticsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SemioticsPackage.SINK_CATALOG: {
				SinkCatalog sinkCatalog = (SinkCatalog)theEObject;
				T result = caseSinkCatalog(sinkCatalog);
				if (result == null) result = caseLabeled(sinkCatalog);
				if (result == null) result = caseDescribable(sinkCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemioticsPackage.SINK_CATEGORY: {
				SinkCategory sinkCategory = (SinkCategory)theEObject;
				T result = caseSinkCategory(sinkCategory);
				if (result == null) result = caseLabeled(sinkCategory);
				if (result == null) result = caseDescribable(sinkCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemioticsPackage.SINK: {
				Sink sink = (Sink)theEObject;
				T result = caseSink(sink);
				if (result == null) result = caseLabeled(sink);
				if (result == null) result = caseDescribable(sink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemioticsPackage.LABELED: {
				Labeled labeled = (Labeled)theEObject;
				T result = caseLabeled(labeled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemioticsPackage.DESCRIBABLE: {
				Describable describable = (Describable)theEObject;
				T result = caseDescribable(describable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkCatalog(SinkCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkCategory(SinkCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSink(Sink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeled(Labeled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribable(Describable object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SemioticsSwitch
