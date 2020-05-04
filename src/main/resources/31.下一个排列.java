/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {

        int index = nums.length - 2;
        for (; index >= 0; index--) {
            if(nums[index + 1] > nums[index]){
                break;
            }
        }
        if(index >= 0){
            int j = nums.length -1;
            while(j>=0 && nums[j] <= nums[index]){
                j--;
            }
            swap(nums, index, j);
        }
        reverse(nums, index + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

