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
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getType <em>Type</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fRUnivCoteAzurL3IAProjectHTML.EnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @see #setType(EnumType)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph_Type()
	 * @model required="true"
	 * @generated
	 */
	EnumType getType();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Graph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Graph
