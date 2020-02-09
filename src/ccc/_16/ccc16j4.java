package ccc._16;

import java.util.*;
import java.io.*;

//	INCOMPLETE

public class ccc16j4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(":");
		int h1 = Integer.parseInt(input[0]);
		int m1 = Integer.parseInt(input[1]);
		int h2;
		int m2;
		
		int min = 120;		
		int slowTravel = 0;
		
		
		if (!(h1 > 5 && h1 < 10) && !(h1 > 13 && h1 < 19)) {
			h2 = h1 + 2;
			m2 = m1;
			System.out.println(timeConvert(h2, m2));
		} else {
			if (h1 > 5 && h1 < 7) {
				slowTravel += 60 - m1;
			}
		}
	}
	
	static String timeConvert(int h, int m) {
		String hours;
		String min;
		if (h < 10) {
			hours = "0" + Integer.toString(h);
		} else {
			hours = Integer.toString(h);
		}
		if (m == 0) {
			min = "00";
		} else {
			min = Integer.toString(m);
		}
		
		String output = hours + ":" + min;
		return output;
	}

}
