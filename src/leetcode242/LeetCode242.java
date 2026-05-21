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
        int x;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (m.containsKey(ch)) {
                x = m.get(ch);
                x++;
                m.put(ch, x);
            } else {
                m.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (m2.containsKey(c)) {
                x = m2.get(c);
                x++;
                m2.put(c, x);
            } else {
                m2.put(c, 1);
            }
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
