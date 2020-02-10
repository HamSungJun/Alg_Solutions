package Baekjoon.Lev_10;

import java.util.Arrays;

public class Eratosthenes {

    public boolean[] che;

    public Eratosthenes(int cheLength) {
        this.che = new boolean[cheLength];
        Arrays.fill(this.che, true);
        this.che[0] = this.che[1] = false;
    }

    public void setChe() {

        for (int i = 2; i < Math.ceil(Math.sqrt(this.che.length)); i++) {

            if (this.che[i]) {
                if (isPrime(i)) {
                    for (int j = (2 * i); j < this.che.length; j += i) {
                        this.che[j] = false;
                    }
                }
            }

        }

    }

    public boolean isPrime(int num) {

        if (num == 0 || num == 1) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;

    }

    public int countBetween(int start) {
        int acc = 0;
        for (int i = start + 1; i <= 2 * start; i++) {
            if (this.che[i]) {
                acc += 1;
            }
        }
        return acc;
    }

    public void printChe() {
        System.out.println(Arrays.toString(this.che));
    }

}