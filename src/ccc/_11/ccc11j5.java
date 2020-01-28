package ccc._11;

import java.util.*;

//	INCOMPLETE

public class ccc11j5 {
	public static void main(String[] in) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] ways = new int[] {1, 1, 1, 1, 1, 1, 1};
		for (int i = 1; i <= n; i++) {
			int y = input.nextInt();
			ways[y] = ways[y] * (1 + ways[i]);
		}

		System.out.println(ways[n]);
	}
}

