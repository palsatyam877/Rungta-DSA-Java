package Lec3;
import java.util.*;

// https://leetcode.com/problems/two-sum/
// https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/

/*
class Solution {
    public int minimumPairRemoval(int[] nums) {

        int count = 0;

        while(nums.length > 0) {
            int n = nums.length;
            int mn = Integer.MAX_VALUE;
            int inx = n - 1;
            boolean isSort = true;

            for(int i = 0; i < n - 1; ++i)
                 if(nums[i] > nums[i + 1])
                    isSort = false;

            if(isSort)
                return count;

            for(int i = n - 2; i >= 0; --i)
                if(nums[i] + nums[i + 1] <= mn) {
                    mn = nums[i] + nums[i + 1];
                    inx = i;
                }

            int [] temp = new int[n - 1];
            int ix = 0;

            for(int i = 0; i < n; ++i)
               if(i == inx) {
                   temp[ix++] = mn;
               } else if(i == inx + 1) {

               } else {
                    temp[ix++] = nums[i];
               }

            nums = temp;
            ++count;
        }

        return count;
    }
}

*/

// https://leetcode.com/problems/happy-number/

/*
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while(n > 1) {
            int temp = 0;

            while(n > 0) {
                int last = n % 10;
                n /= 10;

                temp += (last * last);
            }

            if(hs.contains(temp))
                 return false;

            hs.add(temp);

            n = temp;
        }

        return true;
    }
}
*/

// https://leetcode.com/problems/contains-duplicate-ii/
// https://leetcode.com/problems/merge-similar-items/
// https://leetcode.com/problems/find-right-interval/
// https://leetcode.com/problems/meeting-rooms-iii/


public class DataStructure {
    public static void main(String [] args) {
          TreeSet<Integer> ts = new TreeSet<>();
          ts.add(8);
          ts.add(12);
          ts.add(13);
          ts.add(7);
          ts.add(4);
          ts.add(9);

          System.out.println(ts);
          System.out.println(ts.ceiling(10) == null);

          Integer x = null;

          TreeMap<Integer , Integer> xp = new TreeMap<>();
    }
}
