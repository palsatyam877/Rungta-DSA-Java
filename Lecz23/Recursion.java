package Lecz23;
// https://leetcode.com/problems/finding-3-digit-even-numbers/

// Iterative
/*
class Solution {
    public int[] findEvenNumbers(int[] a) {
       int n = a.length;
       TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                for(int k = 0; k < n; ++k)
                    if((i != j) && (i != k) && (j != k) && (a[i] != 0) && (a[k] % 2 == 0))
                        ts.add(a[i] * 100 + a[j] * 10 + a[k]);

        int [] ans = new int[ts.size()];
        int ix = 0;

        for(Integer x : ts)
           ans[ix++] = x;

        return ans;

    }
}
*/

// Recursion

/*
class Solution {
    TreeSet<Integer> ts;
    int n;

    public void F(int i , int j , int k , int [] a) {
        if(j == -1) {
            for(int p = 0; p < n; ++p)
              if(i != p)
                F(i , p , -1 , a);
        } else {
             for(int p = 0; p < n; ++p)
                if(i != p && j != p) {
                    int val = a[i] * 100 + a[j] * 10 + a[p];

                    if(val % 2 == 0)
                        ts.add(a[i] * 100 + a[j] * 10 + a[p]);
                }
        }
    }

    public int[] findEvenNumbers(int[] a) {
       n = a.length;
       ts = new TreeSet<>();

        for(int i = 0; i < n; ++i)
            if(a[i] != 0)
               F(i , -1 , -1 , a);

        int [] ans = new int[ts.size()];
        int ix = 0;

        for(Integer x : ts)
           ans[ix++] = x;

        return ans;
    }
}

*/

// https://leetcode.com/problems/merge-two-sorted-lists/
// https://leetcode.com/problems/longest-palindromic-substring/
// https://leetcode.com/problems/longest-common-subsequence/

public class Recursion {
    public static void main(String [] args) {
        System.out.println("Hello World");
    }
}
