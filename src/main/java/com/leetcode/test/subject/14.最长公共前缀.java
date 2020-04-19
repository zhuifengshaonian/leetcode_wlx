package com.leetcode.test.subject;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() > strs[i].length()) {
                prefix = strs[i];
            }
        }
        for (int i = 0; i < strs.length; i++) {
            int index = 0;
            for (; index < prefix.length() && index < strs[i].length(); index++) {
                if (prefix.charAt(index) != strs[i].charAt(index)) {
                    break;
                }
            }
            prefix = prefix.substring(0, index);
            if (prefix.length() == 0)
                return prefix;
        }
        return prefix;

    }
}
// @lc code=end
