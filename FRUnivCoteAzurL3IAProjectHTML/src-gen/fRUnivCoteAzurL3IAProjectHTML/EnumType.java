/**
 */
package fRUnivCoteAzurL3IAProjectHTML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage#getEnumType()
 * @model
 * @generated
 */
public enum EnumType implements Enumerator {
	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(0, "line", "line"),

	/**
	 * The '<em><b>Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(1, "bar", "bar"),

	/**
	 * The '<em><b>Pie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(2, "pie", "pie"),

	/**
	 * The '<em><b>Doughnut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUGHNUT_VALUE
	 * @generated
	 * @ordered
	 */
	DOUGHNUT(3, "doughnut", "doughnut"),

	/**
	 * The '<em><b>Scatter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER(4, "scatter", "scatter"),

	/**
	 * The '<em><b>Bubble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUBBLE(5, "bubble", "bubble"),

	/**
	 * The '<em><b>Radar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR(6, "radar", "radar"),

	/**
	 * The '<em><b>Polar Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLAR_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	POLAR_AREA(7, "polarArea", "polarArea");

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 0;

	/**
	 * The '<em><b>Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model name="bar"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 1;

	/**
	 * The '<em><b>Pie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model name="pie"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 2;

	/**
	 * The '<em><b>Doughnut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUGHNUT
	 * @model name="doughnut"
	 * @generated
	 * @ordered
	 */
	public static final int DOUGHNUT_VALUE = 3;

	/**
	 * The '<em><b>Scatter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER
	 * @model name="scatter"
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_VALUE = 4;

	/**
	 * The '<em><b>Bubble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE
	 * @model name="bubble"
	 * @generated
	 * @ordered
	 */
	public static final int BUBBLE_VALUE = 5;

	/**
	 * The '<em><b>Radar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR
	 * @model name="radar"
	 * @generated
	 * @ordered
	 */
	public static final int RADAR_VALUE = 6;

	/**
	 * The '<em><b>Polar Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLAR_AREA
	 * @model name="polarArea"
	 * @generated
	 * @ordered
	 */
	public static final int POLAR_AREA_VALUE = 7;

	/**
	 * An array of all the '<em><b>Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumType[] VALUES_ARRAY = new EnumType[] { LINE, BAR, PIE, DOUGHNUT, SCATTER, BUBBLE, RADAR,
			POLAR_AREA, };

	/**
	 * A public read-only list of all the '<em><b>Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumType get(int value) {
		switch (value) {
		case LINE_VALUE:
			return LINE;
		case BAR_VALUE:
			return BAR;
		case PIE_VALUE:
			return PIE;
		case DOUGHNUT_VALUE:
			return DOUGHNUT;
		case SCATTER_VALUE:
			return SCATTER;
		case BUBBLE_VALUE:
			return BUBBLE;
		case RADAR_VALUE:
			return RADAR;
		case POLAR_AREA_VALUE:
			return POLAR_AREA;
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
	private EnumType(int value, String name, String literal) {
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

} //EnumType
