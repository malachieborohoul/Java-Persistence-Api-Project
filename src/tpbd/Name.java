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
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name (String firstName, String middleName, String lastName){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }
    public Name(){
        
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setFirstName(String f){
        this.firstName=f;
    }
    
    public void setMiddleName(String m){
        this.middleName=m;
    }
    
    public void setLastName(String l){
        this.lastName=l;
    }
    
}
