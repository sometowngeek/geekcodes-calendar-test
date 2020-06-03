package org.geekcodes.calendar.utilities;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtility {
    private CalendarUtility() {}

    static int getDaysUntilSunday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.SUNDAY);
    }

    public static int getDaysUntilMonday(Calendar cal){
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.MONDAY);
    }

    public static int getDaysUntilTuesday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.TUESDAY);
    }

    static int getDaysUntilWednesday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.WEDNESDAY);
    }

    static int getDaysUntilThursday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.THURSDAY);
    }

    static int getDaysUntilFriday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.FRIDAY);
    }

    static int getDaysUntilSaturday(Calendar cal) {
        int calendarDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return getDaysUntilX(calendarDayOfWeek, Calendar.SATURDAY);
    }

    static private int getDaysUntilX(int calendarDayOfWeek, int day) {
        int fixed = 7 + day; // 7 days of the week

        if (calendarDayOfWeek < day + 1) {
            return day - calendarDayOfWeek;
        }

        return fixed - calendarDayOfWeek;
    }
}
