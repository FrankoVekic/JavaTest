package exercise11;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class TryCatch {

	private Date date;

	public TryCatch(){

		// example1();
		// example2();
		// example3();
		// example4();
		//example5();
		//System.out.println(example6());
		try {
			example7();
		} catch (Problem e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void example7() throws Problem {
		
		throw new Problem("Invalid data");
		
	}

	private int example6() {
		Scanner entry = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Enter a number: ");
				var i = Integer.parseInt(entry.nextLine());
				if(i<0) {
					System.out.println("Only positive numbers!");
					continue;
				}
				entry.close();
				return i;
			} catch (Exception e) {
				System.out.println("You didn't enter a valid number.");
			}
		}
	}

	private void example5() {
		// spajanje na bazu
		Connection connect = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			 connect = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/edunovajp25", "root", "");

			PreparedStatement query = connect.prepareStatement("select * from smjer");

			ResultSet rs = query.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("naziv") + " " + rs.getBigDecimal("cijena"));
			}

			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	private void example4() {

		int i = 0;

		try {
			i = Integer.parseInt("a");
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	private void example3() {
		int[] array = new int[2];

		Scanner entry = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			array[0] = Integer.parseInt(entry.nextLine());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		} catch (NumberFormatException e) {
			System.out.println("You must enter a number");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		entry.close();
	}

	private void example2() {

		try {
			System.out.println(date.getTime());
		} catch (NullPointerException e) {
			System.out.println("Date is null");
		}

	}

	private void example1() {

		// Date d;
		// System.out.println(d.getTime());
		// iznimka tjekom izvođenja programa
		System.out.println(date.getTime());
	}

	public static void main(String[] args) {
		new TryCatch();
	}
}
