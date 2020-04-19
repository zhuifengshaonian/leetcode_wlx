import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if(data.containsKey(tmp)){
                return new int[] {data.get(tmp),i};
            }
            data.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

