var reverse = function(x) {
  let numArr = ("" + x).split("");
  strrev(numArr);

  if (!Number.isInteger(parseInt(numArr[numArr.length - 1]))) {
    numArr.unshift(numArr.pop());
  }

  numArr = parseInt(numArr.join(""));
  return numArr > 0x7fffffff ? 0 : numArr;
};

const strrev = arr => {
  if (arr.length >= 2) {
    for (let index = 0; index < Math.floor(arr.length / 2); index++) {
      let temp = arr[index];
      arr[index] = arr[arr.length - (1 + index)];
      arr[arr.length - (1 + index)] = temp;
    }
  }
};

console.log(reverse(123));
