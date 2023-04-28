/**
 */
package fRUnivCoteAzurL3IAProjectHTML.impl;

import fRUnivCoteAzurL3IAProjectHTML.EnumComparaison;
import fRUnivCoteAzurL3IAProjectHTML.EnumType;
import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLFactory;
import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage;
import fRUnivCoteAzurL3IAProjectHTML.FileLoader;
import fRUnivCoteAzurL3IAProjectHTML.Filter;
import fRUnivCoteAzurL3IAProjectHTML.Graph;
import fRUnivCoteAzurL3IAProjectHTML.NewEnum1;
import fRUnivCoteAzurL3IAProjectHTML.Program;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FRUnivCoteAzurL3IAProjectHTMLPackageImpl extends EPackageImpl
		implements FRUnivCoteAzurL3IAProjectHTMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum newEnum1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumComparaisonEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FRUnivCoteAzurL3IAProjectHTMLPackageImpl() {
		super(eNS_URI, FRUnivCoteAzurL3IAProjectHTMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FRUnivCoteAzurL3IAProjectHTMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FRUnivCoteAzurL3IAProjectHTMLPackage init() {
		if (isInited)
			return (FRUnivCoteAzurL3IAProjectHTMLPackage) EPackage.Registry.INSTANCE
					.getEPackage(FRUnivCoteAzurL3IAProjectHTMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFRUnivCoteAzurL3IAProjectHTMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FRUnivCoteAzurL3IAProjectHTMLPackageImpl theFRUnivCoteAzurL3IAProjectHTMLPackage = registeredFRUnivCoteAzurL3IAProjectHTMLPackage instanceof FRUnivCoteAzurL3IAProjectHTMLPackageImpl
				? (FRUnivCoteAzurL3IAProjectHTMLPackageImpl) registeredFRUnivCoteAzurL3IAProjectHTMLPackage
				: new FRUnivCoteAzurL3IAProjectHTMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFRUnivCoteAzurL3IAProjectHTMLPackage.createPackageContents();

		// Initialize created meta-data
		theFRUnivCoteAzurL3IAProjectHTMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFRUnivCoteAzurL3IAProjectHTMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FRUnivCoteAzurL3IAProjectHTMLPackage.eNS_URI,
				theFRUnivCoteAzurL3IAProjectHTMLPackage);
		return theFRUnivCoteAzurL3IAProjectHTMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Filter() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Fileloader() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Graph() {
		return (EReference) programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Graphtype() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Graphname() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileLoader() {
		return fileLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileLoader_Path() {
		return (EAttribute) fileLoaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Columnname() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Abs() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Comparaison() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_ElementComparaison() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNewEnum1() {
		return newEnum1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumType() {
		return enumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumComparaison() {
		return enumComparaisonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRUnivCoteAzurL3IAProjectHTMLFactory getFRUnivCoteAzurL3IAProjectHTMLFactory() {
		return (FRUnivCoteAzurL3IAProjectHTMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__FILTER);
		createEReference(programEClass, PROGRAM__FILELOADER);
		createEReference(programEClass, PROGRAM__GRAPH);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__GRAPHTYPE);
		createEAttribute(graphEClass, GRAPH__GRAPHNAME);

		fileLoaderEClass = createEClass(FILE_LOADER);
		createEAttribute(fileLoaderEClass, FILE_LOADER__PATH);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__COLUMNNAME);
		createEAttribute(filterEClass, FILTER__ABS);
		createEAttribute(filterEClass, FILTER__COMPARAISON);
		createEAttribute(filterEClass, FILTER__ELEMENT_COMPARAISON);

		// Create enums
		newEnum1EEnum = createEEnum(NEW_ENUM1);
		enumTypeEEnum = createEEnum(ENUM_TYPE);
		enumComparaisonEEnum = createEEnum(ENUM_COMPARAISON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Filter(), this.getFilter(), null, "filter", null, 0, -1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProgram_Fileloader(), this.getFileLoader(), null, "fileloader", null, 1, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Graph(), this.getGraph(), null, "graph", null, 0, -1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Graphtype(), this.getEnumType(), "graphtype", null, 1, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Graphname(), ecorePackage.getEString(), "graphname", null, 0, 1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileLoaderEClass, FileLoader.class, "FileLoader", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileLoader_Path(), ecorePackage.getEString(), "path", null, 1, 1, FileLoader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Columnname(), ecorePackage.getEString(), "columnname", null, 1, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Abs(), ecorePackage.getEBooleanObject(), "abs", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Comparaison(), this.getEnumComparaison(), "comparaison", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_ElementComparaison(), ecorePackage.getEString(), "elementComparaison", null, 0, 1,
				Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(newEnum1EEnum, NewEnum1.class, "NewEnum1");

		initEEnum(enumTypeEEnum, EnumType.class, "EnumType");
		addEEnumLiteral(enumTypeEEnum, EnumType.LINE);
		addEEnumLiteral(enumTypeEEnum, EnumType.BAR);
		addEEnumLiteral(enumTypeEEnum, EnumType.PIE);
		addEEnumLiteral(enumTypeEEnum, EnumType.DOUGHNUT);
		addEEnumLiteral(enumTypeEEnum, EnumType.SCATTER);
		addEEnumLiteral(enumTypeEEnum, EnumType.BUBBLE);
		addEEnumLiteral(enumTypeEEnum, EnumType.RADAR);
		addEEnumLiteral(enumTypeEEnum, EnumType.POLAR_AREA);

		initEEnum(enumComparaisonEEnum, EnumComparaison.class, "EnumComparaison");
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.NONE);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.EQUAL);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.SUP);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.INF);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.SUP_EQUAL);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.INF_EQUAL);
		addEEnumLiteral(enumComparaisonEEnum, EnumComparaison.NOT_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //FRUnivCoteAzurL3IAProjectHTMLPackageImpl
