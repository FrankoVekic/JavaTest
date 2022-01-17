package exercise7;

public class E05_Datatype_with_Params {

	public static void main(String[] args) {
		// System.out.println(add(E04_Data_types_without_params.loadNum(),
		// E04_Data_types_without_params.loadNum()));

		// System.out.println(sumPrimNums(3, 100));

		System.out.println(lowest(E04_Data_types_without_params.writeArray()));
	}

	private static int add(int i, int j) {
		return i + j;
	}

	private static boolean prim(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static int sumPrimNums(int min, int max) {
		int sum = 0;

		for (int i = min; i <= max; i++) {
			if (prim(i)) {
				sum += i;
			}
		}

		return sum;
	}

	public static int lowest(int[] arr) {
		int lowest = Integer.MAX_VALUE;

		for (int i : arr) {
			if(i<lowest) {
				lowest = i;
			}
		}

		return lowest;
	}
}
