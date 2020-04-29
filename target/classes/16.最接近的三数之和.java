package com.leetcode.test.subject;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
// @lc code=end
