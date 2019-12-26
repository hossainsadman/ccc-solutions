package ccc._05;

import java.util.*;

//	INCOMPLETE

public class ccc05_J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> directions = new ArrayList<>();
		ArrayList<String> locations = new ArrayList<>();
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

		for (String elem: directions) {
			if (elem.equals("R")) {
				elem.replace("R", "LEFT");
			}
			else if (elem.equals("L")) {
				elem.replace("L", "RIGHT");
			}
		}

		System.out.println(directions.toString());
	}
}