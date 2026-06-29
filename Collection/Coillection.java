package Collection;
import java.util.*;

class MyComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        return Double.compare(o1.proteinIntake , o2.proteinIntake);
    }
}


public class Coillection {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

       /*
          /*

   class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length; int m = mat[0].length;
        int [][] vis = new int[n][m];
        int i = 0 , j = 0 , k = 0;
        int [][] dir = {{0 , 1} , {1 , 0} , {0 , -1} , {-1 , 0}};

        ArrayList<Integer> ans = new ArrayList<>();

        while(true) {
            vis[i][j] = 1;
            ans.add(mat[i][j]);

            int ix = i , jx = j;
            ix += dir[k][0]; jx += dir[k][1]; // next coordn

            if(ix >= n || jx >= m || ix < 0 || jx < 0 || (vis[ix][jx] == 1)) {
                ix = i; jx = j;
                k = (k + 1) % 4;

                ix += dir[k][0]; jx += dir[k][1];

                if(ix >= n || jx >= m || ix < 0 || jx < 0 || (vis[ix][jx] == 1))
                   break;
            }

            i = ix; j = jx;
        }

        return ans;
    }
}
        */

        // https://leetcode.com/problems/spiral-matrix-ii/description/

        /*
        class Solution {
    public int[][] generateMatrix(int n) {
        // int n = mat.length; int m = mat[0].length;
        int [][] ans = new int[n][n];
        int i = 0 , j = 0 , k = 0;
        int [][] dir = {{0 , 1} , {1 , 0} , {0 , -1} , {-1 , 0}};

        // ArrayList<Integer> ans = new ArrayList<>();
        int cnt = 0;

        while(true) {
            ans[i][j] = ++cnt;
            // ans.add(mat[i][j]);

            int ix = i , jx = j;
            ix += dir[k][0]; jx += dir[k][1]; // next coordn

            if(ix >= n || jx >= n || ix < 0 || jx < 0 || (ans[ix][jx] != 0)) {
                ix = i; jx = j;
                k = (k + 1) % 4;

                ix += dir[k][0]; jx += dir[k][1];

                if(ix >= n || jx >= n || ix < 0 || jx < 0 || (ans[ix][jx] != 0))
                   break;
            }

            i = ix; j = jx;
        }

        return ans;
    }
}
         */

        // sqrt

//        long n = sc.nextLong();

//        for(long i = 1; i <= n; ++i)
//            if(i*i == n) {
//                System.out.println(i + " is sqrt of " + n);
//                return;
//            } // O(N) --> 10^8
//        System.out.println("No sqrt for " + n);

/*
        int cnt = 0;

        for(long i = 1; i <= n; ++i)
            if(i*i == n) {
                System.out.println(cnt);
                System.out.println(i + " is sqrt of " + n);
                break;
            } else if(i*i > n) {
                System.out.println(cnt);
                System.out.println("No sqrt for " + n);
                break;
            } else {
                ++cnt;
            }  // O(sqrt(N))

            long lo = 1 , hi = n;

        System.out.println("))))))))))))))");
        long cnt1 = 0;

           while(lo <= hi) {
               long mid = (lo + hi) / (long)2;

               if(mid * mid == n) {
                   System.out.println(cnt1);
                   System.out.println(mid + " is sqrt of " + n);
                   return;

               } else if(mid * mid > n) {
                   hi = mid - 1;
                   ++cnt1;
               } else if(mid * mid < n) {
                   lo = mid + 1;
                   ++cnt1;
               }
           } // O(log(N))

        System.out.println(cnt1 + " : cnt1");

        System.out.println("No sqrt for " + n);

 */
//        for(long i = 2; i*i <= n; ++i)
//            if(n % i == 0) {
//                System.out.println(n + " is composite");
//                return;
//            }
//
//        System.out.println(n + " is a prime");

      // https://leetcode.com/problems/count-primes/description/

     /*
    public int countPrimes(int n) {
        n--;
        int [] a = new int[n + 1];

        for(int i = 2; i*i <= n;++i) {
            if(a[i] != 0) continue;

            for(int j = i * 2; j <= n; j += i) {
                a[j] = 1;
            }
        }

        int ans = 0;

        for(int i = 2; i <= n; ++i)
           if(a[i] == 0)
              ++ans;

        return ans;
    }
     */

        // https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

        Animal a1 = new Animal("Leo" , 1 , 3.5);
        Animal a2 = new Animal("Max" , 1 , 8.5);
        Animal a3 = new Animal("Antonio" , 1 , 4.5);
        Animal a4 = new Animal("Barney" , 1 , 1.5);

        ArrayList<Animal> L = new ArrayList<>(List.of(a1 , a2 , a3 , a4));

//        System.out.println(a1);

        Collections.sort(L, (o1 ,  o2) -> {
            return o2.name.compareTo(o1.name);
        } );

        Set<Integer> st = new TreeSet<>();

        System.out.println(L);
    }
}
