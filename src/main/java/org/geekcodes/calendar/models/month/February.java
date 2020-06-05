package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.DateUtility;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type February.
 */
public class February extends AMonth implements IMonth {
    
    private February() {}
    
    /**
     * Instantiates a new February.
     *
     * @param year the year
     */
    public February(int year) {
        this.localDate = LocalDate.of(year, Month.FEBRUARY, 1);
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        
        holidays.add(getPresidentsDay());
        
        return holidays;
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year){
        February february = new February(year);
        
        return february.getHolidays();
    }
    
    /**
     * Gets presidents day.
     *
     * @return the presidents day
     */
    public LocalDate getPresidentsDay() {
        long daysToAdd = DateUtility.getDaysUntilMonday(this.localDate);
        return this.localDate.plusDays(daysToAdd + 14);
    }
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    @Override
    public List<LocalDate> getDates() {
        return this.localDate.datesUntil(LocalDate.of(this.localDate.getYear(), Month.MARCH, 1)).collect(Collectors.toList());
    }
}
