package Lecz26;
import java.util.*;

// https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
// https://leetcode.com/problems/rotting-oranges/
// https://leetcode.com/problems/flood-fill/description/

public class Graphs {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(-2);
        System.out.println(ts.first());
        int fr = ts.first();

        System.out.println(ts.remove(ts.first()));

        System.out.println(ts.first());
    }
}
