var removeDuplicates = function(nums) {
  let uniqPointer = 1;
  let lastHistory = nums[0];
  for (let index = 1; index < nums.length; index++) {
    if (lastHistory !== nums[index]) {
      lastHistory = nums[index];
      nums[uniqPointer++] = nums[index];
    }
  }

  nums.splice(uniqPointer);
};
