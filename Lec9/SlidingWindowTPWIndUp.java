package Lec9;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// https://leetcode.com/problems/sliding-window-maximum/description/

// https://leetcode.com/problems/minimum-window-substring/

// https://cses.fi/problemset/task/1652

// https://leetcode.com/problems/sliding-window-median/

public class SlidingWindowTPWIndUp {

    public static void main(String [] args) throws IOException {
        // Create BufferedReader to read input efficiently
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));

        // Read the first line and split it into tokens
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());

        char[][] mat = new char[n][n];

        for (int i = 0; i < n; ++i)
            mat[i] = br.readLine().trim().toCharArray();

        int [][] query = new int[q][4];

        for (int i = 0; i < q; ++i) {
            st = new StringTokenizer(br.readLine());
            query[i][0] = Integer.parseInt(st.nextToken());
            query[i][1] = Integer.parseInt(st.nextToken());
            query[i][2] = Integer.parseInt(st.nextToken());
            query[i][3] = Integer.parseInt((st.nextToken()));
        }

        // write logic

        for(int i = 0; i < query.length; ++i) {
            int ans = 0;

            // write logic

            bw.write(String.valueOf(ans));
            bw.newLine();
        }

        bw.flush();
    }
}
