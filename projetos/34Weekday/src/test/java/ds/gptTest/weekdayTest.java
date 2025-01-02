package ds.gptTest;

import ds.weekday;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class weekdayTest {

    private weekday wd;

    @Before
    public void setUp() throws Exception {
        wd = new weekday(); // Testing the default constructor
    }

    @Test(timeout = 1000)
    public void testGetWeekdayValidDate() throws Exception {
        // Test with a valid date
        int result = wd.getWeekday(2023, 10, 1);
        assertEquals(1, result); // Expected to return 1 (Sunday)
    }

    @Test(timeout = 1000)
    public void testGetWeekdayLeapYear() throws Exception {
        // Test with a leap year date
        int result = wd.getWeekday(2020, 2, 29);
        assertEquals(6, result); // Expected to return 6 (Saturday)
    }

    @Test(timeout = 1000)
    public void testGetWeekdayInvalidDateNegativeYear() throws Exception {
        // Test with a negative year
        int result = wd.getWeekday(-1, 10, 1);
        assertEquals(0, result); // Expected to return 0
    }

    @Test(timeout = 1000)
    public void testGetWeekdayInvalidDateMonthTooHigh() throws Exception {
        // Test with month greater than 12
        int result = wd.getWeekday(2023, 13, 1);
        assertEquals(-2, result); // Expected to return -2
    }

    @Test(timeout = 1000)
    public void testGetWeekdayInvalidDateDayTooHigh() throws Exception {
        // Test with day greater than the maximum for the month
        int result = wd.getWeekday(2023, 1, 32);
        assertEquals(-3, result); // Expected to return -3
    }

    @Test(timeout = 1000)
    public void testGetWeekdayYearTooHigh() throws Exception {
        // Test with year greater than 10000
        int result = wd.getWeekday(10001, 10, 1);
        assertEquals(-1, result); // Expected to return -1
    }

    @Test(timeout = 1000)
    public void testGetWeekdayZeroDay() throws Exception {
        // Test with zero day
        int result = wd.getWeekday(2023, 10, 0);
        assertEquals(0, result); // Expected to return 0
    }

    @Test(timeout = 1000)
    public void testGetWeekdayZeroMonth() throws Exception {
        // Test with zero month
        int result = wd.getWeekday(2023, 0, 1);
        assertEquals(0, result); // Expected to return 0
    }

    @Test(timeout = 1000)
    public void testGetWeekdayZeroYear() throws Exception {
        // Test with zero year
        int result = wd.getWeekday(0, 10, 1);
        assertEquals(0, result); // Expected to return 0
    }

    @Test(timeout = 1000)
    public void testGetWeekdayBoundaryNegativeValues() throws Exception {
        // Test with negative values for year, month, day
        assertEquals(0, wd.getWeekday(-1, -1, -1)); // Expected to return 0
    }

    @Test(timeout = 1000)
    public void testGetWeekdayBoundaryPositiveValues() throws Exception {
        // Test with boundary positive values
        assertEquals(1, wd.getWeekday(1, 1, 1)); // Expected to return 1 (Monday)
    }
}