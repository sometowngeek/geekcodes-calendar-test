package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type January test.
 */
class JanuaryTest {
    
    public static final int             YEAR              = 2020;
    private             LocalDate       localDate         = LocalDate.of(2020, Month.JANUARY, 1);
    private             LocalDate       expectedLocalDate = LocalDate.of(YEAR, Month.JANUARY, 10);
    private             List<LocalDate> januaryDates      = LocalDate.of(YEAR, Month.JANUARY, 1).datesUntil(LocalDate.of(2020, Month.FEBRUARY, 1)).collect(Collectors.toList());
    private             January         january           = new January(YEAR);
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() throws ParseException {
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void testGetDates() {
        January january = new January(YEAR);
        Assertions.assertEquals(januaryDates, january.getDates());
    }
    
    /**
     * Test get martin luther king jr date.
     */
    @Test
    void testGetMartinLutherKingJrDate() {
        LocalDate expected   = LocalDate.of(2020, Month.JANUARY, 20);
        LocalDate actualDate = January.getMartinLutherKingJrDate(localDate);
        
        Assertions.assertEquals(expected, actualDate);
    }
    
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.JANUARY, 30);
        
        January january = new January(2000);
        january.setLocalDate(LocalDate.of(2025, Month.JANUARY, 30));
        
        Assertions.assertEquals(expected, january.getLocalDate());
    }
    
    @Test
    void testGetNewYearDate() {
        Assertions.assertEquals(LocalDate.of(YEAR, Month.JANUARY, 1), january.getNewYearDate());
    }
    
    @Test
    void testGetHolidays() {
        List<LocalDate> januaryHolidays = new ArrayList<>();
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 1));
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 20));
        
        Assertions.assertEquals(januaryHolidays, january.getHolidays());
    }
}