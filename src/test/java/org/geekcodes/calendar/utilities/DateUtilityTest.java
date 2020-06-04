package org.geekcodes.calendar.utilities;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.Month;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DateUtilityTest {
    private LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 1);
    
    @BeforeEach
    void setUp() {
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    @Order(1)
    void testGetDaysUntilSunday() {
        Assertions.assertEquals(4, DateUtility.getDaysUntilSunday(localDate));
    }
    
    @Test
    @Order(2)
    void testGetDaysUntilMonday() {
        Assertions.assertEquals(5, DateUtility.getDaysUntilMonday(localDate));
    }
    
    @Test
    @Order(3)
    void testGetDaysUntilTuesday() {
        Assertions.assertEquals(6, DateUtility.getDaysUntilTuesday(localDate));
    }
    
    @Test
    @Order(4)
    void testGetDaysUntilWednesday() {
        Assertions.assertEquals(0, DateUtility.getDaysUntilWednesday(localDate));
    }
    
    @Test
    @Order(5)
    void testGetDaysUntilThursday() {
        Assertions.assertEquals(1, DateUtility.getDaysUntilThursday(localDate));
    }
    
    @Test
    @Order(6)
    void testGetDaysUntilFriday() {
        Assertions.assertEquals(2, DateUtility.getDaysUntilFriday(localDate));
    }
    
    @Test
    @Order(7)
    void testGetDaysUntilSaturday() {
        Assertions.assertEquals(3, DateUtility.getDaysUntilSaturday(localDate));
    }
}