package Baekjoon.Lev_9;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());
        for (int i = 0; i < T; i++) {

            StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine());
            int[] dataIn = new int[3];
            int pointer = 0;
            while (sTokenizer.hasMoreTokens()) {
                dataIn[pointer++] = Integer.parseInt(sTokenizer.nextToken());
            }

            StringBuilder sBuf = new StringBuilder();
            int floor = dataIn[2] % dataIn[0];
            int room = dataIn[2] / dataIn[0] + 1;

            if (floor == 0) {
                floor = dataIn[0];
                room = dataIn[2] / dataIn[0];
            }

            sBuf.append(floor).append(setRoomNumber(room));
            BUF_OUT.write(sBuf.toString() + "\n");

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static String setRoomNumber(int room) {

        if (!(String.valueOf(room).length() > 1)) {
            return "0" + room;
        }

        return "" + room;

    }

}
