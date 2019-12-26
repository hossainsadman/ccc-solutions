package ccc._04;

import java.util.*;

//	COMPLETE

public class ccc04_J1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tiles = in.nextInt();
		int sideLen = (int) Math.sqrt(tiles);
		System.out.println("The largest square has side length " + sideLen + ".");
	}
}