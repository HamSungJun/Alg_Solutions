var merge = function(nums1, m, nums2, n) {
  let i = m + n - 1;
  while (n > 0) {
    if (nums1[m - 1] > nums2[n - 1]) {
      nums1[i] = nums1[m - 1];
      m -= 1;
    } else {
      nums1[i] = nums2[n - 1];
      n -= 1;
    }
    i -= 1;
  }
  return nums1;
};

console.log(merge([1, 3, 5, 0, 0, 0], 3, [2, 4, 6], 3));
