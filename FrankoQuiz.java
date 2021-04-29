package PrviFrankoQuiz;

import java.util.Scanner;

public class FrankoQuiz {

	public static void main(String[] args) {
		int q=0;
		
		Scanner scanner = new Scanner (System.in);
		
		String name ="";
		String[] q1= {"a)Metal", "b)Plastic", "c)Wood"};
		String[] q2= {"a)Ireland", "b)Scotland", "c)USA"};
		String[] q3= {"a)July 4th weekend", "b)Christmas Day", "c)National Burrito Month"};
		String[] q4= {"a)567", "b)777", "c)666"};
		String[] q5= {"a)William Arthur Philip Louis", "b)William Dale Henry", "c)Willibald Arthur Philip"};
		
		while(name.isBlank()) { 
			System.out.print("Enter your name:");
			name = scanner.nextLine();}
			System.out.println("Hello "+ name);
			System.out.println("Are you ready to play the Quiz? Y/N");
			String response1 = scanner.next();
			
			if(response1.equals("Y") || response1.equals("y")) { 
				System.out.println("Lets go!");
				System.out.println();
				System.out.println("Question 1: A magnet would most likely attract which of the following?");
				System.out.println(q1[0]);
				System.out.println(q1[1]);
				System.out.println(q1[2]);
				String q1a = scanner.next();
				
				if(q1a.equals("A") || q1a.equals("a")) { 
					System.out.println("Correct");
					q++;
				}
					else {
						System.out.println("Wrong answer. The answer was " +q1[0]);
				}
				System.out.println();
				System.out.println("Question 2: Where did Scotch whisky originate?");
				System.out.println(q2[0]);
				System.out.println(q2[1]);
				System.out.println(q2[2]);
				String q2a =scanner.next();
				
				if(q2a.equals("B") || q2a.equals("b")) { 
					System.out.println("Correct");
					q++;
				}
				
					else {
						System.out.println("Wrong answer. The answer was " + q2[1]);
					}
				System.out.println();
				System.out.println("Question 3: A well-known lyric in the holiday song \"Silver Bells\" promises that \"soon it will be\" what?");
				System.out.println(q3[0]);
				System.out.println(q3[1]);
				System.out.println(q3[2]);
				String q3a =scanner.next();
				if(q3a.equals("B") || q3a.equals("b")) { 
					System.out.println("Correct");
				q++;
				}
					else {
						System.out.println("Wrong answer. The answer was " + q3[1]);
					}
			
				System.out.println();
				System.out.println("Find the sum of 111 + 222 + 333");
				System.out.println(q4[0]);
				System.out.println(q4[1]);
				System.out.println(q4[2]);
				String q4a =scanner.next();
				if(q4a.equals("C") || q4a.equals("c")) { 
					System.out.println("Correct");
				q++;
				}
				else {
					System.out.println("Wrong answer. The answer was " + q4[2]);
				}
				
				System.out.println();
				System.out.println("What is Prince William's full name?");
				System.out.println(q5[0]);
				System.out.println(q5[1]);
				System.out.println(q5[2]);
				String q5a =scanner.next();
				if(q5a.equals("A") || q5a.equals("a")) { 
					System.out.println("Correct");
				q++;
				}
				else {
					System.out.println("Wrong answer. The answer was " + q5[0]);
				}
			
				
				if(q>3) {
					System.out.println("AWSOME JOB! You got " + q+"/5 questions right!");
				
				}
				else { 
					System.out.println("Good job! You got " + q+"/5 questions right.");
				}
			
			
			}
			else {
				System.out.println("You quit the game.");
				
			
			
			}
		}
	}

