package ccc._09;

import java.util.*;

public class ccc09J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		timeDiff(current, difference)
		int ottawa = in.nextInt();
	}

	public static int hours(int time) {
		int hours = time / 60;
		return hours;
	}

	public static int minutes(int time) {
		int min = time % 60;
		return min;
	}

	public static int timeDiff(int current, int difference) {
		if (current - difference < 0) {
			return 2359 - (difference - current);
		} else {
			return current - difference;
		}
	}

	public static int timeSubtract(int a, int b) {
		if (a - b < 0)
	}
}