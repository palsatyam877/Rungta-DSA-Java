package Lec4;
import Lec1.Heaps;

import java.util.*;

// .ceiling() --> TreeSet , .ceilingKey() --> TreeMap
// just smaller element using above ?

// https://leetcode.com/problems/merge-similar-items/
// https://leetcode.com/problems/find-right-interval/

/*
class Solution {
    public int[] findRightInterval(int[][] intv) {
        int [] ans = new int[intv.length];

        for(int i = 0; i < intv.length; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            int mn = 1000001;
            ans[i] = -1;

            for(int j = 0; j < intv.length; ++j) {
                int start1 = intv[j][0] , end1 = intv[j][1];

                if(end <= start1) {
                    if(start1 < mn) {
                        mn = start1;
                        ans[i] = j;
                    }
                }
            }
        }

        return ans;
    }
}

*/

/*
class Solution {
    public int[] findRightInterval(int[][] intv) {
        int n = intv.length;

        int [] ans = new int[n];
        TreeMap<Integer , Integer> mp = new TreeMap<>();

        for(int i = 0; i < n; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            mp.put(start , i);
        }

        for(int i = 0; i < n; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            ans[i] = -1;

            if(mp.ceilingKey(end) != null) {
                int nxtStart = mp.ceilingKey(end);
                ans[i] = mp.get(nxtStart);
            }
        }

        return ans;
    }
}

*/

// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
// https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
// https://www.geeksforgeeks.org/problems/previous-greater-element/1
// https://www.geeksforgeeks.org/problems/previous-smaller-element/1
// https://leetcode.com/problems/valid-parentheses/
// https://leetcode.com/problems/longest-valid-parentheses/

public class StackDataStructure {
    public static void main(String [] args) {

//       Stack<Integer> stk = new Stack<>();
//       stk.add(5);
//       stk.add(2);
//       stk.add(1);

//       System.out.println(stk);
//       System.out.println(stk.peek());
//       stk.pop();
//       System.out.println(stk);

//       ArrayList<Integer> arrL = new ArrayList<>();
//       arrL.add(59);
//       arrL.add(65);
//       arrL.add(52);
//       arrL.add(51);
//       arrL.add(25);
//
//       arrL.set(2 , 4);
//        System.out.println(arrL);

//       TreeSet<Integer> ts = new TreeSet<>();
//       ts.add(-1 * 4);
//       ts.add(-1 * 10);
//       ts.add(-1 * 15);
//       ts.add(-1 * 16);
//       ts.add(-1 * 17);
//       ts.add(-1 * 21);
//       ts.add(-1 * 25);

//       System.out.println(-ts.ceiling(-20));
//
//       TreeMap<Integer , Integer> mp = new TreeMap<>();
//       mp.put(3 , 10);
//       mp.put(5 , 15);
//       mp.put(10 , 19);
//
//       System.out.println(mp.ceilingKey(5));

    }
}
