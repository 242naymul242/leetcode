package leetcode49;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            if (!m.containsKey(k)) {
                m.put(k, new ArrayList<>());
            }
            m.get(k).add(strs[i]);
        }
        return new ArrayList<>(m.values());
    }
}