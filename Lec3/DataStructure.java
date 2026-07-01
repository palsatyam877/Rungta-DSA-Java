package Lec3;
import java.util.*;

// https://leetcode.com/problems/two-sum/

/*
class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; ++i)
            if(mp.containsKey(t - nums[i])) {
                int [] ans = new int[2];
                ans[0] = mp.get(t - nums[i]);
                ans[1] = i;
                return ans;
            } else {
                mp.put(nums[i] , i);
            }

        return (new int[2]);
    }
}

*/

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

/*
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , ArrayList<Integer>> mp = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; ++i)
           if(mp.containsKey(nums[i]))
               mp.get(nums[i]).add(i);
           else
              mp.put(nums[i] , new ArrayList<>( List.of(i)));

        int dis = Integer.MAX_VALUE;

        for(Map.Entry<Integer , ArrayList<Integer>> x : mp.entrySet()) {
            ArrayList<Integer> a =  x.getValue();

            for(int inx = 1; inx < a.size(); ++inx) {
                dis = Math.min(dis , a.get(inx) - a.get(inx - 1));
            }
        }

        return dis <= k;
    }
}
*/

// https://leetcode.com/problems/meeting-rooms-iii/

/*
class Solution {
    class Pair implements Comparable<Pair> {
        Long first , second;

        Pair(Long first , Long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return this.first + " " + this.second + " \n";
        }

        @Override
        public int compareTo(Pair that) {
            if(this.first.compareTo(that.first) == 0)
                return this.second.compareTo(that.second);

            return this.first.compareTo(that.first);
        }
    }

    public int mostBooked(int n, int[][] meet) {
        TreeMap<Long , Long> mp = new TreeMap<>();

        for(int i = 0; i < meet.length; ++i)
             mp.put(1L * meet[i][0] , 1L * meet[i][1]);

        TreeSet<Pair> avR = new TreeSet<>();

        for(int i = 0; i < n; ++i)
             avR.add(new Pair( 1L * 0 , 1L * i ));

        TreeSet<Pair> avR1 = new TreeSet<>();

        int [] ans = new int[n];

        while(mp.size() > 0) {
            Iterator<Map.Entry<Long , Long>> it = mp.entrySet().iterator();
            Map.Entry<Long , Long> cMeet = it.next();
            it.remove();

            long start = cMeet.getKey() , end = cMeet.getValue();

            // System.out.println(start + " " + end);

            // for(Pair c : avR) {

            // }

            while(avR.size() > 0) {
                Iterator<Pair> it1 = avR.iterator();
                Pair rm = it1.next();

                if(rm.first > start)
                     break;

                it1.remove();
                avR1.add(new Pair(rm.second , rm.first));
            }

            // System.out.println(avR1 + " : xx");

            if(avR1.size() == 0) {
                Iterator<Pair> it1 = avR.iterator();
                Pair rm = it1.next();
                it1.remove();
                avR1.add(new Pair(rm.second , rm.first));
            }

            Iterator<Pair> it2 = avR1.iterator();
            Pair rm = it2.next();
            it2.remove();

            long rStart = rm.second , rInx = rm.first;

            // System.out.println(rStart + " " + rInx + " : x");

            if(rStart <= start) {
                avR.add(new Pair(end , rInx));
            } else {
                avR.add(new Pair(rStart + (end - start) , rInx));
            }

            int ix = (int)rInx;
            ans[ix]++;
        }

        // for(int i = 0; i < n; ++i)
        //     System.out.print(ans[i] + " ");
        // System.out.println();

        int mx = 0;

        for(int i = 0; i < n; ++i) {
             mx = Math.max(ans[i] , mx);
        }

        int ansInx = n;

        for(int i = n - 1; i >= 0; --i)
            if(mx == ans[i])
                ansInx = i;

        return ansInx;

    }
}
*/

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
