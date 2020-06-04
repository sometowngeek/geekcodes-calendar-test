package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.List;

public interface GMonth {
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    public List<LocalDate> getHolidays();

    /**
     * Gets dates.
     *
     * @return the dates
     */
    public List<LocalDate> getDates();
}
