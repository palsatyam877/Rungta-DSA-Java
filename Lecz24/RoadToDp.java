package Lecz24;

/** Recursive Part is Remaining **/
// https://leetcode.com/problems/longest-common-subsequence/
/*
class Solution {

    int [][] dp;
    public int f(int i , int j , String t1 , String t2) {
            if(i < 0 || j < 0)
                return 0;

            if(dp[i][j] != -1)
                 return dp[i][j];
            if(t1.charAt(i) == t2.charAt(j))
                return dp[i][j] =  1 + f(i - 1 , j - 1 , t1 , t2);
            else
                return dp[i][j] = Math.max(f(i - 1 , j , t1 , t2) , f(i , j - 1 , t1 , t2));
    }

    public int longestCommonSubsequence(String t1, String t2) {
        dp = new int[t1.length() + 1][t2.length() + 1];

        for(int i = 0; i <= t1.length(); ++i)
           for(int j = 0; j <= t2.length(); ++j)
               dp[i][j] = -1;

        return f(t1.length() - 1 , t2.length() - 1 , t1 , t2);
    }
}
*/

// https://leetcode.com/problems/longest-palindromic-substring/

// Recursive
/*
class Solution {
    public boolean f(int i , int j , String s) {
            if(j - i + 1 <= 2)
                return s.charAt(i) == s.charAt(j);

            if(s.charAt(i) == s.charAt(j))
              return f(i + 1 , j - 1 , s);
            else
              return false;
    }

    public String longestPalindrome(String s) {
        int n = s.length();

        StringBuilder ans = new StringBuilder("");

        for(int len = n; len >= 1; --len) {
            for(int i = 0; i + len - 1 < n; ++i) {
                if(f(i , i + len  - 1 , s)) {
                    for(int k = i; k <= i + len - 1; ++k)
                        ans.append(s.charAt(k));

                     return ans.toString();
                }
            }
        }

        return "";
    }
}
*/

// Itrations
/*
class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();

        boolean [][] dp = new boolean[n + 1][n + 1];

        for(int i = 0; i <= n; ++i) {
            dp[i][i] = true;

            if(i + 1 < n)
                if(s.charAt(i) == s.charAt(i + 1))
                    dp[i][i + 1] = true;

        }

        for(int len = 3; len <= n; ++len) {
            for(int i = 0; i + len - 1 < n; ++i) {
                int l = i , r = i + len - 1;

                if(s.charAt(i) == s.charAt(r))
                    dp[l][r] = dp[l + 1][r - 1];
            }
        }

        StringBuilder ans = new StringBuilder("");

        for(int len = n; len >= 1; --len) {
            for(int j = 0; j + len - 1 < n; ++j) {
                int l = j , r = j + len - 1;

                if(dp[j][j + len - 1]) {
                    if(ans.length() < len) {
                        for(int k = l; k <= r; ++k)
                           ans.append(s.charAt(k));
                    }
                }
            }
        }

        return ans.toString();
    }
}
*/


// https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1


/*
class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n == 1)
           return 1;

        return towerOfHanoi(n - 1 , from , aux , to) + 1 + towerOfHanoi(n - 1 , aux , to , from);
    }
}
*/

public class RoadToDp {
    public static void main(String [] args) {
    }
}
