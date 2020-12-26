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
     * Gets days until target day of week.
     */
    @Test
    void testGetDaysUntil() {
        assertEquals(6, LocalDateUtility.getDaysUntil(localDateWednesday, DayOfWeek.TUESDAY, false));
        assertEquals(1, LocalDateUtility.getDaysUntil(localDateWednesday, DayOfWeek.THURSDAY, false));

        // TODO: Add negative testing
    }

    @Test
    void testToDayOfWeek_Monday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.MONDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 23);
        final LocalDate targetPreviousDate2 = LocalDate.of(2019, Month.DECEMBER, 30);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 6);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Tuesday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.TUESDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 24);
        final LocalDate targetPreviousDate2 = LocalDate.of(2019, Month.DECEMBER, 31);

        final LocalDate targetFutureDate1 = LocalDate.of(2019, Month.DECEMBER, 31);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 7);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Wednesday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.WEDNESDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 25);
        final LocalDate targetPreviousDate2 = LocalDate.of(2020, Month.JANUARY, 1);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 1);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 8);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Thursday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.THURSDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 26);
        final LocalDate targetPreviousDate2 = LocalDate.of(2020, Month.JANUARY, 2);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 2);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 9);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Friday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.FRIDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 27);
        final LocalDate targetPreviousDate2 = LocalDate.of(2020, Month.JANUARY, 3);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 3);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 10);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Saturday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.SATURDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 28);
        final LocalDate targetPreviousDate2 = LocalDate.of(2020, Month.JANUARY, 4);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 4);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 11);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate2, previousDate);
    }

    @Test
    void testToDayOfWeek_Sunday() {
        final DayOfWeek targetDayOfWeek = DayOfWeek.SUNDAY;

        final LocalDate targetPreviousDate1 = LocalDate.of(2019, Month.DECEMBER, 29);

        final LocalDate targetFutureDate1 = LocalDate.of(2020, Month.JANUARY, 5);
        final LocalDate targetFutureDate2 = LocalDate.of(2020, Month.JANUARY, 12);


        LocalDate futureDate;
        LocalDate previousDate;

        // Testing with Monday (12/30/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateMonday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Tuesday (12/31/2019)
        futureDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateTuesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Wednesday (1/1/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateWednesday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Thursday (1/2/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateThursday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Friday (1/3/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateFriday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Saturday (1/4/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate1, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSaturday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);

        // Testing with Sunday (1/5/2020)
        futureDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, false);
        assertEquals(targetDayOfWeek, futureDate.getDayOfWeek());
        assertEquals(targetFutureDate2, futureDate);

        previousDate = LocalDateUtility.toDayOfWeek(localDateSunday, targetDayOfWeek, true);
        assertEquals(targetDayOfWeek, previousDate.getDayOfWeek());
        assertEquals(targetPreviousDate1, previousDate);
    }

    @Test
    void testGetLastDay() {
    }
}