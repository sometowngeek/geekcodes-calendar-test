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
     * Gets days until sunday.
     *
     * @param localDate the local date
     *
     * @return the days until sunday
     */
    public static long getDaysUntilSunday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.SUNDAY);
    }
    
    /**
     * Gets days until monday.
     *
     * @param localDate the local date
     *
     * @return the days until monday
     */
    public static long getDaysUntilMonday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.MONDAY);
    }
    
    /**
     * Gets days until tuesday.
     *
     * @param localDate the local date
     *
     * @return the days until tuesday
     */
    public static long getDaysUntilTuesday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.TUESDAY);
    }
    
    /**
     * Gets days until wednesday.
     *
     * @param localDate the local date
     *
     * @return the days until wednesday
     */
    public static long getDaysUntilWednesday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.WEDNESDAY);
    }
    
    /**
     * Gets days until thursday.
     *
     * @param localDate the local date
     *
     * @return the days until thursday
     */
    public static long getDaysUntilThursday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.THURSDAY);
    }
    
    /**
     * Gets days until friday.
     *
     * @param localDate the local date
     *
     * @return the days until friday
     */
    public static long getDaysUntilFriday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.FRIDAY);
    }
    
    /**
     * Gets days until saturday.
     *
     * @param localDate the local date
     *
     * @return the days until saturday
     */
    public static long getDaysUntilSaturday(LocalDate localDate) {
        return getDaysUntilX(localDate, DayOfWeek.SATURDAY);
    }
    
    /**
     * Get days until previous sunday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousSunday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.SUNDAY);
    }
    
    /**
     * Get days until previous saturday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousSaturday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.SATURDAY);
    }
    
    /**
     * Get days until previous monday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousMonday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.MONDAY);
    }
    
    /**
     * Get days until previous tuesday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousTuesday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.TUESDAY);
    }
    
    /**
     * Get days until previous wednesday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousWednesday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.WEDNESDAY);
    }
    
    /**
     * Get days until previous thursday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousThursday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.THURSDAY);
    }
    
    /**
     * Get days until previous friday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousFriday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.FRIDAY);
    }
    
    /**
     * Get count of days until previous X (day).
     *
     * @param localDate       the local date.
     * @param targetDayOfWeek target day of week.
     *
     * @return count of days until previous X (day).
     */
    private static long getDaysUntilPreviousX(LocalDate localDate, DayOfWeek targetDayOfWeek) {
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();
        
        if (calendarDayOfWeek.getValue() >= targetDayOfWeek.getValue()) {
            return calendarDayOfWeek.getValue() - targetDayOfWeek.getValue();
        }
        
        // Return 7 days minus the difference of calendarDayOfWeek from targetDayOfWeek.
        // Days are 1-7, Monday-Sunday, respectively.
        return 7 - (targetDayOfWeek.getValue() - calendarDayOfWeek.getValue());
    }
    
    
    /**
     * Gets days until X date.
     *
     * @param localDate       the local date
     * @param targetDayOfWeek the target day of week.
     *
     * @return the days until saturday
     */
    private static long getDaysUntilX(LocalDate localDate, DayOfWeek targetDayOfWeek) {
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();
        final int       fixed             = 7 + targetDayOfWeek.getValue(); // 7 days of the week
        
        if (calendarDayOfWeek.getValue() < targetDayOfWeek.getValue() + 1) {
            return targetDayOfWeek.getValue() - calendarDayOfWeek.getValue();
        }
        
        return fixed - calendarDayOfWeek.getValue();
    }
    
    /**
     * Get last sunday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastSundayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.SUNDAY);
    }
    
    /**
     * Get last monday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastMondayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.MONDAY);
    }
    
    /**
     * Get last tuesday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastTuesdayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.TUESDAY);
    }
    
    /**
     * Get last wednesday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastWednesdayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.WEDNESDAY);
    }
    
    /**
     * Get last thursday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastThursdayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.THURSDAY);
    }
    
    /**
     * Get last friday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastFridayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.FRIDAY);
    }
    
    /**
     * Get last saturday of the month local date.
     *
     * @param localDate the local date
     *
     * @return the local date
     */
    public static LocalDate getLastSaturdayOfTheMonth(LocalDate localDate) {
        return getLastXDay(localDate, DayOfWeek.SATURDAY);
    }
    
    /**
     * Get the last X day.
     *
     * @param localDate the local date.
     * @param dayOfWeek the target last day of the month.
     *
     * @return the date of the last X day of the month.
     */
    private static LocalDate getLastXDay(LocalDate localDate, DayOfWeek dayOfWeek) {
        LocalDate ld = localDate.plusMonths(1).withDayOfMonth(1).minusDays(1);
        
        return ld.minusDays(getDaysUntilPreviousX(ld, dayOfWeek));
    }
}
