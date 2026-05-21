package leetcode242;

import java.util.*;

public class LeetCode242 {

    public void add(Character ch, Map<Character, Integer> m) {
        if (m.containsKey(ch)) {
            int x = m.get(ch);
            x++;
            m.put(ch, x);
        } else {
            m.put(ch, 1);
        }
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            add(ch, m);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            add(ch, m2);
        }
        if (m.size() != m2.size()){
            return false;
        }
        else {
            List<Character> k = new ArrayList<>(m.keySet());
            for(int i = 0; i < k.size(); i++){
                Character key = k.get(i);
                if (!m2.containsKey(key)){
                    return false;
                }
                int  v = m.get(key);
                int v2 = m2.get(key);
                if (v != v2){
                    return false;
                }
            }
        }
        return true;
    }
}
