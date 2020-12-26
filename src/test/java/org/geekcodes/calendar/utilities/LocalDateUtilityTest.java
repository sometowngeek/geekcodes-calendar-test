package org.geekcodes.calendar.utilities;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * The type Local date utility test.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LocalDateUtilityTest {
    final private LocalDate localDateMonday = LocalDate.of(2019, Month.DECEMBER, 30);
    final private LocalDate localDateTuesday = LocalDate.of(2019, Month.DECEMBER, 31);
    final private LocalDate localDateWednesday = LocalDate.of(2020, Month.JANUARY, 1);
    final private LocalDate localDateThursday = LocalDate.of(2020, Month.JANUARY, 2);
    final private LocalDate localDateFriday = LocalDate.of(2020, Month.JANUARY, 3);
    final private LocalDate localDateSaturday = LocalDate.of(2020, Month.JANUARY, 4);
    final private LocalDate localDateSunday = LocalDate.of(2020, Month.JANUARY, 5);

    LocalDate getPreviousMonday(boolean older){
        if (older){
            return localDateMonday.minusDays(7);
        }
        return localDateMonday;
    }

    LocalDate getFutureMonday(){
        return localDateMonday.plusDays(7);
    }

    LocalDate getPreviousTuesday(boolean older){
        if (!older){
            return localDateTuesday;
        }
        return localDateTuesday.minusDays(7);
    }

    LocalDate getFutureTuesday(boolean newer){
        if (!newer){
            return localDateTuesday;
        }
        return localDateTuesday.plusDays(7);
    }

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        assertEquals(DayOfWeek.MONDAY, localDateMonday.getDayOfWeek());
        assertEquals(DayOfWeek.TUESDAY, localDateTuesday.getDayOfWeek());
        assertEquals(DayOfWeek.WEDNESDAY, localDateWednesday.getDayOfWeek());
        assertEquals(DayOfWeek.THURSDAY, localDateThursday.getDayOfWeek());
        assertEquals(DayOfWeek.FRIDAY, localDateFriday.getDayOfWeek());
        assertEquals(DayOfWeek.SATURDAY, localDateSaturday.getDayOfWeek());
        assertEquals(DayOfWeek.SUNDAY, localDateSunday.getDayOfWeek());
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }


    /**
     * Gets days until expected day of week.
     */
    @Test
    void testGetDaysUntil() {
        assertEquals(6, LocalDateUtility.getDaysUntil(localDateWednesday, DayOfWeek.TUESDAY, false));
        assertEquals(1, LocalDateUtility.getDaysUntil(localDateWednesday, DayOfWeek.THURSDAY, false));

        // TODO: Add negative testing
    }

    @Test
    void testToDayOfWeek_Monday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Thursday (1/2/2020)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Friday (1/3/2020)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Saturday (1/4/2020)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Monday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.MONDAY;

        // Testing with Sunday (1/5/2020)
        LocalDate expectedFutureDate = getFutureMonday();
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousMonday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Monday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureTuesday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Thursday (1/2/2020)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Friday (1/3/2020)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Saturday (1/4/2020)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Tuesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.TUESDAY;

        // Testing with Sunday (1/5/2020)
        LocalDate expectedFutureDate = getFutureTuesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousTuesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testGetLastDay() {
    }
}