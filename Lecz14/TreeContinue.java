package Lecz14;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

/*
class Solution {
    int ans = 0;

    public void dfs(TreeNode curr , int mx) {
        if(curr.val >= mx)
             ans++;

        if(curr.left != null)
            dfs(curr.left , Math.max(mx , curr.val));

        if(curr.right != null)
            dfs(curr.right , Math.max(mx , curr.val));
    }

    public int goodNodes(TreeNode root) {
          dfs(root , -10001);
          return ans;
    }
}

*/

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

/*
class Solution {
    int cnt = 0 , K = 0 , ans = 0;

    public void dfs(TreeNode curr) {

        if(curr.left != null)
            dfs(curr.left);

        ++cnt;
        if(cnt == K)
            ans = curr.val;

        if(curr.right != null)
            dfs(curr.right);
    }

    public int kthSmallest(TreeNode root, int k) {
         K = k;
         dfs(root);

         return ans;
    }
}

*/

// https://leetcode.com/problems/validate-binary-search-tree/
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// https://leetcode.com/problems/number-of-islands/

public class TreeContinue {
    public static void main(String [] args) {
    }
}
