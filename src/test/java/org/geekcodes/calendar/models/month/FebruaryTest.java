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
        februaryNotLeapYear = new February(NOT_LEAP_YEAR);
        
        initializeLeapYearDates();
        initializeNonLeapYearDates();
    }
    
    private void initializeNonLeapYearDates() {
        februaryDatesNotLeapYear = new ArrayList<>();
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 1));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 2));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 3));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 4));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 5));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 6));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 7));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 8));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 9));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 10));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 11));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 12));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 13));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 14));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 15));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 16));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 17));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 18));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 19));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 20));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 21));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 22));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 23));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 24));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 25));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 26));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 27));
        februaryDatesNotLeapYear.add(LocalDate.of(NOT_LEAP_YEAR, Month.FEBRUARY, 28));
    }
    
    private void initializeLeapYearDates() {
        februaryDatesLeapYear = new ArrayList<>();
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 1));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 2));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 3));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 4));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 5));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 6));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 7));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 8));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 9));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 10));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 11));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 12));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 13));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 14));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 15));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 16));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 18));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 19));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 20));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 21));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 22));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 23));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 24));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 25));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 26));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 27));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 28));
        februaryDatesLeapYear.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 29));
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