package Baekjoon.Lev_2;

import java.io.*;

public class Solution_2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dataIn = BUF_IN.readLine().split(" ");
        boolean shouldTimeDecrease = false;
        int time = Integer.parseInt(dataIn[0]);
        int minute = Integer.parseInt(dataIn[1]);

        if (minute < 45) {
            shouldTimeDecrease = true;
            minute = 60 - (45 - minute);
        } else {
            minute -= 45;
        }

        if (shouldTimeDecrease) {
            time = (time == 0 ? 23 : time - 1);
        }

        BUF_OUT.write(time + " " + minute);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
