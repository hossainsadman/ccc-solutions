package src.java._16;


import java.util.*;

public class CCC16J1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int wins = 0;
		int loses = 0;
		for (int i = 0; i < 6; i++) {
			String text = in.nextLine();
			if (text.equals("W")) {
				wins++;
			} else if (text.equals("L")){
				loses++;
			}
		}

		if (wins == 5 || wins == 6) {
			System.out.println("1");
		} else if (wins == 3 || wins == 4) {
			System.out.println("2");
		} else if (wins == 1 || wins == 2) {
			System.out.println("3");
		} else {
			System.out.println("-1");
		}
        in.close();
	}

}
