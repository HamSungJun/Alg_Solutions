package Leetcode.Easy.Algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution_205 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Character smc = m1.get(sc);
            Character tmc = m2.get(tc);

            if (smc != null) {
                if (smc.charValue() != tc) {
                    return false;
                }
            } else {
                m1.put(sc, tc);
            }

            if (tmc != null) {
                if (tmc.charValue() != sc) {
                    return false;
                }
            } else {
                m2.put(tc, sc);
            }

        }

        return true;

    }
}
