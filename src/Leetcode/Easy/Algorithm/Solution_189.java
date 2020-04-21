package Leetcode.Easy.Algorithm;

class Solution_189 {
    public void rotate(int[] nums, int k) {

        while (k-- > 0) {

            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i >= 1; i--) {
                swap(i - 1, i, nums);
            }
            nums[0] = temp;

        }

    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
