/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp = new ListNode(0, head);

        ListNode first = tmp;
        ListNode second = tmp;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return tmp.next;
    }
}
// @lc code=end

