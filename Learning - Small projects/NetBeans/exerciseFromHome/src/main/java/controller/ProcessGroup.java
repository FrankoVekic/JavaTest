/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Calendar;
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
        controlBeginningDate();
    }

    @Override
    protected void controlUpdate() throws CatchException {
      controlCreate();
    }

    @Override
    protected void controlDelete() throws CatchException {
       if(entity.getStudents()!=null && !entity.getStudents().isEmpty()){
           throw new CatchException("You can not delete a group while there are active students in it");
       }
    }

    private void controlCourse() throws CatchException {
      if(entity.getCourse()==null || entity.getCourse().getId().equals(Long.valueOf(0))){
          throw new CatchException("You must choose a course.");
      }
    }

    private void controlBeginningDate() throws CatchException {
       if(entity.getBeginningDate()!=null){
           Calendar c1 = Calendar.getInstance();
           c1.setTime(entity.getBeginningDate());
           if(c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
                   c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
               throw new CatchException("Beginning date can not be on weekend.");
               
           }
           
       }
    }
    
    
}
