/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  strs.sort((a, b) => {
    return a.length - b.length;
  });

  let prefixAcc = "";
  if (strs.length > 0) {
    for (let index = 1; index <= strs[0].length; index++) {
      let nextPrefix = strs[0].substring(0, index);
      let isMatchAll = true;
      for (let index2 = 1; index2 < strs.length; index2++) {
        if (nextPrefix !== strs[index2].substring(0, index)) {
          isMatchAll = false;
        }
      }
      if (isMatchAll) {
        prefixAcc = nextPrefix;
      } else {
        break;
      }
    }
  }
  return prefixAcc;
};

console.log(longestCommonPrefix(["", "b"]));
