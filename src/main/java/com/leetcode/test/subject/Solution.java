package com.leetcode.test.subject;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode first = new ListNode(0, l1);
        ListNode second = new ListNode(0, l2);
        ListNode result = new ListNode();
        ListNode tmp = result;
        while (first.next != null && second.next != null) {
            if (first.next.val < second.next.val) {
                tmp.next = new ListNode(first.next.val);
                first = first.next;
            } else {
                tmp.next = new ListNode(second.next.val);
                second = second.next;
            }
            tmp = tmp.next;
        }
        if (first.next != null) {
            tmp.next = first.next;
        }
        if (second.next != null) {
            tmp.next = second.next;
        }
        return result.next;
    }

}
