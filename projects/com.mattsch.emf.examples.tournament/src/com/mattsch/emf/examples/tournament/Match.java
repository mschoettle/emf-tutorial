/**
 */
package com.mattsch.emf.examples.tournament;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getGroup <em>Group</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getGuestTeam <em>Guest Team</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getDate <em>Date</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getLocation <em>Location</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Match#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' reference.
     * @see #setGroup(Group)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_Group()
     * @model required="true"
     * @generated
     */
    Group getGroup();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getGroup <em>Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(Group value);

    /**
     * Returns the value of the '<em><b>Home Team</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Home Team</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Home Team</em>' reference.
     * @see #setHomeTeam(Team)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_HomeTeam()
     * @model required="true"
     * @generated
     */
    Team getHomeTeam();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getHomeTeam <em>Home Team</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Home Team</em>' reference.
     * @see #getHomeTeam()
     * @generated
     */
    void setHomeTeam(Team value);

    /**
     * Returns the value of the '<em><b>Guest Team</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guest Team</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guest Team</em>' reference.
     * @see #setGuestTeam(Team)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_GuestTeam()
     * @model required="true"
     * @generated
     */
    Team getGuestTeam();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getGuestTeam <em>Guest Team</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guest Team</em>' reference.
     * @see #getGuestTeam()
     * @generated
     */
    void setGuestTeam(Team value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_Date()
     * @model required="true"
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_Location()
     * @model
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link com.mattsch.emf.examples.tournament.MatchKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see com.mattsch.emf.examples.tournament.MatchKind
     * @see #setKind(MatchKind)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_Kind()
     * @model required="true"
     * @generated
     */
    MatchKind getKind();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see com.mattsch.emf.examples.tournament.MatchKind
     * @see #getKind()
     * @generated
     */
    void setKind(MatchKind value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' attribute.
     * @see #setResult(String)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatch_Result()
     * @model
     * @generated
     */
    String getResult();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Match#getResult <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' attribute.
     * @see #getResult()
     * @generated
     */
    void setResult(String value);

} // Match
