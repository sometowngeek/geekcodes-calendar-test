package org.geekcodes.calendar.models.month;

import java.time.LocalDate;

/**
 * The type A month.
 */
abstract class AMonth implements GMonth {
    /**
     * The Calendar.
     */
    protected LocalDate localDate;
    
    /**
     * Sets calendar.
     *
     * @param localDate the calendar
     */
    protected abstract void setLocalDate(LocalDate localDate);
    
    /**
     * Get calendar calendar.
     *
     * @return the calendar
     */
    protected LocalDate getLocalDate() {
        return this.localDate;
    }
}
