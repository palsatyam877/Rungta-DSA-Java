package Lecz12;

import java.util.ArrayDeque;

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

    public static void main(String [] args) {
          Int x = new Int(10);
          System.out.println(x.x);

          Int x1 = new Int(2);
          Int x2 = null;

        System.out.println(x1 == x2);

          System.out.println(x);
          f(x);
          System.out.println(x);

        ArrayDeque<Integer> qu = new ArrayDeque<>();
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

            // Write Code here

            bw.write(String.valueOf(ans));
            bw.newLine();
        }

        bw.flush();
    }
}

*/

