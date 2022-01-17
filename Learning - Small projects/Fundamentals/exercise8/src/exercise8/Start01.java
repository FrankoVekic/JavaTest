package exercise8;

public class Start01 {

	public static void main(String[] args) {
		// Person je tip podatka - klasa
		// person je istance varijable - varijabla
		// new je konstruktor
		// Objekt je instanca klase
		Person person = new Person();

		// OVAKO NEĆEMO KORISTITI
		// person.name="Pero";

		// System.out.println(person.name);

		person.setName("Pero");

		System.out.println(person.getName());

		program();

	}

	// Program prvo unosi koliko će se ukupno osoba unijeti
	// Za svaku osobu unosi se šifra,ime,prezime i plaća
	// Program ispisuje imena i prezimena svih unesenih osoba kao i prosjek plaća

	private static void program() {
		int sumPerson = Entry.enterInt("Enter the amout of people");
		Person[] people = new Person[sumPerson];

		// deklaracija instance klase Person s instance varijable osoba
		Person person;

		for (int i = 0; i < sumPerson; i++) {
			person = new Person();
			person.setId(Entry.enterInt("Enter id " + (i + 1) + " . person"));
			person.setName(Entry.enterString("Enter name " + (i + 1) + " . person"));
			person.setSurname(Entry.enterString("Enter surname " + (i + 1) + ". person"));
			person.setSalary(Entry.enterDouble("Enter salary " + (i + 1) + ". person"));
			people[i] = person;
		}
		
		for(Person o: people) {
			System.out.println(o.getName()+ " " + o.getSurname());
		}
		System.out.println(average(people));

	}

	// Napisati metodu tipa double naziva Prosjek koja prima niz Osoba
	// i vraća prosjek svih osoba u nizu

	private static double average(Person[] array) {
		double average = 0;
		double sum = 0;

		for (Person o : array) {
			sum += o.getSalary();
		}
		average = sum / array.length;

		return average;

	}

}
