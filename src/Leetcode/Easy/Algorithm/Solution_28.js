var strStr = function(haystack, needle) {
  let answer = -1;
  for (let i = 0; i <= haystack.length - needle.length; i++) {
    if (haystack.substring(i, i + needle.length) === needle) {
      return i;
    }
  }
  return answer;
};
