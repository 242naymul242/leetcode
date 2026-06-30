package leetcode347;

import java.util.*;

public class LeetCode347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int a: nums) {
            m.put(a, m.getOrDefault(a, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(m.entrySet().stream().toList());
//        for (Map.Entry<Integer, Integer> entry : m.entrySet()){
//            Data d = new Data(entry.getKey(), entry.getValue());
//            ls.add(d);
//        }

        Comparator<Map.Entry<Integer, Integer>> comp = (a, b) -> {
            return b.getValue() - a.getValue();
        };
        ls.sort(comp);
//        int[] ans = new int[k];
//       for (int i = 0; i < k; i ++){
//           ans[i] = ls.get(i).getKey();
//       }


        return ls
                .subList(0, k)
                .stream()
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue).toArray();
    }
}
