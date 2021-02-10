package src.java._00;

import java.io.*;
import java.util.*;

public class CCC00J5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Node> sites = new LinkedList<>();
		Graph siteConnections = new Graph(true);
		int numSites = in.nextInt();
		for (int i = 1; i <= numSites; i++) {
			String line = in.nextLine();
			if (line.startsWith("http")) {
				sites.add(new Node(line));
				while (true) {
					String nestedLine = in.nextLine();
					if (nestedLine.contains("<A HREF=\"")) {
						String link = nestedLine.substring(nestedLine.indexOf("http://", 0), nestedLine.lastIndexOf("\">") - 2);
						Node tmp = new Node(link);
						siteConnections.addEdge(sites.getLast(), tmp);
					}
					if (nestedLine.equals("</HTML>")) {
						break;
					}
				}
			}
		}
	}
}

class Node {
	String name;
	int n;
	boolean visited;

	public Node(String name) {
		this.name = name;
		visited = false;
	}

	public boolean visited() {
		return visited;
	}

	public void visit() {
		visited = true;
	}

	public void unvisit() {
		visited = false;
	}
}

class Graph {
	private HashMap<Node, LinkedList<Node>> adjacencyMap;
	private boolean directed;

	public Graph(boolean directed) {
		this.directed = directed;
		adjacencyMap = new HashMap<>();
	}

	public void addEdgeHelper(Node a, Node b) {
		LinkedList<Node> tmp = adjacencyMap.get(a);

		if (tmp != null) {
			tmp.remove(b);
		}
		else {
			tmp = new LinkedList<>();
		}

		tmp.add(a);
		adjacencyMap.put(a, tmp);
	}

	public void addEdge(Node source, Node destination) {
		if (!adjacencyMap.keySet().contains(source)) {
			adjacencyMap.put(source, null);
		}
		if (!adjacencyMap.keySet().contains(destination)) {
			adjacencyMap.put(destination, null);
		}

		addEdgeHelper(source, destination);
	}
}