/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import model.edunova.model.Student;

/**
 *
 * @author frank
 */
public class StudentComparator implements Comparator<Student> {
    
    private Collator hr;
    
    public StudentComparator(){
        hr = Collator.getInstance(new Locale("hr","HR"));
        hr.setStrength(Collator.PRIMARY);
    }
    
    @Override
    public int compare(Student s1, Student s2){
        return hr.compare(s1.getSurname(), s2.getSurname());
    }
    
}
