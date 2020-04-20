package Leetcode.Easy;

import java.util.Arrays;

class Solution_136_try1 {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1]) {

                if (nums[i + 1] != nums[i + 2]) {
                    return nums[i + 1];
                } else {
                    return nums[i];
                }

            }

        }

        return nums[nums.length - 1];


    }
}
