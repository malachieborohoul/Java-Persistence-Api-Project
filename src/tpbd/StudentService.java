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
public class StudentService {
    protected EntityManager em;
    
    public StudentService(EntityManager em){
        this.em=em;
    }
    
    public Student createStudent(String fName,String mName,String lName,int bDay,int bMonth,int bYear, char gender,String regName, String major){
        Student stu=new Student(fName,mName,lName,bDay,bMonth,bYear,gender,regName,major);
        em.persist(stu);
        return stu;
    }
    
    public void addTutor(int studId,Lecturer lect ){
       Student stud= em.find(Student.class, studId);
       
       if(stud != null){
           stud.setLecturer(lect);
       }
    }
    
    
    
    
}
