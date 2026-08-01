package Lecz26;
import Lecz12.Trees;

import java.util.*;

// https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

/*
class Solution {
    class Pair implements Comparable<Pair>{
        Integer wt , node;

        Pair(Integer wt , Integer node) {
            this.wt = wt;
            this.node = node;
        }

        @Override
        public int compareTo(Pair that) {
            if(this.wt.compareTo(that.wt) == 0)
                return this.node.compareTo(that.node);

            return this.wt.compareTo(that.wt);
        }
    }

    public int[] dijkstra(int V, int[][] E, int src) {
        // code here
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < V; ++i)
            adj.add(new ArrayList<Pair>());


        for(int i = 0; i < E.length; ++i) {
            int a = E[i][0] , b = E[i][1] , wt = E[i][2];

            adj.get(a).add(new Pair(wt , b));
            adj.get(b).add(new Pair(wt , a));
        }

        TreeSet<Pair> ms = new TreeSet<>();
        ms.add(new Pair(0 , src));

        int [] dis = new int [V];

        for(int i = 0; i < V; ++i)
            dis[i] = -1;

        while(ms.size() > 0) {
            Pair curr = ms.pollFirst();

            int wt = curr.wt , node = curr.node;

            if(dis[node] != -1)
              continue;

            dis[node] = wt;

            for(Pair Nxt : adj.get(node)) {
                int wt1 = Nxt.wt , nxtNode = Nxt.node;

                if(dis[nxtNode] != -1) continue;

                ms.add(new Pair( wt + wt1 , nxtNode));
            }
        }

        return dis;
    }
}

*/

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
