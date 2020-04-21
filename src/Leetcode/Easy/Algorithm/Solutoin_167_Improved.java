package Leetcode.Easy.Algorithm;

public class Solutoin_167_Improved {
    public int[] twoSum(int[] numbers, int target) {

        int end = numbers.length - 1;
        int start = 0;

        while (start < end) {

            int sideSum = numbers[start] + numbers[end];
            if (sideSum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sideSum > target) {
                end--;
            } else {
                start++;
            }

        }

        return null;

    }
}
