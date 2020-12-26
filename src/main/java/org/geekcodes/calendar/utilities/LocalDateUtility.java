package org.geekcodes.calendar.utilities;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * The type Calendar utility.
 */
public class LocalDateUtility {
    private LocalDateUtility() {
    }

    /**
     * Get the date of the target {@link java.time.DayOfWeek}.
     *
     * @param localDate       the local date.
     * @param targetDayOfWeek the target {@link java.time.DayOfWeek DayOfWeek}.
     * @param reverse         Will search backwards if true.
     * @return the local date
     */
    public static LocalDate toDayOfWeek(LocalDate localDate, DayOfWeek targetDayOfWeek, boolean reverse){
        return localDate.plusDays(LocalDateUtility.getDaysUntil(localDate, targetDayOfWeek, reverse));
    }

    /**
     * Get number of days until target day of week.
     *
     * @param localDate       the local date.
     * @param targetDayOfWeek the target {@link java.time.DayOfWeek DayOfWeek}.
     * @param reverse         Will search backwards if true.
     * @return the number of days to target day of week.
     */
    public static long getDaysUntil(LocalDate localDate, DayOfWeek targetDayOfWeek, boolean reverse){
        if (!reverse){
            return getDaysUntilX(localDate, targetDayOfWeek);
        }

        return getDaysUntilPreviousX(localDate, targetDayOfWeek);
    }

    /**
     * Get days until day of week.
     *
     * @param localDate       the local date
     * @param targetDayOfWeek the target day of week
     * @return the count of days until target day of week.
     */
    private static long getDaysUntilX(LocalDate localDate, DayOfWeek targetDayOfWeek){
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();

        if (calendarDayOfWeek.equals(targetDayOfWeek)){
            return 7;
        }

        if (calendarDayOfWeek.getValue() < targetDayOfWeek.getValue() + 1) {
            return (long) targetDayOfWeek.getValue() - calendarDayOfWeek.getValue();
        }

        return 7 - ((long) calendarDayOfWeek.getValue() - targetDayOfWeek.getValue());
    }
    
    /**
     * Get days until previous day of week.
     *
     * @param localDate       the local date
     * @param targetDayOfWeek the target day of week
     * @return the count of days until target day of week (in reverse).
     */
    private static long getDaysUntilPreviousX(LocalDate localDate, DayOfWeek targetDayOfWeek) {
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();

        if (calendarDayOfWeek.equals(targetDayOfWeek)){
            return -7;
        }

        if (calendarDayOfWeek.getValue() > targetDayOfWeek.getValue()) {
            return (long) targetDayOfWeek.getValue() - calendarDayOfWeek.getValue();
        }
        
        // Return 7 days minus the difference of calendarDayOfWeek from targetDayOfWeek.
        // Days are 1-7, Monday-Sunday, respectively.
        return (long) targetDayOfWeek.getValue() - calendarDayOfWeek.getValue() - 7;
    }

    /**
     * Get the last {@link java.time.DayOfWeek DayOfWeek}-th date of the month.
     *
     * @param localDate the local date.
     * @param dayOfWeek the target last day of the month.
     * @return the date of the last X day of the month.
     */
    public static LocalDate getLastDay(LocalDate localDate, DayOfWeek dayOfWeek) {
        LocalDate ld = localDate.plusMonths(1).withDayOfMonth(1).minusDays(1);
        
        return LocalDateUtility.toDayOfWeek(ld, dayOfWeek, true);
    }

}
