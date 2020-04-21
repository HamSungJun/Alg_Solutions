var isPalindrome = function(x) {
  if (x === 0) return true;

  let reverseX = ("" + x)
    .split("")
    .reverse()
    .join("");

  return "" + x === reverseX ? true : false;
};

console.log(isPalindrome(121));
