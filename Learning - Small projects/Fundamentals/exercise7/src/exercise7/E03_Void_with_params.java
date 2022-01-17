package exercise7;

public class E03_Void_with_params {

	public static void main(String[] args) {
		add(3,3);
		
		primNums(2,50);
		
		primNums(50);

	}
	
	public static void add(int i,int j) {
		System.out.println(i+j);
	}

	protected static void primNums(int min, int max)
	{
		boolean prim;
		for(int i =min; i<=max;i++) {
			prim = true;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					prim=false;
					break;
				}
			}
			if(prim) {
				System.out.println(i);
			}
		}
	}
	
	private static void primNums(int max) {
		primNums(2,max);
	}
}
