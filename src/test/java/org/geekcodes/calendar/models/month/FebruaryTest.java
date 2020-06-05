package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type February test.
 */
class FebruaryTest {
    
    /**
     * The constant YEAR.
     */
    public static final int             YEAR          = 2020;
    private             LocalDate       localDate     = LocalDate.of(2020, Month.JANUARY, 1);
    private             List<LocalDate> februaryDates = LocalDate.of(YEAR, Month.FEBRUARY, 1).datesUntil(LocalDate.of(YEAR, Month.MARCH, 1)).collect(Collectors.toList());
    private             February        february      = new February(YEAR);
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
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
        expectedDates.add(LocalDate.of(YEAR, Month.FEBRUARY, 17));
        
        Assertions.assertEquals(expectedDates, february.getHolidays());
    }
    
    @Test
    void testGetHolidaysStatic(){
        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(YEAR, Month.FEBRUARY, 17));
    
        Assertions.assertEquals(expectedDates, February.getHolidays(YEAR));
    }
    
    
    /**
     * Test get presidents day.
     */
    @Test
    void testGetPresidentsDay() {
        LocalDate expectedLocalDate = LocalDate.of(2020, Month.FEBRUARY, 17);
        Assertions.assertEquals(expectedLocalDate, february.getPresidentsDay());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(februaryDates, february.getDates());
    }
}