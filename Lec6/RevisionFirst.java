package Lec6;
import java.util.*;

class CustomPair implements Comparable<CustomPair>{
      Integer x , y , z;

      CustomPair(Integer x , Integer y , Integer z) {
           this.x = x; this.y = y; this.z = z;
      }

      @Override
      public String toString() {
          return this.x + " " + this.y + " " + this.z;
      }

      @Override
      public int compareTo(CustomPair that) {
          System.out.println("executed");
          if(this.x.compareTo(that.x) == 0) {
              if(that.y.compareTo(this.y) == 0)
                  return this.z.compareTo(that.z);

              return that.y.compareTo(this.y);
          }

          return this.x.compareTo(that.x);
      }

    @Override
    public boolean equals(Object o) {
          CustomPair that = (CustomPair)o;
        System.out.println("executed");
        if(this.x.compareTo(that.x) == 0) {
            if(that.y.compareTo(this.y) == 0)
                return this.z.compareTo(that.z) == 0;

            return that.y.compareTo(this.y) == 0;
        }

        return this.x.compareTo(that.x) == 0;
    }
}

class CustomComp implements Comparator<CustomPair> {

      @Override
      public int compare(CustomPair a , CustomPair b) {
          if(a.x.compareTo(b.x) == 0) {
              if(b.y.compareTo(a.y) == 0)
                  return a.z.compareTo(b.z);

              return b.y.compareTo(a.y);
          }

          return a.x.compareTo(b.x);
      }
}

public class RevisionFirst {

    public static void main(String []args) {

        // Comparable & Comparators

        CustomPair [] arr = new CustomPair[2];
        arr[0] = new CustomPair(2 , -4 , 6);
        arr[1] = new CustomPair(2 , 1 , -1);
        Arrays.sort(arr , new CustomComp());

        System.out.println(Arrays.toString(arr));

        // Collections

        // ---> ArrayList

        ArrayList<CustomPair> arL = new ArrayList<>();
        arL.add(new CustomPair(10 , -4 , 2));
        arL.add(new CustomPair(10 , 4 , 22));

        Collections.sort(arL);

        System.out.println(arL.remove(new CustomPair(10 , 4 , 22)));
        System.out.println(arL);

        // Set --> HashSet --> LinkedHashSet --> TreeSet

//        TreeSet<CustomPair> ts1 = new TreeSet<>();
//        ts1.add(new CustomPair(10 , -4 , 2));
//        ts1.add(new CustomPair(10 , 4 , 22));
//
//        System.out.println(ts1);
//
//        System.out.println(ts1.remove(new CustomPair(10 , -4 , 2)));
//
//        System.out.println(ts1);


    }
}
