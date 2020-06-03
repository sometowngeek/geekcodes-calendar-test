package org.geekcodes.calendar.utilities;

import org.junit.jupiter.api.*;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalendarUtilityTest {
    private Calendar cal;

    @BeforeEach
    void setUp() {
        System.out.println();
        cal = Calendar.getInstance();
        cal.set(2020, 0, 01, 0, 0, 0);  // Wednesday, 1/1/2020
        System.out.println(cal.getTime());
    }
    
    @AfterEach
    void tearDown() {
        cal = null;
    }
    
    @Test
    @Order(1)
    void testGetDaysUntilSunday(){
        Assertions.assertEquals(4, CalendarUtility.getDaysUntilSunday(cal));
    }
    
    @Test
    @Order(2)
    void testGetDaysUntilMonday(){
        Assertions.assertEquals(5, CalendarUtility.getDaysUntilMonday(cal));
    }
    
    @Test
    @Order(3)
    void testGetDaysUntilTuesday(){
        Assertions.assertEquals(6, CalendarUtility.getDaysUntilTuesday(cal));
    }
    
    @Test
    @Order(4)
    void testGetDaysUntilWednesday(){
        Assertions.assertEquals(0, CalendarUtility.getDaysUntilWednesday(cal));
    }
    
    @Test
    @Order(5)
    void testGetDaysUntilThursday(){
        Assertions.assertEquals(1, CalendarUtility.getDaysUntilThursday(cal));
    }
    
    @Test
    @Order(6)
    void testGetDaysUntilFriday(){
        Assertions.assertEquals(2, CalendarUtility.getDaysUntilFriday(cal));
    }
    
    @Test
    @Order(7)
    void testGetDaysUntilSaturday(){
        Assertions.assertEquals(3, CalendarUtility.getDaysUntilSaturday(cal));
    }
}