import java.io.*;
import java.util.*;

//	COMPLETE

public class CCC11j4 {

	public static LinkedList<Node> holes = new LinkedList<>();
	public static boolean safe = true;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> output = new LinkedList<>();
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
			if (input.contains("q")) {
				break;
			}
			String length = input.substring(2, input.length());
			drill(Character.toString(input.charAt(0)), Integer.parseInt(length));
			if (safe) {
				output.add(holes.getLast().getx() + " " + holes.getLast().gety() + " safe");
			} else if (!safe) {
				output.add(holes.getLast().getx() + " " + holes.getLast().gety() + " DANGER");
				break;
			}
		}

		for (String text: output) {
			System.out.println(text);
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
				equals(tmp);
				holes.add(tmp);
			}
		} else if (direction.equals("r")) {
			for (int i = 1; i <= length; i++) {
				x = x + 1;
				tmp = new Node(x, y);
				equals(tmp);
				holes.add(tmp);
			}
		} else if (direction.equals("u")) {
			for (int i = 1; i <= length; i++) {
				y = y + 1;
				tmp = new Node(x, y);
				equals(tmp);
				holes.add(tmp);
			}
		} else if (direction.equals("d")) {
			for (int i = 1; i <= length; i++) {
				y = y - 1;
				tmp = new Node(x, y);
				equals(tmp);
				holes.add(tmp);
			}
		}
	}

	public static void equals(Node node) {
		int x = node.x;
		int y = node.y;
		for (Node a: holes) {
			int x2 = a.x;
			int y2 = a.y;
			if (x == x2 && y == y2) {
				safe = false;
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