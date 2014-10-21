/**
 */
package com.mattsch.emf.examples.tournament;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mattsch.emf.examples.tournament.TournamentFactory
 * @model kind="package"
 * @generated
 */
public interface TournamentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "tournament";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://mattsch.com/emf/examples/tournament";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "tournament";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TournamentPackage eINSTANCE = com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl.init();

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.impl.NamedElementImpl
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.impl.TournamentImpl <em>Tournament</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.impl.TournamentImpl
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getTournament()
     * @generated
     */
    int TOURNAMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Teams</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT__TEAMS = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Matches</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT__MATCHES = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Tournament</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Tournament</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOURNAMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.impl.GroupImpl
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getGroup()
     * @generated
     */
    int GROUP = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Teams</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__TEAMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.impl.TeamImpl <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.impl.TeamImpl
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getTeam()
     * @generated
     */
    int TEAM = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.impl.MatchImpl <em>Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.impl.MatchImpl
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getMatch()
     * @generated
     */
    int MATCH = 4;

    /**
     * The feature id for the '<em><b>Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__GROUP = 0;

    /**
     * The feature id for the '<em><b>Home Team</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__HOME_TEAM = 1;

    /**
     * The feature id for the '<em><b>Guest Team</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__GUEST_TEAM = 2;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__DATE = 3;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__LOCATION = 4;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__KIND = 5;

    /**
     * The feature id for the '<em><b>Result</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH__RESULT = 6;

    /**
     * The number of structural features of the '<em>Match</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Match</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATCH_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link com.mattsch.emf.examples.tournament.MatchKind <em>Match Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mattsch.emf.examples.tournament.MatchKind
     * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getMatchKind()
     * @generated
     */
    int MATCH_KIND = 5;


    /**
     * Returns the meta object for class '{@link com.mattsch.emf.examples.tournament.Tournament <em>Tournament</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tournament</em>'.
     * @see com.mattsch.emf.examples.tournament.Tournament
     * @generated
     */
    EClass getTournament();

    /**
     * Returns the meta object for the containment reference list '{@link com.mattsch.emf.examples.tournament.Tournament#getGroups <em>Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Groups</em>'.
     * @see com.mattsch.emf.examples.tournament.Tournament#getGroups()
     * @see #getTournament()
     * @generated
     */
    EReference getTournament_Groups();

    /**
     * Returns the meta object for the containment reference list '{@link com.mattsch.emf.examples.tournament.Tournament#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Teams</em>'.
     * @see com.mattsch.emf.examples.tournament.Tournament#getTeams()
     * @see #getTournament()
     * @generated
     */
    EReference getTournament_Teams();

    /**
     * Returns the meta object for the containment reference list '{@link com.mattsch.emf.examples.tournament.Tournament#getMatches <em>Matches</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Matches</em>'.
     * @see com.mattsch.emf.examples.tournament.Tournament#getMatches()
     * @see #getTournament()
     * @generated
     */
    EReference getTournament_Matches();

    /**
     * Returns the meta object for class '{@link com.mattsch.emf.examples.tournament.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see com.mattsch.emf.examples.tournament.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link com.mattsch.emf.examples.tournament.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see com.mattsch.emf.examples.tournament.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link com.mattsch.emf.examples.tournament.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group</em>'.
     * @see com.mattsch.emf.examples.tournament.Group
     * @generated
     */
    EClass getGroup();

    /**
     * Returns the meta object for the reference list '{@link com.mattsch.emf.examples.tournament.Group#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Teams</em>'.
     * @see com.mattsch.emf.examples.tournament.Group#getTeams()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Teams();

    /**
     * Returns the meta object for class '{@link com.mattsch.emf.examples.tournament.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Team</em>'.
     * @see com.mattsch.emf.examples.tournament.Team
     * @generated
     */
    EClass getTeam();

    /**
     * Returns the meta object for the reference '{@link com.mattsch.emf.examples.tournament.Team#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Group</em>'.
     * @see com.mattsch.emf.examples.tournament.Team#getGroup()
     * @see #getTeam()
     * @generated
     */
    EReference getTeam_Group();

    /**
     * Returns the meta object for class '{@link com.mattsch.emf.examples.tournament.Match <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Match</em>'.
     * @see com.mattsch.emf.examples.tournament.Match
     * @generated
     */
    EClass getMatch();

    /**
     * Returns the meta object for the reference '{@link com.mattsch.emf.examples.tournament.Match#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Group</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getGroup()
     * @see #getMatch()
     * @generated
     */
    EReference getMatch_Group();

    /**
     * Returns the meta object for the reference '{@link com.mattsch.emf.examples.tournament.Match#getHomeTeam <em>Home Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Home Team</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getHomeTeam()
     * @see #getMatch()
     * @generated
     */
    EReference getMatch_HomeTeam();

    /**
     * Returns the meta object for the reference '{@link com.mattsch.emf.examples.tournament.Match#getGuestTeam <em>Guest Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Guest Team</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getGuestTeam()
     * @see #getMatch()
     * @generated
     */
    EReference getMatch_GuestTeam();

    /**
     * Returns the meta object for the attribute '{@link com.mattsch.emf.examples.tournament.Match#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getDate()
     * @see #getMatch()
     * @generated
     */
    EAttribute getMatch_Date();

    /**
     * Returns the meta object for the attribute '{@link com.mattsch.emf.examples.tournament.Match#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getLocation()
     * @see #getMatch()
     * @generated
     */
    EAttribute getMatch_Location();

    /**
     * Returns the meta object for the attribute '{@link com.mattsch.emf.examples.tournament.Match#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getKind()
     * @see #getMatch()
     * @generated
     */
    EAttribute getMatch_Kind();

    /**
     * Returns the meta object for the attribute '{@link com.mattsch.emf.examples.tournament.Match#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Result</em>'.
     * @see com.mattsch.emf.examples.tournament.Match#getResult()
     * @see #getMatch()
     * @generated
     */
    EAttribute getMatch_Result();

    /**
     * Returns the meta object for enum '{@link com.mattsch.emf.examples.tournament.MatchKind <em>Match Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Match Kind</em>'.
     * @see com.mattsch.emf.examples.tournament.MatchKind
     * @generated
     */
    EEnum getMatchKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TournamentFactory getTournamentFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.impl.TournamentImpl <em>Tournament</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.impl.TournamentImpl
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getTournament()
         * @generated
         */
        EClass TOURNAMENT = eINSTANCE.getTournament();

        /**
         * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TOURNAMENT__GROUPS = eINSTANCE.getTournament_Groups();

        /**
         * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TOURNAMENT__TEAMS = eINSTANCE.getTournament_Teams();

        /**
         * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TOURNAMENT__MATCHES = eINSTANCE.getTournament_Matches();

        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.impl.NamedElementImpl
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.impl.GroupImpl <em>Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.impl.GroupImpl
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getGroup()
         * @generated
         */
        EClass GROUP = eINSTANCE.getGroup();

        /**
         * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__TEAMS = eINSTANCE.getGroup_Teams();

        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.impl.TeamImpl <em>Team</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.impl.TeamImpl
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getTeam()
         * @generated
         */
        EClass TEAM = eINSTANCE.getTeam();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEAM__GROUP = eINSTANCE.getTeam_Group();

        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.impl.MatchImpl <em>Match</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.impl.MatchImpl
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getMatch()
         * @generated
         */
        EClass MATCH = eINSTANCE.getMatch();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATCH__GROUP = eINSTANCE.getMatch_Group();

        /**
         * The meta object literal for the '<em><b>Home Team</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATCH__HOME_TEAM = eINSTANCE.getMatch_HomeTeam();

        /**
         * The meta object literal for the '<em><b>Guest Team</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATCH__GUEST_TEAM = eINSTANCE.getMatch_GuestTeam();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATCH__LOCATION = eINSTANCE.getMatch_Location();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATCH__KIND = eINSTANCE.getMatch_Kind();

        /**
         * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATCH__RESULT = eINSTANCE.getMatch_Result();

        /**
         * The meta object literal for the '{@link com.mattsch.emf.examples.tournament.MatchKind <em>Match Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.mattsch.emf.examples.tournament.MatchKind
         * @see com.mattsch.emf.examples.tournament.impl.TournamentPackageImpl#getMatchKind()
         * @generated
         */
        EEnum MATCH_KIND = eINSTANCE.getMatchKind();

    }

} //TournamentPackage
