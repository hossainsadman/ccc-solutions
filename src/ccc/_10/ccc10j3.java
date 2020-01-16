package ccc._10;

import java.util.*;

//	PARTIALLY COMPLETE

public class ccc10j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Object> output = new ArrayList<>();
		int A = 0;
		int B = 0;
		while (true) {
			
			String text = in.nextLine();
			
			if (text.length() == 1 && text.equals("7")) {
				break;
			}

			int operation = Integer.parseInt(Character.toString(text.charAt(0)));
			String var1 = Character.toString(text.charAt(2));
			if (text.length() > 3) {
				String var2 = Character.toString(text.charAt(4));
			}

			if (operation == 1) {
				if (var1.equals("A")) {
					A = getX(text, 3);
				} else {
					B = getX(text, 3);
				}
			} else if (operation == 2) {
				if (var1.equals("A")) {
					output.add(A);
				} else output.add(B);
			} else if (operation == 3) {
				A = A + B;
			} else if (operation == 4) {
				A = A * B;
			} else if (operation == 5) {
				A = A - B;
			} else if (operation == 6) {
				A = A / B;
			}
		}
		for (Object object: output) {
			System.out.println(object);
		}
	}

	public static int getX(String text, int position) {
		int num = 0;
		if (position == 2) {
			num = Integer.parseInt(Character.toString(text.charAt(2)));
		} else if (position == 3) {
			num = Integer.parseInt(Character.toString(text.charAt(4)));
		}
		
		return num;
	}
}