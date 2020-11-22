const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();

const numbers = input.split("\n")[1].split(" ");

let min = Number.MAX_SAFE_INTEGER;
let max = Number.MIN_SAFE_INTEGER;

numbers.forEach(number => {
    number = Number(number);
    if (min > number) min = number;
    if (max < number) max = number;
})

console.log(`${min} ${max}`);