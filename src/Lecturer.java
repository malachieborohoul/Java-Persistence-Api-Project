
import javax.persistence.Embedded;
import tpbd.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BSM
 */
public class Lecturer {
    private String lecturerId;
    private String room;
    private float salary;
    @Embedded private Date joinDate;

    
    
    public Lecturer(String lecturerId, String room,float salary, int joinDay, int joinMonth, int joinYear){
        this.lecturerId=lecturerId;
        this.room=room;
        this.salary=salary;
        this.joinDate.setDay(joinDay);
        joinDate.setMonth(joinMonth);
        joinDate.setYear(joinYear);
    }
    
    public String getLecturerId(){
        return this.lecturerId;
    }
}
