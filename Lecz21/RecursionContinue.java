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

/*
class Solution {
    // Function to delete middle element of a stack.
    public static void f(Stack<Integer> s , int mid) {
        int val = s.pop();

        if(mid == 1)
            return;

        f(s , mid - 1);

        s.push(val);
    }

    public void deleteMid(Stack<Integer> s) {
        // code here

        int mid = (s.size() + 1) / 2;

        if(s.size() % 2 == 0)
           ++mid;

        f(s , mid);
    }
}
*/

// https://leetcode.com/problems/combinations/submissions/1916018336/
/*
class Solution {
    public List<List<Integer>> f(int inx , int n) {
        if(inx > n) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>());
            return ans;
        }

        List<List<Integer>> ans = f(inx + 1 , n);

        int sz = ans.size();

        // System.out.println(inx + " : inx , " + ans.size() + " : sz");

        for(int i = 0; i < sz; ++i) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(inx);

            for(int j = 0; j < ans.get(i).size(); ++j)
               t.add(ans.get(i).get(j));

            ans.add(t);
        }

        return ans;
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> t = f(1 , n);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < t.size(); ++i)
            if(t.get(i).size() == k)
                ans.add(t.get(i));

        return ans;
    }
}

*/

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
