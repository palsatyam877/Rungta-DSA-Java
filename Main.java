import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         // https://leetcode.com/problems/spiral-matrix/
        // https://leetcode.com/problems/spiral-matrix-ii/description/

       /*

   class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length; int m = mat[0].length;
        int [][] vis = new int[n][m];
        int i = 0 , j = 0 , k = 0;
        int [][] dir = {{0 , 1} , {1 , 0} , {0 , -1} , {-1 , 0}};

        ArrayList<Integer> ans = new ArrayList<>();

        while(true) {
            vis[i][j] = 1;
            ans.add(mat[i][j]);

            int ix = i , jx = j;
            ix += dir[k][0]; jx += dir[k][1]; // next coordn

            if(ix >= n || jx >= m || ix < 0 || jx < 0 || (vis[ix][jx] == 1)) {
                ix = i; jx = j;
                k = (k + 1) % 4;

                ix += dir[k][0]; jx += dir[k][1];

                if(ix >= n || jx >= m || ix < 0 || jx < 0 || (vis[ix][jx] == 1))
                   break;
            }

            i = ix; j = jx;
        }

        return ans;
    }
}
       */

    }

}
