/**
 * @param {string} s
 * @return {number}
 */
 var balancedStringSplit = function(s) {
    let pairCount = 0
    s.split("").reduce((acc, curr) => {
        switch(curr){
            case 'L':
                acc[0] += 1
                break;
            case 'R':
                acc[1] += 1
                break;
        }
        if(acc.every(count => count >= 1) && acc[0] === acc[1]){
            pairCount += 1
            acc[0] = 0
            acc[1] = 0
        }
        return acc
    }, [0,0])
    return pairCount
};

console.log(balancedStringSplit("RLRRRLLRLL"))