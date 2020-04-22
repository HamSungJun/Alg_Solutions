package Leetcode.Easy.Algorithm;

public class Solution_191 {
    // you need to treat n as an unsigned value
    final int[] wordBits = new int[65536];

    public int hammingWeight(int n) {

        int i = 0;
        int x = 0;
        int count = 0;

        for (i = 0; i <= 0xFFFF; i++) {
            x = i;
            for (count = 0; count < x; count++)
                x &= x - 1;
            wordBits[i] = count;
        }

        return wordBits[n & 0xFFFF] + wordBits[(n >> 16) & 0xFFFF];
    }

}
