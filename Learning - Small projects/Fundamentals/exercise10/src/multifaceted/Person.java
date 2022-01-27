package multifaceted;

// apstraktna klasa je ona koja nema implementaciju (nije moguće napravit instancu)
// kreira se kako bi sadržavala zajednička svojstva svim podklasama koje ju nasljede
public abstract class Person {

	private String name;
	private String surname;
	
	public abstract String introduce();
	
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
	
	
	
}
