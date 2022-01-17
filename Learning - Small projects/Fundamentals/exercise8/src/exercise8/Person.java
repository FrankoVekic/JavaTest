package exercise8;

//primjer POJO

//Klasa je opisnik objekta
public class Person {

	//OVAKO NEĆEMO KORISTITI
	//int id;
	//String name;
	//String surname;
	
	//OOP princip učahurivanje - encapsulation
	//sakrivena (učahurena) svojstva
	private int id;
	private String name;
	private String surname;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//javno dostupne get i set metode
	
}
