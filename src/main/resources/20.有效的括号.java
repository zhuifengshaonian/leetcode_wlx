/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            } else {
                Character peek = stack.peek();
                if (isPair(peek,s.charAt(i))){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }


    private boolean isPair(char left, char right){
        return ('(' == left && ')' == right) || ('[' == left && ']' == right) || ('{' == left && '}' == right);
    }
}
// @lc code=end

