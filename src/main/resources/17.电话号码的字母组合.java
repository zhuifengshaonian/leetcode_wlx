import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start


class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        StringBuilder combination = new StringBuilder("");
        letterCombinations(digits,0,result,combination);
        return result;
    }

    private void letterCombinations(String digits, int i, List<String> result, StringBuilder combination) {
        if (digits.length() == i){
            result.add(combination.toString());
            return;
        }
        char c = digits.charAt(i);
        String s = translateDigit2String(c);
        Objects.requireNonNull(s);
        for (int j = 0; j < s.length(); j++) {
            letterCombinations(digits,i+1,result,combination.append(s.charAt(j)));
            combination.deleteCharAt(combination.length() - 1);
        }
    }
    private String translateDigit2String(char c){
        if (c == '2'){
            return "abc";
        }
        if (c == '3'){
            return "def";
        }
        if (c == '4'){
            return "ghi";
        }
        if (c == '5'){
            return "jkl";
        }
        if (c == '6'){
            return "mno";
        }
        if (c == '7'){
            return "pqrs";
        }
        if (c == '8'){
            return "tuv";
        }
        if (c == '9'){
            return "wxyz";
        }
        return null;
    }
}
// @lc code=end

