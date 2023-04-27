/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage
 * @generated
 */
public interface FRUnivCoteAzurL3IAProjectHTMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FRUnivCoteAzurL3IAProjectHTMLFactory eINSTANCE = fRUnivCoteAzurL3IAProjectHTML.impl.FRUnivCoteAzurL3IAProjectHTMLFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>File Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Loader</em>'.
	 * @generated
	 */
	FileLoader createFileLoader();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FRUnivCoteAzurL3IAProjectHTMLPackage getFRUnivCoteAzurL3IAProjectHTMLPackage();

} //FRUnivCoteAzurL3IAProjectHTMLFactory
