/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        if(height.length<2){
            return 0;
        }
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        while(left != right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[right], height[left]));
            if(height[left]>=height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }
}
// @lc code=end

