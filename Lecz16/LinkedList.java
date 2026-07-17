package Lecz16;

import java.util.*;
import java.util.Scanner;

/***************** Dijoint Set Union ***************/
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/

/***************** Liunked List ***************/
// https://leetcode.com/problems/add-two-numbers/
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// https://leetcode.com/problems/add-two-numbers/
// https://leetcode.com/problems/linked-list-cycle-ii/
// https://leetcode.com/problems/rotate-list/

public class LinkedList {
    public static class DSU {
        public static int [] p , sz;

        DSU(int n) {
            p = new int[n + 1];
            sz = new int[n + 1];

            for(int i = 0; i <= n; ++i) {
                p[i] = i;
                sz[i] = 1;
            }
        }

        public static int find(int node) {
            if(p[node] == node)
                  return node;

            return find(p[node]);
        }

        public static void Union(int node1 , int node2) {
             node1 = find(node1);
             node2 = find(node2);

             if(node1 != node2) {
                 if(node1 > node2) {
                     int temp = node1;
                     node1 = node2;
                     node2 = temp;
                 }

                 sz[node1] += sz[node2];
                 p[node2] = node1;
             }
        }
    }

    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> e = new ArrayList<>();

        e.add(new ArrayList<>(List.of(1 , 4)));
        e.add(new ArrayList<>(List.of(1 , 3)));
        e.add(new ArrayList<>(List.of(3 , 7)));
        e.add(new ArrayList<>(List.of(2 , 3)));
        e.add(new ArrayList<>(List.of(3 , 5)));
        e.add(new ArrayList<>(List.of(3 , 6)));
        e.add(new ArrayList<>(List.of(2 , 8)));
        e.add(new ArrayList<>(List.of(9 , 10)));
        e.add(new ArrayList<>(List.of(9 , 11)));
        e.add(new ArrayList<>(List.of(11 , 12)));
        e.add(new ArrayList<>(List.of(11 , 13)));
        e.add(new ArrayList<>(List.of(14 , 15)));
        e.add(new ArrayList<>(List.of(14 , 16)));
        e.add(new ArrayList<>(List.of(15 , 16)));

        DSU d = new DSU(16);

        for(int i = 0; i < e.size(); ++i) {
            d.Union(e.get(i).get(0) , e.get(i).get(1));
        }

        for(int i = 1; i <= 16; ++i) {
            System.out.println(d.find(i) + " -> " + i);
        }

    }
}
