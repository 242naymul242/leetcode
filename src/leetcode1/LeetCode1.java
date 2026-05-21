package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (mp.containsKey(y)) {
                result[0] = i;
                result[1] = mp.get(y);
            }
        }
        return result;
    }
}
