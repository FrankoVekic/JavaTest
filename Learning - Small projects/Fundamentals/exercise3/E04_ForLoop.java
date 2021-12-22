package exercise3;

public class E04_ForLoop {

	public static void main(String[] args) {

		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek, ");
		// System.out.print("Osijek ");

		// sintaksa for (od kuda; do kuda; uvečanje/umanjenje)
		for (int i = 0; i < 10; i = i + 1) {
			System.out.print("Osijek ");
		}

		// varijabla for petlje se tijekom izvođenja mijenja
		System.out.println();
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println(i);
		}

		// ispiši sve parne brojeve od 1 do 10
		System.out.println();
		for (int i = 1; i < 10; i = i + 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// zbrojiti brojeve od 1 do 100
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
