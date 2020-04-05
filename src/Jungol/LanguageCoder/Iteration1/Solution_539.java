package Jungol.LanguageCoder.Iteration1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_539 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double acc = 0;
        double inputCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (true) {

            int nextInt = Integer.parseInt(st.nextToken());
            acc += nextInt;
            inputCount += 1;
            if (nextInt >= 100) {
                break;
            }

        }

        bw.write(String.format("%d\n%.1f", (int) acc, (acc / inputCount)));
        bw.flush();
        bw.close();

    }

}
