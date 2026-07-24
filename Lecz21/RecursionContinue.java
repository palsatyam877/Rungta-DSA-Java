package Lecz21;

// https://www.geeksforgeeks.org/problems/reverse-a-stack/1

/*
class Solution {

    public static void rev(Stack<Integer> st , Stack<Integer> Aux) {
        if(Aux.size() == 0)
            return;

        int val = Aux.pop();

        rev(st , Aux);

        st.push(val);
    }

    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer> Aux = new Stack<>();

        while(st.size() > 0) {
            Aux.push(st.pop());
        }

        rev(st , Aux);

    }
}

*/

// https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
// https://leetcode.com/problems/combinations/submissions/1916018336/
// https://leetcode.com/problems/permutations/submissions/1916710797/
// https://leetcode.com/problems/finding-3-digit-even-numbers/
// https://leetcode.com/problems/merge-two-sorted-lists/
// https://leetcode.com/problems/longest-palindromic-substring/
// https://leetcode.com/problems/longest-common-subsequence/submissions/1916275503/



public class RecursionContinue {

    static int fib(int n) {
        if(n <= 1)
            return n;
        System.out.println("Started for : " + n);

        int ans =  fib(n - 1) + fib(n - 2);

        System.out.println("Ended for : " + n);

        return ans;
    }

    public static void main(String [] args) {
        System.out.println(fib(6));
    }
}
