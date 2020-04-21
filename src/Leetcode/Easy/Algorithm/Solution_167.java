package Leetcode.Easy.Algorithm;

import java.util.Arrays;

class Solution_167 {
    public int[] twoSum(int[] numbers, int target) {
        int idx = -1;
        for (int i = 0; i < numbers.length; i++) {
            idx = binarySearch(Arrays.copyOfRange(numbers, (i + 1), numbers.length), target - numbers[i]);
            if (idx != -1) {
                return new int[]{(i + 1), (idx + i + 2)};
            }

        }
        return null;
    }

    public int binarySearch(int[] copyNumbers, int key) {

        int low = 0;
        int high = copyNumbers.length - 1;

        while (low <= high) {

            int mid = (high + low) / 2;
            if (copyNumbers[mid] == key) {
                return mid;
            } else {

                if (copyNumbers[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }

        return -1;

    }

}
