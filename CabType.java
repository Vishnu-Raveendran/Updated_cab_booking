package com.vishnu;
import java.util.Scanner;


public class CabType {
	
	
	
	static Scanner sc = new Scanner(System.in);
	static String cab_name="";
	
	public static void TypeofCab() {
		System.out.println("-------------------");
		System.out.println("Choose type of car:");
		System.out.println("1. Micro");
		System.out.println("2. Mini");
		System.out.println("3. Sedan");
		System.out.println("Type Here: (1/2/3)");
		
		int choice = sc.nextInt();                                      // Choosng the type of cab 1.micro, 2. mini, 3. Prime;
		if(choice == 1) {
			System.out.println("-----------------------------------------");
			System.out.println("For -Ola Micro-> Fare--> Rs 10/Km. + GST.");
			System.out.println("-----------------------------------------");
			PriceEstimator.MicroFare();                               // if micro booked calling PriceEstimator function MicroFare
			
			cab_name="Micro";
			Confirm.confirm(cab_name);
		}
		else if(choice == 2) {
			System.out.println("-----------------------------------------");
			System.out.println("For -Ola Mini-> Fare--> Rs 15/km + GST.");
			System.out.println("-----------------------------------------");
			PriceEstimator.MiniFare();
			
			cab_name = "Mini";
			Confirm.confirm(cab_name);
			
		}
		else if(choice == 3)
		{
			System.out.println("-----------------------------------------");
			System.out.println("For -Ola Sedan-> Fare--> Rs 20/km + GST.");
			System.out.println("-----------------------------------------");
			PriceEstimator.PrimeFare();
			
			cab_name = "Prime";
			Confirm.confirm(cab_name);
			
			
			
			
		}
		
		
		
	}

}
