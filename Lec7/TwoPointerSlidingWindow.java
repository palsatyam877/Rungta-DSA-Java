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

/*
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here

        int n = arr.length;

        ArrayDeque<Integer> qu = new ArrayDeque<>();

        for(int i = 0; i < k; ++i)
             if(arr[i] < 0)
                 qu.offer(arr[i]);

        int l = 0;

        List<Integer> ans = new ArrayList<>();

        if(qu.size() > 0)
          ans.add(qu.peek());
        else
           ans.add(0);


        for(int r = k; r < n; ++r) {
            if(arr[l] < 0)
                 qu.poll();

            if(arr[r] < 0)
                 qu.offer(arr[r]);

            if(qu.size() > 0)
                ans.add(qu.peek());
            else
               ans.add(0);

            ++l;
        }

        return ans;
    }
}

*/

// https://leetcode.com/problems/k-diff-pairs-in-an-array/

/*
class Solution {
    public int findPairs(int[] nums, int k) {
        int l = 0 , n = nums.length , ans = 0;
        Arrays.sort(nums);

        if(k == 0) {
            for(int r = 1; r < n; ++r) {
                if(nums[r] == nums[r - 1]) {
                    ++ans;

                    while((r < n) && (nums[r] == nums[r - 1]))
                       ++r;
                }
            }

            return ans;
        }

        for(int r = 0; r < n; ++r) {
            while(nums[r] - nums[l] > k)
                ++l;

            if(nums[r] - nums[l] == k) {
                ++ans;

                while((r + 1 < n) && (nums[r] == nums[r + 1]))
                    ++r;
            }
        }

        return ans;
    }
}
*/

/******* PRACTICE ********/

// https://leetcode.com/problems/maximum-subarray/

/*
class Solution {
    public int maxSubArray(int[] nums) {
        long pfsum = 0;
        int n = nums.length;
        long ans =  -10000000000L;

        if(n == 1)
           return nums[0];

        TreeSet<Long> ts = new TreeSet<>();

        for(int i = 0; i < n; ++i) {
            pfsum += nums[i];

            if((ts.size() > 0) && (ts.first() <= 0) ) {
                ans = Math.max(pfsum - ts.first() , ans);
            }

            ans = Math.max(ans , pfsum);

            ts.add(pfsum);
        }

        return (int)ans;
    }
}

*/

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
