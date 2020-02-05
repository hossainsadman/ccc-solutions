package ccc._18;

import java.io.*;
import java.util.*;

//	INCOMPLETE

public class ccc18j3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] distances = in.readLine().split(" ", 0);
		int sum = 0;
		System.out.print("0 ");
		for (String distance: distances) {
			sum += Integer.parseInt(distance);
			System.out.print(sum + " ");
		}
		System.out.println();
		System.out.print(distances[0] + " ");
		sum = 0;
		for (int i = 2; i < distances.length; i++) {
			sum += Integer.parseInt(distances[i]);
			System.out.print(sum + " ");
		}
	}
}