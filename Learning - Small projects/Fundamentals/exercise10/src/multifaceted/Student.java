package multifaceted;

public class Student extends Person{

	private String contractCount;

	public String getContractCount() {
		return contractCount;
	}

	public void setContractCount(String contractCount) {
		this.contractCount = contractCount;
	}

	@Override
	public String introduce() {
		return "I am student  " + getName() + " " + getSurname() + ", " + contractCount;
	}
	
	
	
}
