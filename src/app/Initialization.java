/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author mian
 */
public class Initialization {
    Object[] day = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31
        };
    Object[] month = {
            "January", "February", "March", "April", "May", "June", "July",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
    int monthInt, dayInt;
    Object[] year = new Object[70];

 

    public Object[] getDay() {
        return day;
    }

    public void setDay(Object[] day) {
        this.day = day;
    }

    public Object[] getMonth() {
        return month;
    }

    public void setMonth(Object[] month) {
        this.month = month;
    }

    public int getMonthInt() {
        return monthInt;
    }

    public void setMonthInt(int monthInt) {
        this.monthInt = monthInt;
    }

    public int getDayInt() {
        return dayInt;
    }

    public void setDayInt(int dayInt) {
        this.dayInt = dayInt;
    }

    public Object[] getYear() {
        return year;
    }

    public void setYear(Object[] year) {
        this.year = year;
    }
    
    
}
