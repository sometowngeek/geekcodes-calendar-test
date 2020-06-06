package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class March extends AMonth implements Month {
    
    private March() {
    }
    
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
}
