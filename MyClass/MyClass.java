package MyClass;

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
    // https://leetcode.com/problems/power-of-two/
    // https://www.geeksforgeeks.org/problems/reverse-a-stack/1

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
         int n = arr.length;

//         System.out.println(f(arr , 0 , n - 1));
         System.out.println(fib(15));
         System.out.println(cnt + " : cnt");
    }
}
