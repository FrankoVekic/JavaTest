package exercise7;

public class E07_Recursion {

	public static void main(String[] args) {
		System.out.println(sum(5));
		
		int sum=0;
		for(int i=5;i>0;i--) {
			sum+=i;
			System.out.println(sum);
		}

	}
	private static int sum(int i) {
		if(i==1) {
			return i;
		}
		return i+sum(i-1);
	}
}
