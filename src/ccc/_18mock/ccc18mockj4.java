package ccc._18mock;

import java.util.*;
import java.io.*;

//	COMPLETE

public class ccc18mockj4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> medians = new TreeSet<Integer>();
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String[] input = in.readLine().split(" ");
			TreeSet<Integer> list = new TreeSet<Integer>();
			for (String number: input) {
				list.add(Integer.parseInt(number));
			}
			Object[] numbers = list.toArray();
			int median = 0;
			if (numbers.length % 2 == 0) {
				median = ((int) numbers[numbers.length / 2] + (int) numbers[numbers.length / 2 + 1]) / 2;
				medians.add(median);
			} else {
				median = (int) numbers[numbers.length / 2];
				medians.add(median);
			}
		}
		Object[] medians2 = medians.toArray();
		int finalmedian = 0;
		if (medians2.length % 2 == 0) {
			finalmedian = ((int) medians2[medians2.length / 2] + (int) medians2[medians2.length / 2 + 1]) / 2;
		} else {
			finalmedian = (int) medians2[medians2.length / 2];
		}
		System.out.println(finalmedian);
	}

}
