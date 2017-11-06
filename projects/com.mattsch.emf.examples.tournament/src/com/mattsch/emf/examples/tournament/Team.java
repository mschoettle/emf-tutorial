/**
 */
package com.mattsch.emf.examples.tournament;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mattsch.emf.examples.tournament.Team#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends NamedElement {
    /**
     * Returns the value of the '<em><b>Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link com.mattsch.emf.examples.tournament.Group#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' reference.
     * @see #setGroup(Group)
     * @see com.mattsch.emf.examples.tournament.TournamentPackage#getTeam_Group()
     * @see com.mattsch.emf.examples.tournament.Group#getTeams
     * @model opposite="teams" required="true"
     * @generated
     */
    Group getGroup();

    /**
     * Sets the value of the '{@link com.mattsch.emf.examples.tournament.Team#getGroup <em>Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(Group value);

} // Team
