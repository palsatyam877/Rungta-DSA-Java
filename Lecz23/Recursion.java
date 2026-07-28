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

// Forwaerd
/*
class Solution {
    public void F(ListNode ls1 , ListNode ls2 , ListNode ans) {
        if((ls1 == null) && (ls2 == null)) {
            ans.next = null;
            return;
        } else if(ls1 == null) {
            ans.next = ls2;
            ans = ans.next;
            F(ls1 , ls2.next , ans);
            //
        } else if(ls2 == null) {
            ans.next = ls1;
            ans = ans.next;
            F(ls1.next , ls2 , ans);
            //
        } else {
            if(ls1.val <= ls2.val ) {
                ans.next = ls1;
                ans = ans.next;
                F(ls1.next , ls2 , ans);
            } else {
                ans.next = ls2;
                ans = ans.next;
                F(ls1 , ls2.next , ans);
            }
        }
    }

    public ListNode mergeTwoLists(ListNode ls1, ListNode ls2) {
        if(ls1 == null)
            return ls2;

        if(ls2 == null)
            return ls1;

        ListNode ans = null;

        if(ls1.val <= ls2.val) {
            ans = ls1;
            F(ls1.next , ls2 , ans);
        } else {
            ans = ls2;
            F(ls1 , ls2.next , ans);
        }

        return ans;
    }
}
*/

// Backward Order
/*
class Solution {
    public ListNode F(ListNode ls1 , ListNode ls2) {
        if((ls1 == null) && (ls2 == null)) {
            return null;
        } else if(ls1 == null) {
            ls2.next = F(ls1 , ls2.next);
            return ls2;
        } else if(ls2 == null) {
            ls1.next = F(ls1.next , ls2);
            return ls1;
        } else {
            if(ls1.val <= ls2.val ) {
                ls1.next =  F(ls1.next , ls2);
                return ls1;
            } else {
                ls2.next = F(ls1 , ls2.next);
                return ls2;
            }
        }
    }

    public ListNode mergeTwoLists(ListNode ls1, ListNode ls2) {
        if(ls1 == null)
            return ls2;

        if(ls2 == null)
            return ls1;

        if(ls1.val <= ls2.val) {
            ls1.next = F(ls1.next , ls2);
            return ls1;
        } else {
            ls2.next = F(ls1 , ls2.next );
            return ls2;
        }
    }
}

*/



// https://leetcode.com/problems/longest-palindromic-substring/
// https://leetcode.com/problems/longest-common-subsequence/

public class Recursion {
    public static void main(String [] args) {
        System.out.println("Hello World");
    }
}
