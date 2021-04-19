package com.vishnu;

import java.util.Scanner;

public class PriceEstimator {

	////////////////////////////////////////////////
	

	static Scanner sc = new Scanner(System.in);

	/////////////////////////////////////////////////

	public static void MicroFare() {
		System.out.println("-----------------------------");
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();

		int RsWithoutGst1 = TotalKilometers * 10;

		// --->
		Discount.discount(RsWithoutGst1);
		
		System.out.println("Total Fare + GST: " + GstCalculator.GST(RsWithoutGst1) + " Rs");
		
		// ---->PEAK HOUR CALCULATION

		 if(PeakHour.hothour() >= 17 && PeakHour.hothour() <= 19) {
			System.out.println(GstCalculator.GST(RsWithoutGst1) + GstCalculator.GST(RsWithoutGst1) * 1.25 / 100 + " Rs ---> Total Fare");
		}
		else {
			GstCalculator.GST(TotalKilometers);
		}

	}

	///////////////////////////////////////////////////
	public static void MiniFare() {
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();
		int RsWithoutGst2 = TotalKilometers * 15;

		// ---->
		Discount.discount(RsWithoutGst2);


		System.out.println("Total Fare + GST: " + GstCalculator.GST(RsWithoutGst2) + " Rs");
		
		// ---->
		if (PeakHour.hothour() >= 17 && PeakHour.hothour() <= 19) {
			System.out.println(GstCalculator.GST(RsWithoutGst2) + GstCalculator.GST(RsWithoutGst2) * 1.25 / 100 + " Rs ---> Total Fare");
		}
		else {
			GstCalculator.GST(TotalKilometers);
		}

	}

	/////////////////////////////////////////////////////
	public static void PrimeFare() {
		System.out.print("Enter distance to destination: ");
		int TotalKilometers = sc.nextInt();

		int RsWithoutGst3 = TotalKilometers * 20;

		// ----->
		Discount.discount(RsWithoutGst3);


		System.out.println("Total Fare + GST: " +GstCalculator.GST(RsWithoutGst3) + " Rs");
		
		if (PeakHour.hothour() >= 17 && PeakHour.hothour() <= 19) {
			System.out.println(GstCalculator.GST(RsWithoutGst3) +GstCalculator.GST(RsWithoutGst3) * 1.25 / 100 + " Rs ---> Total Fare");
		}
		else {
			GstCalculator.GST(TotalKilometers);
		}

	}

}
