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
public class Passport {
    private String passportNum;
    private String nationality;
    
    @Embedded private Date issueDate=new Date();  
    
    @Embedded private Date expiryDate=new Date(); 
    
    public Passport(){
        
    }
    
    public Passport(String passportNum, String nationality, int issueDay, int issueMonth, int issueYear, int expiryDay, int expiryMonth, int expiryYear){
        this.passportNum=passportNum;
        this.nationality=nationality;
        this.issueDate.setDay(issueDay);
        this.issueDate.setMonth(issueMonth);
        this.issueDate.setYear(issueYear);
        this.expiryDate.setDay(expiryDay);
        this.expiryDate.setMonth(expiryMonth);
        this.expiryDate.setYear(expiryYear);
    }
    
    public String getPassportNum(){
        return this.passportNum;
    }
    
    public String getNationality(){
        return this.nationality;
    }
    
    public void setPassportNum(String passportNum){
        this.passportNum=passportNum;
    }
    
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    
}
