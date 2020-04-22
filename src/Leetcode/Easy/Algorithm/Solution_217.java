package Leetcode.Easy.Algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution_217 {
    public boolean containsDuplicate(int[] nums) {
        // Faster.
        if (nums.length <= 1) return true;

        Arrays.sort(nums);
        int track = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (track == nums[i]) {
                return true;
            } else {
                track = nums[i];
            }

        }

        return false;

    }

//    public boolean containsDuplicate(int[] nums) {
//        // Slow.
//        if(nums.length <= 1) return false;
//
//        Set<Integer> uniqSet = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            if(uniqSet.contains(nums[i])){
//                return true;
//            }
//            uniqSet.add(nums[i]);
//        }
//
//        return false;
//
//    }
}
