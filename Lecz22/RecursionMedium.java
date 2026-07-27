package Lecz22;

// https://leetcode.com/problems/permutations/

/*
class Solution {
    public List<List<Integer>> f(int N) {
        if(N == 1) {
            List<List<Integer>> Ans = new ArrayList<>();
            Ans.add(new ArrayList<>(List.of(1)));

            return Ans;
        }

        List<List<Integer>> curr = f(N - 1);

        // Continue;

        int sz = curr.size();

        for(int i = 0; i < sz; ++i) {
             List<Integer> c = curr.get(i);
             c.add(N);

             List<Integer> prev = new ArrayList<>();
             prev = c;

            for(int j = c.size() - 1; j >= 1; --j) {
                ArrayList<Integer> c1 = new ArrayList<>();
                c1.addAll(prev);

                int a = c1.get(j) , b = c1.get(j - 1);
                c1.set(j - 1 , a);
                c1.set(j , b);

                prev = c1;

                curr.add(c1);
            }
        }

        return curr;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = f(nums.length);

        for(int i = 0; i < ans.size(); ++i) {
            for(int  j = 0; j < ans.get(i).size(); ++j) {
                ans.get(i).set(j , nums[ans.get(i).get(j) - 1]);
            }
        }

        return ans;
    }
}

*/

// https://leetcode.com/problems/finding-3-digit-even-numbers/
// https://leetcode.com/problems/merge-two-sorted-lists/
// https://leetcode.com/problems/longest-palindromic-substring/
// https://leetcode.com/problems/longest-common-subsequence/

import java.util.*;
public class RecursionMedium {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>(List.of(1 , 2 , 3));
        ArrayList<Integer> c1 = new ArrayList<>();
        c1.addAll(c);

        System.out.println(c1);
    }
}
