package src.java._12;

import java.util.*;

//	COMPLETE

public class CCC12J4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> output = new LinkedList<>();
		int k = in.nextInt();
		in.nextLine();
        String input = in.nextLine();
		for (int i = 0; i < input.length(); i++) {
			int s = 3 * (i + 1) + k;
			int ascii = (int)(input.charAt(i)) - s;
			if (ascii < 65) {
				ascii = 91 - (65 - ascii);
			}
			char letter = (char)ascii;
			String shiftedLetter = Character.toString(letter);
			output.add(shiftedLetter);
		}

		for (String letter: output) {
			System.out.print(letter);
		}
        in.close();
	}
}