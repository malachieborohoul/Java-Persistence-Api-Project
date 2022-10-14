/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;
package tpbd;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author BSM
 */
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int adresseType;
    private String houseNumber;
    private String street;
    private String town;
    private String postCode;
    private String country;
    @ManyToMany(mappedBy="adresses")
    private Set<Person> person=new HashSet<>();    
    private Set<Student> students=new HashSet<>();

    
    public Adresse(){
        
    }
    public Adresse(int adresseType,String houseNumber,String street, String town, String postCode, String country){
        this.adresseType=adresseType;
        this.houseNumber=houseNumber;
        this.street=street;
        this.town=town;
        this.postCode=postCode;
        this.country=country;
    }
    
    int getAdresseType(){
        return this.adresseType;
    }
    String getHouseNumber(){
        return this.houseNumber;
    }
    String getStreet(){
        return this.street;
    }
    
    String getTown(){
        return this.town;
    }
    
    String getPostCode(){
        return this.postCode;
    }
    
    String getCountry(){
        return this.country;
    }
    
    public Set<Person> getPerson(){
        return person;
    }
    
    public Set<Student> getStudents(){
        return students;
    }
    
    void setAdresseType(int at){
        this.adresseType=at;
    }
    
    void setHouseNumber(String hn){
        this.houseNumber=hn;
    }
    
    void setStreet(String str){
        this.street=str;
    }
    
    void setTown(String t){
        this.town=t;
    }
    
    void setPostCode(String pc){
        this.postCode=pc;
    }
    
    void setCountry(String c){
        this.country=c;
    }
            
}
