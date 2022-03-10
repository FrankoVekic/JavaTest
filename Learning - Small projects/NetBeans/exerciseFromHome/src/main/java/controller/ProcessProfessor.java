/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.edunova.model.Professor;
import nl.garvelink.iban.IBAN;
import util.CatchException;

/**
 *
 * @author frank
 */
public class ProcessProfessor extends ProcessPerson<Professor> {

    @Override
    public List<Professor> read() {
        return session.createQuery("from Professor").list();
    }

    @Override
    protected void controlCreate() throws CatchException {
        super.controlCreate();
        controlIban();
    }

    private void controlIban() throws CatchException {
        if (entity.getIban() == null) {
            throw new CatchException("Iban is required.");
        }

        try {
            IBAN iban = IBAN.valueOf(entity.getIban());
            if (!iban.isSEPA()) {
                throw new CatchException("Iban is invalid.");
            }
        } catch (Exception e) {
            throw new CatchException("Iban is invalid.");
        }

    }

    @Override
    protected void controlDelete() throws CatchException {
       if(entity.getGroups()!=null && entity.getGroups().size()>0){
           throw new CatchException(entity.getName() + " " + entity.getSurname() + " can't be deleted because" + entity.getName()+ " is in a group.");
           
       }
    }

    
    
}
