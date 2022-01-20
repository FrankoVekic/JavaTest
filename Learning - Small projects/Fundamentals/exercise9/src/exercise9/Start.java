package exercise9;

import java.math.BigDecimal;
import java.util.Date;

public class Start {

	public Start() {
		Shape shape = new Shape("a3");
		shape.setName("First");
		System.out.println(shape.getName());
		shape.setName("Secound");
		System.out.println(shape.getName());
		
		
		Triangle triangle = new Triangle("a3");
		triangle.setName("First");
		System.out.println(triangle.getName());
		triangle.setPrefix("a4");
		System.out.println(triangle.getName());
		
		Account account = new Account(1,new Date(),BigDecimal.ZERO,"Random");
		System.out.println(account.getDate());
		System.out.println(account.getAmount());
		account.setAmount(account.getAmount().add(new BigDecimal(100)));
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
