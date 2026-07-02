package Lec4;
import Lec1.Heaps;

import java.util.*;

// .ceiling() --> TreeSet , .ceilingKey() --> TreeMap
// just smaller element using above ?

// https://leetcode.com/problems/merge-similar-items/
// https://leetcode.com/problems/find-right-interval/
// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
// https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
// https://www.geeksforgeeks.org/problems/previous-greater-element/1
// https://www.geeksforgeeks.org/problems/previous-smaller-element/1
// https://leetcode.com/problems/valid-parentheses/
// https://leetcode.com/problems/longest-valid-parentheses/

public class StackDataStructure {
    public static void main(String [] args) {

       Stack<Integer> stk = new Stack<>();
       stk.add(5);
       stk.add(2);
       stk.add(1);

       System.out.println(stk);
       System.out.println(stk.peek());
       stk.pop();
       System.out.println(stk);

       ArrayList<Integer> arrL = new ArrayList<>();
       arrL.add(59);
       arrL.add(65);
       arrL.add(52);
       arrL.add(51);
       arrL.add(25);

       arrL.set(2 , 4);
        System.out.println(arrL);

      TreeMap<Integer , Integer> mp = new TreeMap<>();
    }
}
