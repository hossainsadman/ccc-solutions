import java.io.*;
import java.util.*;

public class CCC18j5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*  so what i need to do is make a graph and find the shortest path and ensure that there isnt a vertex that cannot be reached from page 1 (so an is connected to function, which is probly just a recursive hasEdge function)
        */

        int n = Integer.parseInt(reader.readLine());
        Graph g = new Graph(n, true);

        for(int i = 1; i <= n; i++) {
            String[] line = reader.readLine().split(" ");
            int mi = Integer.parseInt(line[0]);
            if (mi > 0) {
                for (int j = 1; j <= mi; j++) {
                    g.addEdge(i, Integer.parseInt(line[j]));
                }
            }
        }
        g.allReachable(n);
    }
}

class Graph {
    int v;
    boolean directed;
    HashSet visited;

    HashMap<Integer, LinkedList<Integer>> adjlist;

    Graph (int v, boolean directed) {
        v = this.v;
        directed = this.directed;
        adjlist = new HashMap<>();
        visited = new HashSet<Integer>();
    }

    int vertices() {
        return v;
    }

    void addEdge(int src, int dest) {
        if (adjlist.get(src) == null) {
            adjlist.put(src, new LinkedList<>());
        }
        adjlist.get(src).add(dest);
        if (!directed) {
            if (adjlist.get(dest) == null) {
                adjlist.put(dest, new LinkedList<>());
            }
            adjlist.get(dest).add(src);
        }
    }

    boolean hasEdge(int src, int dest) {
        if (directed) {
            return adjlist.get(src).contains(dest);
        }
        return adjlist.containsKey(src) && adjlist.containsKey(dest) && adjlist.get(src).contains(dest) && adjlist.get(dest).contains(src);
    }

    LinkedList getEdges(int src) {
        return adjlist.get(src);
    }

    void dfs(int start) {
        visited.add(start);
        LinkedList<Integer> adj_nodes = getEdges(start);
        if (adj_nodes == null) {
            return;
        }
        for (Integer node : adj_nodes) {
            if (visited.contains(node) != true) {
                dfs(node);
            }
        }
    }

    void allReachable(int nodes) {
        this.dfs(1);
        for (int i = 1; i <= nodes; i++) {
            if (visited.contains(i) != true) {
                System.out.println("N");
                return;
            }
        }
        System.out.println("Y");
    }

    void bfs(int start) {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        visited.add(start);
        while (q.isEmpty() != true) {
            int node = q.removeFirst();
            LinkedList<Integer> adj_nodes = getEdges(start);
            if (adj_nodes != null) {
                for (Integer a_node : adj_nodes) {
                    if (!visited.contains(a_node)) {
                        q.add(a_node);
                        visited.add(a_node);
                    }
                }
            }
        }
    }
}