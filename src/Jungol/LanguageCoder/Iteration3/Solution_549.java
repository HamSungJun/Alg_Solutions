package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_549 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int oddSum = 0;
        int oddAcc = 1;
        int oddCounter = 0;
        while (true) {
            oddSum += oddAcc;
            oddAcc += 2;
            oddCounter += 1;
            if (oddSum >= N) {
                break;
            }
        }

        bw.write("" + oddCounter + " " + oddSum);
        bw.flush();
        bw.close();
        br.close();

    }

}
