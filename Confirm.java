package com.vishnu;

import java.util.*;

//import java.util.Scanner;

public class Confirm 
{
	static Scanner scan = new Scanner(System.in);
	public static void confirm(String cabModel)
	{
		System.out.println("---------------------");
		System.out.println("Confirm Booking?(Y/N)");
		System.out.println("1. Yes");
		System.out.println("2. No");
		if(scan.hasNextLine())
		{
			String prompt = scan.nextLine();
			int prompt1 = Integer.parseInt(prompt);
			if(prompt1==1)
			{
				Booking.Billing(cabModel);
			}
			else 
			{
				System.out.println("Booking Cancelled.");
				System.exit(0);
			}
		}
		else 
		{
			
				System.out.println("ERROR!!");
		}
		//int prompt1 = Integer.parseInt(prompt);
	    //int prompt = 1;
		
		
		
						
	}

}
