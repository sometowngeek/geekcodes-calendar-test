package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class March extends AMonth implements Month {
    
    private March() {}
    
    /**
     * Instantiates a new March.
     *
     * @param year the year
     */
    public March(int year) {
        this.localDate = LocalDate.of(year, java.time.Month.MARCH, 1);
    }
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        return new ArrayList<>();
    }
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    @Override
    public List<LocalDate> getDates() {
        return this.localDate.datesUntil(LocalDate.of(this.localDate.getYear(), java.time.Month.APRIL, 1)).collect(Collectors.toList());
    }
}
