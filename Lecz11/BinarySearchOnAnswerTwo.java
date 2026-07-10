package Lecz11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

/*
class Solution {
    public int shipWithinDays(int[] w, int d) {
        long totW = 0;
        int n = w.length;

        for(int i = 0; i < n; ++i)
            totW += w[i];

        boolean [] monoF = new boolean[(int)totW + 1];

        for(int shipC = 1; shipC <= totW; ++shipC) {
            int currSpace = shipC , cntD = 1;

            boolean f = true;

            for(int i = 0; i < n; ++i)
              if(w[i] > shipC) {
                f = false;
                  currSpace = shipC;
                  monoF[shipC] = false;
                  break;
              } else {
                  if(w[i] > currSpace) {
                      ++cntD;
                      currSpace = shipC;
                      currSpace -= w[i];
                  }  else {
                      currSpace -= w[i];
                  }
              }

            if(!f)
               continue;


            if(cntD <= d)
                monoF[shipC] = true;
            else
                monoF[shipC] = false;
        }

        int ans = 0;

        for(int i = 1; i <= totW; ++i)
            if(monoF[i]) {
               if(ans == 0)
                  ans = i;
            //    System.out.print("T ");
            }
            // else
            //    System.out.print("F ");


       return ans;
    }
}
*/

/*
class Solution {
    public int shipWithinDays(int[] w, int d) {
        long totW = 0;
        int n = w.length;

        for(int i = 0; i < n; ++i)
            totW += w[i];

        boolean [] monoF = new boolean[(int)totW + 1];

        long lo = 0 , hi = 0;

        for(int i = 0; i < n; ++i) {
            lo = Math.max(lo , w[i]);
            hi += w[i];
        }

        long ans = hi;

        while(lo <= hi) {
            long shipC = (lo + hi) / 2;
            long currSpace = shipC , cntD = 1;

            boolean f = true;

            for(int i = 0; i < n; ++i)
              if(w[i] > shipC) {
                  f = false;
                  currSpace = shipC;
                  break;
              } else {
                  if(w[i] > currSpace) {
                      ++cntD;
                      currSpace = shipC;
                      currSpace -= w[i];
                  }  else {
                      currSpace -= w[i];
                  }
              }

            if(!f) {
                lo = shipC + 1;
                continue;
            }

            if(cntD <= d) {
                ans = shipC;
                hi = shipC - 1;
            } else {
                lo = shipC + 1;
            }

        }

       return (int)ans;
    }
}
*/

// https://leetcode.com/problems/koko-eating-bananas/

/*
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx = 0 , n = piles.length;

        for(int i = 0; i < n; ++i)
            mx = Math.max( piles[i] , mx );

        boolean [] kokoS = new boolean[mx + 1];

        for(int speed = 1 ; speed <= mx; ++speed) {
            int cntH = 0;

            for(int i = 0; i < n; ++i) {
                cntH += (piles[i] / speed);

                if(piles[i] % speed != 0)
                   cntH++;
            }

            if(cntH <= h)
               kokoS[speed] = true;
            else
               kokoS[speed] = false;
        }

        int ans = 0;

        for(int i = 1; i <= mx; ++i) {
            if((ans == 0) && (kokoS[i] == true))
                   ans = i;
            if(kokoS[i])
              System.out.print("T ");
            else
              System.out.print("F ");
        }

        return ans;
    }
}
*/

/*
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long mx = 0 , n = piles.length;

        for(int i = 0; i < n; ++i)
            mx = Math.max( piles[i] , mx );

        long lo = 1 , hi = mx;
        long ans = mx;

        while(lo <= hi) {
            long speed = (lo + hi) / 2;
            long cntH = 0;

            for(int i = 0; i < n; ++i) {
                cntH += (piles[i] / speed);

                if(piles[i] % speed != 0)
                   cntH++;
            }

            if(cntH <= h) {
                ans = speed;
                hi = speed - 1;
            } else {
                lo = speed + 1;
            }
        }

        return (int)ans;
    }
}
*/

// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

/*
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long hi = 0;
        long ans = -1;

        for(int i = 0; i < n; ++i)
            hi = Math.max(bloomDay[i] , hi);

        boolean [] monoF = new boolean[(int)hi + 1];

        for(long days = 1; days <= hi; ++days) {
            long boq = 0 , AdjC = 0;

            for(int i = 0; i < n; ++i)
               if(bloomDay[i] <= days) {
                   AdjC++;
               } else {
                   boq += (AdjC / k);
                   AdjC = 0;
               }

               boq += (AdjC / k);

            if(boq >= m) {
                if(ans == -1)
                    ans = days;
                monoF[(int)days] = true;
            } else {
                monoF[(int)days] = false;
            }
        }

        for(int i = 1; i <= hi; ++i) {
            if(monoF[i])
               System.out.print("T ");
            else
              System.out.print("F ");
        }

        return (int)ans;
    }
}
*/

/*
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long hi = 0;
        long ans = -1;

        for(int i = 0; i < n; ++i)
            hi = Math.max(bloomDay[i] , hi);

        // boolean [] monoF = new boolean[(int)hi + 1];
        long lo = 1;

        while(lo <= hi) {
            long days = (lo + hi) / 2;
            long boq = 0 , AdjC = 0;

            for(int i = 0; i < n; ++i)
               if(bloomDay[i] <= days) {
                   AdjC++;
               } else {
                   boq += (AdjC / k);
                   AdjC = 0;
               }

               boq += (AdjC / k);

            if(boq >= m) {
                hi = days - 1;
                ans = days;
                // monoF[(int)days] = true;
            } else {
                lo = days + 1;
                // monoF[(int)days] = false;
            }
        }

        // for(int i = 1; i <= hi; ++i) {
        //     if(monoF[i])
        //        System.out.print("T ");
        //     else
        //       System.out.print("F ");
        // }

        return (int)ans;
    }
}

*/

// https://codeforces.com/contest/1873/problem/E

public class BinarySearchOnAnswerTwo {
    public static void main(String [] args) {
        System.out.println("Hello World");
    }
}



/************ E. Building an Aquarium ****************/

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String [] args) throws IOException {
        // Create BufferedReader to read input efficiently
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));

        // Read the first line and split it into tokens
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(st.nextToken());

        for(int i = 0; i < t; ++i) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int [] a = new int[n];

            for(int j = 0; j < n; ++j)
                a[j] = Integer.parseInt(st.nextToken());

            long ans = 0;

            // Write Code here

            bw.write(String.valueOf(ans));
            bw.newLine();
        }

        bw.flush();
    }
}
*/
