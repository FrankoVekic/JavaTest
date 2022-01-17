package exercise8;

public class MobilePhone {

	private String name;
	private String producer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(String name, String producer) {

		this.name = name;
		this.producer = producer;
	}
	
	
	
}
