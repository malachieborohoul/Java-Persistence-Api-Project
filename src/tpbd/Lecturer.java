/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;
import javax.persistence.*;
import java.util.Set;



/**
 *
 * @author BSM
 */
@Entity
@DiscriminatorValue(value="LECT")

public class Lecturer extends Person{
    private String lecturerId;
    private String room;
    private float salary;
    @Embedded private Date joinDate=new Date();
    @OneToMany(mappedBy="lecturer")
    private Set<Student> student;
    

    
    
    public Lecturer(String fName,String mName,String lName,int bDay,int bMonth,int bYear,char gender, String lecturerId, String room,float salary, int joinDay, int joinMonth, int joinYear){
        super(fName,mName,lName,bDay,bMonth,bYear,gender);
        this.lecturerId=lecturerId;
        this.room=room;
        this.salary=salary;
        joinDate.setDay(joinDay);
        joinDate.setMonth(joinMonth);
        joinDate.setYear(joinYear);
    }
    
    public String getLecturerId(){
        return this.lecturerId;
    }
    
     public String getRoom(){
        return this.room;
    }
     
     public float salary(){
        return this.salary;
    }
     
     public void setLecturerId(String lectId) {
         this.lecturerId=lectId;
     }
     
     public void setRoom(String room) {
         this.room=room;
     }
     
     public void setSalary(float salary) {
         this.salary=salary;
     }
}
