/**
 */
package fRUnivCoteAzurL3IAProjectHTML.impl;

import fRUnivCoteAzurL3IAProjectHTML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FRUnivCoteAzurL3IAProjectHTMLFactoryImpl extends EFactoryImpl
		implements FRUnivCoteAzurL3IAProjectHTMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FRUnivCoteAzurL3IAProjectHTMLFactory init() {
		try {
			FRUnivCoteAzurL3IAProjectHTMLFactory theFRUnivCoteAzurL3IAProjectHTMLFactory = (FRUnivCoteAzurL3IAProjectHTMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(FRUnivCoteAzurL3IAProjectHTMLPackage.eNS_URI);
			if (theFRUnivCoteAzurL3IAProjectHTMLFactory != null) {
				return theFRUnivCoteAzurL3IAProjectHTMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FRUnivCoteAzurL3IAProjectHTMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRUnivCoteAzurL3IAProjectHTMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM:
			return createProgram();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH:
			return createGraph();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILE_LOADER:
			return createFileLoader();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER:
			return createFilter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.NEW_ENUM1:
			return createNewEnum1FromString(eDataType, initialValue);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.ENUM_TYPE:
			return createEnumTypeFromString(eDataType, initialValue);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.ENUM_COMPARAISON:
			return createEnumComparaisonFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.NEW_ENUM1:
			return convertNewEnum1ToString(eDataType, instanceValue);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.ENUM_TYPE:
			return convertEnumTypeToString(eDataType, instanceValue);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.ENUM_COMPARAISON:
			return convertEnumComparaisonToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileLoader createFileLoader() {
		FileLoaderImpl fileLoader = new FileLoaderImpl();
		return fileLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEnum1 createNewEnum1FromString(EDataType eDataType, String initialValue) {
		NewEnum1 result = NewEnum1.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewEnum1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumTypeFromString(EDataType eDataType, String initialValue) {
		EnumType result = EnumType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumComparaison createEnumComparaisonFromString(EDataType eDataType, String initialValue) {
		EnumComparaison result = EnumComparaison.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumComparaisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRUnivCoteAzurL3IAProjectHTMLPackage getFRUnivCoteAzurL3IAProjectHTMLPackage() {
		return (FRUnivCoteAzurL3IAProjectHTMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FRUnivCoteAzurL3IAProjectHTMLPackage getPackage() {
		return FRUnivCoteAzurL3IAProjectHTMLPackage.eINSTANCE;
	}

} //FRUnivCoteAzurL3IAProjectHTMLFactoryImpl
