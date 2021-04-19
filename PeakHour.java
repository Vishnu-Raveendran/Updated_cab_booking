package com.vishnu;

import java.time.LocalTime;

public class PeakHour {
	public static int hothour() {
		LocalTime currenttime = LocalTime.now();
		int Hikehour = currenttime.getHour();
		return Hikehour;
	}

}
