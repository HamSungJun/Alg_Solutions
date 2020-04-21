var addBinary = function(a, b) {
  let ans = new Array(Math.max(a.length, b.length));
  let ansP = ans.length - 1;
  let isCarried = false;
  let charP = 0;
  let nextA = "";
  let nextB = "";

  a = a.split("").reverse();
  b = b.split("").reverse();

  while (ansP >= 0) {
    if (charP < a.length && charP < b.length) {
      nextA = a[charP];
      nextB = b[charP];

      switch (nextA + nextB) {
        case "00":
          ans[ansP] = isCarried ? "1" : "0";
          isCarried = false;
          break;
        case "01":
        case "10":
          ans[ansP] = isCarried ? "0" : "1";
          isCarried = isCarried ? true : false;
          break;
        case "11":
          ans[ansP] = isCarried ? "1" : "0";
          isCarried = true;
          break;
      }
    } else if (charP < a.length && charP >= b.length) {
      nextA = a[charP];
      switch (nextA) {
        case "0":
          ans[ansP] = isCarried ? "1" : "0";
          isCarried = false;
          break;
        case "1":
          ans[ansP] = isCarried ? "0" : "1";
          isCarried = isCarried ? true : false;
          break;
      }
    } else if (charP >= a.length && charP < b.length) {
      console.log("B");
      nextB = b[charP];
      switch (nextB) {
        case "0":
          ans[ansP] = isCarried ? "1" : "0";
          isCarried = false;
          break;
        case "1":
          ans[ansP] = isCarried ? "0" : "1";
          isCarried = isCarried ? true : false;
          break;
      }
    }
    ansP--;
    charP++;
    // console.log(ans, isCarried);
  }

  if (isCarried) {
    ans.unshift("1");
  }

  return ans.join("");
};

console.log(addBinary("1010", "1011"));
