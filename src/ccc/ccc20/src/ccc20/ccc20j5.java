package ccc20;

import java.util.*;
import java.io.*;

public class ccc20j5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		LinkedList<Node> allNodes = new LinkedList<Node>();
		Graph graph = new Graph();
		Node endNode = new Node(-1, -1, -1);
		Node startNode = new Node(-1, -1, -1);
		for (int i = 1; i <= m; i++) {
			String[] tmp = in.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				int x = Integer.parseInt(tmp[j - 1]);
				if (i == 1 && j == 1) {
					startNode = new Node(j, i, x);
					allNodes.add(startNode);
				}
				if (j == n && i == m) {
					endNode = new Node(m, n, x);
					allNodes.add(endNode);
				} else {
					Node tmpNode = new Node(i, j, x);
					allNodes.add(tmpNode);
				}
			}
		}
		for (Node node: allNodes) {
			for (Node node2: allNodes) {
				if (node.getX() == node2.getSum() || node.getN() == node2.getSum()) {
					graph.addEdge(node, node2);
				}
			}
		}
		
		boolean truth = graph.BFS(startNode, endNode);
		
		if (truth) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}

class Node {
	int m;
	int n;
	int x;
	boolean visited;
	
	public Node(int m, int n, int x) {
		this.m = m;
		this.n = n;
		this.x = x;
		visited = false;
	}
	
	public int getM() {
		return m;
	}
	
	public int getN() {
		return n;
	}
	
	public int getX() {
		return x;
	}
	
	public int getSum() {
		return m*n;
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
	
	public boolean isEqual(Node anotherNode) {
		if (anotherNode.getM() == m && anotherNode.getN() == n) {
			return true;
		} else {
			return false;
		}
	}
}


class Graph {
	HashMap<Node, LinkedList<Node>> adjacencyMap;
	
	public Graph() {
		adjacencyMap = new HashMap<Node, LinkedList<Node>>();
	}
	
	public void printEdges() {
		for (Node key: adjacencyMap.keySet()) {
			LinkedList<Node> neighbours = adjacencyMap.get(key);
			System.out.println("The node " + key.m + key.n + " is connected to: ");
			for (Node neighbour: neighbours) {
				System.out.print(neighbour.m + "" + neighbour.n + " ");
			}
			System.out.println();
		}
	}
	
	public void addEdgeHelper(Node a, Node b) {
		LinkedList<Node> tmp = adjacencyMap.get(a);
		if (tmp != null) {
			tmp.remove(b);
		} else {
			tmp = new LinkedList<Node>();
		}
		
		tmp.add(b);
		adjacencyMap.put(a, tmp);
	}

	public void addEdge(Node source, Node destination) {
		if (!adjacencyMap.containsKey(source)) {
			adjacencyMap.put(source, null);
		}
		if (!adjacencyMap.containsKey(destination)) {
			adjacencyMap.put(destination, null);
		}
		
		addEdgeHelper(source, destination);
		addEdgeHelper(destination, source);
	}
	
	public boolean BFS(Node startNode, Node endNode) {
		boolean truth = false;
		LinkedList<Node> queue = new LinkedList<Node>();
		HashSet<Node> visitedNodes = new HashSet<Node>();
		queue.add(startNode);
		while (!queue.isEmpty()) {
			Node currentNode = queue.remove();
			if (currentNode.visited) {
				continue;
			}
//			System.out.println(currentNode.m + "" + currentNode.n);
			if (currentNode.isEqual(endNode)) {
				truth = true;
				return truth;
			}
			currentNode.visit();
			visitedNodes.add(currentNode);
			LinkedList<Node> allNeighbours = adjacencyMap.get(currentNode);
			if (allNeighbours == null) {
				continue;
			}
			for (Node neighbour : allNeighbours) {
				if (neighbour.visited == false) {
					queue.add(neighbour);
				}
			}
		}
		return truth;
	}
}