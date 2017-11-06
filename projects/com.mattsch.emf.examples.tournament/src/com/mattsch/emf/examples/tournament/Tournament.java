/**
 */
package com.mattsch.emf.examples.tournament;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.Tournament#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Tournament#getTeams <em>Teams</em>}</li>
 *   <li>{@link com.mattsch.emf.examples.tournament.Tournament#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends NamedElement {
    /**
     * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
     * The list contents are of type {@link com.mattsch.emf.examples.tournament.Group}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Groups</em>' containment reference list.
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTournament_Groups()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Group> getGroups();

    /**
     * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
     * The list contents are of type {@link com.mattsch.emf.examples.tournament.Team}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' containment reference list.
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTournament_Teams()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Team> getTeams();

    /**
     * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
     * The list contents are of type {@link com.mattsch.emf.examples.tournament.Match}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matches</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matches</em>' containment reference list.
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTournament_Matches()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Match> getMatches();

} // Tournament
