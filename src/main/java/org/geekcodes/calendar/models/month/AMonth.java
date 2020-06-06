package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type A month.
 */
abstract class AMonth implements Month {
    /**
     * The Calendar.
     */
    protected LocalDate localDate;
    
    /**
     * Get calendar calendar.
     *
     * @return the calendar
     */
    protected final LocalDate getLocalDate() {
        return this.localDate;
    }
    
    /**
     * Sets calendar.
     *
     * @param localDate the calendar
     */
    protected final void setLocalDate(LocalDate localDate) {
        this.localDate = LocalDate.ofEpochDay(localDate.toEpochDay());
    }
    
    public final List<LocalDate> getDates() {
        if (this.localDate.getMonth() == java.time.Month.DECEMBER) {
            return this.localDate.withDayOfMonth(1).datesUntil(LocalDate.of(this.localDate.getYear(), java.time.Month.JANUARY, 1)).collect(Collectors.toList());
        }
        
        return this.localDate.withDayOfMonth(1).datesUntil(LocalDate.of(this.localDate.getYear(), this.localDate.getMonthValue() + 1, 1)).collect(Collectors.toList());
    }
}
