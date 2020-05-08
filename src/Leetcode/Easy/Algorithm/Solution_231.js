var isPowerOfTwo = function (n) {
  if (n === 0) return false;
  if (n % 2 != 0 && n !== 1) return false;

  while (n >= 1) {
    if (n === 1) return true;
    n /= 2;
  }

  return false;
};
