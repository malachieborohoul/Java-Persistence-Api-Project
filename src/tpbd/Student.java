/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author BSM
 */
@Entity
@DiscriminatorValue(value="STUD")
public class Student extends Person{
    private String regName;
    private String major;
    @ManyToOne
    @JoinColumn(name="LECT_ID")
    private Lecturer lecturer;
    
    @ManyToMany
    @JoinTable(name="PERS_ADR",
            joinColumns={@JoinColumn(name="PERS_ID")},
            inverseJoinColumns={@JoinColumn(name="ADR_ID")}
            )
    private  Set<Adresse> adresses=new HashSet<>();
    
    public Student(String fName,String mName,String lName,int bDay,int bMonth,int bYear,char gender,String regName, String major){
        super(fName,mName,lName,bDay,bMonth,bYear,gender);
        this.regName=regName;
        this.major=major;
    }
    
      public void addAdresse(Adresse adresse){
      boolean added= adresses.add(adresse);
      if(added){
          adresse.getStudents().add(this);
      }
    }
    
    
    public String getRegName(){
        return this.regName;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public void setRegName(String regName){
        this.regName=regName;
    }
    
    public void setMajor(String major){
        this.major=major;
    }
    
    public void setLecturer(Lecturer lect){
        
        this.lecturer=lect;
    }
}
