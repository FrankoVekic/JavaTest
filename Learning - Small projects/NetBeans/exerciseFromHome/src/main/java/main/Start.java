/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import connections.Municipality;
import connections.Place;
import controller.ProcessGroup;
import controller.ProcessProfessor;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import model.edunova.model.Group;
import model.edunova.model.Professor;
import model.edunova.model.Student;
import model.primary.MobilePhone;
import org.hibernate.Session;
import util.CatchException;
import util.HibernateUtil;
import view.SplashScreen;


public class Start {

    private Session session;

    public Start() {
        // this.session = HibernateUtil.getSession();
        // Insert.execute();
        //example1();
        // readMunicipality();
        //testingInsertProfessor();

    }

    private void exerciseInsertProfessor() {
        Professor professor = new Professor();
        professor.setOib("59710206893");
        professor.setName("Ana");
        professor.setSurname("Osječka");
        professor.setIban("HR7824020066293418958");
        professor.setEmail("ana@osjecka");
        ProcessProfessor pp = new ProcessProfessor();
        pp.setEntity(professor);
        try {
            pp.create();
        } catch (CatchException ce) {
            System.out.println(ce.getMessage());
        }
    }

    private void exerciseReadData() {

        List<Group> groups = new ProcessGroup().read();

        for (Group g : groups) {
            System.out.println(g.getName() + " - " + g.getCourse().getName() + ": "
                    + g.getProfessor().getName() + " " + g.getProfessor().getSurname());
            for (Student s : g.getStudents()) {
                System.out.println(s.getName() + " " + s.getSurname());

            }
        }

    }

    public static void main(String[] args) {
        //Session s = HibernateUtil.getSession();

        // new Start();
         new SplashScreen().setVisible(true);
        
        //Insert.insertOperator();
    }

    private void insertMobilePhone() {

        Session s = HibernateUtil.getSession();
        
        MobilePhone m = new MobilePhone();
        m.setPrice(new BigDecimal(5999.99));
        m.setBuyDate(new Date());
        m.setName("iPhone");
        m.setWorking(true);
        m.setDescription("Mobile phone is good!");
        m.setNote("Mobile is too good");

        s.beginTransaction();
        s.save(m);
        s.getTransaction().commit();
    }

    private void readMunicipality() {
        List<Municipality> municipality = session.createQuery("from Municipality").list();

        for (Municipality m : municipality) {
            System.out.println(m.getName());
            m.getPlaces().forEach(p -> System.out.println(p.getName()));
        }
    }

    private void example1() {
        session.beginTransaction();
        Municipality municipality = new Municipality();
        municipality.setName("Bilje");
        session.save(municipality);
        Place place = new Place();
        place.setName("Kopačevo");
        place.setMunicipality(municipality);
        session.save(place);

        place = new Place();
        place.setName("Bilje");
        place.setMunicipality(municipality);
        session.getTransaction().commit();
    }

    private void testingInsertProfessor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
