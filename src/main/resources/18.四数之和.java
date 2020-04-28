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
        for (int i = 0; i < nums.length - 4; i++) {
            if(nums[i] == nums[i+1]){
                continue;
            }
            for (int j = i + 1; j < nums.length - 3; j++) {
                if(nums[j] == nums[j + 1]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 4;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target){
                        left ++;
                    }else if (sum > target){
                        right --;
                    } else {
                        res.add(Arrays.asList(i,j,left,right));
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

