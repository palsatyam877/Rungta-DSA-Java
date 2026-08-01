package Lecz27;

// https://leetcode.com/problems/rotting-oranges/

/*
class Solution {
    class Pair {
        Integer time , i , j;

        Pair(Integer time , Integer i , Integer j) {
            this.time = time;
            this.i = i;
            this.j = j;
        }
    }

    public int orangesRotting(int[][] G) {
        ArrayDeque<Pair> qu = new ArrayDeque<>();
        int inf = 10000;

        int n = G.length;
        int m = G[0].length;
        int [][] vis = new int[n][m];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j) {
                if(G[i][j] == 2)
                   qu.offer(new Pair(0 , i , j));

                vis[i][j] =  10000;
            }

        int [][] dir = {{-1 , 0} , {1 , 0} , {0 , 1} , {0 , -1}};

        while(qu.size() > 0) {
            Pair curr = qu.poll();
            int t = curr.time , i = curr.i , j = curr.j;

            if(vis[i][j] != inf) continue;

            G[i][j] = 2;
            vis[i][j] = t;


            for(int p = 0; p < dir.length; ++p) {
                int ix = i + dir[p][0] , jx = j + dir[p][1];

                if(ix < 0 || jx < 0 || ix >= n || jx >= m)
                    continue;

                if(G[ix][jx] == 1)
                    qu.offer(new Pair(t + 1 , ix , jx));

            }
        }

        int ans = 0;

        // for(int i = 0; i < n; ++i) {
        //     for(int j = 0; j < m; ++j)
        //        System.out.print(vis[i][j] + " ");

        //     System.out.println();
        // }

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                if(G[i][j] == 1)
                   return -1;
                else if(G[i][j] == 2)
                   ans = Math.max(ans , vis[i][j]);

        return ans;
    }
}

 */

// https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1
// https://leetcode.com/problems/flood-fill/description/

public class GraphsContinue {
    public static void main(String [] args) {
        System.out.println("Hello World");
    }
}
