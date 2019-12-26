package ccc._04;

import java.util.*;

//	COMPLETE

public class ccc04_J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] adjs = new String[n];
		String[] nouns = new String[m];
		for (int i = 0; i < n; i++) {
			adjs[i] = in.next();
		}
		for (int i = 0; i < m; i++) {
			nouns[i] = in.next();
		}
		for (String elem: adjs) {
			for (String elem2: nouns) {
				System.out.println(elem + " as " + elem2);
			}
		}
	}
}