package src.java._11;

import java.io.*;
import java.util.*;

// COMPLETE

public class CCC11S1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int eng = 0;
		int fre = 0;
		for (int i = 1; i < n + 2; i++) {
			String text = in.nextLine();
			for (int j = 0; j < text.length(); j++) {
				if (Character.toString(text.charAt(j)).equals("t") || Character.toString(text.charAt(j)).equals("T")) {
					eng += 1;
				}
				if (Character.toString(text.charAt(j)).equals("s") || Character.toString(text.charAt(j)).equals("S")) {
					fre += 1;
				}
			}
		}

		if (fre >= eng) {
			System.out.println("French");
		} else {
			System.out.println("English");
		}
	}
}