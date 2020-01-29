// DIJKSTRA'S ALGORITHM W. CHESS but w/o weighted lines & directed

package ccc._10;

public class ccc10j5 {
	public static void main(String[] args) {
		
	}
}

class Node {
	int x;
	int y;
	boolean visited;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		visited = false;
	}

	public boolean isVisited() {
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
	boolean directed = true;

}