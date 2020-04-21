package Leetcode.Easy.Algorithm;

class Solution_171 {
    public int titleToNumber(String s) {

        int acc = 0;
        for (int i = 0; i < s.length(); i++) {

            char nextChar = s.charAt(i);
            acc += (nextChar - 64) * Math.pow(26, s.length() - 1 - i);

        }
        return acc;

    }
}
