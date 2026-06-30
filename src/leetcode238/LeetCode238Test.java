package leetcode238;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class LeetCode238Test {
    LeetCode238 ob = new LeetCode238();
    @Test
    public void test1(){
        int[] a = {1,2,3,4};
        int[] e = {24,12,8,6};
        int[] r = ob.productExceptSelf(a);
        assertArrayEquals(e,r);
    }
    @Test
    public void test2(){
        int[] a = {-1,1,0,-3,3};
        int[] e = {0,0,9,0,0};
        int[] r = ob.productExceptSelf(a);
        assertArrayEquals(e,r);
    }

}