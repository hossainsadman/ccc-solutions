package src.java._16;

import java.io.*;
import java.util.*;

// INCOMPLETE

public class CCC16S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String[] txt = r.readLine().split(" ");
        int n = Integer.parseInt(txt[0]);
        int m = Integer.parseInt(txt[1]);

        txt = r.readLine().split(" ");
        int[] ms = new int[m];
        for (int i = 0; i <= m-1; i++) {
            ms[i] = Integer.parseInt(txt[i]);
        }

        Graph g = new Graph(n);
        for (int i = 0; i <= n-2; i++) {
            txt = r.readLine().split(" ");
            g.addEdge(Integer.parseInt(txt[0]), Integer.parseInt(txt[1]));
        }

        int i = 0;
        for (i = 0; i < m-1; i++) {
            g.bfs(ms[i], ms[i+1]);
        }
        System.out.println(g.dist.get(ms[i]));
    }
}

// class Node {
//     int num, dist;
//     Node (int num) {
//         this.num = num;
//     }
// }

class Graph {
    int v;
    HashMap<Integer, HashSet<Integer>> adjlist;
    public HashMap<Integer, Integer> dist;
    Graph (int v) {
        this.v = v;
        adjlist = new HashMap<Integer, HashSet<Integer>>();
        dist = new HashMap<Integer, Integer>();
    }

    void addEdge (int src, int dest) {
        if (adjlist.get(src) == null) {
            adjlist.put(src, new HashSet<>());
        }
        if (adjlist.get(dest) == null) {
            adjlist.put(dest, new HashSet<>());
        }
        adjlist.get(src).add(dest);
        adjlist.get(dest).add(src);
    }

    HashSet<Integer> adjNodes (int src) {
        return adjlist.get(src);
    }

    void bfs (int src, int dest) {
        LinkedList queue = new LinkedList<Integer>();
        HashSet visited = new HashSet<Integer>();
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
                        System.out.println(dist.get(adjNode));
                        // System.out.println("src:"+src+" adjNode:"+adjNode+);
                    }
                }
            dist.put(src, dist.get(src)+1);
            }
        }
    }
}