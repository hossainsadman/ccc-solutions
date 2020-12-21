package ccc._20;

import java.util.*;
import java.io.*;

public class ccc20j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		TreeSet<Integer> x = new TreeSet<Integer>();
		TreeSet<Integer> y = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			String[] input = in.readLine().split(",");
			x.add(Integer.parseInt(input[0]));
			y.add(Integer.parseInt(input[1]));
		}
		System.out.println((x.first() - 1) + ", " + (y.first() - 1));
		System.out.println((x.last() + 1) + ", " + (y.last() + 1));

	}

}
