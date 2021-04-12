/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
 var addStrings = function(num1, num2) {
    const revNum1 = rev(num1.split(""))
    const revNum2 = rev(num2.split(""))
    const longer = (revNum1.length >= revNum2.length ? revNum1 : revNum2)
    let isCarried = false
    let subSum = 0
    let i;
    for(i = 0; i < Math.max(revNum1.length, revNum2.length); i++){
        subSum = parseInt(revNum1[i] || 0) + parseInt(revNum2[i] || 0) + (isCarried ? 1 : 0)
        isCarried = (subSum >= 10)
        longer[i] = (subSum % 10) + ''
        subSum = 0
    }
    if(isCarried){
        longer.push('1')
    }
    return rev(longer).join('')
};

function rev (arr) {
    for(let i = 0; i < Math.floor(arr.length / 2); i++){
        const temp = arr[i]
        const j = arr.length - (1 + i)
        arr[i] = arr[j]
        arr[j] = temp
    }
    return arr
}

console.log(addStrings("1", "9"))