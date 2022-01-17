package exercise4;

public class E01_WhileLoop {

	public static void main(String[] args) {
		
		int i = 2; 
		boolean condition=i<10;
		
		//not so often
		while(condition) {
			System.out.println(i);
		i++;
		condition = i<10;
	}
		//more often
		i=2;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		// 3. way
		
		i=2;
		while(i<10) {
			System.out.println(i++);
		}
		
		// continue, break
		
		// infinite loop
		
		while(true) {
			System.out.println("Osijek");
			break;
		}
  }
}
