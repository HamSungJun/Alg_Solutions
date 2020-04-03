// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
  // write your code in JavaScript (Node.js 8.9.4)
  A.sort((a, b) => {
    return a - b;
  });

  const i = A.length - 1;
  const p1 = A[i - 2] * A[i - 1] * A[i];
  const p2 = A[0] * A[1] * A[i];

  return p1 > p2 ? p1 : p2;
}
