package exercise4;

public class Z4 {

	public static void main(String[] args) {
		
		int sum=0;
		int i = 98;
		
		do {
			if(i%2==0) {
				sum+=i;
			}
		}while(i-->27);
		System.out.println(sum);
	}

}
