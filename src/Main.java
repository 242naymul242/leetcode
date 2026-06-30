import leetcode1.LeetCode1;
import leetcode167.LeetCode167;
import leetcode242.LeetCode242;
import leetcode347.LeetCode347;
import leetcode49.LeetCode49;
import leedcode125.LeetCode125;

void main() {
    LeetCode347 ob = new LeetCode347();
    int[] array = {1,1,1,2,2,3};
    int k = 2;
    int []ans = ob.topKFrequent(array, k);
    System.out.println(Arrays.toString(ans));
}
