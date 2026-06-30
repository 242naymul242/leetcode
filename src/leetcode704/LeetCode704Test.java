package leetcode704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode704Test {
    LeetCode704 ob = new LeetCode704();
    @Test
    public void test(){
        int[] a = {-1,0,3,5,9,12};
        int t = 9;
        int e = 4;
        int r = ob.search(a,t);
        assertEquals(e,r);
    }
    @Test
    public void test1(){
        int[] a = {-1,0,3,5,9,12};
        int t = 2;
        int e = -1;
        int r = ob.search(a,t);
        assertEquals(e,r);
    }
    @Test
    public void test2(){
        int[] a = {5};
        int t = 5;
        int e = 0;
        int r = ob.search(a,t);
        assertEquals(e,r);
    }

}