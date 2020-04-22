package Leetcode.Easy.Algorithm;

class Solution_202 {
    // 사이클이 있는 넘버는 상수 4로 반복되는 점을 이용한 풀이
    public boolean isHappy(int n) {

        int origin = 4;
        boolean isFirstHappyLoop = true;
        while (n != 1) {

            n = happyLoop(n);
            if (n == origin && !isFirstHappyLoop) return false;
            if (isFirstHappyLoop) {
                isFirstHappyLoop = false;
            }

        }

        return true;

    }

    public int happyLoop(int n) {

        int acc = 0;
        while (n > 0) {
            acc += (int) Math.pow((n % 10), 2);
            n /= 10;
        }
        return acc;

    }

}
