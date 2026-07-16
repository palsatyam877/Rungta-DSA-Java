package Lecz15;

// https://leetcode.com/problems/validate-binary-search-tree/
/*
class Solution {
    class Pair {
        Long first , second; Boolean third;

        Pair(Long mn , Long mx , Boolean f) {
            this.first = mn;
            this.second = mx;
            this.third = f;
        }
    }

    long mnn = -100000000000L , mxx = 100000000000L;

    public Pair dfs( TreeNode curr ) {

        Pair L = new Pair(mnn , mnn , true);
        Pair R = new Pair(mxx , mxx , true);

        if(curr.left != null)
            L = dfs(curr.left);

        if(curr.right != null)
            R = dfs(curr.right);



        boolean isBst = (curr.val > L.second) && (curr.val < R.first) && L.third && R.third;

        Long mx = Math.max( curr.val , curr.left != null ? L.second : mnn );
        mx = Math.max( mx , curr.right != null ? R.second : mnn );

        Long mn = Math.min( curr.val , curr.left != null ? L.first : mxx );
        mn = Math.min( mn , curr.right != null ? R.first : mxx );

        // System.out.println(curr.val + " : val");
        // System.out.println( mn + " " + mx + " " + isBst );

        return (new Pair( mn , mx , isBst ));
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root).third;
    }
}

*/

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
/*
class Solution {
    int ans = -100000001;
    public int dfs(TreeNode curr) {
        int currAns = curr.val;
        int Lmax = -100000001 , Rmax = -100000001;

        if(curr.left != null)
           Lmax = Math.max(Lmax , dfs(curr.left));

        if(curr.right != null)
           Rmax = Math.max(Rmax , dfs(curr.right));

         currAns = Math.max( currAns , Lmax + Rmax + curr.val );
         currAns = Math.max( currAns , Lmax + curr.val);
         currAns = Math.max( currAns , Rmax + curr.val);

         ans = Math.max(ans , currAns);

         return Math.max( curr.val , curr.val + Math.max(Math.max(0 , Lmax) , Math.max(0 , Rmax)));
    }

    public int maxPathSum(TreeNode root) {
        ans = -100000001;
        dfs(root);
        return ans;
    }
}
*/

// https://leetcode.com/problems/number-of-islands/

/*
class Solution {
    boolean [][] vis;
    int n = 0 , m = 0;

    public void dfs(int ix , int jx , char [][] grid) {
        vis[ix][jx] = true;
        int [][] dir = new int[4][2];
        dir[0][0] = 0; dir[0][1] = 1;
        dir[1][0] = 0; dir[1][1] = -1;

        dir[2][0] = 1; dir[2][1] = 0;
        dir[3][0] = -1; dir[3][1] = 0;

        for(int i = 0; i < dir.length; ++i) {
            int ixx = ix + dir[i][0]; int jxx = jx + dir[i][1];

            if(((ixx >= 0) && (ixx < n)) && ((jxx >= 0) && (jxx < m)) && (!vis[ixx][jxx]) && (grid[ixx][jxx] == '1'))
                 dfs(ixx , jxx , grid);

        }
    }

    public int numIslands(char[][] grid) {
        this.n = grid.length;
        this.m = grid[0].length;

        vis = new boolean[n][m];

        int ans = 0;

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
               vis[i][j] = false;

        for(int i = 0; i < n; ++i)
          for(int j = 0; j < m; ++j)
             if(!vis[i][j] && (grid[i][j] == '1')) {
                ans++;
                dfs(i , j , grid);
             }

        return ans;
    }
}

*/

                    /****************** Linked list *******************/

  // https://leetcode.com/problems/add-two-numbers/

public class TreesFinish {
    public static void main(String [] args) {
        System.out.println("Hello");
    }
}
