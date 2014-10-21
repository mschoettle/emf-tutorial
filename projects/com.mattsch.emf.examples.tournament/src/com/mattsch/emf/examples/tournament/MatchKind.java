/**
 */
package com.mattsch.emf.examples.tournament;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Match Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mattsch.emf.examples.tournament.TournamentPackage#getMatchKind()
 * @model
 * @generated
 */
public enum MatchKind implements Enumerator {
    /**
     * The '<em><b>Group</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GROUP_VALUE
     * @generated
     * @ordered
     */
    GROUP(0, "Group", "Group"),

    /**
     * The '<em><b>Round Of16</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROUND_OF16_VALUE
     * @generated
     * @ordered
     */
    ROUND_OF16(1, "RoundOf16", "RoundOf16"), /**
     * The '<em><b>Quarter Final</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUARTER_FINAL_VALUE
     * @generated
     * @ordered
     */
    QUARTER_FINAL(2, "QuarterFinal", "QuarterFinal"),

    /**
     * The '<em><b>Semi Final</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEMI_FINAL_VALUE
     * @generated
     * @ordered
     */
    SEMI_FINAL(3, "SemiFinal", "SemiFinal"),

    /**
     * The '<em><b>Final</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FINAL_VALUE
     * @generated
     * @ordered
     */
    FINAL(4, "Final", "Final");

    /**
     * The '<em><b>Group</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GROUP
     * @model name="Group"
     * @generated
     * @ordered
     */
    public static final int GROUP_VALUE = 0;

    /**
     * The '<em><b>Round Of16</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Round Of16</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROUND_OF16
     * @model name="RoundOf16"
     * @generated
     * @ordered
     */
    public static final int ROUND_OF16_VALUE = 1;

    /**
     * The '<em><b>Quarter Final</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quarter Final</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUARTER_FINAL
     * @model name="QuarterFinal"
     * @generated
     * @ordered
     */
    public static final int QUARTER_FINAL_VALUE = 2;

    /**
     * The '<em><b>Semi Final</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Semi Final</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEMI_FINAL
     * @model name="SemiFinal"
     * @generated
     * @ordered
     */
    public static final int SEMI_FINAL_VALUE = 3;

    /**
     * The '<em><b>Final</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FINAL
     * @model name="Final"
     * @generated
     * @ordered
     */
    public static final int FINAL_VALUE = 4;

    /**
     * An array of all the '<em><b>Match Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MatchKind[] VALUES_ARRAY =
        new MatchKind[] {
            GROUP,
            ROUND_OF16,
            QUARTER_FINAL,
            SEMI_FINAL,
            FINAL,
        };

    /**
     * A public read-only list of all the '<em><b>Match Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<MatchKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Match Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatchKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Match Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatchKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Match Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MatchKind get(int value) {
        switch (value) {
            case GROUP_VALUE: return GROUP;
            case ROUND_OF16_VALUE: return ROUND_OF16;
            case QUARTER_FINAL_VALUE: return QUARTER_FINAL;
            case SEMI_FINAL_VALUE: return SEMI_FINAL;
            case FINAL_VALUE: return FINAL;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private MatchKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //MatchKind
