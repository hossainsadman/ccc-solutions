package ccc._10;

import java.util.*;

public class ccc10j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = 0;
		int B = 0;
		while (true) {
			String text = in.nextLine();
			if (Integer.parseInt(text) == 7 && text.length() == 1) {
				break;
			}
			int operation = Integer.parseInt(Character.toString(text.charAt(0)));
			String var = Character.toString(text.charAt(2));
			if (operation == 1) {
				if (var.equals("A")) {
					A = Integer.parseInt(Character.toString(text.charAt(text.length() - 1)));
				} else {
					B = 
				}
			}
		}
	}
}