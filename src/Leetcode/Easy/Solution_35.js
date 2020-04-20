var searchInsert = function(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === target) {
      return i;
    } else if (nums[i] >= target) {
      return i;
    } else if (nums[0] > target) {
      return 0;
    }
  }
  return nums.length;
};
