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
    protected final void setLocalDate(LocalDate localDate){
        this.localDate = LocalDate.ofEpochDay(localDate.toEpochDay());
    }
    
    /**
     * Get calendar calendar.
     *
     * @return the calendar
     */
    protected final LocalDate getLocalDate() {
        return this.localDate;
    }
}
