// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
  // write your code in JavaScript (Node.js 8.9.4)
  let oneCount = 0;
  let passingCount = 0;
  for (let index = A.length - 1; index >= 0; index--) {
    if (A[index] === 1) {
      oneCount += 1;
    } else {
      passingCount += oneCount;
    }
  }
  return passingCount > 1000000000 ? -1 : passingCount;
}

solution([0, 1, 0, 1, 1]);
