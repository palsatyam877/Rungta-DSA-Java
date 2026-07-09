package Lecz10;

// https://leetcode.com/problems/sliding-window-median/

/*
class Solution {
    class Pair implements Comparable<Pair> {
        Integer first , second;

        Pair(Integer first , Integer second) {
            this.first = first; this.second = second;
        }

        @Override
        public String toString() {
            return "{ " + this.first + " , " + this.second + " }";
        }

        @Override
        public int compareTo(Pair that) {
            if(this.first.compareTo(that.first) == 0)
                return this.second.compareTo(that.second);

            return this.first.compareTo(that.first);
        }
    }

    public double[] medianSlidingWindow(int[] arr, int k) {
        TreeSet<Pair> ts = new TreeSet<>();
        int n = arr.length;

        double [] ans = new double[n - k + 1];

        if(k == 1) {
            for(int i = 0; i < n; ++i)
               ans[i] = arr[i];

            return ans;
        }

        for(int i = 0; i < k; ++i)
           ts.add(new Pair( arr[i] , i ));

        Iterator<Pair> it = ts.iterator();
        Pair curr = new Pair(0 , 0);

        for(int i = 0; i < k / 2; ++i)
           curr = it.next();

        if(k % 2 == 1)
           curr = it.next();

        int l = 0;

        if(k % 2 == 0) {
            Pair curr2 = new Pair(0 , 0);

            Iterator<Pair> it1 = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
            it1.next(); curr2 = it1.next();

            ans[l] = ((1L * curr.first) + (1L * curr2.first)) / 2.0;
        } else {
            ans[l] = curr.first;
        }

        for(int i = k; i < n; ++i) {
            if((curr.first < arr[l]) || ((curr.first == arr[l]) && (l > curr.second))) {
                ts.add(new Pair( arr[i] , i ));
                ts.remove(new Pair(arr[l] , l));

                if(arr[i] >= curr.first) {
                    // do nothing
                } else {
                    Iterator<Pair> it1 = ts.headSet( new Pair(curr.first , curr.second) , true).descendingIterator();
                    it1.next(); curr = it1.next();
                }
            } else if((curr.first > arr[l]) || ((curr.first == arr[l]) && (l < curr.second))) {
                ts.add(new Pair( arr[i] , i ));
                ts.remove(new Pair(arr[l] , l));

                if(arr[i] < curr.first) {
                    // do nothing
                } else {
                    Iterator<Pair> it1 = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
                    it1.next(); curr = it1.next();
                }
            } else {
                Iterator<Pair> it1 = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
                it1.next(); curr = it1.next();
                ts.remove(new Pair(arr[l] , l));
                ts.add(new Pair(arr[i] , i));

                if(arr[i] < curr.first) {
                    Iterator<Pair> it2 = ts.headSet( new Pair(curr.first , curr.second) , true).descendingIterator();
                    it2.next(); curr = it2.next();
                }
            }

            ++l;

            if(k % 2 == 0) {
                Pair curr2 = new Pair(0 , 0);

                Iterator<Pair> it1 = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
                it1.next(); curr2 = it1.next();

                ans[l] = ((1L * curr.first) + (1L * curr2.first)) / 2.0;
            } else {
                ans[l] = curr.first;
            }
        }

        return ans;

    }
}

*/

/************************ BINARY SEARCH ON ANSWER ***************************/

// https://leetcode.com/problems/first-bad-version/description/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(long version); */

/*
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long lo = 1 , hi = n , ans = n;

        while(lo <= hi) {
            long mid = (lo + hi) / 2;

            if(isBadVersion((int)mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return (int)ans;
    }
}

*/

// https://leetcode.com/problems/sqrtx/
/*
class Solution {
    public int mySqrt(int x) {
        long lo = 1 , hi = x , ans = 0;

        while(lo <= hi) {
            long mid = (lo + hi) / 2;

            if(mid * mid == x)
               return (int)mid;
            else if(mid * mid < x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return (int)ans;
    }
}
*/

// https://leetcode.com/problems/search-in-rotated-sorted-array/
/*
class Solution {
    public int search(int[] arr, int t) {
        int n = arr.length;

        if(n == 1)
            if(arr[0] == t)
                return 0;
            else
                return -1;

        if(n == 2) {
            if(arr[0] == t)
               return 0;
            else if(arr[1] == t)
                 return 1;
            else
                return -1;
        }

        if(arr[n - 1] > arr[0]) {
            long lo = 0 , hi = n - 1;

            while(lo <= hi) {
                long mid = (lo + hi) / 2;

                if(arr[(int)mid] > t)
                   hi = mid - 1;
                else if(arr[(int)mid] < t)
                   lo = mid + 1;
                else
                    return (int)mid;
            }

            return -1;
        }

        // System.out.println("----------");

        if(arr[n - 1] < arr[n - 2]) {
            if(arr[n - 1] == t)
               return n - 1;

            long lo = 0 , hi = n - 2;

            while(lo <= hi) {
                long mid = (lo + hi) / 2;

                if(arr[(int)mid] > t)
                    hi = mid - 1;
                else if(arr[(int)mid] < t)
                    lo = mid + 1;
                else
                   return (int)mid;
            }

            return -1;
        }

        long lo = 0 , hi = n - 2 , pivot = -1;

        while(lo <= hi) {
            long mid = (lo + hi) / 2;

            if(arr[(int)mid] > arr[n - 1])
                lo = mid + 1;
            else if(arr[(int)mid] < arr[n - 1]) {
                pivot = mid;
                hi = mid - 1;
            }
        }

        // System.out.println(pivot + " : pivot");

        if(arr[n - 1] == t)
            return n - 1;

        if(arr[n - 1] > t) {
            long lo1 = pivot , hi1 = n - 2;

            while(lo1 <= hi1) {
                long mid = (lo1 + hi1) / 2;

                if(arr[(int)mid] > t)
                    hi1 = mid - 1;
                else if(arr[(int)mid] < t)
                    lo1 = mid + 1;
                else
                   return (int)mid;
            }

        }  else {

            // System.out.println(" &&& ");
            long lo1 = 0 , hi1 = pivot - 1;

            while(lo1 <= hi1) {
                long mid = (lo1 + hi1) / 2;

                if(arr[(int)mid] > t)
                    hi1 = mid - 1;
                else if(arr[(int)mid] < t)
                    lo1 = mid + 1;
                else
                   return (int)mid;
            }
        }

        return -1;

    }
}
*/

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// https://leetcode.com/problems/koko-eating-bananas/

public class BinarySearchOnAnswer {

    public static void main(String [] args) {
       // (((((A+(B*C*(D*(E*F+((G))))))))))
    }
}
