package ccc._18;

import java.util.*;
import java.io.*;

public class ccc18j5ii {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Graph2 g = new Graph2(n);

        for(int i = 1; i <= n; i++) {
            String[] line = reader.readLine().split(" ");
            int mi = Integer.parseInt(line[0]);

            if (mi > 0) {
                for (int j = 1; j <= mi; j++) {
                    g.addEdge(mi, Integer.parseInt(line[j]));
                    System.out.println(g.adjlist.get(1));
                }
            }
        }

        g.bfs(1);
    }
}

class Graph2 {
    int v;
    HashMap<Integer, HashSet<Integer>> adjlist;
    public HashMap<Integer, Integer> dist;
    Graph2 (int v) {
        this.v = v;
        adjlist = new HashMap<Integer, HashSet<Integer>>();
        dist = new HashMap<Integer, Integer>();
    }

    void addEdge (int src, int dest) {
        if (adjlist.get(src) == null) {
            adjlist.put(src, new HashSet<Integer>());
        }
        adjlist.get(src).add(dest);
    }

    HashSet<Integer> adjNodes (int src) {
        return adjlist.get(src);
    }

    boolean hasEdge(int src, int dest) {
        return adjNodes(src).contains(dest);
    }

    void bfs (int src) {
        LinkedList queue = new LinkedList<Integer>();
        HashSet visited = new HashSet<Integer>();
        int shortest = 10001;
        
        visited.add(src);
        dist.put(src, 0);
        queue.add(src);

        while (!queue.isEmpty()) {
            src = (int) queue.removeFirst();
            if (adjNodes(src) != null) {
                for (int adjNode : adjNodes(src)) {
                        if (!visited.contains(adjNode)) {
                            visited.add(adjNode);
                            dist.put(adjNode, dist.get(src)+1);
                        }
                    }
                // dist.put(src, dist.get(src)+1);
            } else {
                if (dist.get(src) < shortest) {
                    shortest = dist.get(src);
                }
            }
        }
        System.out.println(shortest);
    }
}