package ccc._01;

import java.util.*;

//	INCOMPLETE

public class ccc01_J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int m = in.nextInt();
		reverseMod(x, m);
	}

	public static void reverseMod(int x, int m) {
		int a = 0;
		// int b = 1;
		while (true) {
			a += 1;
			int factor = a * x;
			for (int b = 1; b <= 100; b++) {
				if (m * b - factor == 1) {
					System.out.println(m * b - factor);
				}
			}
		}
	}
}