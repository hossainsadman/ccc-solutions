import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC02_J1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (number == 0) {
			horiLine();
			bothLines();
			emptyLine();
			bothLines();
			horiLine();
		} else if (number == 1) {
			emptyLine();
			leftLine();
			emptyLine();
			leftLine();

		} else if (number == 2) {
			horiLine();
			rightLine();
			horiLine();
			leftLine();
			horiLine();

		} else if (number == 3) {
			horiLine();
			rightLine();
			horiLine();
			rightLine();
			horiLine();

		} else if (number == 4) {
			emptyLine();
			bothLines();
			horiLine();
			rightLine();

		} else if (number == 5) {
			horiLine();
			leftLine();
			horiLine();
			rightLine();
			horiLine();

		} else if (number == 6) {
			horiLine();
			leftLine();
			horiLine();
			bothLines();
			horiLine();

		} else if (number == 7) {
			horiLine();
			rightLine();
			emptyLine();
			rightLine();

		} else if (number == 8) {
			horiLine();
			bothLines();
			horiLine();
			bothLines();
			horiLine();

		} else if (number == 9) {
			horiLine();
			bothLines();
			horiLine();
			rightLine();
			horiLine();

		}
	}

	public static void horiLine() {
		System.out.println(" * * *");
	}

	public static void emptyLine() {
		System.out.println();
	}

	public static void leftLine() {
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
	}

	public static void rightLine() {
		System.out.println(" ".repeat(6) + "*");
		System.out.println(" ".repeat(6) + "*");
		System.out.println(" ".repeat(6) + "*");
	}

	public static void bothLines() {
		System.out.println("*" + " ".repeat(5) + "*");
		System.out.println("*" + " ".repeat(5) + "*");
		System.out.println("*" + " ".repeat(5) + "*");
	}
}