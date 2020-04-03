function solution(A) {
  return Object.keys(
    A.reduce((acc, curr) => {
      if (!(curr in acc)) {
        acc[curr] = true;
      }
      return acc;
    }, {})
  ).length;
}
