package Lec2;

public class HeapsLeetCode {
    // Making Map store Duplicate keys

    // https://leetcode.com/problems/k-closest-points-to-origin/

    /*
class Solution {
    public class Pair implements Comparable <Pair>{
       Integer first , second;

       Pair(Integer first , Integer second) {
           this.first = first;
           this.second = second;
       }

       @Override
       public String toString() {
          return this.first + " = " + this.second + " , ";
       }

       @Override
       public int compareTo(Pair that) {
            if(that.first.compareTo(this.first) == 0)
              return this.second.compareTo(that.second);


            return that.first.compareTo(this.first);
       }

    }

    public int[][] kClosest(int[][] points, int k) {
        // O(n * log(k)) // O(n * log(n))
        // Map<Integer,Integer> mp = new treeMap<>(); // {dis , inx}
        Set<Pair> st = new TreeSet<>();

        for(int i = 0; i < k; ++i) {
           int dis = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
           st.add(new Pair(dis , i));
        }

        for(int i = k; i < points.length; ++i) {
            int dis = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            Integer Dis = new Integer(dis);
            Iterator<Pair> it = st.iterator();
            Pair fr = it.next();

            if(Dis.compareTo(fr.first) < 0) {
                it.remove();
                st.add(new Pair(dis , i));
            }
        }

        Iterator<Pair> it = st.iterator();
        int [][] ans = new int[k][2];
        int i = 0;

        while(it.hasNext()) {
            Pair curr = it.next();
            ans[i][0] = points[curr.second][0];
            ans[i++][1] = points[curr.second][1];
        }

        return ans;
    }
}

    */

    // https://leetcode.com/problems/find-median-from-data-stream/

    // https://leetcode.com/problems/meeting-rooms-iii/

    // Ascending and Descinding iterator from a given point in Set ***** IMP


    public static void main(String [] args) {
        System.out.println("Hello Map");
    }
}
