package com.leetcode.test.subject;

public class Subject_01_Two_Sum {

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */


    public int[] twoSum(int[] nums, int target) {
        for (int i : nums) {
            for (int j : nums) {
                if (i + j == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
