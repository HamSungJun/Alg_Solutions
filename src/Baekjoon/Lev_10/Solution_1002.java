package Baekjoon.Lev_10;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");
            int x1 = Integer.parseInt(sTokenizer.nextToken());
            int y1 = Integer.parseInt(sTokenizer.nextToken());
            int r1 = Integer.parseInt(sTokenizer.nextToken());
            int x2 = Integer.parseInt(sTokenizer.nextToken());
            int y2 = Integer.parseInt(sTokenizer.nextToken());
            int r2 = Integer.parseInt(sTokenizer.nextToken());

            int distance = (int) calcDistance(x1, x2, y1, y2);

            String point = "";
            int rp = r1 + r2;
            int rm = Math.abs(r1 - r2);

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) point = "-1";
                if (r1 != r2) point = "0";
            } else {
                if (distance == rp || distance == rm) point = "1";
                else if (distance < rp && distance > rm) point = "2";
                else point = "0";
            }

            BUF_OUT.write(point);
            BUF_OUT.newLine();

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static double calcDistance(int x1, int x2, int y1, int y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

    }

}
