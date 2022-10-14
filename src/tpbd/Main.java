/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BSM
 */
public class Main {
     public static void main(String[] args) {
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("$objectdb/db/tpbd.odb");
            EntityManager em=emf.createEntityManager();
            
            //Créer Student
            StudentService stuS=new StudentService(em);            
            PersonService pers=new PersonService(em);

            
            
            
            em.getTransaction().begin();
            Student stu=stuS.createStudent("malachie", "soguelni", "borohoul", 17, 02, 2017, 'm',"dhhod", "yes");
            em.getTransaction().commit();
            System.out.println("Student créé avec succès");
            
            //Créer Lecturer
            
            LecturerService lectS=new LecturerService(em);
            em.getTransaction().begin();
                Lecturer lect=lectS.createLecturer("kani", "armand", "djoulde", 18, 05, 1987, 'm', "jjojo", "h", 40000, 17, 04, 2000);
            em.getTransaction().commit();
            System.out.println("Lecturer créé avec succès");
            
            //Assigner Un tuteur à Student
            em.getTransaction().begin();
                stuS.addTutor(stu.getId(), lect);
            em.getTransaction().commit();
            System.out.println("Tuteur créé avec succès");
            
            
            //Assigner une adresse à Student

            em.getTransaction().begin();

                stu.addAdresse(new Adresse(1,"ihi","ihih","uiui", "hih", "hihi"));                

                
            em.getTransaction().commit();
            System.out.println("Adresse assignée à Student avec succès");
            
            //Ajouter un passport à un Student
             em.getTransaction().begin();
                pers.createPassport(stu.getId(), "hfihi454", "tchadien", 14, 12, 2004, 17, 05, 2020);
            em.getTransaction().commit();
            System.out.println("Passport créé avec succès");

            
            
            
            
            
    }
}
