/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Comparaison</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getEnumComparaison()
 * @model
 * @generated
 */
public enum EnumComparaison implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "none", "none"),
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "equal", "equal"),

	/**
	 * The '<em><b>Sup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUP(2, "sup", "sup"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(3, "inf", "inf"),
	/**
	 * The '<em><b>Sup Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SUP_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUP_EQUAL(4, "supEqual", "supEqual"),
	/**
	 * The '<em><b>Inf Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INF_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INF_EQUAL(5, "infEqual", "infEqual"),
	/**
	 * The '<em><b>Not Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(6, "notEqual", "notEqual");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Sup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP
	 * @model name="sup"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_VALUE = 2;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 3;

	/**
	 * The '<em><b>Sup Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_EQUAL
	 * @model name="supEqual"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Inf Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_EQUAL
	 * @model name="infEqual"
	 * @generated
	 * @ordered
	 */
	public static final int INF_EQUAL_VALUE = 5;

	/**
	 * The '<em><b>Not Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model name="notEqual"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Enum Comparaison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumComparaison[] VALUES_ARRAY = new EnumComparaison[] { NONE, EQUAL, SUP, INF, SUP_EQUAL,
			INF_EQUAL, NOT_EQUAL, };

	/**
	 * A public read-only list of all the '<em><b>Enum Comparaison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumComparaison> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Comparaison</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumComparaison get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumComparaison result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Comparaison</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumComparaison getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumComparaison result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Comparaison</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumComparaison get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case EQUAL_VALUE:
			return EQUAL;
		case INF_VALUE:
			return INF;
		case SUP_EQUAL_VALUE:
			return SUP_EQUAL;
		case INF_EQUAL_VALUE:
			return INF_EQUAL;
		case NOT_EQUAL_VALUE:
			return NOT_EQUAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumComparaison(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EnumComparaison
