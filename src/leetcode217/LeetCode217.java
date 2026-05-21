package leetcode217;

import java.util.HashSet;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}
