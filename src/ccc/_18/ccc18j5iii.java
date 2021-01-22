package ccc._18;

import java.util.*;
import java.io.*;

/*
    Ok, that's it. I give up. Dealing with Java is just too freaking painful. I have to use python or c++ because i can't even learn how to implement algorithms in java. From now on, I'm using python. I'll start from the basics, including going through all the basic data structures and sorting algorithms that i'm going to lose from the standard java libraries. i just can't waste so much time writing boilerplate instead of learning.
*/

public class ccc18j5iii {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        Graph3 g = new Graph3(n);

        for (int i = 1; i <= n; i++) {
            String[] line = r.readLine().split(" ");
            int mi = Integer.parseInt(line[0]);

            if (mi > 0) {
                for (int j = 1; j <= mi; j++) {
                    // g.addEdge(, dest);
                }
            }
        }
    }
}

class Node2 {
    int id, dist;
    Node2 (int id) {
        this.id = id;
    }
}

// class Tuple {
//     Node2 x, y;
//     Tuple (int x, int y) {
//         this.x = new Node2(x);
//         this.y = new Node2(y);
//     }
// }

class Graph3 {
    int v;
    HashMap<Node2, LinkedList<Node2>> adjlist;
    HashSet<Node2> nodes;

    Graph3 (int v) {
        this.v = v;
        adjlist = new HashMap<Node2, LinkedList<Node2>>();
        nodes = new HashSet<Node2>();
    }

    void addEdge (Node2 src, Node2 dest) {
        if (adjlist.get(src) == null) {
            adjlist.put(src, new LinkedList<Node2>());
        }
        // adjlist.put(src, adjlist.get(src).add(dest));
        adjlist.get(src).add(dest);
        dest.dist = 10001;

        // if (!nodes.contains(src)) {
        //     nodes.add(src);
        // }
        // if (!nodes.contains(dest)) {
        //     nodes.add(dest);
        // }
    }

    LinkedList<Node2> adjNode2s(Node2 src) {
        if (adjlist.get(src) == null) {
            return new LinkedList<Node2>();
        }
        return adjlist.get(src);
    }

    void dijkstra(Node2 src) {
        Comparator<Node2> lowest = new Comparator<Node2>(){
            @Override
            public int compare(Node2 n1, Node2 n2) {
                return n1.dist - n2.dist;
            }
        };
        PriorityQueue<Node2> q = new PriorityQueue<Node2>(lowest);
        src.dist = 0;
        q.add(src);
        while (!q.isEmpty()) {
            Node2 cur = q.poll();

            if (!nodes.contains(cur)) {
                nodes.add(cur);
            }

            cur.dist = Math.min(cur.dist, src.dist + 1);
            for (Node2 adjNode : adjNode2s(cur)) {
                q.add(adjNode);
            }
            src = cur;
        }

        int shortest = 10001;
        String reachable = "Y";
        for (Node2 n : nodes) {
            if (n.id == 1) {
                continue;
            }
            if (n.dist < shortest) {
                shortest = n.dist;
            }
            if (n.dist == 10001) {
                reachable = "N";
            }
        }

        System.out.println(shortest);
        System.out.println(reachable);
    }
}