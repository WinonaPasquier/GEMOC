/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

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
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLFactory
 * @model kind="package"
 * @generated
 */
public interface FRUnivCoteAzurL3IAProjectHTMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fRUnivCoteAzurL3IAProjectHTML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fRUnivCoteAzurL3IAProjectHTML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fRUnivCoteAzurL3IAProjectHTML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FRUnivCoteAzurL3IAProjectHTMLPackage eINSTANCE = fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Fileloader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FILELOADER = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__GRAPH = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Graphtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GRAPHTYPE = 0;

	/**
	 * The feature id for the '<em><b>Graphname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__GRAPHNAME = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.FileLoaderImpl <em>File Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FileLoaderImpl
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getFileLoader()
	 * @generated
	 */
	int FILE_LOADER = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOADER__PATH = 0;

	/**
	 * The number of structural features of the '<em>File Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 3;

	/**
	 * The feature id for the '<em><b>Columnname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__COLUMNNAME = 0;

	/**
	 * The feature id for the '<em><b>Abs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ABS = 1;

	/**
	 * The feature id for the '<em><b>Comparaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__COMPARAISON = 2;

	/**
	 * The feature id for the '<em><b>Element Comparaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ELEMENT_COMPARAISON = 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.NewEnum1 <em>New Enum1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.NewEnum1
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getNewEnum1()
	 * @generated
	 */
	int NEW_ENUM1 = 4;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 5;

	/**
	 * The meta object id for the '{@link fRUnivCoteAzurL3IAProjectHTML.EnumComparaison <em>Enum Comparaison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumComparaison
	 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getEnumComparaison()
	 * @generated
	 */
	int ENUM_COMPARAISON = 6;

	/**
	 * Returns the meta object for class '{@link fRUnivCoteAzurL3IAProjectHTML.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fRUnivCoteAzurL3IAProjectHTML.Program#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Program#getFilter()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link fRUnivCoteAzurL3IAProjectHTML.Program#getFileloader <em>Fileloader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fileloader</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Program#getFileloader()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Fileloader();

	/**
	 * Returns the meta object for the containment reference list '{@link fRUnivCoteAzurL3IAProjectHTML.Program#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Program#getGraph()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Graph();

	/**
	 * Returns the meta object for class '{@link fRUnivCoteAzurL3IAProjectHTML.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphtype <em>Graphtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphtype</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphtype()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Graphtype();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphname <em>Graphname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphname</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphname()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Graphname();

	/**
	 * Returns the meta object for class '{@link fRUnivCoteAzurL3IAProjectHTML.FileLoader <em>File Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Loader</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.FileLoader
	 * @generated
	 */
	EClass getFileLoader();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.FileLoader#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.FileLoader#getPath()
	 * @see #getFileLoader()
	 * @generated
	 */
	EAttribute getFileLoader_Path();

	/**
	 * Returns the meta object for class '{@link fRUnivCoteAzurL3IAProjectHTML.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getColumnname <em>Columnname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columnname</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Filter#getColumnname()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Columnname();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getAbs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Filter#getAbs()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Abs();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getComparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparaison</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Filter#getComparaison()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Comparaison();

	/**
	 * Returns the meta object for the attribute '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getElementComparaison <em>Element Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Comparaison</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.Filter#getElementComparaison()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_ElementComparaison();

	/**
	 * Returns the meta object for enum '{@link fRUnivCoteAzurL3IAProjectHTML.NewEnum1 <em>New Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum1</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.NewEnum1
	 * @generated
	 */
	EEnum getNewEnum1();

	/**
	 * Returns the meta object for enum '{@link fRUnivCoteAzurL3IAProjectHTML.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for enum '{@link fRUnivCoteAzurL3IAProjectHTML.EnumComparaison <em>Enum Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Comparaison</em>'.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumComparaison
	 * @generated
	 */
	EEnum getEnumComparaison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FRUnivCoteAzurL3IAProjectHTMLFactory getFRUnivCoteAzurL3IAProjectHTMLFactory();

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
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FILTER = eINSTANCE.getProgram_Filter();

		/**
		 * The meta object literal for the '<em><b>Fileloader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FILELOADER = eINSTANCE.getProgram_Fileloader();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__GRAPH = eINSTANCE.getProgram_Graph();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Graphtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__GRAPHTYPE = eINSTANCE.getGraph_Graphtype();

		/**
		 * The meta object literal for the '<em><b>Graphname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__GRAPHNAME = eINSTANCE.getGraph_Graphname();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.FileLoaderImpl <em>File Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FileLoaderImpl
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getFileLoader()
		 * @generated
		 */
		EClass FILE_LOADER = eINSTANCE.getFileLoader();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_LOADER__PATH = eINSTANCE.getFileLoader_Path();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Columnname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__COLUMNNAME = eINSTANCE.getFilter_Columnname();

		/**
		 * The meta object literal for the '<em><b>Abs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__ABS = eINSTANCE.getFilter_Abs();

		/**
		 * The meta object literal for the '<em><b>Comparaison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__COMPARAISON = eINSTANCE.getFilter_Comparaison();

		/**
		 * The meta object literal for the '<em><b>Element Comparaison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__ELEMENT_COMPARAISON = eINSTANCE.getFilter_ElementComparaison();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.NewEnum1 <em>New Enum1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.NewEnum1
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getNewEnum1()
		 * @generated
		 */
		EEnum NEW_ENUM1 = eINSTANCE.getNewEnum1();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.EnumType <em>Enum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getEnumType()
		 * @generated
		 */
		EEnum ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '{@link fRUnivCoteAzurL3IAProjectHTML.EnumComparaison <em>Enum Comparaison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fRUnivCoteAzurL3IAProjectHTML.EnumComparaison
		 * @see fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLPackageImpl#getEnumComparaison()
		 * @generated
		 */
		EEnum ENUM_COMPARAISON = eINSTANCE.getEnumComparaison();

	}

} //FRUnivCoteAzurL3IAProjectHTMLPackage
