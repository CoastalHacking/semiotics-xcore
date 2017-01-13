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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.semiotics.xcore.model.Describable;
import us.coastalhacking.semiotics.xcore.model.SemioticsPackage;
import us.coastalhacking.semiotics.xcore.model.Sink;
import us.coastalhacking.semiotics.xcore.model.SinkCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sink Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl#getSinks <em>Sinks</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl#getCWES <em>CWES</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkCategoryImpl extends MinimalEObjectImpl.Container implements SinkCategory {
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
	 * The cached value of the '{@link #getSinks() <em>Sinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sink> sinks;

	/**
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<SinkCategory> subCategories;

	/**
	 * The cached value of the '{@link #getCWES() <em>CWES</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWES()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> cwes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemioticsPackage.Literals.SINK_CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SemioticsPackage.SINK_CATEGORY__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SemioticsPackage.SINK_CATEGORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sink> getSinks() {
		if (sinks == null) {
			sinks = new EObjectContainmentEList<Sink>(Sink.class, this, SemioticsPackage.SINK_CATEGORY__SINKS);
		}
		return sinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SinkCategory> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentEList<SinkCategory>(SinkCategory.class, this, SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getCWES() {
		if (cwes == null) {
			cwes = new EDataTypeEList<Integer>(Integer.class, this, SemioticsPackage.SINK_CATEGORY__CWES);
		}
		return cwes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemioticsPackage.SINK_CATEGORY__SINKS:
				return ((InternalEList<?>)getSinks()).basicRemove(otherEnd, msgs);
			case SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
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
			case SemioticsPackage.SINK_CATEGORY__LABEL:
				return getLabel();
			case SemioticsPackage.SINK_CATEGORY__DESCRIPTION:
				return getDescription();
			case SemioticsPackage.SINK_CATEGORY__SINKS:
				return getSinks();
			case SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES:
				return getSubCategories();
			case SemioticsPackage.SINK_CATEGORY__CWES:
				return getCWES();
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
			case SemioticsPackage.SINK_CATEGORY__LABEL:
				setLabel((String)newValue);
				return;
			case SemioticsPackage.SINK_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SemioticsPackage.SINK_CATEGORY__SINKS:
				getSinks().clear();
				getSinks().addAll((Collection<? extends Sink>)newValue);
				return;
			case SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends SinkCategory>)newValue);
				return;
			case SemioticsPackage.SINK_CATEGORY__CWES:
				getCWES().clear();
				getCWES().addAll((Collection<? extends Integer>)newValue);
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
			case SemioticsPackage.SINK_CATEGORY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SemioticsPackage.SINK_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SemioticsPackage.SINK_CATEGORY__SINKS:
				getSinks().clear();
				return;
			case SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case SemioticsPackage.SINK_CATEGORY__CWES:
				getCWES().clear();
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
			case SemioticsPackage.SINK_CATEGORY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SemioticsPackage.SINK_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SemioticsPackage.SINK_CATEGORY__SINKS:
				return sinks != null && !sinks.isEmpty();
			case SemioticsPackage.SINK_CATEGORY__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case SemioticsPackage.SINK_CATEGORY__CWES:
				return cwes != null && !cwes.isEmpty();
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
				case SemioticsPackage.SINK_CATEGORY__DESCRIPTION: return SemioticsPackage.DESCRIBABLE__DESCRIPTION;
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
				case SemioticsPackage.DESCRIBABLE__DESCRIPTION: return SemioticsPackage.SINK_CATEGORY__DESCRIPTION;
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
		result.append(", CWES: ");
		result.append(cwes);
		result.append(')');
		return result.toString();
	}

} //SinkCategoryImpl
