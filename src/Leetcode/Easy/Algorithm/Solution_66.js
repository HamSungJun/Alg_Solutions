var plusOne = function(digits) {
  let a = BigInt(digits.join(""));
  return ("" + (a + 1n)).split("");
};

console.log(plusOne([9]));
