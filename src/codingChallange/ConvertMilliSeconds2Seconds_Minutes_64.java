package codingChallange;

import java.util.concurrent.TimeUnit;

public class ConvertMilliSeconds2Seconds_Minutes_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long millisecods = 1000000;
		// System.currentTimeMillis();
		long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecods);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millisecods);
		System.out.println("Current miliseconds: " + millisecods);
		System.out.println("Current seconds: " + seconds);
		System.out.println("Current minutes: " + minutes);

	}

}
