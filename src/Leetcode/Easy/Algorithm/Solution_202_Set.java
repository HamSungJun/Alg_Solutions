package Leetcode.Easy.Algorithm;

import java.util.HashSet;
import java.util.Set;

class Solution_202_Set {
    // 자료의 유일성을 보장하는 Set을 이용하여 기존 Set에 있는 원소가 들어오는 경우 사이클로 판단하는 풀이
    public boolean isHappy(int n) {

        Set<Integer> uniqSet = new HashSet<>();
        while (n != 1) {

            n = happyLoop(n);
            if (uniqSet.contains(n)) {
                return false;
            }
            uniqSet.add(n);

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
