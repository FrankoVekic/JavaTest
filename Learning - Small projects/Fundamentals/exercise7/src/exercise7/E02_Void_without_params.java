package exercise7;

public class E02_Void_without_params {

	public static void main(String[] args) {
		
		for(int i =0;i<10;i++) {
			writeRandomNumber();
		}

	}
	
	static void writeRandomNumber()
	{
		int i = (int)(Math.random()*1000);
		System.out.println(i);
	}

}
