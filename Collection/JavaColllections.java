package Collection;
import java.util.*;

class Pair {
 public Integer first = 0;
 public Integer second = 0;
Pair(Integer first , Integer second) {
    this.first = first;
    this.second = second;
} }

public class JavaColllections {

    public static int f(int n) {
        if(n == 0)
            return 0;

        return n + f(n - 1);
    }

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

//        ArrayList<Integer> arr = new ArrayList<>(List.of(1 , 3 , 5));
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

//         .get(7).get(5)
        ArrayList<ArrayList<Integer>> a2 = new ArrayList<>(List.of(e1,e1,e1,a1,e1,e1,e1,a1 , e1 , a1));

//        System.out.println(a2.get(7).get(5));

        ArrayList<ArrayList<Integer>> e2 = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Integer>>> a3 = new ArrayList<>(List.of(e2 , e2 , a2 , e2 , e2 , e2 , a2));

//        System.out.println(a3.get(2).get(7).get(5));

        ArrayList<ArrayList<ArrayList<Integer>>> e3 = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> a4 = new ArrayList<>(List.of(e3 , a3 , e3 , a3));

         System.out.println(a4.get(3).get(2).get(7).get(5)); // 7
          System.out.println(a4.get(1).get(6).get(9).get(3));
        System.out.println(a4.get(3).get(2).get(3).get(4));

        ArrayList<ArrayList<String>> arr = new ArrayList<>();

        ArrayList<String> aa1 = new ArrayList<>(List.of("Hello" , "Java"));
        ArrayList<String> ee1 = new ArrayList<>();

        arr.add(ee1);
        arr.add(aa1);

        // Iterators

        Iterator<ArrayList<String>> i1 = arr.iterator();
        ArrayList<String> t1 = new ArrayList<>();

        for(int i = 0; i < 2; ++i)
            t1 = i1.next(); // t1 -> ArrayList<String>

        Iterator<String> i2 = t1.iterator();
        String t2 = "";

        for(int i = 0; i < 2; ++i)
              t2 = i2.next();

        System.out.println(t2);

        // System.out.println(a4.get(3).get(2).get(7).get(5)); // 7
        // a4 -> ArrayList<ArrayList<ArrayList<ArrayLisr<Integer>>>> a4

        Iterator<ArrayList<ArrayList<ArrayList<Integer>>>> ii1 = a4.iterator();
        ArrayList<ArrayList<ArrayList<Integer>>> tt1 = new ArrayList<>();

        for(int i = 0; i < 4; ++i)
               tt1 = ii1.next();

        Iterator<ArrayList<ArrayList<Integer>>> ii2 = tt1.iterator();
        ArrayList<ArrayList<Integer>> tt2 = new ArrayList<>();

        for(int i = 0; i < 3; ++i)
              tt2 = ii2.next();

        Iterator<ArrayList<Integer>> ii3 = tt2.iterator();
        ArrayList<Integer> tt4 = new ArrayList<>();

        for(int i = 0; i < 8; ++i)
            tt4 = ii3.next();

        Iterator<Integer> ii4 = tt4.iterator();
        Integer tt5 = 0;

        for(int i = 0; i < 6; ++i)
            tt5 = ii4.next();

        System.out.println(tt5 + " : solution");


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

    // https://www.geeksforgeeks.org/problems/quick-sort/1
  /*      ``````
        class Solution {

    public void quickSort(int[] arr, int low, int high) {
        //

        if(low >= high)
             return ;

        int [] temp = new int [high - low + 1];
        int ix = 0;

        for(int i = low; i < high; ++i)
            if(arr[i] <= arr[high])
                temp[ix++] = arr[i];

        int pivot = low + ix;
        temp[ix++] = arr[high];

        for(int i = low; i < high; ++i)
           if(arr[i] > arr[high])
              temp[ix++] = arr[i];

        ix = 0;

        for(int i = low; i <= high; ++i)
            arr[i] = temp[ix++];

        quickSort(arr , low , pivot - 1);
        quickSort(arr , pivot + 1 , high);

    }
}
     */

//        ArrayList<String> arr = new ArrayList<>(List.of( "Hello" , "World" , "Java" ));
//        System.out.println(arr.get(2));

//        Iterator<String> it = arr.iterator();
//
//        while(it.hasNext())
//            System.out.println(it.next());




        // Set

        /*
            HashSet<>
            LinkedHashset<>
            TreeHashSet<>
        */

        TreeSet<String> hs1 = new TreeSet<>();
        hs1.add("Sumeet");
        hs1.add("Rajat");
        hs1.add("Saumya");
        hs1.add("Shweta");

        System.out.println(hs1);

        hs1.remove("Sumeet");

        System.out.println(hs1);

        System.out.println(hs1.contains("Satyam"));
        System.out.println(hs1.contains("Rajat"));

        System.out.println(hs1.isEmpty());
        System.out.println(hs1.size());
//        hs1.clear();
//        System.out.println(hs1);
        // HashSet<String> hs1 = new HashSet<>();
        Iterator<String> ih1 = hs1.iterator();

        while(ih1.hasNext())
            System.out.println(ih1.next());



        // https://www.geeksforgeeks.org/problems/minimum-vertical-sum-1593518814/1

/*

class Solution {
    public int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr, int n) {
        // code here
        int N = arr.size();

        int mxCol = 0;

        for(int i = 0; i < N; ++i)
            mxCol = Math.max(mxCol , arr.get(i).size());

        int [] ans = new int [mxCol + 1];

        for(int inx = 0; inx < mxCol; ++inx) {
            for(int i = 0; i < N; ++i) {
               if(arr.get(i).size()  >= inx + 1)
                ans[inx] += arr.get(i).get(inx);
            }
        }

        int Ans = 1000000000;

        for(int i = 0; i < mxCol; ++i)
            Ans = Math.min(Ans , ans[i]);

        return Ans;
    }
}
 */

        // https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
/*
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < a.length; ++i)
            hs.add(a[i]);

        for(int i = 0; i < b.length; ++i)
            hs.add(b[i]);

        ArrayList<Integer> ans = new ArrayList<>();

        for(Integer x : hs)
             ans.add(x);

        return ans;

    }
}
*/

        // https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1


/*
class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here

        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < arr.length; ++i)
             ts.add(arr[i]);

        ArrayList<Integer> ans = new ArrayList<>();

        for(Integer x : ts)
              ans.add(x);
        return ans;
    }
}

*/

/*
class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < a.length; ++i)
           hs.add(a[i]);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < b.length; ++i)
           if(hs.contains(b[i]))
               ans.add(b[i]);

        return ans.size();
    }
}

*/

        // https://www.geeksforgeeks.org/problems/distinct-sorted--124713/1

        // System.out.println(lhs5.get(3).getLast().getFirst().get(2).getFirst()); // Number Theory
        // System.out.println(lhs5.get(3).getLast().getLast().get(4).getLast()); // Recursion

        // Iterator --> Number Theory

        // Iterator --> Recursion
        TreeSet<Pair> x = new TreeSet<>();
        x.add(new Pair(1 , 4));
        x.add(new Pair(2 , 2));
        x.add(new Pair(4 , 5));

        for(Pair y : x) {
            System.out.println(y);
        }

        // https://leetcode.com/problems/roman-to-integer/description/?topicSlugs=array
    }
}
