package Leetcode.Easy;

class Solution_136_try2 {
    public int singleNumber(int[] nums) {

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;

    }
}
