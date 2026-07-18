package Lecz17;
// https://leetcode.com/problems/remove-duplicates-from-sorted-list
/*
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cHead = head;
        ListNode curr = head;

        while (true) {
            if(curr == null)
               break;
            while(curr != null && curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            cHead.next = curr.next;
            cHead = curr.next;
            curr = cHead;
        }

        return head;
    }
}
 */

// https://leetcode.com/problems/linked-list-cycle-ii/
// https://leetcode.com/problems/rotate-list/

import java.util.ArrayList;
import java.util.List;

public class LinkedListContinue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(4 , 8 , 10 , 7, 11));
        Node head = null , tail = null;

        for(int i = 0; i < a.size(); ++i) {
             if(head  == null) {
                 head = new Node(a.get(i));
                 tail = head;
             } else {
                 tail.next = new Node(a.get(i));
                 tail = tail.next;
             }
        }

        Node curr = head;

        while(curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
