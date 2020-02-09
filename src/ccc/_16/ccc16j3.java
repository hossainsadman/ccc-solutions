package ccc._16;

//	COMPLETE

import java.io.*;
import java.util.*;

public class ccc16j3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
//		char[] letters = text.toCharArray();
		int length = 0;
		if (palindrome(text)) {
			System.out.println(text.length());
		} else {
			for (int i = 0; i < text.length(); i++) {
				for (int j = text.length(); j >= i; j = j - 1) {
					String substring = text.substring(i, j);
					if (palindrome(substring) && substring.length() > length) {
						length = substring.length();
					}
				}
			}
			System.out.println(length);
		}
	}
	
	static boolean palindrome(String text) {
		if (text.equals(reverse(text))) {
			return true;
		} else {
			return false;
		}
	}
	
	static String reverse(String text) {
		String reversed = new StringBuilder(text).reverse().toString();
		return reversed;
	}

}
