/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.edunova.model;
import javax.persistence.Entity;
/**
 *
 * @author frank
 */
@Entity
public class Student extends Person {
    
    private String contractCount;

    public String getContractCount() {
        return contractCount;
    }

    public void setContractCount(String contractCount) {
        this.contractCount = contractCount;
    }
    
    
    
    
}
