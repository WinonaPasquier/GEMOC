/**
 */
package fRUnivCoteAzurL3IAProjectHTML.impl;

import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage;
import fRUnivCoteAzurL3IAProjectHTML.FileLoader;
import fRUnivCoteAzurL3IAProjectHTML.Filter;
import fRUnivCoteAzurL3IAProjectHTML.Graph;
import fRUnivCoteAzurL3IAProjectHTML.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl#getFileloader <em>Fileloader</em>}</li>
 *   <li>{@link fRUnivCoteAzurL3IAProjectHTML.impl.ProgramImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * The cached value of the '{@link #getFileloader() <em>Fileloader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileloader()
	 * @generated
	 * @ordered
	 */
	protected EList<FileLoader> fileloader;

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> graph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this,
					FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileLoader> getFileloader() {
		if (fileloader == null) {
			fileloader = new EObjectContainmentEList<FileLoader>(FileLoader.class, this,
					FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER);
		}
		return fileloader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getGraph() {
		if (graph == null) {
			graph = new EObjectContainmentEList<Graph>(Graph.class, this,
					FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH);
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER:
			return ((InternalEList<?>) getFileloader()).basicRemove(otherEnd, msgs);
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH:
			return ((InternalEList<?>) getGraph()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER:
			return getFilter();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER:
			return getFileloader();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH:
			return getGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends Filter>) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER:
			getFileloader().clear();
			getFileloader().addAll((Collection<? extends FileLoader>) newValue);
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH:
			getGraph().clear();
			getGraph().addAll((Collection<? extends Graph>) newValue);
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
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER:
			getFilter().clear();
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER:
			getFileloader().clear();
			return;
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH:
			getGraph().clear();
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
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILTER:
			return filter != null && !filter.isEmpty();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__FILELOADER:
			return fileloader != null && !fileloader.isEmpty();
		case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM__GRAPH:
			return graph != null && !graph.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
