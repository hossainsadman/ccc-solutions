package ccc._18;

import java.util.*;
import java.io.*;

public class ccc18j5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*  so what i need to do is make a graph and find the shortest path and ensure that there isnt a vertex that cannot be reached from page 1 (so an is connected to function, which is probly just a recursive hasEdge function)
        */

        int n = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            int mi = Integer.parseInt(line[0]);
            if (mi > 0) {
                for (int j = 1; j < mi; j++) {
                    // add line[j] to graph
                }
            }
        }
    }
}

class Graph {
    HashMap<Integer, LinkedList<Integer>> adj_list;
    boolean directed;

    Graph(boolean directed) {
        this.directed = directed;
        adj_list = new HashMap<>();
    }

    void addEdgeHelper(int a, int b) {
        LinkedList tmp = adj_list.get(a);

        if (tmp != null) {
            tmp.remove(b);
        }
        else tmp = new LinkedList<>();

        tmp.add(b);
        adj_list.put(a, tmp);
    }

    void addEdge(int src, int dest) {
        if (!adj_list.keySet().contains(src))
            adj_list.put(src, null);
        if (!adj_list.keySet().contains(dest))
            adj_list.put(dest, null);

        addEdgeHelper(src, dest);
        if (!directed) {
            addEdgeHelper(dest, src);
        }
    }
}