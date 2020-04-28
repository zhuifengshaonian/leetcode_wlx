/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null || p ==null){
            return false;
        }
        if(p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty()) && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0));
        if(p.length() >= 2 && p.charAt(1) == '*'){
            // 如果第二个字符是*  那么第一个字符可以是0个或是多个  
            // 因此要判断是0个和至少一个的情况
            return isMatch(s, p.substring(2)) || firstMatch && (isMatch(s.substring(1), p) );
        }else{
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
// @lc code=end

