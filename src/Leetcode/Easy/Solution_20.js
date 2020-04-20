var isValid = function(s) {
  if (s.length === 0) return true;

  let bracketStack = [];

  for (let index = 0; index < s.length; index++) {
    const nextChar = s.charAt(index);
    if (["(", "[", "{"].includes(nextChar)) {
      bracketStack.push(nextChar);
    } else {
      if (bracketStack.length === 0) return false;
      if (!["()", "[]", "{}"].includes(bracketStack.pop() + nextChar))
        return false;
    }
  }

  if (bracketStack.length !== 0) return false;

  return true;
};

console.log(isValid("()[]{}"));
