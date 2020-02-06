package Baekjoon.Lev_9;

import java.io.*;

public class Solution_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataIn = Integer.parseInt(BUF_IN.readLine());
        int child = 1;
        int parent = 1;
        boolean sw = false;

        for (int i = 1; i < dataIn; i++) {

            if (sw) {
                if (parent == 1) {
                    sw = !sw;
                    child++;
                } else {
                    child++;
                    parent--;
                }
            } else {
                if (child == 1) {
                    sw = !sw;
                    parent++;
                } else {
                    child--;
                    parent++;
                }

            }

            BUF_OUT.write(child + "/" + parent + "\n");

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
