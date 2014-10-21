/**
 */
package com.mattsch.emf.examples.tournament.impl;

import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Match;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.Tournament;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.TournamentImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.TournamentImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.TournamentImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TournamentImpl extends NamedElementImpl implements Tournament {
    /**
     * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroups()
     * @generated
     * @ordered
     */
    protected EList<Group> groups;

    /**
     * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeams()
     * @generated
     * @ordered
     */
    protected EList<Team> teams;

    /**
     * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatches()
     * @generated
     * @ordered
     */
    protected EList<Match> matches;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TournamentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TournamentPackage.Literals.TOURNAMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Group> getGroups() {
        if (groups == null) {
            groups = new EObjectContainmentEList<Group>(Group.class, this, TournamentPackage.TOURNAMENT__GROUPS);
        }
        return groups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Team> getTeams() {
        if (teams == null) {
            teams = new EObjectContainmentEList<Team>(Team.class, this, TournamentPackage.TOURNAMENT__TEAMS);
        }
        return teams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Match> getMatches() {
        if (matches == null) {
            matches = new EObjectContainmentEList<Match>(Match.class, this, TournamentPackage.TOURNAMENT__MATCHES);
        }
        return matches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TournamentPackage.TOURNAMENT__GROUPS:
                return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
            case TournamentPackage.TOURNAMENT__TEAMS:
                return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
            case TournamentPackage.TOURNAMENT__MATCHES:
                return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
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
            case TournamentPackage.TOURNAMENT__GROUPS:
                return getGroups();
            case TournamentPackage.TOURNAMENT__TEAMS:
                return getTeams();
            case TournamentPackage.TOURNAMENT__MATCHES:
                return getMatches();
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
            case TournamentPackage.TOURNAMENT__GROUPS:
                getGroups().clear();
                getGroups().addAll((Collection<? extends Group>)newValue);
                return;
            case TournamentPackage.TOURNAMENT__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends Team>)newValue);
                return;
            case TournamentPackage.TOURNAMENT__MATCHES:
                getMatches().clear();
                getMatches().addAll((Collection<? extends Match>)newValue);
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
            case TournamentPackage.TOURNAMENT__GROUPS:
                getGroups().clear();
                return;
            case TournamentPackage.TOURNAMENT__TEAMS:
                getTeams().clear();
                return;
            case TournamentPackage.TOURNAMENT__MATCHES:
                getMatches().clear();
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
            case TournamentPackage.TOURNAMENT__GROUPS:
                return groups != null && !groups.isEmpty();
            case TournamentPackage.TOURNAMENT__TEAMS:
                return teams != null && !teams.isEmpty();
            case TournamentPackage.TOURNAMENT__MATCHES:
                return matches != null && !matches.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TournamentImpl
