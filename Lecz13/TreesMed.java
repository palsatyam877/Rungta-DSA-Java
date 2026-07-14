package Lecz13;

// https://leetcode.com/problems/subtree-of-another-tree/
/*
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(((p == null) && (q != null)) || ((p != null) && (q == null)))
            return false;

        if((p == null) && (q == null) )
            return true;

        if(((p.left == null) && (q.left != null)) || ((p.left != null) && (q.left == null)))
            return false;

        if(((p.right == null) && (q.right != null)) || ((p.right != null) && (q.right == null)))
            return false;

        boolean ans = p.val == q.val;

        if(p.left != null)
            ans &= isSameTree(p.left , q.left);

        if(p.right != null)
            ans &= isSameTree(p.right , q.right);

        return ans;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean f = isSameTree(root , subRoot);

        if(f)
            return true;

        if(root.left != null)
            f |= isSubtree(root.left , subRoot); // f = f | isSubtree(root.left , subRoot);

        if(root.right != null)
            f |= isSubtree(root.right , subRoot);

        return f;
    }
}
*/

// https://leetcode.com/problems/binary-tree-level-order-traversal/
/*
class Solution {
    class Pair {
        TreeNode first ; Integer second;

        Pair(TreeNode first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            List<List<Integer>> a = new ArrayList<>();
            return a;
        }

        ArrayDeque<Pair> qu = new ArrayDeque<>();

        qu.offer(new Pair( root , 0 ));
        int currLevel = 0;
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> currD = new ArrayList<>();

        while(qu.size() > 0) {
            Pair curr = qu.poll();

            if(curr.second > currLevel) {
                ans.add(currD);
                currD = new ArrayList<>();

                currD.add(curr.first.val);
                currLevel = curr.second;
            } else {
                currD.add(curr.first.val);
            }

            if(curr.first.left != null)
                qu.offer(new Pair( curr.first.left , curr.second + 1 ));

            if(curr.first.right != null)
                qu.offer(new Pair( curr.first.right , curr.second + 1 ));
        }

        if(currD.size() > 0)
            ans.add(currD);

        return ans;

    }
}
*/

// https://leetcode.com/problems/binary-tree-right-side-view/

/*
class Solution {
    class Pair {
        TreeNode first;
        Integer second;

        Pair(TreeNode first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            List<Integer> a = new ArrayList<>();
            return a;
        }

        ArrayDeque<Pair> qu = new ArrayDeque<>();

        qu.offer(new Pair(root, 0));
        int currLevel = 0;
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> currD = new ArrayList<>();
        // ans.add(root.val);

        int prev = -1;

        while (qu.size() > 0) {
            Pair curr = qu.poll();

            if (curr.second > currLevel) {
                ans.add(prev);
                currD = new ArrayList<>();

                currD.add(curr.first.val);
                currLevel = curr.second;
            } else {
                currD.add(curr.first.val);
            }

            prev = curr.first.val;

            if (curr.first.left != null)
                qu.offer(new Pair(curr.first.left, curr.second + 1));

            if (curr.first.right != null)
                qu.offer(new Pair(curr.first.right, curr.second + 1));
        }

        if (currD.size() > 0)
            ans.add(prev);

        return ans;

    }
}
*/

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// https://leetcode.com/problems/validate-binary-search-tree/

import java.util.ArrayList;

public class TreesMed {

    public static void main(String [] args) {
        System.out.println("Hello Trwees");
        ArrayList<> a = new ArrayList();
    }
}
