package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class April extends AMonth implements Month {
    
    private April() {
    }
    
    public April(int year) {
        this.localDate = LocalDate.of(year, java.time.Month.APRIL, 1);
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
