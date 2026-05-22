package leetcode242;

import java.util.*;

public class LeetCode242 {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
//        Map<Character, Integer> m2 = new HashMap<>();
        int x ;

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
            if (!m.containsKey(c)) {
                return false;
            }
            x = m.get(c);
            x--;
            if (x == 0){
                m.remove(c);
            }
            else {
                m.put(c,x);
            }
        }
        if (m.isEmpty()){
            return true;
        }
        return false;
    }
}
