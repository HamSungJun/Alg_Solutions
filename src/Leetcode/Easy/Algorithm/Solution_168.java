package Leetcode.Easy.Algorithm;

class Solution_168 {
    public String convertToTitle(int n) {

        // A - Z :: 1 - 26 :: 65 - 90
        StringBuilder sBuf = new StringBuilder();
        while (n != 0) {
            sBuf.append((char) ('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        sBuf.reverse();
        return sBuf.toString();

    }
}

