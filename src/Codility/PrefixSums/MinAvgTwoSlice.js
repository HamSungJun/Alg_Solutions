// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
  // write your code in JavaScript (Node.js 8.9.4)

  let minAvg = (A[0] + A[1]) / 2;
  let minIdx = 0;

  for (let index = 2; index < A.length; index++) {
    let avg = (A[index - 2] + A[index - 1] + A[index]) / 3;
    if (minAvg > avg) {
      minAvg = avg;
      minIdx = index - 2;
    }

    avg = (A[index - 1] + A[index]) / 2;
    if (minAvg > avg) {
      minAvg = avg;
      minIdx = index - 1;
    }
  }

  return minIdx;
}

solution([4, 2, 2, 5, 1, 5, 8]);
