package src.java._06;

import java.io.*;
import java.util.*;

//	INCOMPLETE

public class CCC06J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> words = new ArrayList<String>();
		while (true) {
			String word = in.nextLine();
			if (word.equals("halt")) {
				break;
			}
			words.add(word);
		}
		System.out.println((int)'a');

	}

	public static int time(String word) {
		int time = 0;
		String[] letters = new String[word.length()];
		for (String letter: letters) {
			int pressNum = 0;
			// if (letter.contains("a") || letter.contains("d") ||)
		}
		
		return 0;
	}

	// public static boolean onePress(String letter) {
	// }
}