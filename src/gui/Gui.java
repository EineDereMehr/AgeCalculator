/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import app.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Vladimir
 */
public class Gui
{
    Initialization init = new Initialization();
    int respDay, respYear;
    Object respMonth;
    int monthInt = 0, dayInt;
    int calcAge = 0;
    Calendar cal = Calendar.getInstance();

    public void GraphicInterface(){
        Object[] month = init.getMonth();
        Object[] year = init.getYear();
        
        
        
        for(int i = 0; i <= 69; i++){
            year[i] = cal.get(Calendar.YEAR) - i;
        }
        respDay = Integer.parseInt((JOptionPane.showInputDialog(null, "choose your birth day", "Day", JOptionPane.DEFAULT_OPTION, null, init.getDay(), init.getDay())).toString()); 
        respMonth =  JOptionPane.showInputDialog(null, "choose your birth month", "Month", JOptionPane.DEFAULT_OPTION, null, month, month[0]); 
        respYear = Integer.parseInt((JOptionPane.showInputDialog(null, "choose your year of birth", "Year", JOptionPane.DEFAULT_OPTION, null, year, year[0])).toString());
        for(int i = 0; i <= 11; i++){
            if(respMonth == month[i]){
                monthInt = i + 1;
            }
        }
        this.Result();
        
        
        
    }
    
    public void Result(){
        Calculator calc = new Calculator(respDay, monthInt, respYear, cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
        JOptionPane.showMessageDialog(null,
                ("You were born in:  " + (respDay + " " + respMonth + " " + respYear) + "\nY/O: " + calc.YearsOld()));
    }
}
