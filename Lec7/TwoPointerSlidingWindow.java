package Lec7;

import javax.security.sasl.SaslClient;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


/******** WARMUP ********/

// https://leetcode.com/problems/max-consecutive-ones/

/*
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0 , n = nums.length , l = 0 , r = 0;

        for(int i = 0; i < n; ++i) {
            if(nums[i] == 0) {
                r++;
                l = r;
            } else {
                ans = Math.max(r - l + 1 , ans);
                r++;
            }
        }

        return ans;
    }
}

*/

// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

// https://leetcode.com/problems/k-diff-pairs-in-an-array/

/******* PRACTICE ********/

// https://leetcode.com/problems/maximum-subarray/

// https://leetcode.com/problems/sliding-window-maximum/

// https://leetcode.com/problems/sum-of-subarray-minimums/

// https://leetcode.com/problems/minimum-window-substring/

public class TwoPointerSlidingWindow {
    public static void main(String [] args) throws IOException {
        // Initialize Fast Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // Initialize Fast Output
        PrintWriter out = new PrintWriter(System.out);

        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }

        TreeMap<Integer , Integer> mp = new TreeMap<>();

        int n = Integer.parseInt(st.nextToken()) , k = Integer.parseInt(st.nextToken());
        int [] a =  new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; ++i)
            a[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < k; ++i)
            mp.put(a[i] , mp.containsKey(a[i]) ? mp.get(a[i]) + 1 : 1);

        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i <= k; ++i)
            ts.add(i);

        for(Map.Entry<Integer , Integer> c : mp.entrySet())
            ts.remove(c.getKey());

        int l = 0;

        out.print(ts.first() + " ");

        for(int i = k; i < n; ++i) {
            mp.put(a[l] , mp.get(a[l]) - 1);

            if(mp.get(a[l]) == 0)
                ts.add(a[l]);

//            if (mp.get(a[l]) == 1) {
//                mp.remove(a[l]);
//                ts.add(a[l]);
//            } else {
//                mp.put(a[l] , mp.get(a[l]) - 1);
//            }

            if(mp.containsKey(a[i]) && (mp.get(a[i]) > 0)) {
                mp.put(a[i] , mp.get(a[i]) + 1);
            } else {
                mp.put(a[i] , 1);
                ts.remove(a[i]);
            }

            out.print(ts.first() + " ");

            ++l;
        }

        out.flush();
    }
}
