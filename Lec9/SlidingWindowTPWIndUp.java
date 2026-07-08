package Lec9;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// https://leetcode.com/problems/sliding-window-maximum/description/

/*
class Solution {
    class Pair implements Comparable<Pair> {
        Integer first , second;

        Pair(Integer first , Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair that) {
            if(that.first.compareTo(this.first) == 0)
                return this.second.compareTo(that.second);

            return that.first.compareTo(this.first);
        }
    }

    public int[] maxSlidingWindow(int[] arr, int k) {
        TreeSet<Pair> ts = new TreeSet<>();
        int n = arr.length;

        int [] ans = new int[n - k + 1];

        for(int i = 0; i < k; ++i)
            ts.add(new Pair( arr[i] , i ));

        int l = 0;
        ans[l] = ts.first().first;

        for(int i = k; i < n; ++i) {
            ts.remove(new Pair(arr[l] , l));
            ts.add(new Pair(arr[i] , i));

            ++l;
            ans[l] = ts.first().first;
        }

        return ans;
    }
}

*/

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
