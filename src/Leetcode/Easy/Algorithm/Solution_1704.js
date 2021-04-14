/**
 * @param {string} s
 * @return {boolean}
 */
const halvesAreAlike = function (s) {
  const vowelSet = new Set(['a', 'e', 'i', 'o', 'u'])
  const vowelCount = [0, 0]
  const lowerStr = s.toLowerCase()
  const strLen = lowerStr.length
  const strLenHalf = (strLen / 2)
  for (let i = 0; i < strLen; i++) {
    if (vowelSet.has(lowerStr[i])) {
      vowelCount[i < strLenHalf ? 0 : 1] += 1
    }
  }
  return vowelCount[0] === vowelCount[1]
}

console.log(halvesAreAlike('kkkkwwww'))
