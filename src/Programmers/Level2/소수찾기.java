package Programmers.Level2;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class 소수찾기 {

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println("Answer : " + s.solution("011"));

    }

}

class Solution {

    Set<Integer> uniqNumSet = new HashSet<>();
    int maxPermNumber = Integer.MIN_VALUE;
    int primeAcc = 0;
    StringBuilder sBuf = new StringBuilder();

    public int solution(String numbers) {

        String[] sNum = numbers.split("");
        for (int i = 1; i <= sNum.length; i++) {
            perm(sNum, 0, sNum.length, i);
        }

        countPrime();

        return primeAcc;

    }

    public void perm(String[] arr, int depth, int n, int k) {
        if (depth == k) {
//            print(arr);
            if (sBuf.length() > 0) {
                int nextPermNumber = Integer.parseInt(sBuf.toString());
                if (maxPermNumber < nextPermNumber) {
                    maxPermNumber = nextPermNumber;
                }
                uniqNumSet.add(nextPermNumber);
            }

            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            sBuf.append(arr[depth]);
            perm(arr, depth + 1, n, k);
            sBuf.deleteCharAt(depth);
            swap(arr, i, depth);
        }
    }

    public void countPrime() {

        boolean[] che = new boolean[maxPermNumber + 1];
        che[0] = che[1] = true;

        for (int i = 2; i * i <= maxPermNumber; i++) {
            for (int j = i + i; j <= maxPermNumber; j += i) {

                che[j] = true;

            }
        }

        Iterator setIter = uniqNumSet.iterator();
        while (setIter.hasNext()) {
            if (!che[(int) setIter.next()]) {
                primeAcc += 1;
            }
        }

    }

//    public void print(String[] arr){
//        System.out.println(Arrays.toString(arr));
//    }

    public void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
