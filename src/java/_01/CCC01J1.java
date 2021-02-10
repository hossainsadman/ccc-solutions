package src.java._01;

import java.io.*;
import java.util.*;
	
//	COMPLETE

public class CCC01J1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int columns = 2 * rows;
		int dots;

		for (int i = 0; i < rows / 2 + 1; i++) {
			dots = 2 * i + 1;
			if (dots == rows) {
				System.out.println();
				repeat("*", columns);
			}
			else {
				System.out.println();
				repeat("*", dots);
				repeat(" ", columns - dots * 2);
				repeat("*", dots);
			}
		}

		for (int i = rows - rows / 2 - 2; i >= 0; i--) {
			dots = 2 * i + 1;
			System.out.println();
			repeat("*", dots);
			repeat(" ", columns - dots * 2);
			repeat("*", dots);		
		}

	}

	public static void repeat(String string, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(string);
		}
	}
}