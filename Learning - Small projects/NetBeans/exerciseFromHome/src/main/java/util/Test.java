/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author frank
 */
public class Test {
    
    public static void main(String[] args) {
        
        Faker faker = new Faker();

        List<String> beers = new ArrayList();
        String beer;
        while(beers.size()<25){
            beer = faker.beer().name();
            if(!beers.contains(beer)){
                beers.add(beer);
            }
        }
        
        Collections.sort(beers);
        beers.forEach(p->System.out.println(p));
        
        
        //better way
        
        Set<String> beersSet = new HashSet();
        while(beersSet.size()<25){
            beersSet.add(faker.beer().name());
        }
        
        beersSet.forEach(p->System.out.println(p));
        
        Faker hr = new Faker(new Locale("de"));
        for(int i=0;i<200;i++){
            System.out.println(hr.name().fullName());
        }
        
    }
    
}
