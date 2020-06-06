package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type February test.
 */
class FebruaryTest {
    
    private static final int             LEAP_YEAR = 2020;
    private              List<LocalDate> februaryDatesLeapYear;
    private              February        februaryLeapYear;
    
    private static final int             NOT_LEAP_YEAR = 2021;
    private              List<LocalDate> februaryDatesNotLeapYear;
    private              February        februaryNotLeapYear;
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        februaryLeapYear    = new February(LEAP_YEAR);
        februaryNotLeapYear = new February(LEAP_YEAR + 1);
        februaryDatesLeapYear = FebruaryTest.getDates(true);
        februaryDatesNotLeapYear = FebruaryTest.getDates(false);
    }
    
    /**
     * Gets dates.
     *
     * @param leapYear the leap year
     *
     * @return the dates
     */
    static List<LocalDate> getDates(boolean leapYear) {
        List <LocalDate> dates = new ArrayList<>();
        
        final int year = leapYear ? LEAP_YEAR : NOT_LEAP_YEAR;
        
        dates.add(LocalDate.of(year, Month.FEBRUARY, 1));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 2));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 3));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 4));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 5));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 6));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 7));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 8));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 9));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 10));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 11));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 12));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 13));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 14));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 15));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 16));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 17));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 18));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 19));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 20));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 21));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 22));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 23));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 24));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 25));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 26));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 27));
        dates.add(LocalDate.of(year, Month.FEBRUARY, 28));
        
        if (leapYear){
            dates.add(LocalDate.of(year, Month.FEBRUARY, 29));
        }
        
        return dates;
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }
    
    /**
     * Test get holidays.
     */
    @Test
    void testGetHolidays() {
        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17));
        
        Assertions.assertEquals(expectedDates, februaryLeapYear.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17));
        
        Assertions.assertEquals(expectedDates, February.getHolidays(LEAP_YEAR));
    }
    
    
    /**
     * Test get presidents day.
     */
    @Test
    void testGetPresidentsDay() {
        LocalDate expectedLocalDate = LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17);
        Assertions.assertEquals(expectedLocalDate, februaryLeapYear.getPresidentsDay());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDatesLeapYear() {
        Assertions.assertEquals(februaryDatesLeapYear, februaryLeapYear.getDates());
        Assertions.assertNotEquals(februaryDatesNotLeapYear, februaryLeapYear.getDates());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDatesNotLeapYear() {
        Assertions.assertEquals(februaryDatesNotLeapYear, februaryNotLeapYear.getDates());
        Assertions.assertNotEquals(februaryDatesLeapYear, februaryNotLeapYear.getDates());
    }
}