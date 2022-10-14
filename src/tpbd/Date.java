/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;
import javax.persistence.*;


/**
 *
 * @author BSM
 */
@Embeddable
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year ){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public Date(){
        
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setDay(int day){
        this.day=day;
    }
    
    public void setMonth(int month){
        this.month=month;
    }
    
    public void setYear(int year){
        this.year=year;
    }
}
