/**
 */
package com.mattsch.emf.examples.tournament.impl;

import com.mattsch.emf.examples.tournament.Group;
import com.mattsch.emf.examples.tournament.Team;
import com.mattsch.emf.examples.tournament.TournamentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.impl.TeamImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends NamedElementImpl implements Team {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TeamImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TournamentPackage.Literals.TEAM;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TournamentPackage.TEAM__GROUP, oldGroup, group));
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
    public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
        Group oldGroup = group;
        group = newGroup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TournamentPackage.TEAM__GROUP, oldGroup, newGroup);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(Group newGroup) {
        if (newGroup != group) {
            NotificationChain msgs = null;
            if (group != null)
                msgs = ((InternalEObject)group).eInverseRemove(this, TournamentPackage.GROUP__TEAMS, Group.class, msgs);
            if (newGroup != null)
                msgs = ((InternalEObject)newGroup).eInverseAdd(this, TournamentPackage.GROUP__TEAMS, Group.class, msgs);
            msgs = basicSetGroup(newGroup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TournamentPackage.TEAM__GROUP, newGroup, newGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TournamentPackage.TEAM__GROUP:
                if (group != null)
                    msgs = ((InternalEObject)group).eInverseRemove(this, TournamentPackage.GROUP__TEAMS, Group.class, msgs);
                return basicSetGroup((Group)otherEnd, msgs);
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
            case TournamentPackage.TEAM__GROUP:
                return basicSetGroup(null, msgs);
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
            case TournamentPackage.TEAM__GROUP:
                if (resolve) return getGroup();
                return basicGetGroup();
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
            case TournamentPackage.TEAM__GROUP:
                setGroup((Group)newValue);
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
            case TournamentPackage.TEAM__GROUP:
                setGroup((Group)null);
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
            case TournamentPackage.TEAM__GROUP:
                return group != null;
        }
        return super.eIsSet(featureID);
    }

} //TeamImpl
