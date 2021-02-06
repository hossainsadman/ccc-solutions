import java.io.*;
import java.util.*;

// COMPLETE

public class CCC00S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int fm = in.nextInt();
		int sm = in.nextInt();
		int tm = in.nextInt();

		int counter = 0;

		while (q > 0) {
			if (q == 0) {
				break;
			}
			q -= 1;
			fm += 1;
			counter += 1;
			if (fm == 35) {
				q += 30;
				fm = 0;
			}
			if (q == 0) {
				break;
			}
			counter += 1;
			q -= 1;
			sm += 1;
			if (sm == 100) {
				q += 60;
				sm = 0;
			}
			if (q == 0) {
				break;
			}
			counter += 1;
			q -= 1;
			tm += 1;
			if (tm == 10) {
				q += 9;
				tm = 0;
			}
			if (q == 0) {
				break;
			}
		}
		System.out.println("Martha plays " + counter + " times before going broke.");
    }
}