package src.java._04;

import java.io.*;
import java.util.*;

//	INCOMPLETE

public class CCC04J4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String keyword = in.next();
		int columns = keyword.length();
		String original = in.next();
		original = trim(original);
		
	}

	public static String trim(String text) {
		String newText = "";
		for (int i = 0; i < text.length(); i++) {
			int unicode = (byte) text.charAt(i);
			if (unicode >= 65 && unicode <= 90) {
				newText += text.charAt(i);
			}
		}
		return newText;
	}
}