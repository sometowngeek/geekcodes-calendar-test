package org.geekcodes.calendar.models;

import java.util.Date;

public interface GCalendar {
    public void set(int month, int date, int year);
    public void set(int month, int date, int year, int hour, int minute, int second);
    public void set(int month, int date, int year, int hour, int minute, int second, int millisecond);

    public Date getDate();

    
}
