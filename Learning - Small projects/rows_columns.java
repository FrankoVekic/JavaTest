package Solutions;
import java.util.Scanner;
public class redovi_stupci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = scanner.nextInt();
		System.out.print("Broj stupaca: ");
		int stupac = scanner.nextInt();
		
		if(red <=0 || stupac <=0) {
			System.out.println("Probaj ponovno!");
		}
		else {
			for(int r=1; r<=red;r++) {
				for(int s=1;s<=stupac;s++) {
					System.out.print("A");
				}
				System.out.println();
			}
		}
	}
}