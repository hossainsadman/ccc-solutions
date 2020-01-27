package ccc._10;

import java.util.*;

public class ccc10j4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> outputs = new LinkedList<>();
		ArrayList<String> rawStrings = new ArrayList<>();
		HashMap<Integer, ArrayList<Integer>> rawNums = new HashMap<>();
		while (true) {
			rawStrings.add(in.nextLine());
			if (rawStrings.get(rawStrings.size() - 1).equals("0")) {
				break;
			}
		}

		for (String raw_string: rawStrings) {
			int input_num = 0;
			ArrayList<Integer> nums = new ArrayList<>();
			for (int i = 0; i < raw_string.length(); i++) {
				if (!Character.isWhitespace(raw_string.charAt(i))) {
					nums.add(Integer.getInteger(Character.toString(raw_string.charAt(i))));
				}
			}
			rawNums.put(input_num, nums);
			input_num++;
		}

		for (int i = 0; i < rawNums.size(); i++) {
			rawNums.get(i);
		}
	}
}