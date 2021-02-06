import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC11j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		LinkedList<Integer> sequence = new LinkedList<>();
		sequence.add(a);
		sequence.add(b);
		if (a < b) {
			System.out.println("2");
		} else {
			int counter = 1;
			while (true) {
				int diff = sequence.get(counter - 1) - sequence.get(counter);
				sequence.add(diff);
				counter += 1;
				if (diff < 0) {
					break;
				}
			}
			System.out.println(counter);
		}
	}		
}