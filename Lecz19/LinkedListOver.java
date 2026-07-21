package Lecz19;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/

import java.util.Stack;

/******************** Recursion *************************/

// https://leetcode.com/problems/fibonacci-number/?envType=problem-list-v2&envId=recursion
/*
class Solution {
    int [] memo;

    public int f(int n) {
        if(n <= 1)
           return n;

        if(memo[n] != 0)
           return memo[n];

        return memo[n] = f(n -1 ) + f(n - 2);
    }

    public int fib(int n) {
        memo = new int[n + 1];
        return f(n);
    }
}
*/

// https://leetcode.com/problems/power-of-two/

/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        int cnt = 0;

        for(int bit = 0; bit <= 30; ++bit) {
            if((n & (1 << bit)) != 0)
               ++cnt;
        }

        return cnt == 1;
    }
}
*/

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
// https://www.geeksforgeeks.org/problems/reverse-a-stack/1

public class LinkedListOver {
//    public static int subArraySum(int [] arr , int l , int r) {
//        if(l > r)
//             return 0;
//
//        if(l == r)
//            return arr[l];
//
//        int mid = (l + r) / 2;
//        int a  = subArraySum(arr , l , mid); int b = subArraySum(arr , mid + 1 , r);
//        System.out.println("a -> " + a + " " + l + " " + mid + " b -> " + b + " " + mid + 1 + " " + r);
//
//        return a + b;
//    }

    static int cnt = 0;

    static int [] memo;

    public static int f(int n) {
        if(memo[n] != -1)
            return memo[n];

        System.out.println(n + " : fib");
         ++cnt;
         if(n <= 1) return n;
         return memo[n] = f(n - 1) + f(n - 2);
    }

    public static void main(String [] args) {
        memo = new int[9];

        for(int i = 0; i <= 8; ++i)
             memo[i] = -1;

//        StringBuilder sb = new StringBuilder();
//        Stack<Integer> stk = new Stack<>();
        /*
         int ans = 0;

          for(int i = 1; i <= 8; ++i)
              for(int j = 1; j <= 8; ++j)
                      if(10 - (i + j) >= 1)
                            ans++;

         System.out.println(ans);
         */

//        int ans = 0;
//
//        for(int i = 1; i <= 10; ++i)
//             for(int j = i + 1; j <= 10; ++j)
//                  ++ans;
//
//        System.out.println(ans);

//         int [] arr = {4,5,6,8,7,2,4,3,2};

//        System.out.println(subArraySum(arr , 0 , arr.length - 1));
//        System.out.println(f(6));
//        System.out.println(cnt);

        System.out.println(1 << 5);
    }
}
