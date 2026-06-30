package leetcode167;

import java.util.HashMap;
import java.util.Map;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            m.put(numbers[i],i);
        }
        for (int i = 0; i < numbers.length ; i++) {
            int x = numbers[i];
            int y = target - x;
            if (m.containsKey(y)) {
                r[0] = i;
                r[1] = m.get(y);
            }
        }
        int a = 1;
        for (int i = 0; i < r.length;i++){
            r[i] = r [i] + a;
        }
        for (int i = 1; i < r.length; i++) {

            int key = r[i];
            int j = i - 1;

            while (j >= 0 && r[j] > key) {
                r[j + 1] = r[j];
                j--;
            }

            r[j + 1] = key;
        }
        for (int i = 0; i < r.length;i++){
            System.out.println(r[i]);
        }

        return r;

    }
}
