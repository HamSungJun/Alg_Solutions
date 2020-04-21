var twoSum = function(nums, target) {
  for (let index = 0; index < nums.length - 1; index++) {
    for (let index2 = index + 1; index2 < nums.length; index2++) {
      if (nums[index] + nums[index2] === target) {
        return [index, index2];
      }
    }
  }
};
