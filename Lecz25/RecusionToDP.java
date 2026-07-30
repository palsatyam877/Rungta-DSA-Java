package Lecz25;

// https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1

/*
class Solution {
    public static int [][][][] t;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here

        t = new int[n + 1][3][3][3];
        int N = 3;

        for(int i = 0; i < N; ++i)
           for(int j = 0; j < N; ++j)
               for(int k = 0; k < N; ++k)
                  if(i != j && i != k && j != k)
                      t[1][i][j][k] = 1;


        int ans = 1;

        for(int p = 2; p <= n; ++p) {
            for(int i = 0; i < N; ++i)
               for(int j = 0; j < N; ++j)
                  for(int k = 0; k < N; ++k)
                      if(i != j && i != k && j != k) {
                           t[p][i][j][k] = t[p - 1][i][k][j] + 1 + t[p - 1][k][j][i];
                           ans = Math.max( t[p][i][j][k] , ans);
                      }

        }

        return ans;

    }
}


*/

// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

/*
class Solution {
    class Pair {
        Node first , second;

        Pair(Node first , Node second) {
            this.first = first;
            this.second = second;
        }
    }

    public Pair F(Node curr) {
        if(curr.next == null && curr.child == null) {
            return new Pair(curr , curr);
        }

        if(curr.child == null) {
            Pair c = F(curr.next);
            Node H = c.first;
            Node T = c.second;

            curr.next = H;
            H.prev = curr;

            curr.child = null;
            return new Pair(curr , T);
        } else if(curr.next == null){
            Pair c = F(curr.child);
            Node H = c.first;
            Node T = c.second;

            curr.next = H;
            H.prev = curr;
            T.next = null;

            curr.child = null;
            return new Pair(curr , T);
        } else {
            Pair c = F(curr.child);
            Node H = c.first;
            Node T = c.second;

            Node temp = curr.next;
            curr.next = H;
            H.prev = curr;

            T.next = temp;
            temp.prev = T;

            c = F(curr.next);
            H = c.first;
            T = c.second;

            curr.child = null;
            return new Pair(curr , T);
        }
    }

    public Node flatten(Node head) {
        if(head == null)
            return null;

        F(head);

        return head;
    }
}

*/

/*********** Graphs *************/

/*********** Adjacency List *****/

import java.util.*;

/*********** Adjacency Matrix ****/

//   https://leetcode.com/problems/find-if-path-exists-in-graph/
/*
class Solution {
    public boolean dfs(int node , int des , boolean [] vis , ArrayList<ArrayList<Integer>> adj) {
            boolean flag = node == des;
            vis[node] = true;

            for(Integer nxt : adj.get(node))
                if(!vis[nxt])
                    flag = flag | dfs(nxt , des , vis , adj);

            return flag;
    }

    public boolean validPath(int n, int[][] E, int src, int des) {
        boolean [] vis = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; ++i)
           adj.add(new ArrayList<>());

        for(int i = 0; i < E.length; ++i) {
            adj.get(E[i][0]).add(E[i][1]);
            adj.get(E[i][1]).add(E[i][0]);
        }

        return dfs(src , des , vis , adj);
    }
}
*/

//   https://leetcode.com/problems/is-graph-bipartite/

/*
class Solution {
    class Pair {
        Integer node , color;

        Pair(Integer node , Integer color) {
            this.node = node;
            this.color = color;
        }
    }

    public boolean isBipartite(int[][] graph) {
        ArrayDeque<Pair> qu = new ArrayDeque<>();

        int n = graph.length;

        int [] vis = new int[n + 1];

        for(int i = 0; i <= n; ++i)
            vis[i] = -1;


     for(int p = 0; p < n; ++p) {
        if(vis[p] != -1) continue;

        qu.offer(new Pair( p , 1 ));

        while(qu.size() > 0) {
            Pair curr = qu.poll();
            int node = curr.node , color = curr.color;

            vis[node] = color;

            for(int i = 0; i < graph[node].length; ++i) {
                if(vis[graph[node][i]] != -1) {
                    if(vis[graph[node][i]] == color)
                       return false;
                    continue;
                }

                if(color == 0)
                   qu.offer(new Pair(graph[node][i] , 1));
                else
                   qu.offer(new Pair(graph[node][i] , 0));
            }
        }
     }

        return true;
    }
}

*/


public class RecusionToDP {
     public static void main(String [] args) {
         ArrayList<ArrayList<Integer>> input = new ArrayList<>();

         input.add(new ArrayList<>(List.of(0 , 4)));
         input.add(new ArrayList<>(List.of(0 , 1)));
         input.add(new ArrayList<>(List.of(1 , 4)));
         input.add(new ArrayList<>(List.of(1 , 3)));
         input.add(new ArrayList<>(List.of(1 , 2)));
         input.add(new ArrayList<>(List.of(2 , 3)));
         input.add(new ArrayList<>(List.of(4 , 3)));

         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

         int node = 4;

         for(int i = 0; i <= node; ++i)
               adj.add(new ArrayList<>());

         for(int i = 0; i < input.size(); ++i) {
             int x = input.get(i).get(0) , y = input.get(i).get(1);

             adj.get(x).add(y);
             adj.get(y).add(x);
         }

         int ix = 0;

         for(ArrayList<Integer> c : adj) {
             System.out.print(ix++ + " -> ");
             for (Integer y : c)
                 System.out.print(y + " ");
             System.out.println();
         }

         int [][] mat = new int[node + 1][node + 1];

         for(int i = 0; i < input.size(); ++i)
             mat[input.get(i).get(0)][input.get(i).get(1)] = mat[input.get(i).get(1)][input.get(i).get(0)] = 1;

         System.out.println("------------------------------------------\n\n");
         for(int i = 0; i <= node; ++i) {
             for (int j = 0; j <= node; ++j)
                 System.out.print(mat[i][j] + " ");
             System.out.println();
         }
     }
}
