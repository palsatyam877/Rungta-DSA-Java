package Lecz26;
import Lecz12.Trees;

import java.util.*;

// https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
// https://leetcode.com/problems/rotting-oranges/
// https://leetcode.com/problems/flood-fill/description/

public class Graphs {
    static class Pair implements Comparable<Pair> {
        Integer dis , node;

        Pair(Integer dis , Integer node) {
            this.dis = dis;
            this.node = node;

        }

        @Override
        public int compareTo(Pair that) {
            if(this.dis.compareTo(that.dis) == 0)
                return this.node.compareTo(that.node);

            return this.dis.compareTo(that.dis);
        }
    }


    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int N = 10;

        for(int i = 0; i <= N; ++i)
            adj.add(new ArrayList<Integer>());

        int [][] edges = {
                {1 , 3},
                {2 , 3},
                {2 , 4},
                {2 , 6},
                {1 , 2},
                {2 , 5},
                {4 , 10},
                {4 , 9},
                {4 , 6},
                {6 , 8},
                {6 , 7},
                {6 , 5},
                {9 , 10},
                {5 , 7},
                {7 , 8},
                {8 , 3},
        };

        // Construct

        for(int i = 0; i < edges.length; ++i) {
            int a = edges[i][0] , b = edges[i][1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        int ix = 0;

        for(ArrayList<Integer> connN : adj) {
            System.out.println(ix++ + " -> " + connN);
        }

        ArrayDeque<Pair> qu = new ArrayDeque<>();
        qu.offer(new Pair(0 , 1));

        int [] dis = new int[N + 1];

        for(int i = 0; i <= N; ++i)
            dis[i] = -1;

        while(qu.size() > 0) {
            Pair c = qu.poll();

            int currDis = c.dis , currNode = c.node;
            if(dis[currNode] != -1) continue;
            dis[currNode] = currDis;

            for(Integer nxt : adj.get(currNode)) {
                if(dis[nxt] == -1) {
                    qu.offer(new Pair(currDis + 1 , nxt));
                }
            }
        }

        for (int i = 1; i <= N; ++i)
            System.out.print(dis[i] + " ");
    }
}
