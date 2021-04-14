/**
 * @param {string} s
 * @return {number}
 */
const maxDepth = function (s) {
  const bracketStack = []
  let maxDepth = 0
  for (let i = 0; i < s.length; i++) {
    const nextChar = s.charAt(i)
    switch (nextChar) {
      case '(':
        bracketStack.push('(')
        break
      case ')':
        maxDepth = Math.max(maxDepth, bracketStack.length)
        bracketStack.pop()
        break
    }
  }
  return maxDepth
}

console.log(maxDepth('1'))
