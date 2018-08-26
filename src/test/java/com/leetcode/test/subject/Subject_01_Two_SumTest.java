package com.leetcode.test.subject;

import org.junit.Test;

public class Subject_01_Two_SumTest
{

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */

    @Test
    public void twoSum()
    {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = new Subject_01_Two_Sum().twoSum(nums, target);


        for (int i : result)
        {
            System.out.println("num is " + i);
        }

    }
}