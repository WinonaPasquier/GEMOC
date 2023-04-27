/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphtype <em>Graphtype</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphname <em>Graphname</em>}</li>
 * </ul>
 *
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphtype</b></em>' attribute.
	 * The literals are from the enumeration {@link fRUnivCoteAzurL3IAProjectHTML.EnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphtype</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @see #setGraphtype(EnumType)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph_Graphtype()
	 * @model required="true"
	 * @generated
	 */
	EnumType getGraphtype();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphtype <em>Graphtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphtype</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @see #getGraphtype()
	 * @generated
	 */
	void setGraphtype(EnumType value);

	/**
	 * Returns the value of the '<em><b>Graphname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphname</em>' attribute.
	 * @see #setGraphname(String)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph_Graphname()
	 * @model
	 * @generated
	 */
	String getGraphname();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getGraphname <em>Graphname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphname</em>' attribute.
	 * @see #getGraphname()
	 * @generated
	 */
	void setGraphname(String value);

} // Graph
