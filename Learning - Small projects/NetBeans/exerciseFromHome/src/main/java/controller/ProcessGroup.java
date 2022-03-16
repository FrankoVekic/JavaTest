/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.edunova.model.Group;
import util.CatchException;

/**
 *
 * @author frank
 */
public class ProcessGroup extends Process<Group> {

    @Override
    public List<Group> read() {
       return session.createQuery("from Groups").list();
    }

    @Override
    protected void controlCreate() throws CatchException {
        controlCourse();
    }

    @Override
    protected void controlUpdate() throws CatchException {
      
    }

    @Override
    protected void controlDelete() throws CatchException {
       
    }

    private void controlCourse() throws CatchException {
      if(entity.getCourse()==null || entity.getCourse().getId().equals(Long.valueOf(0))){
          throw new CatchException("You must choose a course.");
      }
    }
    
    
}
