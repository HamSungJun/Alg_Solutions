var countAndSay = function(n) {
  if (n === 1) return "1";

  return countHelper(countAndSay(n - 1));
};

const countHelper = s => {
  let out = "";
  let track = s.charAt(0);
  let trackAcc = 1;

  if (s.length >= 2) {
    for (let index = 1; index < s.length; index++) {
      if (s.charAt(index) !== track) {
        out = out.concat(`${trackAcc}${track}`);
        trackAcc = 1;
        track = s.charAt(index);
      } else {
        trackAcc += 1;
      }
    }
  }

  out = out.concat(`${trackAcc}${track}`);
  return out;
};

console.log(countAndSay(10));
