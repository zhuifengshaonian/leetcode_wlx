/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        char[] charList =  a.toCharArray();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < charList.length; i++) {
            rs.append(charList[a.length()-i-1]);
        }
        return rs.toString().equals(a);
    }
}
// @lc code=end

