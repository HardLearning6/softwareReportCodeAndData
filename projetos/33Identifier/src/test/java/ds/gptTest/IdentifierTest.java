package ds.gptTest;

import ds.Identifier;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class IdentifierTest {
    private Identifier identifier;

    @Before
    public void setUp() throws Exception {
        identifier = new Identifier(); // Testing the default constructor
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_NullString() throws Exception {
        assertFalse(identifier.validateIdentifier(null)); // Testing with null input
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_EmptyString() throws Exception {
        assertFalse(identifier.validateIdentifier("")); // Testing with empty string
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_SingleCharacterValid() throws Exception {
        assertTrue(identifier.validateIdentifier("a")); // Testing valid single character
        assertTrue(identifier.validateIdentifier("Z")); // Testing valid single character
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_SingleCharacterInvalid() throws Exception {
        assertFalse(identifier.validateIdentifier("1")); // Testing invalid single character
        assertFalse(identifier.validateIdentifier("$")); // Testing invalid single character
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidTwoCharacter() throws Exception {
        assertTrue(identifier.validateIdentifier("ab")); // Valid two-character identifier
        assertTrue(identifier.validateIdentifier("Z1")); // Valid two-character identifier
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidTwoCharacter() throws Exception {
        assertFalse(identifier.validateIdentifier("1a")); // Invalid starting character
        assertFalse(identifier.validateIdentifier("$$")); // Invalid characters
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidThreeCharacter() throws Exception {
        assertTrue(identifier.validateIdentifier("abc")); // Valid three-character identifier
        assertTrue(identifier.validateIdentifier("Z12")); // Valid three-character identifier
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidFourCharacter() throws Exception {
        assertTrue(identifier.validateIdentifier("abcd")); // Valid four-character identifier
        assertTrue(identifier.validateIdentifier("A12b")); // Valid four-character identifier
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidFiveCharacter() throws Exception {
        assertTrue(identifier.validateIdentifier("abcde")); // Valid five-character identifier
        assertTrue(identifier.validateIdentifier("A123b")); // Valid five-character identifier
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidSixCharacter() throws Exception {
        assertFalse(identifier.validateIdentifier("abcdef")); // Invalid six-character identifier
        assertFalse(identifier.validateIdentifier("A1234b")); // Invalid six-character identifier
    }

    @Test(timeout = 1000)
    public void testValid_s_ValidCharacters() throws Exception {
        assertTrue(identifier.valid_s('a')); // Valid lowercase letter
        assertTrue(identifier.valid_s('Z')); // Valid uppercase letter
    }

    @Test(timeout = 1000)
    public void testValid_s_InvalidCharacters() throws Exception {
        assertFalse(identifier.valid_s('1')); // Invalid number
        assertFalse(identifier.valid_s('$')); // Invalid special character
    }

    @Test(timeout = 1000)
    public void testValid_f_ValidCharacters() throws Exception {
        assertTrue(identifier.valid_f('a')); // Valid lowercase letter
        assertTrue(identifier.valid_f('Z')); // Valid uppercase letter
        assertTrue(identifier.valid_f('0')); // Valid number
    }

    @Test(timeout = 1000)
    public void testValid_f_InvalidCharacters() throws Exception {
        assertFalse(identifier.valid_f('$')); // Invalid special character
        assertFalse(identifier.valid_f('&')); // Invalid special character
    }
}