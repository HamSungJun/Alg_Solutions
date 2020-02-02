package Baekjoon.Lev_6;

import java.io.*;

public class Solution_8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());
        for (int i = 0; i < T; i++) {

            String[] dataIn = BUF_IN.readLine().split("");
            boolean isCorrect = false;
            int totalGrade = 0;
            int grade = 1;
            for (int j = 0; j < dataIn.length; j++) {

                if (dataIn[j].equals("O")) {
                    if (isCorrect) {
                        grade += 1;
                    } else {
                        isCorrect = true;
                    }
                    totalGrade += grade;
                } else {
                    isCorrect = false;
                    grade = 1;
                }

            }

            BUF_OUT.write("" + totalGrade + "\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
