package generics;

import java.util.ArrayList;
import java.util.List;

import multifaceted.Teacher;

public class Start {

	public Start() {
	
		ArrayList al = new ArrayList();
		
		String n = "Ana";
		
		Teacher t = new Teacher();

		al.add(n);
		al.add(t);
		
		//ovo gore nije dobro
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Osijek");
		cities.add(n);
		cities.add("Zagreb");
		
		
		for(String s : cities) {
			System.out.println(s);
		}
		
		//ovo gore može bolje
		
		List<String> names = new ArrayList<>();
		
		names.add("Mario");
		names.add(n);
		
		//5. način iteracije podataka 
		// functional programming 
		names.forEach(e-> System.out.println(e));
		
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
	
}
