/**
 */
package fRUnivCoteAzurL3IAProjectHTML.impl;

import fRUnivCoteAzurL3IAProjectHTML.EnumComparaison;
import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage;
import fRUnivCoteAzurL3IAProjectHTML.Filter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl#getAbs <em>Abs</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl#getComparaison <em>Comparaison</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.FilterImpl#getElementComparaison <em>Element Comparaison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends MinimalEObjectImpl.Container implements Filter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbs() <em>Abs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbs() <em>Abs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs()
	 * @generated
	 * @ordered
	 */
	protected Boolean abs = ABS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparaison() <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparaison()
	 * @generated
	 * @ordered
	 */
	protected static final EnumComparaison COMPARAISON_EDEFAULT = EnumComparaison.NONE;

	/**
	 * The cached value of the '{@link #getComparaison() <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparaison()
	 * @generated
	 * @ordered
	 */
	protected EnumComparaison comparaison = COMPARAISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementComparaison() <em>Element Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementComparaison()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_COMPARAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementComparaison() <em>Element Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementComparaison()
	 * @generated
	 * @ordered
	 */
	protected String elementComparaison = ELEMENT_COMPARAISON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.FILTER;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbs() {
		return abs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbs(Boolean newAbs) {
		Boolean oldAbs = abs;
		abs = newAbs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ABS,
					oldAbs, abs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumComparaison getComparaison() {
		return comparaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparaison(EnumComparaison newComparaison) {
		EnumComparaison oldComparaison = comparaison;
		comparaison = newComparaison == null ? COMPARAISON_EDEFAULT : newComparaison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__COMPARAISON, oldComparaison, comparaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementComparaison() {
		return elementComparaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementComparaison(String newElementComparaison) {
		String oldElementComparaison = elementComparaison;
		elementComparaison = newElementComparaison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ELEMENT_COMPARAISON, oldElementComparaison,
					elementComparaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__NAME:
			return getName();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ABS:
			return getAbs();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__COMPARAISON:
			return getComparaison();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ELEMENT_COMPARAISON:
			return getElementComparaison();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__NAME:
			setName((String) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ABS:
			setAbs((Boolean) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__COMPARAISON:
			setComparaison((EnumComparaison) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ELEMENT_COMPARAISON:
			setElementComparaison((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ABS:
			setAbs(ABS_EDEFAULT);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__COMPARAISON:
			setComparaison(COMPARAISON_EDEFAULT);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ELEMENT_COMPARAISON:
			setElementComparaison(ELEMENT_COMPARAISON_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ABS:
			return ABS_EDEFAULT == null ? abs != null : !ABS_EDEFAULT.equals(abs);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__COMPARAISON:
			return comparaison != COMPARAISON_EDEFAULT;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER__ELEMENT_COMPARAISON:
			return ELEMENT_COMPARAISON_EDEFAULT == null ? elementComparaison != null
					: !ELEMENT_COMPARAISON_EDEFAULT.equals(elementComparaison);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abs: ");
		result.append(abs);
		result.append(", comparaison: ");
		result.append(comparaison);
		result.append(", elementComparaison: ");
		result.append(elementComparaison);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
