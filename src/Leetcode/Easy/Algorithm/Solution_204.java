package Leetcode.Easy.Algorithm;

class Solution_204 {
    public int countPrimes(int n) {

        if (0 <= n && n <= 1) {
            return 0;
        }

        boolean[] visited = new boolean[n];

        for (int i = 2; i * i < n; i++) {
            for (int j = i; j < n; j += i) {
                if (!visited[j] && j != i) {
                    visited[j] = true;
                }
            }
        }

        int primeAcc = 0;
        for (int i = 2; i < n; i++) {
            if (!visited[i]) {
                primeAcc += 1;
            }
        }

        return primeAcc;

    }
}
