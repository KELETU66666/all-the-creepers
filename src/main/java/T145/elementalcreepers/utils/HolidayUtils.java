package T145.elementalcreepers.utils;

import java.util.Calendar;

public class HolidayUtils {

	private static Calendar holidayStart = Calendar.getInstance();
	private static Calendar holidayEnd = Calendar.getInstance();
	private static Calendar currTime = Calendar.getInstance();

	private HolidayUtils() {
	}

	public static boolean isValentinesDay() {
		setDate(holidayStart, Calendar.FEBRUARY, 13, false);
		setDate(holidayEnd, Calendar.FEBRUARY, 15, true);
		return dateCheck();
	}

	public static boolean isAprilFools() {
		setDate(holidayStart, Calendar.MARCH, 31, false);
		setDate(holidayEnd, Calendar.APRIL, 2, true);
		return dateCheck();
	}

	public static boolean isEarthDay() {
		setDate(holidayStart, Calendar.APRIL, 21, false);
		setDate(holidayEnd, Calendar.APRIL, 23, true);
		return dateCheck();
	}

	public static boolean isHalloween() {
		setDate(holidayStart, Calendar.OCTOBER, 30, false);
		setDate(holidayEnd, Calendar.NOVEMBER, 1, true);
		return dateCheck();
	}

	public static boolean isChristmas() {
		setDate(holidayStart, Calendar.DECEMBER, 24, false);
		setDate(holidayEnd, Calendar.DECEMBER, 26, true);
		return dateCheck();
	}

	/* HELPER FUNCTIONS */

	private static void setDate(Calendar cal, int month, int date, boolean endOfDay) {
		cal.clear();
		cal.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);

		if (endOfDay) {
			cal.set(Calendar.HOUR_OF_DAY, 23);
			cal.set(Calendar.MINUTE, 59);
			cal.set(Calendar.SECOND, 59);
			cal.set(Calendar.MILLISECOND, 999);
		} else {
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MILLISECOND, 0);
		}
	}

	private static boolean dateCheck() {
		currTime = Calendar.getInstance();
		return currTime.after(holidayStart) && currTime.before(holidayEnd);
	}
}