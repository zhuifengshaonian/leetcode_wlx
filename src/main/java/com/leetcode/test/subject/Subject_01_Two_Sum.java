package com.leetcode.test.subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subject_01_Two_Sum
{

  /**
   * 给定 nums = [2, 7, 11, 15], target = 9
   * <p>
   * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
   */


  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length < 2) {
      return new int[]{};
    }
    int len = nums.length;
    for (int i = 0; i <= len - 2; i++) {
      for (int j = i + 1; j < len; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{};
  }
}
