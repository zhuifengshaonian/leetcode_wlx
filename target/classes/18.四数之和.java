import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            for (int j = i + 1; j <= nums.length - 3; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target){
                        left ++;
                    }else if (sum > target){
                        right --;
                    } else {
                        res.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                        while(left < right && nums[left] == nums[left + 1]){
                            left ++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right --;
                        }
                        left ++;
                        right --;
                    }
                }
                while(j + 1 <= nums.length -3 && nums[j] == nums[j+1]){
                    j++;
                }
            }
            while(i+1 <= nums.length - 4 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return res;
    }
}
// @lc code=end

