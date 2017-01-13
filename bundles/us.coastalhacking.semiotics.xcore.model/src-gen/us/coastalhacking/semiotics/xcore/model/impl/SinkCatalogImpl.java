/**
 */
package us.coastalhacking.semiotics.xcore.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.xcore.model.Describable;
import us.coastalhacking.semiotics.xcore.model.SemioticsPackage;
import us.coastalhacking.semiotics.xcore.model.SinkCatalog;
import us.coastalhacking.semiotics.xcore.model.SinkCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl#getSinkCategories <em>Sink Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkCatalogImpl extends MinimalEObjectImpl.Container implements SinkCatalog {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSinkCategories() <em>Sink Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SinkCategory> sinkCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemioticsPackage.Literals.SINK_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemioticsPackage.SINK_CATALOG__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemioticsPackage.SINK_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SinkCategory> getSinkCategories() {
		if (sinkCategories == null) {
			sinkCategories = new EObjectContainmentEList<SinkCategory>(SinkCategory.class, this, SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES);
		}
		return sinkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES:
				return ((InternalEList<?>)getSinkCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATALOG__LABEL:
				return getLabel();
			case SemioticsPackage.SINK_CATALOG__DESCRIPTION:
				return getDescription();
			case SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES:
				return getSinkCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATALOG__LABEL:
				setLabel((String)newValue);
				return;
			case SemioticsPackage.SINK_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES:
				getSinkCategories().clear();
				getSinkCategories().addAll((Collection<? extends SinkCategory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATALOG__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SemioticsPackage.SINK_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES:
				getSinkCategories().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATALOG__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SemioticsPackage.SINK_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SemioticsPackage.SINK_CATALOG__SINK_CATEGORIES:
				return sinkCategories != null && !sinkCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Describable.class) {
			switch (derivedFeatureID) {
				case SemioticsPackage.SINK_CATALOG__DESCRIPTION: return SemioticsPackage.DESCRIBABLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Describable.class) {
			switch (baseFeatureID) {
				case SemioticsPackage.DESCRIBABLE__DESCRIPTION: return SemioticsPackage.SINK_CATALOG__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SinkCatalogImpl
