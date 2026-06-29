package Lec1;

import com.sun.source.tree.Tree;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Heaps {
    // Sets
    // Comparable
    // Comparators
    // can u create a TreeSet which can contain duplicates
    // https://leetcode.com/problems/kth-largest-element-in-an-array/
 /*
 class Solution {

    public class MyCust implements Comparator<Integer> {

       @Override
       public int compare(Integer a , Integer b) {
            if(a.compareTo(b) == 0)
                return 1;

            return a.compareTo(b);
       }
    }

    public int findKthLargest(int[] nums, int k) {
        Set<Integer> s = new TreeSet<>(new MyCust());

        for(int i = 0; i < k; ++i)
            s.add(nums[i]);

        for(int i = k; i < nums.length; ++i) {
            Iterator<Integer> it = s.iterator();

            Integer v = it.next();

            if(v.compareTo(new Integer(nums[i])) < 0) {
                it.remove();
                s.add(nums[i]);
            }

            // System.out.println(s);
        }

        Iterator<Integer> it = s.iterator();
        Integer v = it.next();

        return v;
    }
}

  */


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

    public  static class A {
          Integer a;

          public A(Integer a) {
              this.a = a;
          }

//          @Override
//          public int compareTo(A that) {
//              return that.a.compareTo(this.a);
//          }

          @Override
          public String toString() {
              return this.a + " ";
          }
    }

    public static class MyCmp implements Comparator<A> {

        @Override
        public int compare(A x , A y) {
            return y.a.compareTo(x.a);
        }
    }

    public static class MySetCust implements Comparator<Integer> {

        @Override
        public int compare(Integer a , Integer b) {
             if(a.compareTo(b) == 0)
                 return 1;

             return a.compareTo(b);
        }
    }

    public static class Cust {
        Integer a , b;

        Cust(Integer a , Integer b) {
            this.a = a;
            this.b = b;
        }

//        @Override
//        public int compareTo(Cust that) {
//            if(this.a.compareTo(that.a) == 0) {
//                return that.b.compareTo(this.b);
//            }
//
//            return this.a.compareTo(that.a);
//        }

        @Override
        public String toString() {
            return this.a + " " + this.b + " \n";
        }
    }

    public static class MyCust implements Comparator<Cust> {

        @Override
        public int compare(Cust A , Cust B) {
            if(A.a.compareTo(B.a) == 0) {
                return B.b.compareTo(A.b);
            }

            return A.a.compareTo(B.a);

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

        Collections.sort(arr, new MyCustom());

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

        mp.put(1, 10);
        mp.put(-6, 12);
        mp.put(-2, 7);
        mp.put(10, 20);
        mp.put(-6, 12);
        mp.put(-6, 8);
//            mp.remove( 1 );

//           Iterator<Map.Entry<Integer , Integer>> it = mp.entrySet().iterator();
//
//          System.out.println(it.next());
//          System.out.println(it.next());
//          System.out.println(it.next());
//          System.out.println(it.next());
//          System.out.println(it.next());
//          it.remove();
//
//           System.out.println(mp);

//          Set<Integer> s1 = new TreeSet<>();
//          s1.add(1);
//          s1.add(4);
//         s1.add(1);
//        s1.add(4);
//        s1.add(2);
//        s1.add(3);
//
//        System.out.println(s1.size());
//
//        s1.remove(3);
//
//        System.out.println(s1.size());
//
//        System.out.println(s1);
//
//        System.out.println(s1.contains(2));

//        Map<String, Integer> mp1 = new TreeMap<>();
//        mp1.put("Sunny", 15);
//        mp1.put("Chotu", 12);
//        mp1.put("Nitesh", 123);
//        mp1.put("Satyam", 21);
//        mp1.put("Satyam", 18);
//
//        System.out.println(mp1.get("Chotu"));
//        System.out.println(mp1.size());
//
//        System.out.println(mp1.entrySet());
//
//        for (Map.Entry<String, Integer> x : mp1.entrySet()) {
//            System.out.println(x);
//        }

//        ArrayList<A> a1 = new ArrayList<>(List.of(new A(4) , new  A(1) , new A(7) , new A(3)));
//        Collections.sort(a1 , new MyCmp());
//
//        System.out.println(a1);

//          Set<Integer> s1 = new TreeSet<>(new MySetCust());
//          s1.add(4);
//          s1.add(2);
//          s1.add(9);
//          s1.add(-1);
//          s1.add(2);
//
//        System.out.println(s1);

        Set<Cust> s2 = new TreeSet<>(new MyCust());
        s2.add(new Cust(1 , 3));
        s2.add(new Cust(3 , 1));
        s2.add(new Cust(1 , 2));
        s2.add(new Cust(4 ,2));

        System.out.println(s2);

    }
}
