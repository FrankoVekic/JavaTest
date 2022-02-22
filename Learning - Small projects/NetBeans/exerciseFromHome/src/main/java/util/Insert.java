/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import model.edunova.model.Course;
import model.edunova.model.Group;
import model.edunova.model.Professor;
import model.edunova.model.Student;
import org.hibernate.Session;

/**
 *
 * @author frank
 */
public class Insert {

    public static void execute() {

        Session session = HibernateUtil.getSession();

        Faker faker = new Faker();

        List<Student> students = generateStudents(faker, session);
        List<Professor> professors = generateProfessors(faker, session);
        List<Course> courses = generateCourses(faker, session);
        
        Course c;
        Group g;
        
        for(int i =0; i<courses.size()-2;i++){
            c = courses.get(i);
            for(int j=0;j<((int) Math.random() * (5-2) +2);j++){
                g = new Group();
                g.setName(faker.animal().name());
                g.setCourse(c);
                g.setProfessor(professors.get((int) Math.random() * (professors.size()-1)));
                g.setBeginningDate(new Date()); 
                
                Collections.shuffle(students);
                g.setStudents(new ArrayList<>());
                for(int k=0;k<((int) Math.random() * (20-10) +10);k++){
                    g.getStudents().add(students.get(k));
                }
                session.save(g);
                System.out.println("Created group: " + g.getName());
            }
        }
    }

    private static List<Student> generateStudents(Faker faker, Session session) {

        List<Student> students = new ArrayList();
        Student s;
        for (int i = 0; i < 3000; i++) {
            s = new Student();
            s.setName(faker.name().firstName());
            s.setSurname(faker.name().lastName());
            s.setEmail(faker.name().firstName().substring(0, 1).toLowerCase()
                    + faker.name().lastName().toLowerCase().replace(" ", "")
                    + "@gmail.com");
            s.setOib(Util.generateOib());
            s.setContractCount((i + 1) + "/2022");
            session.save(s);
            students.add(s);
            System.out.println("Created student: " + s.getName() + " " + s.getOib());
        }
        return students;
    }

    private static List<Professor> generateProfessors(Faker faker, Session session) {

        List<Professor> professors = new ArrayList();
        Professor p;
        for (int i = 0; i < 12; i++) {
            p = new Professor();
            p.setName(faker.name().firstName());
            p.setSurname(faker.name().lastName());
            p.setEmail(faker.name().firstName().substring(0, 1).toLowerCase()
                    + faker.name().lastName().toLowerCase().replace(" ", "")
                    + "@gmail.com");
            p.setOib(Util.generateOib());
            p.setIban("");
            session.save(p);
            professors.add(p);
            System.out.println("Created professor: " + p.getName() + " " + p.getOib());
        }
        return professors;
    }

    private static List<Course> generateCourses(Faker faker, Session session) {
        List<Course> courses = new ArrayList();
        Course c;

        for (int i = 0; i < 10; i++) {
            c = new Course();
            c.setName(faker.book().title());
            c.setCertified(Math.random() < 0.5 ? true : false);
            c.setDuration((int) Math.random() * (200 - 100) + 100);
            c.setPrice(new BigDecimal(Math.random() * (10000 - 5000) + 5000));
            session.save(c);
            courses.add(c);
            System.out.println("Created course: " + c.getName());
        }
        return courses;
    }
}
