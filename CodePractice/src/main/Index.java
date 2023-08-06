package main;

import dataTypes.*;

public class Index {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        ListNode merged = mergeTwoLists(node1, node4);

        // Print the merged list for verification
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);  // Dummy node
        ListNode prev = dummy;              // Pointer to the last node of the merged list

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        // Attach the remaining nodes, if any
        if (list1 != null) {
            prev.next = list1;
        }
        if (list2 != null) {
            prev.next = list2;
        }

        return dummy.next;
    }
}
