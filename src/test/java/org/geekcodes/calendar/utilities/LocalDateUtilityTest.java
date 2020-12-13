package org.geekcodes.calendar.utilities;


import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.Month;

/**
 * The type Local date utility test.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LocalDateUtilityTest {
    private LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 1);
    
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
     * Test get days until sunday.
     */
    @Test
    @Order(1)
    void testGetDaysUntilSunday() {
        Assertions.assertEquals(4, LocalDateUtility.getDaysUntilSunday(localDate));
    }
    
    /**
     * Test get days until monday.
     */
    @Test
    @Order(2)
    void testGetDaysUntilMonday() {
        Assertions.assertEquals(5, LocalDateUtility.getDaysUntilMonday(localDate));
    }
    
    /**
     * Test get days until tuesday.
     */
    @Test
    @Order(3)
    void testGetDaysUntilTuesday() {
        Assertions.assertEquals(6, LocalDateUtility.getDaysUntilTuesday(localDate));
    }
    
    /**
     * Test get days until wednesday.
     */
    @Test
    @Order(4)
    void testGetDaysUntilWednesday() {
        Assertions.assertEquals(0, LocalDateUtility.getDaysUntilWednesday(localDate));
    }
    
    /**
     * Test get days until thursday.
     */
    @Test
    @Order(5)
    void testGetDaysUntilThursday() {
        Assertions.assertEquals(1, LocalDateUtility.getDaysUntilThursday(localDate));
    }
    
    /**
     * Test get days until friday.
     */
    @Test
    @Order(6)
    void testGetDaysUntilFriday() {
        Assertions.assertEquals(2, LocalDateUtility.getDaysUntilFriday(localDate));
    }
    
    /**
     * Test get days until saturday.
     */
    @Test
    @Order(7)
    void testGetDaysUntilSaturday() {
        Assertions.assertEquals(3, LocalDateUtility.getDaysUntilSaturday(localDate));
    }
    
    /**
     * Get days until previous sunday.
     */
    @Test
    @Order(8)
    void getDaysUntilPreviousSunday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(2, LocalDateUtility.getDaysUntilPreviousSunday(ld));
    }
    
    /**
     * Get days until previous monday.
     */
    @Test
    @Order(9)
    void getDaysUntilPreviousMonday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(1, LocalDateUtility.getDaysUntilPreviousMonday(ld));
    }
    
    /**
     * Get days until previous tuesday.
     */
    @Test
    @Order(10)
    void getDaysUntilPreviousTuesday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(0, LocalDateUtility.getDaysUntilPreviousTuesday(ld));
    }
    
    /**
     * Get days until previous wednesday.
     */
    @Test
    @Order(11)
    void getDaysUntilPreviousWednesday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(6, LocalDateUtility.getDaysUntilPreviousWednesday(ld));
    }
    
    /**
     * Get days until previous thursday.
     */
    @Test
    @Order(12)
    void getDaysUntilPreviousThursday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(5, LocalDateUtility.getDaysUntilPreviousThursday(ld));
    }
    
    /**
     * Get days until previous friday.
     */
    @Test
    @Order(13)
    void getDaysUntilPreviousFriday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(4, LocalDateUtility.getDaysUntilPreviousFriday(ld));
    }
    
    /**
     * Get days until previous saturday.
     */
    @Test
    @Order(14)
    void getDaysUntilPreviousSaturday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        System.out.printf("%s %s", ld.getDayOfWeek(), ld);
        Assertions.assertEquals(3, LocalDateUtility.getDaysUntilPreviousSaturday(ld));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(15)
    void testGetLastSundayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 26);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastSundayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(16)
    void testGetLastMondayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 27);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastMondayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(17)
    void testGetLastTuesdayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 28);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastTuesdayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(18)
    void testGetLastWednesdayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 29);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastWednesdayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(19)
    void testGetLastThursdayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 30);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastThursdayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(20)
    void testGetLastFridayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 31);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastFridayOfTheMonth(localDate));
    }
    
    /**
     * Test get last monday of the month.
     */
    @Test
    @Order(21)
    void testGetLastSaturdayOfTheMonth() {
        LocalDate expectedDate = LocalDate.of(2020, Month.JANUARY, 25);
        
        System.out.printf("%s %s", localDate.getDayOfWeek(), localDate);
        Assertions.assertEquals(expectedDate, LocalDateUtility.getLastSaturdayOfTheMonth(localDate));
    }
}