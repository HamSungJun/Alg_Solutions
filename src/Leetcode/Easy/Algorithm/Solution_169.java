package Leetcode.Easy.Algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution_169 {

    public int majorityElement(int[] nums) {

        int majorCount = (int) Math.ceil((double) nums.length / 2);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }

            if (countMap.get(nums[i]) >= majorCount) {
                return nums[i];
            }

        }

        return -1;

    }
}
