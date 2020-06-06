package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type January.
 */
final class January extends AMonth implements Month {
    
    private January() {
    }
    
    /**
     * Instantiates a new January.
     *
     * @param year the year
     */
    public January(int year) {
        this.localDate = LocalDate.of(year, java.time.Month.JANUARY, 1);
    }
    
    /**
     * Gets Martin Luther King Jr Date.<br>
     * <em>3rd Monday of January.</em>
     *
     * @param localDate the LocalDate
     *
     * @return Date of MLK Jr day.
     */
    protected static LocalDate getMartinLutherKingJrDate(LocalDate localDate) {
        January january = new January(localDate.getYear());
        
        return january.getMartinLutherKingJrDate();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        
        holidays.add(getNewYearDate());
        holidays.add(getMartinLutherKingJrDate());
        
        return holidays;
    }
    
    public LocalDate getNewYearDate() {
        return LocalDate.of(localDate.getYear(), 1, 1);
    }
    
    /**
     * Gets Martin Luther King Jr Date.<br>
     * <em>3rd Monday of January.</em>
     *
     * @return LocalDate the date of MLK Jr day.
     */
    protected LocalDate getMartinLutherKingJrDate() {
        long days = LocalDateUtility.getDaysUntilMonday(this.localDate);
        return this.localDate.plusDays(days + 14);
    }
}
