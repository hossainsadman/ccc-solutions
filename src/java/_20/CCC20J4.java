package src.java._20;

import java.io.*;
import java.util.*;

public class CCC20J4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String original = in.readLine();
		String possible = in.readLine();
		LinkedList<String> shifts = new LinkedList<String>();
		for (int i = 0; i < possible.length(); i++) {
			String tmp = possible.substring(i, possible.length()) + possible.substring(0, i);
			shifts.add(tmp);
		}
		boolean truth = false;
		for (String possibleShift : shifts) {
			if (original.contains(possibleShift)) {
				truth = true;
			}
		}
		if (truth) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
