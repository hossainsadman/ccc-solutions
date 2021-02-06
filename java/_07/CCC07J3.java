import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC07_J3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		LinkedHashMap<Integer, Integer> bags = new LinkedHashMap<>();
		bags.put(1, 100);
		bags.put(2, 500);
		bags.put(3, 1000);
		bags.put(4, 5000);
		bags.put(5, 10000);
		bags.put(6, 25000);
		bags.put(7, 50000);
		bags.put(8, 100000);
		bags.put(9, 500000);
		bags.put(10, 1000000);

		LinkedHashMap<Integer, Integer> eliminatedBags = new LinkedHashMap<>();
		int offer = 0;
		while (true) {
			int input = in.nextInt();
			if (input > 10) {
				offer = input;
				break;
			} else {
				eliminatedBags.put(input, bags.get(input));
				bags.remove(input);
			}
		}

		if (bagSum(bags)/bags.size() >= offer) {
			System.out.println("no deal");
		} else {
			System.out.println("deal");
		}
	}

	public static int bagSum(LinkedHashMap<Integer, Integer> map) {
		int sum = 0;
		for (Map.Entry<Integer,Integer> elem: map.entrySet()) {
			sum += elem.getValue();
		}
		return sum;
	}
}