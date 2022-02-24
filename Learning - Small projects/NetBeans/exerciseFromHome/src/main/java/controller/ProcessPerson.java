/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.edunova.model.Person;
import util.CatchException;
import util.OibValidation;

/**
 *
 * @author frank
 */
public abstract class ProcessPerson<T extends Person> extends Process<T> {


    @Override
    protected void controlCreate() throws CatchException {
        controlOib();
    }

    @Override
    protected void controlUpdate() throws CatchException {
      
    }

    @Override
    protected void controlDelete() throws CatchException {
      
    }

    private void controlOib() throws CatchException {
        if(!OibValidation.checkOIB(entity.getOib())){
            throw new CatchException("Oib is invalid.");
        }
    }
    
}
