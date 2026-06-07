package leetcode347;

import java.util.*;

public class LeetCode347 {
    class Data {
        int key;
        int val;

        Data(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int x;
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            if (m.containsKey(a)){
                x = m.get(a);
                x++;
                m.put(a,x);
            }
            else {
                m.put(a,1);
            }
        }

        List<Data> ls = new ArrayList<>();
        List<Integer> keys = new ArrayList<>(m.keySet());
        for (int i = 0; i < keys.size();i ++){
            int key = keys.get(i);
            int v = m.get(key);
            Data d = new Data(key,v);
            ls.add(d);
        }

        Comparator<Data> comp = (a, b) -> {
            return b.val - a.val;
        };
        ls.sort(comp);
        int[] ans = new int[k];
       for (int i = 0; i < k; i ++){
           ans[i] = ls.get(i).key;
       }

//        Comparator<Integer> comp = (a, b) -> {
////            return a - b;
//            return b - a;
////            if (a < b) {
////                return -1;
////            } else if (a > b) {
////                return +1;
////            } else {
////                return 0;
////            }
//        };

        return ans;
    }
}
