const d = (n) => {
    let result = n;
    while (n > 0) {
        result += (n % 10);
        n = parseInt(n / 10);
    }
    return result;
}

const history = new Array(10001);

for (let i = 1; i <= 10000; i++) {
    const next = d(i);
    history[next] = true;
    if (!history[i]) process.stdout.write(i + "\n");
}
