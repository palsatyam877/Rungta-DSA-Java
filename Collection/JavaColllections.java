package Collection;

import java.util.*;

public class JavaColllections {

    public static void main(String[] args) {
        // ArrayList

        /*
             .add()
             .add(inx , val)
             .get()
             .contains
             .set()
             .remove()
        */

        /*
           Iterators
        */


//        System.out.println(w.get(3).get(2).get(7).get(5)); --> 7
//        System.out.println(w.get(1).get(6).get(9).get(3)); --> 12
//        System.out.println(w.get(3).get(2).get(3).get(4)); --> 81

//        want to reach at --> w.get(3).get(2).get(7).get(5)   ( by iterators without using .get())
//        want to reach at --> w.get(1).get(6).get(9).get(3)   ( by iterators without using .get())

//        https://leetcode.com/problems/sort-an-array/description/
//        https://www.geeksforgeeks.org/problems/quick-sort/1


        // ArrayList
/*
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);

        System.out.println(arr);

        arr.add(10);
        arr.add(12);

        System.out.println(arr);

        System.out.println(arr.get(2));

        arr.set(1 , 38);

        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

        arr.remove(0);

        System.out.println(arr);

        System.out.println(arr.size());

 */

        ArrayList<Integer> arr = new ArrayList<>(List.of(1 , 3 , 5));
//        System.out.println(arr);

//        Iterator<Integer> i = arr.iterator();
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//
//        ArrayList<Integer> w = new ArrayList<>(List.of(0 , 0 , 0 , 12));
//        System.out.println(w.get(3));
        // System.out.println(w.get(3)); --> 12

        // System.out.println(w.get(3).get(2).get(7).get(5)); --> 7
        // System.out.println(w.get(1).get(6).get(9).get(3)); --> 12
        // System.out.println(w.get(3).get(2).get(3).get(4)); --> 81

        // w.get(5)
        ArrayList<Integer> a1 = new ArrayList<>(List.of(0 , 0 , 0 , 0 , 0 , 7));
        a1.set(3 , 12);
        a1.set(4 , 81);

//        System.out.println(a1.get(5));

        ArrayList<Integer> e1 = new ArrayList<>();

        // .get(7).get(5)
        ArrayList<ArrayList<Integer>> a2 = new ArrayList<>(List.of(e1,e1,e1,a1,e1,e1,e1,a1 , e1 , a1));

//        System.out.println(a2.get(7).get(5));

        ArrayList<ArrayList<Integer>> e2 = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Integer>>> a3 = new ArrayList<>(List.of(e2 , e2 , a2 , e2 , e2 , e2 , a2));

//        System.out.println(a3.get(2).get(7).get(5));

        ArrayList<ArrayList<ArrayList<Integer>>> e3 = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> a4 = new ArrayList<>(List.of(e3 , a3 , e3 , a3));

         System.out.println(a4.get(3).get(2).get(7).get(5));
          System.out.println(a4.get(1).get(6).get(9).get(3));
        System.out.println(a4.get(3).get(2).get(3).get(4));
        //  System.out.println(w.get(1).get(6).get(9).get(3)); --> 12
        // System.out.println(w.get(3).get(2).get(3).get(4)); --> 81

        // https://leetcode.com/problems/sort-an-array/description/
    }

}
