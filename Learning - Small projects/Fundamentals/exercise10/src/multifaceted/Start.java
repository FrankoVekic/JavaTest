package multifaceted;

public class Start {

	public Start() {
		Student student = new Student();
		student.setName("Marija");
		student.setSurname("Jak");
		student.setContractCount("12/2022");
		
		Teacher teacher = new Teacher();
		teacher.setName("Ana");
		teacher.setSurname("Malj");
		teacher.setIban("HR1234568762123");
		
		Person[] array = new Person[2];
		array[0]=student;
		array[1]=teacher;
		
		introduceThem(array);
	}
	
	private void introduceThem(Person[] array) {
		for(Person p : array) {
			System.out.println(p.introduce());
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
