package Lec4;
import Lec1.Heaps;

import java.util.*;

// .ceiling() --> TreeSet , .ceilingKey() --> TreeMap
// just smaller element using above ?

// https://leetcode.com/problems/merge-similar-items/
// https://leetcode.com/problems/find-right-interval/

/*
class Solution {
    public int[] findRightInterval(int[][] intv) {
        int [] ans = new int[intv.length];

        for(int i = 0; i < intv.length; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            int mn = 1000001;
            ans[i] = -1;

            for(int j = 0; j < intv.length; ++j) {
                int start1 = intv[j][0] , end1 = intv[j][1];

                if(end <= start1) {
                    if(start1 < mn) {
                        mn = start1;
                        ans[i] = j;
                    }
                }
            }
        }

        return ans;
    }
}

*/

/*
class Solution {
    public int[] findRightInterval(int[][] intv) {
        int n = intv.length;

        int [] ans = new int[n];
        TreeMap<Integer , Integer> mp = new TreeMap<>();

        for(int i = 0; i < n; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            mp.put(start , i);
        }

        for(int i = 0; i < n; ++i) {
            int start = intv[i][0] , end = intv[i][1];
            ans[i] = -1;

            if(mp.ceilingKey(end) != null) {
                int nxtStart = mp.ceilingKey(end);
                ans[i] = mp.get(nxtStart);
            }
        }

        return ans;
    }
}

*/

// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
/*
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr.length;

        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = -1;


        for(int i = 0; i < n; ++i) {
           while(stk.size() > 0) {
               int top = stk.peek();

               if(arr[top] < arr[i]) {
                   ans[top] = i;
                   stk.pop();
               } else {
                   break;
               }
           }

           stk.push( i );
        }

        for(int i = 0; i < n; ++i) {
           if(ans[i] != -1)
               Ans.add(arr[ans[i]]);
            else
               Ans.add(-1);
        }

        return Ans;
    }
}
*/

// https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1

/*
class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        // code here
        ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr.length;

        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = -1;


        for(int i = 0; i < n; ++i) {
           while(stk.size() > 0) {
               int top = stk.peek();

               if(arr[top] > arr[i]) {
                   ans[top] = i;
                   stk.pop();
               } else {
                   break;
               }
           }

           stk.push( i );
        }

        for(int i = 0; i < n; ++i) {
           if(ans[i] != -1)
               Ans.add(arr[ans[i]]);
            else
               Ans.add(-1);
        }

        return Ans;
    }
}

 */

// https://www.geeksforgeeks.org/problems/previous-greater-element/1

/*
class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr.length;

        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = -1;


        for(int i = n - 1; i >= 0; --i) {
           while(stk.size() > 0) {
               int top = stk.peek();

               if(arr[top] < arr[i]) {
                   ans[top] = i;
                   stk.pop();
               } else {
                   break;
               }
           }

           stk.push( i );
        }

        for(int i = 0; i < n; ++i) {
           if(ans[i] != -1)
               Ans.add(arr[ans[i]]);
            else
               Ans.add(-1);
        }

        return Ans;
    }
}

 */

// https://www.geeksforgeeks.org/problems/previous-smaller-element/1

/*
class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
         ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr.length;

        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = -1;


        for(int i = n - 1; i >= 0; --i) {
           while(stk.size() > 0) {
               int top = stk.peek();

               if(arr[top] > arr[i]) {
                   ans[top] = i;
                   stk.pop();
               } else {
                   break;
               }
           }

           stk.push( i );
        }

        for(int i = 0; i < n; ++i) {
           if(ans[i] != -1)
               Ans.add(arr[ans[i]]);
            else
               Ans.add(-1);
        }

        return Ans;
    }
}

*/


// https://leetcode.com/problems/valid-parentheses/

/*
class Solution {
    public boolean isValid(String s) {
        HashMap<Character , Character> mp = new HashMap<>();
        mp.put(')' , '(');
        mp.put(']' , '[');
        mp.put('}' , '{');

        Stack<Character> stk = new Stack<>();
        int n = s.length();

        for(int i = 0; i < n; ++i) {
            if(!mp.containsKey(s.charAt(i)))
                 stk.push(s.charAt(i));
            else
               if(!stk.isEmpty() && mp.get(s.charAt(i)).equals(stk.peek())) {
                   stk.pop();
               } else
                   return false;
        }

        return stk.size() == 0;

    }
}

*/

   // https://leetcode.com/problems/longest-valid-parentheses/

/*
class Solution {
    class Pair {
        Character first ; Integer second;

        Pair(Character first , Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    public int longestValidParentheses(String s) {
        int n = s.length();
        int [] arr = new int[n];

        Arrays.fill(arr , -1);

        Stack<Pair> stk = new Stack();

        for(int i = 0; i < n; ++i) {
            if(s.charAt(i) == ')') {
                if((stk.size() > 0) && (stk.peek().first.equals('('))) {
                     arr[i] = stk.peek().second;
                     stk.pop();
                } else {
                     stk.push(new Pair(')' , i));
                }
            } else {
                stk.push(new Pair('(' , i));
            }
        }

        // for(int i = 0; i < n; ++i)
        //   System.out.print(arr[i] + " ");

        // System.out.println();

        for(int i = n - 1; i >= 0; --i) {
            if(arr[i] != -1) {
                int end = arr[i];

                for(int j = i; j >= end; --j) {
                    arr[j] = 1;
                }

                i = end;
            }
        }

        // for(int i = 0; i < n; ++i)
        //   System.out.print(arr[i] + " ");

        // System.out.println();

        int Ans = 0 , cnt = 0;

        for(int i = 0; i < n; ++i) {
            if(arr[i] == 1) {
                ++cnt;
                Ans = Math.max(Ans , cnt);
            } else {
                cnt = 0;
            }
        }

        return Ans;
    }
}
*/

public class StackDataStructure {
    public static void main(String [] args) {

//       Stack<Integer> stk = new Stack<>();
//       stk.add(5);
//       stk.add(2);
//       stk.add(1);

//       System.out.println(stk);
//       System.out.println(stk.peek());
//       stk.pop();
//       System.out.println(stk);

//       ArrayList<Integer> arrL = new ArrayList<>();
//       arrL.add(59);
//       arrL.add(65);
//       arrL.add(52);
//       arrL.add(51);
//       arrL.add(25);
//
//       arrL.set(2 , 4);
//        System.out.println(arrL);

//       TreeSet<Integer> ts = new TreeSet<>();
//       ts.add(-1 * 4);
//       ts.add(-1 * 10);
//       ts.add(-1 * 15);
//       ts.add(-1 * 16);
//       ts.add(-1 * 17);
//       ts.add(-1 * 21);
//       ts.add(-1 * 25);

//       System.out.println(-ts.ceiling(-20));
//
//       TreeMap<Integer , Integer> mp = new TreeMap<>();
//       mp.put(3 , 10);
//       mp.put(5 , 15);
//       mp.put(10 , 19);
//
//       System.out.println(mp.ceilingKey(5));

       Stack<Integer> stk = new Stack<>();
       stk.push(4);
       stk.push(14);
       stk.push(8);
       stk.push(24);
       stk.push(-4);

       System.out.println(stk);

       System.out.println(stk.peek());
       stk.pop();
       System.out.println(stk.peek());

       while (!stk.isEmpty()) {
          stk.pop();
       }

       System.out.println(stk);
    }
}
