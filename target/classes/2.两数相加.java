import com.leetcode.test.subject.Subject_02_Two_Sum.ListNode;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result, dump = new ListNode(0);
        result = dump;
        int stepResult = 0;
        ListNode left = l1;
        ListNode right = l2;
        while(left != null || right != null | stepResult != 0){
            if(left != null){
                stepResult += left.val;
                left = left.next;
            }
            if(right != null){
                stepResult += right.val;
                right = right.next;
            }
            dump.next = new ListNode(stepResult %10);
            stepResult = stepResult / 10;
            dump = dump.next;
        }
        return result.next;
    }
}
// @lc code=end

