package ccc._12;

import java.util.*;

//	COMPLETE

public class ccc12j4 {
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
	}
}

/*
	1 GET S VALUE USING K VALUE (WILL SAY HOW MANY LETTERS TO SHIFT LEFT TO)
	2 GET SHIFTED ASCII VALUE
	3 GET LETTER AT SHIFTED ASCII VALUE
*/