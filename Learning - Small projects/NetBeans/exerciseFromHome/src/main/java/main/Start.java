/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import connections.Municipality;
import connections.Place;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import model.primary.MobilePhone;
import org.hibernate.Session;
import util.HibernateUtil;
import util.Insert;

/**
 *
 * @author frank
 */
public class Start {

    private Session session;

    public Start() {
        // this.session = HibernateUtil.getSession();
         Insert.execute();
        //example1();
        // readMunicipality();
    }

    public static void main(String[] args) {
        //Session s = HibernateUtil.getSession();

        new Start();

        Session s = HibernateUtil.getSession();

        /*
        MobilePhone m = new MobilePhone();
        m.setPrice(new BigDecimal(5999.99));
        m.setBuyDate(new Date());
        m.setName("iPhone");
        m.setWorking(true);
        m.setDescription("Mobile phone is good!");
        m.setNote("Mobile is too good");
        
        s.beginTransaction();
        s.save(m);
        s.getTransaction().commit(); */
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

}
