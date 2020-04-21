package Leetcode.Easy.Algorithm;

import java.util.Arrays;

class Solution_169_Improved {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
