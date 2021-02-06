//	COMPLETE
import java.io.*;
import java.util.*;

public class CCC16j2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] a = in.nextLine().split(" ");
		String[] b = in.nextLine().split(" ");
		String[] c = in.nextLine().split(" ");
		String[] d = in.nextLine().split(" ");
		LinkedList<String[]> rows = new LinkedList<String[]>();
		rows.add(a);
		rows.add(b);
		rows.add(c);
		rows.add(d);
		HashSet<Integer> sums = new HashSet<Integer>();
		boolean magic = true;
		int sum;
		for (String[] row: rows) {
			sum = 0;
			for (String num: row) {
				sum += Integer.parseInt(num);
			}
			sums.add(sum);
			if (sums.size() > 1) {
				magic = false;
				break;
			}
		}
		if (magic) {
			for (int i = 0; i < 4; i++) {
				sum = 0;
				for (String[] row: rows) {
					sum += Integer.parseInt(row[i]);
				}
				sums.add(sum);
				if (sums.size() > 1) {
					magic = false;
					break;
				}
			}
		}
		
		if (magic) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
	}

}
