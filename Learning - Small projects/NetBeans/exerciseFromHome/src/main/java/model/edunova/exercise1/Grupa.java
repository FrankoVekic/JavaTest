/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.edunova.exercise1;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

/**
 *
 * @author frank
 */
@Entity
public class Grupa extends Entitet {
    
    private String naziv;
    @ManyToOne
    private Smjer smjer;
    
    @ManyToOne
    private Predavac predavac;
    
    private Date datumPocetka;

    @ManyToMany
    private List<Polaznik> polaznici;

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
    
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }
    
    
    
    
}
