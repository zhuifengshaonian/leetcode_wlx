import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=218 lang=java
 *
 * [218] 天际线问题
 */

// @lc code=start
class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        int left = 0, right = 0, curHight = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            int x1 = buildings[i][0];
            int x2 = buildings[i][1];
            int h = buildings[i][2];
            if(x1==right){
                left = x1;
                right = x2;
                curHight = h>curHight? h:curHight;
                result.add(Arrays.asList(left, curHight));
            }else if(x1 > right){
                result.add(Arrays.asList(right,0));
                left =x1;
                right = x2;
                curHight = h;
                result.add(Arrays.asList(left, curHight));
            }else{
                if()
            }

        }

        
    }
}
// @lc code=end

