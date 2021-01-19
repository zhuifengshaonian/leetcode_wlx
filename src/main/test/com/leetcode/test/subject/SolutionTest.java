package com.leetcode.test.subject;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testMerge() {
        int[] a = {1, 2, 4};
        int[] b = {1, 3, 4};
        ListNode listNode = new Solution().mergeTwoLists(getListNode(a), getListNode(b));
        System.out.println(listNode);
    }

    private ListNode getListNode(int[] data) {
        ListNode node = new ListNode();
        ListNode tmp = node;
        for (int i = 0; i < data.length; i++) {
            tmp.next = new ListNode(data[i]);
            tmp = tmp.next;
        }
        return node.next;
    }
}