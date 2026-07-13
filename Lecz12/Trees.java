package Lecz12;

import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Trees {

    public static class Int {
        int x;

        Int(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "{ " + this.x + " }";
        }
    }

    public static void f(Int x) {
         x.x = 20;
    }

    public static class TreeNode {
         int val;
         ArrayList<TreeNode> children;

         TreeNode(int val) {
             children = new ArrayList<>();
             this.val = val;
         }
    }

    public static void main(String [] args) {
//          Int x = new Int(10);
//          System.out.println(x.x);
//
//          Int x1 = new Int(2);
//          Int x2 = null;
//
//        System.out.println(x1 == x2);
//
//          System.out.println(x);
//          f(x);
//          System.out.println(x);
//
//        ArrayDeque<Integer> qu = new ArrayDeque<>();

          TreeNode root = new TreeNode(1);
          root.children.add(new TreeNode(4));
          root.children.add(new TreeNode(3));
          root.children.add(new TreeNode(2));

          TreeNode curr3 =  root.children.get(1);

          curr3.children.add(new TreeNode(5));
          curr3.children.add(new TreeNode(6));
          curr3.children.add(new TreeNode(7));
          curr3.children.add(new TreeNode(8));

          TreeNode curr8 = curr3.children.get(3);

          curr8.children.add(new TreeNode(11));
          curr8.children.add(new TreeNode(10));
          curr8.children.add(new TreeNode(9));

          ArrayDeque<TreeNode> qu = new ArrayDeque<>();
          qu.offer(root);

          while(qu.size() > 0) {
              TreeNode c = qu.poll();
              System.out.print(c.val + " ");

              for(int i = 0; i < c.children.size(); ++i)
                  qu.offer(c.children.get(i));
          }

    }
}

// https://codeforces.com/problemset/problem/1873/E

                            /***********Trees***********/

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
// https://leetcode.com/problems/diameter-of-binary-tree/
// https://leetcode.com/problems/balanced-binary-tree/submissions/
// https://leetcode.com/problems/same-tree/
// https://leetcode.com/problems/subtree-of-another-tree/
// https://leetcode.com/problems/binary-tree-level-order-traversal/

                   /************ E. Building an Aquarium ****************/

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Trees {
    public static void main(String [] args) throws IOException {
        // Create BufferedReader to read input efficiently
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));

        // Read the first line and split it into tokens
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(st.nextToken());

        for(int i = 0; i < t; ++i) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int [] a = new int[n];

            for(int j = 0; j < n; ++j)
                a[j] = Integer.parseInt(st.nextToken());

            long ans = 0;
            // BS on Height;

            long lo = 0 , hi = 2 * 1000000000;

            while(lo <= hi) {
                long mid = (lo + hi) / 2;
                long req = 0;

                for (int j = 0; j < n; ++j) {
                    if (a[j] > mid) {
                        //
                    } else {
                        req += (mid - a[j]);
                    }
                }

                if (req > x) {
                    hi = mid - 1;
                } else {
                    ans = mid;
                    lo = mid + 1;
                }
            }

            bw.write(String.valueOf(ans));
            bw.newLine();
        }

        bw.flush();
    }
}

*/
