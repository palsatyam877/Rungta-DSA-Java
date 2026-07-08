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

/*
class Solution {
    public String minWindow(String s, String t) {
        int n = s.length() , m = t.length();

        int [][] freq = new int[n + 1][70];

        for(int i = 0; i < n; ++i) {
            freq[i + 1][s.charAt(i) - 'A']++;

            for(int j = 0; j < 70; ++j)
                freq[i + 1][j] += freq[i][j];
        }

        int [] tar = new int [70];

        for(int i = 0; i < m; ++i)
            tar[t.charAt(i) - 'A']++;

        int val = 1000000 , ix = -1 , jx = -1;

        for(int i = 1; i <= n; ++i) {
            int lo = 1 , hi = i;

            while(lo <= hi) {
                int mid = (lo + hi) / 2;

                int [] t1 = new int [70];

                boolean isT = true;

                for(int j = 0; j < 70; ++j) {
                    t1[j] = freq[i][j] - freq[mid - 1][j];

                    if(t1[j] < tar[j])
                       isT = false;
                }

                if(isT) {
                    lo = mid + 1;

                  if(i - mid + 1 < val)  {
                    val = i - mid + 1;
                    ix = mid - 1;
                    jx = i - 1;
                  }
                } else {
                    hi = mid - 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        if(ix == -1) {
            String a = "";
            return a;
        } else {
            for(int i = ix; i <= jx; ++i)
                ans.append(s.charAt(i));

            return ans.toString();
        }
    }
}

*/

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

        int [][] pfsum = new int [n + 1][n + 1];

        for(int i = 1; i <= n; ++i)
            for(int j = 1;j <= n; ++j) {
                int cSum = mat[i - 1][j - 1] == '*' ? 1 : 0;
                pfsum[i][j] = pfsum[i - 1][j] + pfsum[i][j - 1] - pfsum[i - 1][j - 1] + cSum;
            }

        System.out.println("_____________________");

        for(int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                bw.write(String.valueOf(pfsum[i][j]));
                bw.write(String.valueOf(" "));
            }
            bw.newLine();
        }

        System.out.println(pfsum[3][4]);
        System.out.println(pfsum[1][2]);
        System.out.println(pfsum[2][1]);

        for(int i = 0; i < query.length; ++i) {
            int ans = 0;

            // write logic

            int i1 = query[i][0];
            int j1 = query[i][1];
            int i2 = query[i][2];
            int j2 = query[i][3];

            System.out.println(i1  +  " " + j1 + " " + i2 + " " + j2 );



            ans = pfsum[i2][j2] - pfsum[i1 - 1][j1] - pfsum[i2][j2 - 1] + pfsum[i1 - 1][j1 - 1];

            bw.write(String.valueOf(ans));
            bw.newLine();
        }

        bw.flush();
    }
}
