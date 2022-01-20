package exercise9;

import java.util.Scanner;

public class JavaSDKClass {

	public JavaSDKClass()
	{
		String string = new String("Pero");
		
		String name = "Pero";
		
		Person person = new Person("Pero");
		
		System.out.println(person.hashCode());
		person.setName("Marko");
		System.out.println(person.hashCode());
		
		
		//String je mutable class
		
		System.out.println("String");
		System.out.println(name.hashCode());
		name = "Marko";
		System.out.println(name.hashCode());
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Pero");
		System.out.println("StringBuilder");
		System.out.println(sb.hashCode());
		sb.replace(0, 4, "Marko");
		System.out.println(sb.hashCode());
		
		String city = "Osijek";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name:");
		person.setName(scanner.nextLine());
		System.out.print("Enter surname:");
		person.setSurname(scanner.nextLine());
		
		scanner.close();
		//lošiji način
		System.out.println(person.getName() + " " + person.getSurname());
		
		//bolji način -> pogledaj klasu Person
		System.out.println(person.getNameSurname());
		
		//implementacija metode toString() u klasi Person
		System.out.println(person);
		
		Person p1 = new Person("Ana");
		Person p2 = new Person("Ana");
		
		System.out.println(p1.equals(p2));
		
		Student student = new Student();
		
	}
	
	public static void main(String[] args) {
		new JavaSDKClass();
	}
	
}
