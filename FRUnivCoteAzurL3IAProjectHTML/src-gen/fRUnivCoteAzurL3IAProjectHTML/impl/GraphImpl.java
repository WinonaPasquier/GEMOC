/**
 */
package fRUnivCoteAzurL3IAProjectHTML.impl;

import fRUnivCoteAzurL3IAProjectHTML.EnumType;
import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage;
import fRUnivCoteAzurL3IAProjectHTML.Graph;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl#getGraphtype <em>Graphtype</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.GraphImpl#getGraphname <em>Graphname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The default value of the '{@link #getGraphtype() <em>Graphtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphtype()
	 * @generated
	 * @ordered
	 */
	protected static final EnumType GRAPHTYPE_EDEFAULT = EnumType.LINE;

	/**
	 * The cached value of the '{@link #getGraphtype() <em>Graphtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphtype()
	 * @generated
	 * @ordered
	 */
	protected EnumType graphtype = GRAPHTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphname() <em>Graphname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphname()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphname() <em>Graphname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphname()
	 * @generated
	 * @ordered
	 */
	protected String graphname = GRAPHNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType getGraphtype() {
		return graphtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphtype(EnumType newGraphtype) {
		EnumType oldGraphtype = graphtype;
		graphtype = newGraphtype == null ? GRAPHTYPE_EDEFAULT : newGraphtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHTYPE,
					oldGraphtype, graphtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphname() {
		return graphname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphname(String newGraphname) {
		String oldGraphname = graphname;
		graphname = newGraphname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHNAME,
					oldGraphname, graphname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHTYPE:
			return getGraphtype();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHNAME:
			return getGraphname();
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
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHTYPE:
			setGraphtype((EnumType) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHNAME:
			setGraphname((String) newValue);
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
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHTYPE:
			setGraphtype(GRAPHTYPE_EDEFAULT);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHNAME:
			setGraphname(GRAPHNAME_EDEFAULT);
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
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHTYPE:
			return graphtype != GRAPHTYPE_EDEFAULT;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH__GRAPHNAME:
			return GRAPHNAME_EDEFAULT == null ? graphname != null : !GRAPHNAME_EDEFAULT.equals(graphname);
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
		result.append(" (graphtype: ");
		result.append(graphtype);
		result.append(", graphname: ");
		result.append(graphname);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
