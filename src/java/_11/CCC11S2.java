package src.java._11;

import java.util.*;

//	COMPLETE

public class CCC11S2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		int correct = 0;

		ArrayList<String> student = new ArrayList<>();
		ArrayList<String> answers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			student.add(in.nextLine());
		}
		for (int i = 0; i < n; i++) {
			answers.add(in.nextLine());
		}

		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).equals(answers.get(i))) {
				correct += 1;
			}
		}

		System.out.println(correct);
        in.close();
	}
}