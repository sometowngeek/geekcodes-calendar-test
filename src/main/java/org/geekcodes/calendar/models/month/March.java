package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class March extends AMonth implements IMonth {
    
    private March() {}
    
    /**
     * Instantiates a new March.
     *
     * @param year the year
     */
    public March(int year) {
        this.localDate = LocalDate.of(year, Month.MARCH, 1);
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
        return this.localDate.datesUntil(LocalDate.of(this.localDate.getYear(), Month.APRIL, 1)).collect(Collectors.toList());
    }
}
