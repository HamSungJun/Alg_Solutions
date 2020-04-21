var lengthOfLastWord = function(s) {
  let sArr = s.split(" ").filter(el => el.length >= 1) || [];
  return (sArr[sArr.length - 1] || "").length;
};
