package Baekjoon.Lev_12;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2798 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        StringTokenizer cardTokenizer = new StringTokenizer(br.readLine(), " ");
        int[] cards = new int[N];
        int i = 0;
        while (cardTokenizer.hasMoreTokens()) {
            cards[i++] = Integer.parseInt(cardTokenizer.nextToken());
        }

        while (M >= 10) {
            if (canMake(cards, M) || M == 10) {
                break;
            }
            M--;
        }

        bw.write("" + M);
        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean canMake(int[] cards, int M) {

        boolean result = false;

        for (int i = 0; i < cards.length; i++) {

            for (int j = i + 1; j < cards.length; j++) {

                for (int k = j + 1; k < cards.length; k++) {

                    int cardSum = cards[i] + cards[j] + cards[k];
                    if (cardSum == M) {
                        result = true;
                        break;
                    }

                }

            }

        }

        return result;

    }

}
