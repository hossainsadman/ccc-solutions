package src.java._16;

import java.io.*;
import java.util.*;

// INCOMPLETE

public class CCC16J5 {

	public static void main(String[] args) throws IOException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		String[] a = in.readLine().split(" ");
		String[] b = in.readLine().split(" ");
		TreeSet<Integer> dmo = new TreeSet<Integer>();
		TreeSet<Integer> peg = new TreeSet<Integer>();
		int[] p_speeds = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			dmo.add(Integer.parseInt(a[i]));
			peg.add(Integer.parseInt(b[i]));
		}
	}

}
