package multifaceted;

public class Teacher extends Person {
	
	private String iban;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String introduce() {
		return "I am teacher " + getName() + " " + getSurname() + ", " + iban;
	}
	
}
