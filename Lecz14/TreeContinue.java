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

// https://leetcode.com/problems/add-two-numbers/

// Linked List
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class TreeContinue {
    public static void main(String [] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(9);
        Node n3 = new Node(-10);
        Node n4 = new Node(-12);
        Node n5 = new Node(-15);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node curr = n1;

        while(curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
