package ccc._11;

import java.util.*;

//	INCOMPLETE

public class ccc11j4 {

	public static LinkedList<Node> holes = new LinkedList<>();
	public static boolean safe = true;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		holes.add(new Node(0, -1));
		drill("d", 2);
		drill("r", 3);
		drill("d", 2);
		drill("r", 2);
		drill("u", 2);
		drill("r", 2);
		drill("d", 4);
		drill("l", 8);
		drill("u", 2);

		while (safe) {
			String input = in.nextLine();
			String length = input.substring(2, input.length());
			drill(Character.toString(input.charAt(0)), Integer.parseInt(length));
			if (safe) {
				System.out.println(holes.getLast().getx() + " " + holes.getLast().gety() + " safe");
			} else {
				System.out.println(holes.getLast().getx() + " " + holes.getLast().gety() + " DANGER");
				break;
			}
		}
	}

	static void drill(String direction, int length) {
		Node tmp = holes.getLast();
		int x = tmp.getx();
		int y = tmp.gety();

		if (direction.equals("l")) {
			for (int i = 1; i <= length; i++) {
				x = x - 1;
				tmp = new Node(x, y);
				if (holes.contains(tmp)) {
					safe = false;
				}
				holes.add(tmp);
			}
		} else if (direction.equals("r")) {
			for (int i = 1; i <= length; i++) {
				x = x + 1;
				tmp = new Node(x, y);
				if (holes.contains(tmp)) {
					safe = false;
				}
				holes.add(tmp);
			}
		} else if (direction.equals("u")) {
			for (int i = 1; i <= length; i++) {
				y = y + 1;
				tmp = new Node(x, y);
				if (holes.contains(tmp)) {
					safe = false;
				}
				holes.add(tmp);
			}
		} else if (direction.equals("d")) {
			for (int i = 1; i <= length; i++) {
				y = y - 1;
				tmp = new Node(x, y);
				if (holes.contains(tmp)) {
					safe = false;
				}
				holes.add(tmp);
			}
		}
	}
}

class Node {
	int x;
	int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}
}