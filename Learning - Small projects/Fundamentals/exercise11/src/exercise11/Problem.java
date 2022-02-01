package exercise11;

public class Problem extends Exception {

	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public Problem(String message) {
		super(message);
		this.message = "Translated " + message;
	}
	
}
