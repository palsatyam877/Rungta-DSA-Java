package Lec8;

import java.util.*;

/********** WARMUP *****************/
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/    // O(N^2)

/*
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for(int left = 0; left < n; ++left) {
            int currSum = 0;

            for(int right = left; right < n; ++right) {
                currSum  += arr[right];

                if((right - left + 1) % 2 != 0)
                    ans += currSum;
            }
        }

        return ans;
    }
}
 */

/********** PRACTICE **************/

// https://leetcode.com/problems/sum-of-subarray-minimums/

/*
class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;

        int [] nse = new int[n];

        for(int i = 0; i < n; ++i) {
            nse[i] = n;

            while((stk.size() > 0) && (arr[stk.peek()] > arr[i])) {
                nse[stk.peek()] = i;
                stk.pop();
            }

            stk.push(i);
        }

        for(int i = 0; i < n; ++i)
          System.out.print(nse[i] + " ");

        long [] ans = new long[n + 1];
        long mod = 1000000007;
        long Ans = 0;

        for(int i = n - 1; i >= 0; --i) {
            int inx = nse[i];
            ans[i] = ans[inx];

            ans[i] += (((inx - i) * arr[i]) % mod);
            ans[i] %= mod;

            Ans += ans[i]; Ans %= mod;
        }

        return (int)Ans;
    }
}

*/

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

// https://leetcode.com/problems/sliding-window-median/

// https://www.geeksforgeeks.org/problems/decode-the-string2444/1

public class SlidingWindowTwoPointerAdvance {

    public static void main(String [] args) {
        System.out.println("Lec 8");
    }
}
