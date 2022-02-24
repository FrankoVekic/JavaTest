/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.edunova.model.Student;
import util.CatchException;

/**
 *
 * @author frank
 */
public class ProcessStudent extends ProcessPerson<Student> {

    @Override
    public List<Student> read() {
        return session.createQuery("from Student").list();
    }

    @Override
    protected void controlCreate() throws CatchException {
        super.controlCreate(); 
        controlContractCount();
    }

    private void controlContractCount() throws CatchException {
       
        if(entity.getContractCount()==null || !entity.getContractCount().contains("/")){
           throw new CatchException("Invalid contract count data.");
        }
    }
    
    
    
}
