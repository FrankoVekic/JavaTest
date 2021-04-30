package ProblemSolvingFolder;

import java.util.Scanner;

public class SmallerAndLarger {

	public static void main(String[] args) {
		
		int i=2;
		int smaller=0;
		int larger=0;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Number 1:");
		int num= scanner.nextInt();
		
		smaller = num; 
		larger = num;
		
		while(i<=10) {
			System.out.println("Number " + i + ":");
				int num2=scanner.nextInt();
				if(num2<smaller) {
				smaller=num2;
				}
				if(num2>larger) {
					larger=num2;
				}
				i++;
		}
		System.out.println("Smaller: " + smaller + " Larger: " + larger);
	}
}

