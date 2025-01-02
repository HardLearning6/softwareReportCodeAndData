package ds.gptTest;

import ds.CasamentoExato;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CasamentoExatoTest {

    private CasamentoExato casamentoExato;

    @Before
    public void setUp() throws Exception {
        casamentoExato = new CasamentoExato();
    }

    @Test(timeout=1000)
    public void testForcaBruta() throws Exception {
        // Test case with valid inputs
        CasamentoExato.forcaBruta("abcabc", 6, "abc", 3);
        // Test case with empty pattern
        CasamentoExato.forcaBruta("abcabc", 6, "", 0);
        // Test case with pattern longer than text
        CasamentoExato.forcaBruta("abc", 3, "abcd", 4);
        // Test case with no match
        CasamentoExato.forcaBruta("abc", 3, "xyz", 3);
    }

    @Test(timeout=1000)
    public void testShiftAndExato() throws Exception {
        // Test case with valid inputs
        CasamentoExato.shiftAndExato("abcabc", 6, "abc", 3);
        // Test case with empty pattern
        CasamentoExato.shiftAndExato("abcabc", 6, "", 0);
        // Test case with pattern longer than text
        CasamentoExato.shiftAndExato("abc", 3, "abcd", 4);
        // Test case with no match
        CasamentoExato.shiftAndExato("abc", 3, "xyz", 3);
    }

    @Test(timeout=1000)
    public void testBmh() throws Exception {
        // Test case with valid inputs
        CasamentoExato.bmh("abcabc", 6, "abc", 3);
        // Test case with empty pattern
        CasamentoExato.bmh("abcabc", 6, "", 0);
        // Test case with pattern longer than text
        CasamentoExato.bmh("abc", 3, "abcd", 4);
        // Test case with no match
        CasamentoExato.bmh("abc", 3, "xyz", 3);
    }

    @Test(timeout=1000)
    public void testBmhs() throws Exception {
        // Test case with valid inputs
        CasamentoExato.bmhs("abcabc", 6, "abc", 3);
        // Test case with empty pattern
        CasamentoExato.bmhs("abcabc", 6, "", 0);
        // Test case with pattern longer than text
        CasamentoExato.bmhs("abc", 3, "abcd", 4);
        // Test case with no match
        CasamentoExato.bmhs("abc", 3, "xyz", 3);
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        // Testing the default constructor
        assertNotNull(casamentoExato);
    }
}