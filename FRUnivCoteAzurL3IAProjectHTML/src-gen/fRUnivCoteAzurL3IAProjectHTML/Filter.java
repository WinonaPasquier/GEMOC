/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getName <em>Name</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getAbs <em>Abs</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getComparaison <em>Comparaison</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getElementComparaison <em>Element Comparaison</em>}</li>
 * </ul>
 *
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getFilter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs</em>' attribute.
	 * @see #setAbs(Boolean)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getFilter_Abs()
	 * @model
	 * @generated
	 */
	Boolean getAbs();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getAbs <em>Abs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs</em>' attribute.
	 * @see #getAbs()
	 * @generated
	 */
	void setAbs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Comparaison</b></em>' attribute.
	 * The literals are from the enumeration {@link fRUnivCoteAzurL3IAProjectHTML.EnumComparaison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparaison</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumComparaison
	 * @see #setComparaison(EnumComparaison)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getFilter_Comparaison()
	 * @model
	 * @generated
	 */
	EnumComparaison getComparaison();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getComparaison <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparaison</em>' attribute.
	 * @see fRUnivCoteAzurL3IAProjectHTML.EnumComparaison
	 * @see #getComparaison()
	 * @generated
	 */
	void setComparaison(EnumComparaison value);

	/**
	 * Returns the value of the '<em><b>Element Comparaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Comparaison</em>' attribute.
	 * @see #setElementComparaison(String)
	 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getFilter_ElementComparaison()
	 * @model
	 * @generated
	 */
	String getElementComparaison();

	/**
	 * Sets the value of the '{@link fRUnivCoteAzurL3IAProjectHTML.Filter#getElementComparaison <em>Element Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Comparaison</em>' attribute.
	 * @see #getElementComparaison()
	 * @generated
	 */
	void setElementComparaison(String value);

} // Filter
