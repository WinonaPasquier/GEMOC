/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Program#getFilter <em>Filter</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Program#getFileloader <em>Fileloader</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Program#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fRUnivCoteAzurL3IAProjectHTML.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getProgram_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilter();

	/**
	 * Returns the value of the '<em><b>Fileloader</b></em>' containment reference list.
	 * The list contents are of type {@link fRUnivCoteAzurL3IAProjectHTML.FileLoader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileloader</em>' containment reference list.
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getProgram_Fileloader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FileLoader> getFileloader();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference list.
	 * The list contents are of type {@link fRUnivCoteAzurL3IAProjectHTML.Graph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference list.
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getProgram_Graph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graph> getGraph();

} // Program
