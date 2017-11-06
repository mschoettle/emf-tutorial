/**
 */
package com.mattsch.emf.examples.tournament.impl;

import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Match;
import com.mattsch.emf.examples.tournament.MatchKind;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getGuestTeam <em>Guest Team</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.MatchImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected Group group;

    /**
     * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHomeTeam()
     * @generated
     * @ordered
     */
    protected Team homeTeam;

    /**
     * The cached value of the '{@link #getGuestTeam() <em>Guest Team</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuestTeam()
     * @generated
     * @ordered
     */
    protected Team guestTeam;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final MatchKind KIND_EDEFAULT = MatchKind.GROUP;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected MatchKind kind = KIND_EDEFAULT;

    /**
     * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected static final String RESULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected String result = RESULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TournamentPackage.Literals.MATCH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group getGroup() {
        if (group != null && group.eIsProxy()) {
            InternalEObject oldGroup = (InternalEObject)group;
            group = (Group)eResolveProxy(oldGroup);
            if (group != oldGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TournamentPackage.MATCH__GROUP, oldGroup, group));
            }
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group basicGetGroup() {
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(Group newGroup) {
        Group oldGroup = group;
        group = newGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__GROUP, oldGroup, group));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Team getHomeTeam() {
        if (homeTeam != null && homeTeam.eIsProxy()) {
            InternalEObject oldHomeTeam = (InternalEObject)homeTeam;
            homeTeam = (Team)eResolveProxy(oldHomeTeam);
            if (homeTeam != oldHomeTeam) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TournamentPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
            }
        }
        return homeTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Team basicGetHomeTeam() {
        return homeTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHomeTeam(Team newHomeTeam) {
        Team oldHomeTeam = homeTeam;
        homeTeam = newHomeTeam;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Team getGuestTeam() {
        if (guestTeam != null && guestTeam.eIsProxy()) {
            InternalEObject oldGuestTeam = (InternalEObject)guestTeam;
            guestTeam = (Team)eResolveProxy(oldGuestTeam);
            if (guestTeam != oldGuestTeam) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TournamentPackage.MATCH__GUEST_TEAM, oldGuestTeam, guestTeam));
            }
        }
        return guestTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Team basicGetGuestTeam() {
        return guestTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGuestTeam(Team newGuestTeam) {
        Team oldGuestTeam = guestTeam;
        guestTeam = newGuestTeam;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__GUEST_TEAM, oldGuestTeam, guestTeam));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(MatchKind newKind) {
        MatchKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__KIND, oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResult() {
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResult(String newResult) {
        String oldResult = result;
        result = newResult;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.MATCH__RESULT, oldResult, result));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TournamentPackage.MATCH__GROUP:
                if (resolve) return getGroup();
                return basicGetGroup();
            case TournamentPackage.MATCH__HOME_TEAM:
                if (resolve) return getHomeTeam();
                return basicGetHomeTeam();
            case TournamentPackage.MATCH__GUEST_TEAM:
                if (resolve) return getGuestTeam();
                return basicGetGuestTeam();
            case TournamentPackage.MATCH__DATE:
                return getDate();
            case TournamentPackage.MATCH__LOCATION:
                return getLocation();
            case TournamentPackage.MATCH__KIND:
                return getKind();
            case TournamentPackage.MATCH__RESULT:
                return getResult();
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
            case TournamentPackage.MATCH__GROUP:
                setGroup((Group)newValue);
                return;
            case TournamentPackage.MATCH__HOME_TEAM:
                setHomeTeam((Team)newValue);
                return;
            case TournamentPackage.MATCH__GUEST_TEAM:
                setGuestTeam((Team)newValue);
                return;
            case TournamentPackage.MATCH__DATE:
                setDate((Date)newValue);
                return;
            case TournamentPackage.MATCH__LOCATION:
                setLocation((String)newValue);
                return;
            case TournamentPackage.MATCH__KIND:
                setKind((MatchKind)newValue);
                return;
            case TournamentPackage.MATCH__RESULT:
                setResult((String)newValue);
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
            case TournamentPackage.MATCH__GROUP:
                setGroup((Group)null);
                return;
            case TournamentPackage.MATCH__HOME_TEAM:
                setHomeTeam((Team)null);
                return;
            case TournamentPackage.MATCH__GUEST_TEAM:
                setGuestTeam((Team)null);
                return;
            case TournamentPackage.MATCH__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case TournamentPackage.MATCH__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case TournamentPackage.MATCH__KIND:
                setKind(KIND_EDEFAULT);
                return;
            case TournamentPackage.MATCH__RESULT:
                setResult(RESULT_EDEFAULT);
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
            case TournamentPackage.MATCH__GROUP:
                return group != null;
            case TournamentPackage.MATCH__HOME_TEAM:
                return homeTeam != null;
            case TournamentPackage.MATCH__GUEST_TEAM:
                return guestTeam != null;
            case TournamentPackage.MATCH__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case TournamentPackage.MATCH__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case TournamentPackage.MATCH__KIND:
                return kind != KIND_EDEFAULT;
            case TournamentPackage.MATCH__RESULT:
                return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (date: ");
        result.append(date);
        result.append(", location: ");
        result.append(location);
        result.append(", kind: ");
        result.append(kind);
        result.append(", result: ");
        result.append(result);
        result.append(')');
        return result.toString();
    }

} //MatchImpl
