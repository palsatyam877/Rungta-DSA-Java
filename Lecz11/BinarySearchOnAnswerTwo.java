package Lecz11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// https://leetcode.com/problems/koko-eating-bananas/
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
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
