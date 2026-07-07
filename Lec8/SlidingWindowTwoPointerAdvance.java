package Lec8;

import java.util.*;

/********** WARMUP *****************/
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/    // O(N^2)

/********** PRACTICE **************/

// https://leetcode.com/problems/sum-of-subarray-minimums/

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/   // O(N)

/*
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int odd = 0 , even = 0 , pfsum = 0 , cntO = 0 , cntE = 0;

        for(int i = 0; i < n; ++i) {
            pfsum += arr[i];

            if((i % 2) != 0) {
                even += pfsum;
                cntE++;
            } else {
                odd += pfsum;
                cntO++;
            }
        }

        int cO = (n % 2) != 0 ? (n / 2) + 1 : (n / 2) , cE = n / 2;
        int ans = 0;

        for(int i = 0; i < n; ++i) {
            if(i % 2 == 0)
                ans += odd;
            else
                ans += even;

            odd -=(cO * arr[i]);
            even -= (cE * arr[i]);

            if(i % 2 == 0) cO--;
            else cE--;
        }

        return ans;
    }
}

*/

// https://leetcode.com/problems/sliding-window-maximum/

// https://leetcode.com/problems/minimum-window-substring/

// https://www.geeksforgeeks.org/problems/decode-the-string2444/1

// https://leetcode.com/problems/sliding-window-median/

public class SlidingWindowTwoPointerAdvance {

    public static void main(String [] args) {
        System.out.println("Lec 8");
    }
}
