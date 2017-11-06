/**
 */
package com.mattsch.emf.examples.tournament.util;

import com.mattsch.emf.examples.tournament.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.mattsch.emf.examples.tournament.TournamentPackage
 * @generated
 */
public class TournamentValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final TournamentValidator INSTANCE = new TournamentValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "com.mattsch.emf.examples.tournament";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TournamentValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return TournamentPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case TournamentPackage.TOURNAMENT:
                return validateTournament((Tournament)value, diagnostics, context);
            case TournamentPackage.NAMED_ELEMENT:
                return validateNamedElement((NamedElement)value, diagnostics, context);
            case TournamentPackage.GROUP:
                return validateGroup((Group)value, diagnostics, context);
            case TournamentPackage.TEAM:
                return validateTeam((Team)value, diagnostics, context);
            case TournamentPackage.MATCH:
                return validateMatch((Match)value, diagnostics, context);
            case TournamentPackage.MATCH_KIND:
                return validateMatchKind((MatchKind)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTournament(Tournament tournament, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tournament, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(group, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(team, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
        if (result || diagnostics != null) result &= validateMatch_groupMatchRequiresGroupKind(match, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the groupMatchRequiresGroupKind constraint of '<em>Match</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String MATCH__GROUP_MATCH_REQUIRES_GROUP_KIND__EEXPRESSION = "Tuple {\n" +
        "\tmessage : String = 'A group match requires the match kind to be set to group.',\n" +
        "\tstatus : Boolean = if (not group.oclIsUndefined()) then kind = MatchKind::Group else true endif\n" +
        "}.status";

    /**
     * Validates the groupMatchRequiresGroupKind constraint of '<em>Match</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatch_groupMatchRequiresGroupKind(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (TournamentPackage.Literals.MATCH,
                 match,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                 "groupMatchRequiresGroupKind",
                 MATCH__GROUP_MATCH_REQUIRES_GROUP_KIND__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatchKind(MatchKind matchKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //TournamentValidator
