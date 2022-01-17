package exercise4;

public class E03_ForeachLoop {

	public static void main(String[] args) {
		
		int[] array = {1,23,323,23,23,3212};
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//jednostavnija sintaksa
		for(int i:array) {
			System.out.println(i);
		}

	}

}
