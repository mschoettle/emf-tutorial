/**
 */
package com.mattsch.emf.examples.tournament;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.Group#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see com.mattsch.emf.examples.tournament.TournamentPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends NamedElement {
    /**
     * Returns the value of the '<em><b>Teams</b></em>' reference list.
     * The list contents are of type {@link com.mattsch.emf.examples.tournament.Team}.
     * It is bidirectional and its opposite is '{@link com.mattsch.emf.examples.tournament.Team#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Teams</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' reference list.
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getGroup_Teams()
     * @see com.mattsch.emf.examples.tournament.Team#getGroup
     * @model opposite="group" required="true"
     * @generated
     */
    EList<Team> getTeams();

} // Group
