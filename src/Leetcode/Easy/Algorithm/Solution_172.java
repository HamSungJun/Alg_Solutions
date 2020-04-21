package Leetcode.Easy.Algorithm;

class Solution_172 {
    public int trailingZeroes(int n) {

        int twoAcc = 0;
        int fiveAcc = 0;

        for (long i = 2; i <= n; i *= 2) {
            twoAcc += n / i;
        }

        for (long i = 5; i <= n; i *= 5) {
            fiveAcc += n / i;
        }

        return Math.min(twoAcc, fiveAcc);

    }
}
