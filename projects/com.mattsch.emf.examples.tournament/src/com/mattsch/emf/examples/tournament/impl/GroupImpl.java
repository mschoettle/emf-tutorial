/**
 */
package com.mattsch.emf.examples.tournament.impl;

import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.GroupImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends NamedElementImpl implements Group {
    /**
     * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeams()
     * @generated
     * @ordered
     */
    protected EList<Team> teams;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TournamentPackage.Literals.GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Team> getTeams() {
        if (teams == null) {
            teams = new EObjectWithInverseResolvingEList<Team>(Team.class, this, TournamentPackage.GROUP__TEAMS, TournamentPackage.TEAM__GROUP);
        }
        return teams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TournamentPackage.GROUP__TEAMS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TournamentPackage.GROUP__TEAMS:
                return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
            case TournamentPackage.GROUP__TEAMS:
                return getTeams();
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
            case TournamentPackage.GROUP__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends Team>)newValue);
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
            case TournamentPackage.GROUP__TEAMS:
                getTeams().clear();
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
            case TournamentPackage.GROUP__TEAMS:
                return teams != null && !teams.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GroupImpl
