package org.geekcodes.calendar.models.month;

import java.util.Date;
import java.util.List;

public interface GMonth {
    public void setYear(int year);

    public List<Date> getHolidays();
    public List<Date> getDates();
}
