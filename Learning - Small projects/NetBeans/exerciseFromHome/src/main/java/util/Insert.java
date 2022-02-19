/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.edunova.model.Course;
import model.edunova.model.Student;
import org.hibernate.Session;

/**
 *
 * @author frank
 */
public class Insert {
    
    public static void execute(){
        
        Session session = HibernateUtil.getSession();
        
        Faker faker = new Faker();
        
        List<Student> students = new ArrayList();
        Student s;
        for(int i =0; i<3000;i++){
            s = new Student();
            s.setName(faker.name().firstName());
            s.setSurname(faker.name().lastName());
            s.setEmail(faker.name().firstName().substring(0,1).toLowerCase() 
                    + faker.name().lastName().toLowerCase().replace(" ", "")
            + "@gmail.com");
        }
        
        Course c = new Course();
        c.setName(faker.book().title());
        c.setCertified(Math.random()<0.5 ? true: false);
        c.setDuration((int)Math.random() * (200 - 100) + 100);
        c.setPrice(new BigDecimal(Math.random() * (10000 - 5000) + 5000));
        
    }
}
