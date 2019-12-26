package ccc._04;

import java.util.Scanner;

//	COMPLETE

public class ccc04_J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		for (int i = x; i <= y; i += 60) {
			System.out.println("All positions change in year " + i);
		}
	}
}