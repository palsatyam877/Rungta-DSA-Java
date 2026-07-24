package Lecz20;

public class MyClass {

//    public static int f(int n , int [] arr) {
//        if(n == 0)
//            return arr[n];
//        return f(n - 1 , arr) + arr[n];
//    }

    static int cnt = 0;

    public static int f(int [] arr , int start , int end) {
        if(start == end)
             return arr[start];

        int mid = (start + end) / 2;
        return f(arr , start , mid) + f(arr , mid + 1, end);
    }

    static int [] memo;

    public static int fib(int n) {
       if(n <= 1)
           return n;

       if(memo[n] != -1)
             return memo[n];
       ++cnt;

       return memo[n] = fib(n - 1) + fib(n - 2);
    }

    // https://leetcode.com/problems/fibonacci-number/?envType=problem-list-v2&envId=recursion

    /*
    class Solution {
      int [] memo = new int[31];

      public int fib(int n) {
         if(n <= 1)
           return n;

         if(memo[n] != 0)
             return memo[n];

         return memo[n] = fib(n - 1) + fib(n - 2);
      }
    }
    */

    // https://leetcode.com/problems/power-of-two/
    /*
    class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
           return false;

        if(n == 1)
           return true;

        if(n % 2 == 0)
           return isPowerOfTwo(n / 2);
        else
           return false;
    }
}
    */


    public static void main(String [] args) {
        int sum = 0;
        int [] arr = {4 , 9 , 12 , 8 , 7 , 3 , 4};

        memo = new int[35];

        for(int i = 0; i <= 34; ++i)
               memo[i] = -1;

//        for(int i = 0; i < arr.length; ++i)
//              sum += arr[i];
//
//        System.out.println(sum);
//         int n = arr.length;

//         System.out.println(f(arr , 0 , n - 1));
//         System.out.println(fib(15));
//         System.out.println(cnt + " : cnt");

           int n = 13;

           for(int i = 30; i >= 0; --i) {
               if((n & (1 << i)) > 0) {
                   System.out.print("1");
               } else {
                   System.out.print("0");
               }
           }

           System.out.println();

           n = n << 3;

        for(int i = 30; i >= 0; --i) {
            if((n & (1 << i)) > 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }

//           System.out.println(x);
    }
}
