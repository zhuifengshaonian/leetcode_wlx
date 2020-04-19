package com.leetcode.test.subject;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        int num = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int nextNum = getValue(s.charAt(i));
            if (num < nextNum) {
                result -= num;
            } else {
                result += num;
            }
            num = nextNum;
        }
        return result + num;
    }

    private int getValue(char charValue) {
        switch (charValue) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end
