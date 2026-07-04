package Lec6;
import java.sql.Array;
import java.util.*;

// Comprable
// implements Comparable<CustomArrayList>
class CustomArrayList implements Comparable<CustomArrayList> {
    ArrayList<Integer> arl;

    CustomArrayList(ArrayList<Integer> x) {
        this.arl = new ArrayList<>(x);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

//        for(Integer x : this.arl) {
//            sb.append(x + " ");
//        }

           for(int i = 0; i < this.arl.size(); i += 2) {
                 sb.append(arl.get(i) + " " + arl.get(i + 1) + "\n");
           }

        return sb.toString();
    }

    @Override
    public int compareTo(CustomArrayList that) {
        System.out.println("compare executed");
        if(this.arl.get(0).compareTo(that.arl.get(0)) == 0)
            return that.arl.get(1).compareTo(this.arl.get(1));

        return this.arl.get(0).compareTo(that.arl.get(0));
    }
}

public class Revision {
    // {4 , 6} , {-1 , 23} , {1  , 2} , {3 , 4} , {-2 , 4}

    /*
         { 4 , 1 }
         { 5 , -2 }
         { 4 , 5 }
         { 0 , -1 }
         { 5 , -10}

     */

    /*
        { 0 , -1 }
        { 4 , 5 }
        { 4 , 1 }
        { 5 , -2 }
        { 5 , -10}
     */

    public static class CustomComp implements Comparator<Integer> {

        @Override
        public int compare(Integer left , Integer right) {
            if(left.compareTo(right) == 0) {
                System.out.println("same has occured");
                return 1;
            }

            if(left.compareTo(right) == 1) {
                System.out.println("positive : " + " " + left + " " + right);
            }

            if(left.compareTo(right) == -1) {
                System.out.println("negative : " + " " + left + " " + right);
            }

            return left.compareTo(right);
        }
    }

    public static void main(String []args) {

//         ArrayList<CustomArrayList> arL =
//                 new ArrayList<>(List.of(
//                           new CustomArrayList(new ArrayList<>(List.of(4 , 1))),
//                           new CustomArrayList(new ArrayList<>(List.of(5 , -2))),
//                           new CustomArrayList(new ArrayList<>(List.of(4 , 5))),
//                           new CustomArrayList(new ArrayList<>(List.of(0 , -1))),
//                           new CustomArrayList(new ArrayList<>(List.of(5 , -10)))
//                         ));
//
//        System.out.println(arL);
//        Collections.sort(arL);
//        System.out.println("----------------------------------------------");
//        System.out.println(arL);


//
//         ArrayList<Integer> ar1 = new ArrayList<>(List.of(4 , 5 , 7));
//         ArrayList<Integer> ar2 = new ArrayList<>(ar1);

//         for(Integer x : ar1)
//             ar2.add(x);
//        Collections.addAll(ar1);

         /*

              ar1 -> | 4 , 5 , 7 |  ar2 -> |4 , 5 , 7|
          */

//        System.out.println(ar2);
//
//        ar2.remove(1);
//
//        System.out.println(ar1);


//         System.out.println(arL);
//
//         Collections.sort(arL);
//
//        System.out.println(arL);

//         Set<Integer> st = new HashSet<>();
//         st.add(32);
//         st.add(-2);
//         st.add(-8);
//         st.add(0);
//         st.add(7);
//         st.add(-2);

//        System.out.println(st);

//        Set<Integer> st1 = new LinkedHashSet<>();
//        st1.add(32);
//        st1.add(-2);
//        st1.add(-8);
//        st1.add(0);
//        st1.add(7);
//        st1.add(0);
//
//        st1.remove(0);
//        System.out.println(st1.contains(0));
//
//        System.out.println(st1);

//        TreeSet<Integer> ts1 = new TreeSet<>(new CustomComp());
//        ts1.add(32);
//        ts1.add(-2);
//        ts1.add(-8);
//        ts1.add(0);
//        ts1.add(7);
//
//        System.out.println(ts1);
//        System.out.println("------------------------------------------------------------------------");
//        ts1.remove(8);
//        ts1.add(32);
//        ts1.add(89);
//        ts1.add(89);

//        System.out.println(ts1);

        Map<Integer , Integer> mp = new TreeMap<>(new CustomComp());
        mp.put(4 , 23);
        mp.put(45 , -34);
        mp.put(123 , -21);
        mp.put(-34 , 21);
        mp.put(45 , 20);

        System.out.println(mp);
    }
}
