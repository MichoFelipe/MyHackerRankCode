package algorithms.easy;

import java.io.IOException;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below. 07:05:45PM 19:05:45
	 */
	static String timeConversion(String s) {
		String result = "";
		String hour, min, seg, am_pm;

		String[] inputTime = s.split(":");
		hour = inputTime[0];
		min = inputTime[1];
		seg = inputTime[2].substring(0, 2);
		am_pm = inputTime[2].substring(2, 4);

		if (am_pm.equals("PM") && Integer.valueOf(hour) < 12) {
			hour = String.valueOf(Integer.valueOf(hour) + 12);
		} else if (hour.equals("12") && am_pm.equals("AM")) {
			hour = "00";
		}
		result = hour + ":" + min + ":" + seg;
		return result;
	}

	public static void main(String[] args) throws IOException {
		// String result = timeConversion("07:05:45PM");
		String result = timeConversion("12:00:00PM");
		System.out.println(result);
	}

}
