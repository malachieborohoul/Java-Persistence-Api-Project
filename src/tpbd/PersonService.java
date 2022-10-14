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
public class PersonService {
      protected EntityManager em;
      
      public PersonService(EntityManager em){
          this.em=em;
      }
      
      public void createPassport(int id, String passportNum, String nationality, int issusDay, int issueMonth, int issueYear, int expiryDay, int expiryMonth, int expiryYear){
        Person pers=em.find(Student.class, id);
        
        if(pers != null){
            pers.addPassport(passportNum, nationality, issusDay, issueMonth, issueYear, expiryDay, expiryMonth, expiryYear);
        }
    }

    
}
