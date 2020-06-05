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

class MarchTest {
    
    /**
     * The constant YEAR.
     */
    public static final int             YEAR       = 2020;
    private             LocalDate       localDate  = LocalDate.of(2020, Month.MARCH, 1);
    private             List<LocalDate> marchDates = LocalDate.of(YEAR, Month.MARCH, 1).datesUntil(LocalDate.of(YEAR, Month.APRIL, 1)).collect(Collectors.toList());
    private             March           march      = new March(YEAR);
    
    @BeforeEach
    void setUp() {
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void getHolidays() {
        Assertions.assertEquals(new ArrayList<LocalDate>(), march.getHolidays());
    }
    
    @Test
    void getDates() {
        Assertions.assertEquals(marchDates, march.getDates());
    }
}