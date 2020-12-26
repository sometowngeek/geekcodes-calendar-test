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

    LocalDate getPreviousWednesday(boolean older){
        if (!older){
            return localDateWednesday;
        }

        return localDateWednesday.minusDays(7);
    }

    LocalDate getFutureWednesday(boolean newer){
        if (!newer){
            return localDateWednesday;
        }

        return localDateWednesday.plusDays(7);
    }

    LocalDate getPreviousThursday(boolean older){
        if (!older){
            return localDateThursday;
        }

        return localDateThursday.minusDays(7);
    }

    LocalDate getFutureThursday(boolean newer){
        if (!newer){
            return localDateThursday;
        }

        return localDateThursday.plusDays(7);
    }

    LocalDate getPreviousFriday(boolean older){
        if (!older){
            return localDateFriday;
        }

        return localDateFriday.minusDays(7);
    }

    LocalDate getFutureFriday(boolean newer){
        if (!newer){
            return localDateFriday;
        }

        return localDateFriday.plusDays(7);
    }

    LocalDate getPreviousSaturday(boolean older){
        if (!older){
            return localDateSaturday;
        }

        return localDateSaturday.minusDays(7);
    }

    LocalDate getFutureSaturday(boolean newer){
        if (!newer){
            return localDateSaturday;
        }

        return localDateSaturday.plusDays(7);
    }

    LocalDate getPreviousSunday(){
        return localDateSunday.minusDays(7);
    }

    LocalDate getFutureSunday(boolean newer){
        if (!newer){
            return localDateSunday;
        }

        return localDateSunday.plusDays(7);
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
    void testToDayOfWeek_Monday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureWednesday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureWednesday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureWednesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Thursday (1/2/2020)
        LocalDate expectedFutureDate = getFutureWednesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Friday (1/3/2020)
        LocalDate expectedFutureDate = getFutureWednesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Wednesday(){
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Saturday (1/4/2020)
        LocalDate expectedFutureDate = getFutureWednesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Wednesday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        // Testing with Sunday (1/5/2020)
        LocalDate expectedFutureDate = getFutureWednesday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousWednesday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }





    @Test
    void testToDayOfWeek_Monday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureThursday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureThursday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureThursday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Thursday (1/2/2019)
        LocalDate expectedFutureDate = getFutureThursday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Thursday (1/2/2019)
        LocalDate expectedFutureDate = getFutureThursday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Thursday (1/2/2019)
        LocalDate expectedFutureDate = getFutureThursday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Thursday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.THURSDAY;

        // Testing with Thursday (1/2/2019)
        LocalDate expectedFutureDate = getFutureThursday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousThursday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }





    @Test
    void testToDayOfWeek_Monday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureFriday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureFriday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureFriday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Thursday (1/2/2020)
        LocalDate expectedFutureDate = getFutureFriday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Friday (1/3/2020)
        LocalDate expectedFutureDate = getFutureFriday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Saturday (1/4/2020)
        LocalDate expectedFutureDate = getFutureFriday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Friday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.FRIDAY;

        // Testing with Sunday (1/5/2020)
        LocalDate expectedFutureDate = getFutureFriday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousFriday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }





    @Test
    void testToDayOfWeek_Monday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureSaturday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureSaturday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSaturday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSaturday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSaturday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSaturday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(true);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Saturday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SATURDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSaturday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSaturday(false);
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }





    @Test
    void testToDayOfWeek_Monday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Monday (12/30/2019)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateMonday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Tuesday (12/31/2019)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Wednesday (1/1/2020)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Thursday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Thursday (1/2/2020)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateThursday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Friday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Friday (1/3/2020)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateFriday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Saturday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Saturday (1/4/2020)
        LocalDate expectedFutureDate = getFutureSunday(false);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }

    @Test
    void testToDayOfWeek_Sunday_to_Sunday() {
        final DayOfWeek expectedDayOfWeek = DayOfWeek.SUNDAY;

        // Testing with Sunday (1/5/2020)
        LocalDate expectedFutureDate = getFutureSunday(true);
        LocalDate actualFutureDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, false);
        assertEquals(expectedDayOfWeek, actualFutureDate.getDayOfWeek());
        assertEquals(expectedFutureDate, actualFutureDate);

        LocalDate expectedPreviousDate = getPreviousSunday();
        LocalDate actualPreviousDate = LocalDateUtility.toDayOfWeek(localDateSunday, expectedDayOfWeek, true);
        assertEquals(expectedDayOfWeek, actualPreviousDate.getDayOfWeek());
        assertEquals(expectedPreviousDate, actualPreviousDate);
    }






    @Test
    void testGetLastDay() {
    }
}