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

// https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1

public class RoadToDp {
    public static void main(String [] args) {
    }
}
