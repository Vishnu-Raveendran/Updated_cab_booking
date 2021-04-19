package com.vishnu;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {
	
	public static int age()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("                          ");
		System.out.println("Enter Your Date of Birth: ");
		String DOB = sc.next();

		LocalDate ParsedDob = LocalDate.parse(DOB);
		LocalDate currentDate = LocalDate.now();

		int Age = Period.between(ParsedDob, currentDate).getYears();
		return Age;
	}
	
	

}
