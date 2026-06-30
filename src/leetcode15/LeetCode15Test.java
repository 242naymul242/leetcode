package leetcode15;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode15Test {
    LeetCode15 ob = new LeetCode15();
    @Test
    public void test1(){
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> e = Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1)
        );
        List<List<Integer>> r = ob.threeSum(a);
        assertEquals(e,r);
    }
}