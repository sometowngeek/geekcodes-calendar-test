package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * The type January.
 */
final class January extends AMonth implements Month {
    
    private January() {}
    
    /**
     * Instantiates a new January.
     *
     * @param year the year
     */
    public January(int year) {
        this.localDate = LocalDate.of(year, java.time.Month.JANUARY,1);
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
    protected LocalDate getMartinLutherKingJrDate(){
        long days = LocalDateUtility.getDaysUntilMonday(this.localDate);
        return this.localDate.plusDays(days + 14);
    }
    
    /**
     * Gets Martin Luther King Jr Date.<br>
     * <em>3rd Monday of January.</em>
     *
     * @param localDate the LocalDate
     *
     * @return Date of MLK Jr day.
     */
    protected static LocalDate getMartinLutherKingJrDate(LocalDate localDate){
        January january = new January(localDate.getYear());
        
        return january.getMartinLutherKingJrDate();
    }
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    @Override
    public List<LocalDate> getDates() {
        return this.localDate.datesUntil(LocalDate.of(localDate.getYear(),java.time.Month.FEBRUARY,1)).collect(Collectors.toList());
    }
    
}
