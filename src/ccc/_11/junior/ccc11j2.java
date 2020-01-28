package ccc._11.junior;

import java.util.*;

//	COMPLETE

public class ccc11j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int humidity = in.nextInt();
		int max = in.nextInt();
		boolean touchGround = false;
		int reach = -1;
		for (int t = 1; t <= max; t++) {
			if (A(t, humidity) <= 0) {
				touchGround = true;
				reach = t;
				break;
			}
		}
		if (touchGround == false) {
			System.out.println("The balloon does not touch ground in the given time.");
		} else {
			System.out.println("The balloon first touches ground at hour: ");
			System.out.println(reach);
		}
	}

	static double A(int t, int h) {
		return (-6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t);
	}
}