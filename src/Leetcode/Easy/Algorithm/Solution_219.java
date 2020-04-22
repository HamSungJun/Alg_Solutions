package Leetcode.Easy.Algorithm;

import java.util.Arrays;

class Solution_219 {

    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicate(new int[]{99, 99}, 2));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length <= 1) return false;

        for (int i = 0; i <= nums.length - k; i++) {

            int[] nextRange = new int[]{(Math.max(i - k, 0)), (Math.min(i + k, nums.length))};
            if (hasDup(Arrays.copyOfRange(nums, nextRange[0], nextRange[1]), nums[i])) {
                return true;
            }

        }

        return false;

    }

    public static boolean hasDup(int[] subNums, int target) {
        if (subNums.length <= 1) return false;
        int acc = 0;
        for (int i = 0; i < subNums.length; i++) {
            if (subNums[i] == target) {
                acc += 1;
            }
            if (acc >= 2) return true;
        }
        return false;
    }
}
