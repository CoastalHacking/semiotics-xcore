/**
 */
package us.coastalhacking.semiotics.xcore.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.xcore.model.SemioticsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/us.coastalhacking.semiotics.xcore.edit/src-gen' editorDirectory='/us.coastalhacking.semiotics.xcore.editor/src-gen' modelName='Semiotics' fileExtensions='semiotics' prefix='Semiotics' basePackage='us.coastalhacking.semiotics.xcore'"
 * @generated
 */
public interface SemioticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.semiotics.xcore.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemioticsPackage eINSTANCE = us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.Labeled <em>Labeled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.Labeled
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getLabeled()
	 * @generated
	 */
	int LABELED = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Labeled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Labeled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl <em>Sink Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSinkCatalog()
	 * @generated
	 */
	int SINK_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATALOG__LABEL = LABELED__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATALOG__DESCRIPTION = LABELED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sink Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATALOG__SINK_CATEGORIES = LABELED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sink Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATALOG_FEATURE_COUNT = LABELED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sink Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATALOG_OPERATION_COUNT = LABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl <em>Sink Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSinkCategory()
	 * @generated
	 */
	int SINK_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY__LABEL = LABELED__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY__DESCRIPTION = LABELED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY__SINKS = LABELED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY__SUB_CATEGORIES = LABELED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CWES</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY__CWES = LABELED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sink Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY_FEATURE_COUNT = LABELED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sink Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_CATEGORY_OPERATION_COUNT = LABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkImpl
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__LABEL = LABELED__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__DESCRIPTION = LABELED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__LANGUAGE = LABELED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = LABELED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = LABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.Describable <em>Describable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.Describable
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getDescribable()
	 * @generated
	 */
	int DESCRIBABLE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Describable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.xcore.model.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.xcore.model.Language
	 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 5;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.xcore.model.SinkCatalog <em>Sink Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Catalog</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCatalog
	 * @generated
	 */
	EClass getSinkCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.xcore.model.SinkCatalog#getSinkCategories <em>Sink Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sink Categories</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCatalog#getSinkCategories()
	 * @see #getSinkCatalog()
	 * @generated
	 */
	EReference getSinkCatalog_SinkCategories();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.xcore.model.SinkCategory <em>Sink Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Category</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCategory
	 * @generated
	 */
	EClass getSinkCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getSinks <em>Sinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sinks</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCategory#getSinks()
	 * @see #getSinkCategory()
	 * @generated
	 */
	EReference getSinkCategory_Sinks();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCategory#getSubCategories()
	 * @see #getSinkCategory()
	 * @generated
	 */
	EReference getSinkCategory_SubCategories();

	/**
	 * Returns the meta object for the attribute list '{@link us.coastalhacking.semiotics.xcore.model.SinkCategory#getCWES <em>CWES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>CWES</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.SinkCategory#getCWES()
	 * @see #getSinkCategory()
	 * @generated
	 */
	EAttribute getSinkCategory_CWES();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.xcore.model.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.xcore.model.Sink#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Sink#getLanguage()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Language();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.xcore.model.Labeled <em>Labeled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Labeled
	 * @generated
	 */
	EClass getLabeled();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.xcore.model.Labeled#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Labeled#getLabel()
	 * @see #getLabeled()
	 * @generated
	 */
	EAttribute getLabeled_Label();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.xcore.model.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describable</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Describable
	 * @generated
	 */
	EClass getDescribable();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.xcore.model.Describable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Describable#getDescription()
	 * @see #getDescribable()
	 * @generated
	 */
	EAttribute getDescribable_Description();

	/**
	 * Returns the meta object for enum '{@link us.coastalhacking.semiotics.xcore.model.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see us.coastalhacking.semiotics.xcore.model.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemioticsFactory getSemioticsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl <em>Sink Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkCatalogImpl
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSinkCatalog()
		 * @generated
		 */
		EClass SINK_CATALOG = eINSTANCE.getSinkCatalog();

		/**
		 * The meta object literal for the '<em><b>Sink Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_CATALOG__SINK_CATEGORIES = eINSTANCE.getSinkCatalog_SinkCategories();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl <em>Sink Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkCategoryImpl
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSinkCategory()
		 * @generated
		 */
		EClass SINK_CATEGORY = eINSTANCE.getSinkCategory();

		/**
		 * The meta object literal for the '<em><b>Sinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_CATEGORY__SINKS = eINSTANCE.getSinkCategory_Sinks();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_CATEGORY__SUB_CATEGORIES = eINSTANCE.getSinkCategory_SubCategories();

		/**
		 * The meta object literal for the '<em><b>CWES</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_CATEGORY__CWES = eINSTANCE.getSinkCategory_CWES();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SinkImpl
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__LANGUAGE = eINSTANCE.getSink_Language();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.Labeled <em>Labeled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.Labeled
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getLabeled()
		 * @generated
		 */
		EClass LABELED = eINSTANCE.getLabeled();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED__LABEL = eINSTANCE.getLabeled_Label();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.Describable <em>Describable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.Describable
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getDescribable()
		 * @generated
		 */
		EClass DESCRIBABLE = eINSTANCE.getDescribable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBABLE__DESCRIPTION = eINSTANCE.getDescribable_Description();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.xcore.model.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.xcore.model.Language
		 * @see us.coastalhacking.semiotics.xcore.model.impl.SemioticsPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //SemioticsPackage
