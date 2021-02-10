package src.java._11;

import java.util.*;

//	INCOMPLETE

public class CCC11S3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
        in.close();
	}

	int closedAtX(int m, int x) {
		if (m >= 1) {
			int power = (int) Math.pow(5, m - 1);
			int location = (int) x / power;
			if (location == 0 || location == 4) {
				return 0;
			} else if (location == 1 || location == 3) {
				return 1 * power + closedAtX(m - 1, x % power);
			} else if (location == 2) {
				return 2 * power + closedAtX(m - 1, x % power);
			}
		}

		return 0;
	}
}