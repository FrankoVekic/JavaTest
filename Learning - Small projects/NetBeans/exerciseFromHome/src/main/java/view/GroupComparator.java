/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import model.edunova.model.Group;

/**
 *
 * @author frank
 */
public class GroupComparator implements Comparator<Group> {
    
    @Override
    public int compare(Group o1, Group o2){
        Integer first = o1.getStudents() == null ? 0 : o1.getStudents().size();
        Integer secound = o2.getStudents() == null ? 0 : o2.getStudents().size();
        
        return secound.compareTo(first);
    }
    
}
