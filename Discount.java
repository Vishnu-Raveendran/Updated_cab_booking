package com.vishnu;

public class Discount {

	public static void discount(int gst1) {
			if (AgeFinder.age() >= 60 && (PeakHour.hothour() <17 || PeakHour.hothour()>19 ) ) {
			
			System.out.println("-----------------------------------------");
			System.out.println("Hurray! You are eligible for 50% discount!");
			System.out.println("-----------------------------------------");
			
			System.out.println(GstCalculator.GST(gst1) - GstCalculator.GST(gst1) * 50 / 100 + " Rs ---> Total Fare");

		}
		
	}
}
