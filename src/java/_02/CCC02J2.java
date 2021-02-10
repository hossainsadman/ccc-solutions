package src.java._02;

import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC02J2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			String input = in.nextLine();
			if (input.equals("quit!")) {
				break;
			}
			System.out.println(convert(input));
		}
		
	}

	public static String convert(String text) {
		String suffix = text.substring(text.length() - 2, text.length());
		if (text.length() > 4 && suffix.equals("or") && !consonant(text)) {
			suffix = "our";
			String newText = text.substring(0, text.length() - 2) + suffix;
			return newText;
		}
		else {
			return text;
		}

	}

	public static boolean consonant(String text) {
		if (Character.toString(text.charAt(text.length() - 3)).equals("a") || Character.toString(text.charAt(text.length() - 3)).equals("e") || Character.toString(text.charAt(text.length() - 3)).equals("i") || Character.toString(text.charAt(text.length() - 3)).equals("o") || Character.toString(text.charAt(text.length() - 3)).equals("u")) {
			return true;
		}
		else {
			return false;
		}
	}
}