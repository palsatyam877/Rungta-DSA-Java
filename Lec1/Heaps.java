package Lec1;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Heaps {
    // Sets
    // Comparable
    // Comparators
    // can u create a TreeSet which can contain duplicates
    // https://leetcode.com/problems/kth-largest-element-in-an-array/
    // https://leetcode.com/problems/top-k-frequent-elements/description/
    // https://leetcode.com/problems/k-closest-points-to-origin/
    // https://leetcode.com/problems/meeting-rooms-iii/submissions/2049400865/

    public static class MyInt implements Comparable<MyInt> {
        Integer Int;

        MyInt(int Int) {
            this.Int  = Int;
        }

        @Override
        public String toString() {
            return this.Int + " ";
        }

        @Override
        public int compareTo(MyInt that) {
           // this.Int  that.Int

            if(that.Int.compareTo(this.Int) == 0)
                   return 1;

           return (this.Int.compareTo(that.Int));
        }

    }

    public  static class MyCustom implements  Comparator<Integer> {

        @Override
        public int compare(Integer a , Integer b) {
//            System.out.println(a.compareTo(b) + " " + a + " compare to " + b);
            if(a.compareTo(b) == 0)
                  return  0;
            return a.compareTo(b);
        }
    }

    public static class MyCustomInt implements Comparator<MyInt> {

        @Override
        public int compare(MyInt a , MyInt b) {
            if(a.Int.compareTo(b.Int) == 0)
                  return 1;

            return a.Int.compareTo(b.Int);
        }

    }

    public static class MyCustomMap implements Comparator<Integer> {

        @Override
        public int compare(Integer a , Integer b) {
            if(b.compareTo(a) == 0)
                  return 1;

            return b.compareTo(a);
        }
    }

    public static void main(String []args) {
//        System.out.println("Hello heaps");
        HashSet<String> hs = new LinkedHashSet<>();
        hs.add("Dog");

        hs.add("Cat");
        hs.add("Bhanu");
        hs.add("Aakash");
        hs.add("Dog");
//        System.out.println(hs);

//        System.out.println(hs.contains("Aakash"));
        hs.remove("Aaksah");

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(41);
        arr.add(-4);
        arr.add(31);
        arr.add(68);
        arr.add(54);

//        System.out.println(arr);

         Collections.sort(arr , new MyCustom());

//        System.out.println(arr);

//        TreeSet<Integer> ts = new TreeSet<>(new MyCustom());
//        ts.add(4);
//        ts.add(-3);
//        ts.add(3);
//        ts.add(2);
//        ts.add(3);
//
//        System.out.println(ts);

//          TreeSet<MyInt> ts1 = new TreeSet<>();
//
//          ts1.add(new MyInt(4));
//          ts1.add(new MyInt(14));
//          ts1.add(new MyInt(41));
//          ts1.add(new MyInt(-4));
//          ts1.add(new MyInt(42));
//          ts1.add(new MyInt(-4));
//          ts1.add(new MyInt(14));
//
//          System.out.println(ts1);

            TreeMap<Integer, Integer> mp = new TreeMap<>(new MyCustomMap());

            mp.put(1 , 10);
            mp.put(-6 , 12);
            mp.put(-2 , 7);
            mp.put(10 , 20);
            mp.put(-6 , 12);

           System.out.println(mp);

    }
}
