/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connections;

import inheritance.Document;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author frank
 */
@Entity
public class Place extends Document {
    
    private String name;
    
    @ManyToOne
    private Municipality municipality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }
    
    
    
}
