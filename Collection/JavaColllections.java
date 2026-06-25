package Collection;

import java.util.*;

public class JavaColllections {

    public static int f(int n) {
        if(n == 0)
            return 0;

        return n + f(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(f(5));

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


  /*
class Solution {
    public void MS(int s , int e , int[] arr) {
        if(e - s <= 1) {
             if(e - s == 1) {
                if(arr[s] > arr[e]) {
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                }
             }

             return;
        }

        int mid = (s + e) / 2;

        MS(s , mid , arr); MS(mid + 1 , e , arr);

        // System.out.println(s + " " + e);
        // for(int i = s; i <= mid; ++i)
        //    System.out.print(arr[i] + " ");
        // System.out.println("");

        // for(int i = mid + 1; i <= e; ++i)
        //    System.out.print(arr[i] + " ");
        // System.out.println("-------------------");

        int [] temp = new int[e - s + 2];
        int ix = 0; // temp ->
        int lx = s; int rx = mid + 1;

        while((lx <= mid) && (rx <= e)) {
            if(arr[lx] <= arr[rx]) {
                temp[ix] = arr[lx];
                ++ix;
                ++lx;
            } else {
                temp[ix] = arr[rx];
                ++ix;
                ++rx;
            }
        }

        while(lx <= mid) {
            temp[ix] = arr[lx];
            ++ix;
            ++lx;
        }

        while(rx <= e) {
            temp[ix] = arr[rx];
            ++ix;
            ++rx;
        }

        ix = 0;

        for(int i = s; i <= e; ++i)
           arr[i] = temp[ix++];
    }

    public int[] sortArray(int[] nums) {
        MS(0 , nums.length - 1 , nums);
        return nums;
    }
}


  */
    }

}
