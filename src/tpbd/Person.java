/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;
import javax.persistence.*;
import java.util.*;
import java.util.HashSet;




/**
 *
 * @author BSM
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Embedded private Name name=new Name();   
    
    @Embedded private Date birthDate=new Date();    

    @Embedded private Passport passport;

    private char gender;
    //Table d'association aussi appelée table de jointure
    @ManyToMany
    @JoinTable(name="PERS_ADR",
            joinColumns={@JoinColumn(name="PERS_ID")},
            inverseJoinColumns={@JoinColumn(name="ADR_ID")}
            )
    private  Set<Adresse> adresses=new HashSet<>();
    
    public Person(String fName,String mName,String lName,int birthDay,int birthMonth,int birthYear, char gender){
        name.setFirstName(fName);
        name.setMiddleName(mName);
        name.setLastName(lName);
        birthDate.setDay(birthDay);
        birthDate.setMonth(birthMonth);
        birthDate.setYear(birthYear);
        this.gender=gender;
        
    }
    
    public int getId(){
        return this.id;
    }
    
    public Set<Adresse> getAdresses(){
        return adresses;
    }
    
    public void addPassport(String passportNum, String nationality, int issusDay, int issueMonth, int issueYear, int expiryDay, int expiryMonth, int expiryYear){
        Passport passport= new Passport(passportNum,nationality,issusDay,issueMonth,issueYear,expiryDay,expiryMonth,expiryYear);
        this.passport=passport;
    }
    
   
    public void addAdresse(Adresse adresse){
      boolean added= adresses.add(adresse);
      if(added){
          adresse.getPerson().add(this);
      }
    }
    
    
    
    
}
