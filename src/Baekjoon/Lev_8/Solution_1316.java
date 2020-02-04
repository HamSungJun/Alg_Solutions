package Baekjoon.Lev_8;

import java.io.*;

public class Solution_1316 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(BUF_IN.readLine());
        int acc = 0;

        for (int i = 0; i < T; i++) {

            StringBuilder dataIn = new StringBuilder();
            dataIn.append(BUF_IN.readLine());

            char aim = dataIn.charAt(0);
            dataIn.deleteCharAt(0);
            boolean isGroupWord = true;

            while (dataIn.length() > 0) {

                if (aim == dataIn.charAt(0)) {

                    dataIn.deleteCharAt(0);

                } else {

                    if (dataIn.indexOf(Character.toString(aim)) == -1) {

                        aim = dataIn.charAt(0);

                    } else {

                        isGroupWord = false;
                        break;

                    }

                }

            }

            if (isGroupWord) acc += 1;

        }

        BUF_OUT.write("" + acc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
