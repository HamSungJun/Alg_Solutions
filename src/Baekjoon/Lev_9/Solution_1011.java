package Baekjoon.Lev_9;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1011 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < T; i++) {

            StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine());
            int x = Integer.parseInt(sTokenizer.nextToken());
            int y = Integer.parseInt(sTokenizer.nextToken());
            int movingDistance = 0;
            int xMovingCount = 0;
            int yMovingCount = 0;

            while (true) {
                movingDistance++;

                x += movingDistance;
                xMovingCount++; // x의 이동횟수

                if (x >= y) {
                    break;
                }

                y -= movingDistance;
                yMovingCount++; // y의
                if (y <= x) {
                    break;
                }

            }

            BUF_OUT.write("" + (xMovingCount + yMovingCount));
            BUF_OUT.newLine();

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
