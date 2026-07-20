package Lecz18;
// https://leetcode.com/problems/delete-node-in-a-linked-list/

/*
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
*/

/*
class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }

        node.val = node.next.val;
        node.next = null;
    }
}
*/

// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
/*
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode left = head;
        ListNode right = head;

        int pfsum = 0;

        HashMap<Integer , ListNode> mp = new HashMap<>();

        while(right != null) {
            pfsum += right.val;

            if(pfsum == 0) {
                head = right.next;
                right = head;
                mp.clear();
                continue;
            }

            if(mp.containsKey(pfsum)) {
                ListNode actual = mp.get(pfsum);
                ListNode temp = actual;
                int tSum = pfsum;

                while(temp.next != right) {
                    tSum += temp.next.val;
                    temp = temp.next;

                    mp.remove(tSum);
                }

                actual.next = right.next;
                right = right.next;
            } else {
                mp.put(pfsum , right);
                right = right.next;
            }
        }

        return head;
    }
}

*/

// https://leetcode.com/problems/copy-list-with-random-pointer/
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

import Lecz12.Trees;

import java.util.ArrayDeque;
import java.util.TreeMap;

public class LinkedListContinue {
    public static void main(String [] args) {
        TreeMap<Integer , Integer> x = new TreeMap<>();

        int Cprefix = 0;

        x.remove(Cprefix);
    }
}
