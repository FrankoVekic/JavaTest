package exercise7;

public class Task1 {

	public static void main(String[] args) {
		float[]array= {2.1F,289.49F,3.6F,23.3F};
		System.out.println(choseNum(array));
	}

	private static float choseNum(float[]array) {
		for(float f: array) {
			if(f-(int)f>0.5) {
				return f;
			}
		}
		return 0;
	}
}
