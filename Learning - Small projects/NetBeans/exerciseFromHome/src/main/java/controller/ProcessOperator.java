/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.persistence.NoResultException;
import model.edunova.model.Operator;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author frank
 */
public class ProcessOperator extends ProcessPerson<Operator> {

    @Override
    public List<Operator> read() {
        return session.createQuery("from Operator").list();
    }
    
    public Operator authorize(String email, String password){
        
        Operator operator = null;
        try {
            operator = (Operator)session.createQuery("from Operator where email =:email")
                .setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        
        if(operator == null){
            return null;
        }

        return BCrypt.checkpw(password, operator.getPassword()) ? operator : null;
        
    }
    
}
