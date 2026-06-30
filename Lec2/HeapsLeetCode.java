package Lec2;
import javax.smartcardio.CardChannel;
import java.util.*;

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

    /*
class MedianFinder {
    public class Pair implements Comparable<Pair> {
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
           if(this.first.compareTo(that.first) == 0)
               return this.second.compareTo(that.second);

           return this.first.compareTo(that.first);
       }
    }

    HashMap<Integer,Integer> hm;
    TreeSet<Pair> ts;
    Pair curr;

    public MedianFinder() {
        hm = new HashMap<>();
        ts = new TreeSet<>();
    }

    public void addNum(int num) {
        if(ts.size() == 0) {
            hm.put(num , 1);
            ts.add(new Pair(num , 1));
            curr = new Pair(num , 1);
            return;
        }

        if(ts.size() % 2 == 0) {
            if(hm.containsKey(num))
                hm.put(num , hm.get(num) + 1);
            else
                hm.put(num , 1);

            ts.add(new Pair(num , hm.get(num)));

            Integer num1 = new Integer(num);

            if(num1.compareTo(curr.first) >= 0) {
                Iterator<Pair> it = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
                it.next();
                curr = it.next();
            }
        } else {
            if(hm.containsKey(num))
                hm.put(num , hm.get(num) + 1);
            else
                hm.put(num , 1);

            ts.add(new Pair(num , hm.get(num)));

            Integer num1 = new Integer(num);

           if(num1.compareTo(curr.first) < 0) {
                Iterator<Pair> it = ts.headSet(new Pair(curr.first , curr.second) , true).descendingIterator();
                it.next();
                curr = it.next();
            }
        }
    }

    public double findMedian() {
        if(ts.size() % 2 == 0) {
            Iterator<Pair> it = ts.tailSet(new Pair(curr.first , curr.second) , true).iterator();
            it.next();
            Pair curr1 = it.next();

            return (curr.first + curr1.first) / 2.0;
        } else {
            return (double)curr.first;
        }
    }
}
    */

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/

    /*
class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length() == 0)
            return 0;

       int l = 0 , r = 0;
       HashSet<Character> hs = new HashSet<>();
       hs.add(s.charAt(0));
       int ans = 1;

       for(int i = 1; i < s.length(); ++i) {
           if(hs.contains(s.charAt(i))) {
               while(l < i) {
                   Character temp = s.charAt(l);
                   hs.remove(s.charAt(l));
                   ++l;
                   if(temp.equals(s.charAt(i))) {
                       break;
                   }
               }
           }

           hs.add(s.charAt(i));
           ans = Math.max(ans , hs.size());
       }

       return ans;
    }
}
    */

    // https://leetcode.com/problems/meeting-rooms-iii/

    // Ascending and Descinding iterator from a given point in Set ***** IMP


    public static void main(String [] args) {
        System.out.println("Hello Map");

        TreeSet<Integer> s = new TreeSet<>();
        s.add(13);
        s.add(8);
        s.add(14);
        s.add(4);
        s.add(2);
        s.add(7);
        s.add(9);



        System.out.println(s);

        Iterator<Integer> it = s.tailSet( 9 , true ).iterator();

//        while(it.hasNext())
//            System.out.println(it.next());

        Iterator<Integer> it1 = s.headSet(8 , true).descendingIterator();

        while(it1.hasNext())
            System.out.println(it1.next());

        Character x = 'A';
        Character y = 'A';
        String x7 = "Ahhd";
        System.out.println();
        System.out.println(x.equals(y));

    }
}
