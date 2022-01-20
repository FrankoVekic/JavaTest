package exercise9;

public class Shape {

	protected String prefix;
	private String name;

	public Shape(String prefix) {
		this.prefix=prefix;
	}
	
	public String getName() {
		return new StringBuilder().append(prefix).append(":").append(name).toString();
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}
