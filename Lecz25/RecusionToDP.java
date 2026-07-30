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

/*********** Adjacency Matrix ****/

//   https://leetcode.com/problems/find-if-path-exists-in-graph/
//   https://leetcode.com/problems/is-graph-bipartite/

public class RecusionToDP {
     public static void main(String [] args) {
         System.out.println("Jai Maa Kaali");
     }
}
