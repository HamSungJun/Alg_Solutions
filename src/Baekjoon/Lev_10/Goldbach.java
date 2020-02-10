package Baekjoon.Lev_10;

public class Goldbach extends Eratosthenes {

    public Goldbach(int cheLength) {
        super(cheLength);
    }

    public int[] findPartition(int num) {

        int[] answer = new int[2];

        int left = num / 2;
        int right = num / 2;

        while (true) {
            if (this.che[left] && this.che[right]) {
                answer[0] = left;
                answer[1] = right;
                break;
            }
            left--;
            right++;
        }

        return answer;

    }

}
