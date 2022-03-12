/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.edunova.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author frank
 */
@MappedSuperclass
public class Person extends model.edunova.model.Entity {
    
    private String name;
    private String surname;
    @Column(columnDefinition = "char(11)")
    private String oib;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name==null ? name : name.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname==null ? surname : surname.trim();
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
