package com.leetcode.test.subject;

public class Subject_02_Two_Sum {

  /**
   * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
   */


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    if (l1 == null && l2 != null) {
      return l2;
    } else if (l2 != null && l1 != null) {
      int ret = l1.val + l2.val;
      int count = ret / 10;
      ret = ret % 10;
      l1.val = ret;
      if (count > 0) {
        if (l1.next == null) {
          l1.next = new ListNode(count);
        } else {
          l1.next.val = l1.next.val + count;
        }
      }
      l1.next = addTwoNumbers(l1.next, l2.next);
    } else if (l1 != null && l2 == null) {
      if (l1.next == null) {
        l1.next = l1.val / 10 > 0 ? new ListNode(l1.val / 10) : null;
      } else {
        l1.next.val += l1.val / 10;
      }
      l1.val = l1.val % 10;
      l1.next = addTwoNumbers(l1.next, null);
    }
    return l1;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode ptr = result;
    int index = 0;
    while (l1 != null && l2 != null) {
      int res = index + l1.val + l2.val;
      index = res / 10;
      ptr.next = new ListNode(res % 10);
      ptr = ptr.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null) {
      int res = l1.val + index;
      ptr.next = new ListNode(res % 10);
      index = res / 10;
      ptr = ptr.next;
      l1 = l1.next;
    }
    while (l2 != null) {
      int res = l2.val + index;
      ptr.next = new ListNode(res % 10);
      index = res / 10;
      ptr = ptr.next;
      l2 = l2.next;
    }
    if (index > 0) {
      ptr.next = new ListNode(index);
    }
    return result.next;
  }
}
