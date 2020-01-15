package ccc._10;

import java.util.*;

public class ccc10j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = 0;
		int B = 0;
		while (true) {
			
			String text = in.nextLine();
			
			if (text.length() == 1 && Integer.parseInt(text) == 7) {
				break;
			}

			int operation = Integer.parseInt(Character.toString(text.charAt(0)));
			String var1 = Character.toString(text.charAt(2));

			if (operation == 1) {
				if (var1.equals("A")) {
					A = getX(text);
				} else {
					B = getX(text);
				}
			} else if (operation == 2) {
				String msg = Character.toString(text.charAt(text.length() - 1));
				System.out.println(msg);
			} else if (operation == 3) {

			}
		}
	}

	public static int getX(String text, int position) {
		if (position == 2) {
			int num = Integer.parseInt(Character.toString(text.charAt(text.length() - 1)));
		} else if (position == 3) {
			int num = Integer.parseInt(Character.toString(text.charAt(text.length() - 1)));
		}
		
		return num;
	}
}