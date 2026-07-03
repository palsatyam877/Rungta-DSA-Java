package Lec5;
import java.util.*;

public class StackDataStructureContinue {

    // https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

    /*
    class Solution {
    public String reverse(String S) {
        // code here
        int n = S.length();

        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < n; ++i)
             stk.push(S.charAt(i));

        StringBuilder rev = new StringBuilder();

        while(!stk.isEmpty()) {
             rev.append(stk.peek());
             stk.pop();
        }

        return rev.toString();
    }
}

    */


    // https://leetcode.com/problems/largest-rectangle-in-histogram/

/*
class Solution {
    public int largestRectangleArea(int[] h) {
          // next Smaller El
          int n = h.length;
          int [] nxtSmE = new int[n];
          int [] prevSmE = new int[n];

          Stack<Integer> stk = new Stack<>();

          for(int i = 0; i < n; ++i) {
              nxtSmE[i] = n;
              while((stk.size() > 0) && (h[stk.peek()] >  h[i])) {
                 nxtSmE[stk.peek()] = i;
                 stk.pop();
              }

              stk.push(i);
          }

           while(stk.size() > 0)
               stk.pop();

          for(int i = n - 1; i >= 0; --i) {
             prevSmE[i] = -1;

              while((stk.size() > 0) && (h[stk.peek()] >  h[i])) {
                 prevSmE[stk.peek()] = i;
                 stk.pop();
              }

              stk.push(i);
          }

          int ans = 0;

          for(int i = 0; i < n; ++i) {
              ans = Math.max(ans , ((nxtSmE[i] - i) + (i - prevSmE[i]) - 1) * h[i]);
          }

          return ans;
    }
}

*/

    // https://leetcode.com/problems/trapping-rain-water/

    /******************** Sliding Windows && Two Pointers *****************************/

    // https://leetcode.com/problems/product-of-array-except-self/
    // https://leetcode.com/problems/maximum-subarray/
    // https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

    public static void main(String [] args) {
    }
}
