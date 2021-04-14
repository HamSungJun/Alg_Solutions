/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
const countConsistentStrings = function (allowed, words) {
  const uniqCharSet = new Set(allowed.split(''))
  return words.reduce((acc, curr) => {
    for (let i = 0; i < curr.length; i++) {
      const nextChar = curr.charAt(i)
      if (!uniqCharSet.has(nextChar)) {
        acc -= 1
        break
      }
    }
    return acc
  }, words.length)
}

console.log(countConsistentStrings('ab', ['ad', 'bd', 'aaab', 'baa', 'badab']))
