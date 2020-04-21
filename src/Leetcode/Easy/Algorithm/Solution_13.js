var romanToInt = function(s) {
  const romanMap = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
  let sArr = s.split("");
  let sP = 0;
  let answer = 0;
  while (sP <= sArr.length - 1) {
    const nextRoman = sArr[sP];
    let isSpecialCase = false;
    switch (nextRoman) {
      case "I":
        if (["V", "X"].includes(sArr[sP + 1])) {
          isSpecialCase = true;
          answer += romanMap[sArr[sP + 1]] - romanMap[nextRoman];
          sP++;
        }
        break;
      case "X":
        if (["L", "C"].includes(sArr[sP + 1])) {
          isSpecialCase = true;
          answer += romanMap[sArr[sP + 1]] - romanMap[nextRoman];
          sP++;
        }
        break;
      case "C":
        if (["D", "M"].includes(sArr[sP + 1])) {
          isSpecialCase = true;
          answer += romanMap[sArr[sP + 1]] - romanMap[nextRoman];
          sP++;
        }
        break;
    }
    if (!isSpecialCase) {
      answer += romanMap[nextRoman];
    }
    sP++;
  }
  return answer;
};

console.log(romanToInt("LVIII"));
