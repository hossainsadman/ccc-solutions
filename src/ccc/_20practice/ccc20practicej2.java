package ccc._20practice;

import java.util.*;
import java.io.*;

public class ccc20practicej2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] kTest = in.readLine().split(" ");
		String[] sTest = in.readLine().split(" ");
		int[] kRuns = new int[kTest.length];
		int[] sRuns = new int[sTest.length];
		for (int i = 0; i < kTest.length; i++) {
			kRuns[i] = Integer.parseInt(kTest[i]);
			sRuns[i] = Integer.parseInt(sTest[i]);
		}
		int ksum = 0;
		int ssum = 0;
		int counter = 0;
		for (int i = 0; i < kRuns.length; i++) {
			ksum += kRuns[i];
			ssum += sRuns[i];
			counter++;
			if (ksum == ssum) {
				break;
			}
		}
		if (counter == kRuns.length) {
			counter = 0;
		}
		System.out.println(counter);

	}

}
