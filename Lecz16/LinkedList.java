package Lecz16;

import java.util.*;
import java.util.Scanner;

/***************** Dijoint Set Union ***************/
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/

/***************** Liunked List ***************/
// https://leetcode.com/problems/add-two-numbers/

/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ansCurr = null , ansHead = null;

        while((l1 != null) && (l2 !=  null)) {
            int val = (l1.val + l2.val + carry) , rem = val % 10;

            if(val > 9)
               carry = 1;
            else
               carry = 0;

            if(ansHead == null) {
                ansHead = new ListNode(rem);
                ansCurr = ansHead;
            } else {
                ansCurr.next = new ListNode(rem);
                ansCurr = ansCurr.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while((l1 != null)) {
            int val = (l1.val + carry) , rem = val % 10;

            if(val > 9)
               carry = 1;
            else
               carry = 0;

            if(ansHead == null) {
                ansHead = new ListNode(rem);
                ansCurr = ansHead;
            } else {
                ansCurr.next = new ListNode(rem);
                ansCurr = ansCurr.next;
            }

            l1 = l1.next;
        }

        while((l2 !=  null)) {
            int val = (l2.val + carry) , rem = val % 10;

            if(val > 9)
               carry = 1;
            else
               carry = 0;

            if(ansHead == null) {
                ansHead = new ListNode(rem);
                ansCurr = ansHead;
            } else {
                ansCurr.next = new ListNode(rem);
                ansCurr = ansCurr.next;
            }
            l2 = l2.next;
        }

        if(carry > 0)
            ansCurr.next = new ListNode(carry);

        return ansHead;
    }
}
*/

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/*
class Solution {
    boolean f = false;

    class Int {
        int cnt;

        Int(int cnt) {
            this.cnt = cnt;
        }
    }

    public void f(ListNode curr , Int X) {
        if(curr == null)
           return;

        f(curr.next , X);
        X.cnt--;

        if(X.cnt == 0) {
            if(curr.next == null) {

            } else {
               f = true;
               curr.next = curr.next.next;
            }
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        f = false;
        Int X = new Int(n + 1);

        f(head , X);

        if(!f) {
           head = head.next;
        }

        return head;
    }
}
*/

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
