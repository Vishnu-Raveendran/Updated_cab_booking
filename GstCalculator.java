package com.vishnu;

public class GstCalculator {
	
	public static double GST(int km) {
		double RsWithGst = km + ((km * 7) / 100.0);
		return RsWithGst;
	}

}
