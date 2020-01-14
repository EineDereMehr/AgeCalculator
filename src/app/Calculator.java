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
public class Calculator {
    int day, month, year;
    int sysDay, sysMonth, sysYear;

    public Calculator(int day, int month, int year, int sysDay, int sysMonth, int sysYear) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.sysDay = sysDay;
        this.sysMonth = sysMonth;
        this.sysYear = sysYear;
    }
    
    
    
    public int DaysOld(){
        int daysOld = 0;
        return daysOld;
    }
    
    public int MonthsOld(){
        int monthsOld = 0;
        return monthsOld;
    }
    
    public int YearsOld(){
        int yearsOld;
        yearsOld = sysYear - year;
        if((month >= sysMonth && day > sysDay) || (month == 1 && sysMonth == 12)){
         yearsOld = yearsOld - 1;   
        }
        return yearsOld;
    }
  
}
