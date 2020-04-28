import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {

    public static void main(String[] args) {
        String test = "abba";
        int a = new Solution().lengthOfLongestSubstring(test);
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> dataMap = new HashMap<>();
        int ans = 0;

        //  窗口是 【i,j)
        for (int i = 0,j = 0; j < s.length(); j++) {
            if(dataMap.containsKey(s.charAt(j))){
                i = Math.max(dataMap.get(s.charAt(j)), i);
            }
            ans = Math.max(j-i+1,ans);
            dataMap.put(s.charAt(j),j+1);
        }
        return ans;

    }
}
// @lc code=end

