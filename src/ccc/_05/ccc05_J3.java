package ccc._05;

import java.util.*;

//	INCOMPLETE

public class ccc05_J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> directions = new ArrayList<>();
		ArrayList<String> locations = new ArrayList<>();

		ArrayList<String> reverseDirections = new ArrayList<>();
		//	ArrayList<String> reverseLocations = new ArrayList<>();

		while (true) {
			String direction = in.nextLine();
			directions.add(direction);
			String location = in.nextLine();
			if (location.equals("SCHOOL")) {
				locations.add(location);
				break;
			} else {
				locations.add(location);
			}
		}

		System.out.println(directions.toString());
		System.out.println(locations.toString());

		Collections.reverse(locations);
		locations.add("HOME");

		for (String elem: directions) {
			if (elem.equals("R")) {
				reverseDirections.add("LEFT");
			}
			else if (elem.equals("L")) {
				reverseDirections.add("RIGHT");
			}
		}

		System.out.println(reverseDirections.toString());
		System.out.println(locations.toString());

		for (String direction: reverseDirections) {
			System.out.println("Turn " + direction);
		}
	}
}