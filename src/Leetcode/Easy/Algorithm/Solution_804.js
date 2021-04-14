/**
 * @param {string[]} words
 * @return {number}
 */
const uniqueMorseRepresentations = function (words) {
  const morseList = [
    '.-', '-...', '-.-.', '-..',
    '.', '..-.', '--.', '....',
    '..', '.---', '-.-', '.-..',
    '--', '-.', '---', '.--.',
    '--.-', '.-.', '...', '-',
    '..-', '...-', '.--', '-..-',
    '-.--', '--..']
  return words.reduce((acc, curr) => {
    let morseOut = ''
    for (let i = 0; i < curr.length; i++) {
      const nextMorseIndex = curr.charCodeAt(i) - 97
      morseOut += morseList[nextMorseIndex]
    }
    acc.add(morseOut)
    return acc
  }, new Set()).size
}

console.log(uniqueMorseRepresentations(['gin', 'zen', 'gig', 'msg']))
