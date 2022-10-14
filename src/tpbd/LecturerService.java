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
public class LecturerService {
    protected EntityManager em;
    
    public LecturerService(EntityManager em){
        this.em=em;
    }
    
    public Lecturer createLecturer(String fName,String mName,String lName,int bDay,int bMonth,int bYear,char gender,String lecId, String room, float salary, int day, int month, int year){
        Lecturer lec=new Lecturer(fName,mName,lName,bDay,bMonth,bYear,gender,lecId,room, salary, day, month, year);
        em.persist(lec);
        return lec;
    }
}
