package ccc._07;

import java.util.*;

//	COMPLETE

public class ccc07_j4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HashSet<String> a = new HashSet<>();
		HashSet<String> b = new HashSet<>();

		String word1 = in.nextLine();
		String word2 = in.nextLine();
		
		word1 = word1.replace(" ", "");
		word2 = word2.replace(" ", "");

		String[] aWord = new String[word1.length()];
		for (int i = 0; i < word1.length(); i++) {
			aWord[i] = Character.toString(word1.charAt(i));
		}
		for (String elem: aWord) {
			a.add(elem);
		}

		String[] bWord = new String[word2.length()];
		for (int i = 0; i < word2.length(); i++) {
			bWord[i] = Character.toString(word2.charAt(i));
		}
		for (String elem: bWord) {
			b.add(elem);
		}

		if (a.equals(b)) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
		}

	}
}