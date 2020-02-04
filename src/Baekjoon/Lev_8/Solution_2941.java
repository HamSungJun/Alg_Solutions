package Baekjoon.Lev_8;

import java.io.*;

public class Solution_2941 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder dataIn = new StringBuilder();
        dataIn.append(BUF_IN.readLine());

        String[] cases = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String test : cases) {

            int testResult;

            while ((testResult = dataIn.indexOf(test)) != -1) {

                dataIn.delete(testResult, testResult + test.length());
                dataIn.insert(testResult, "|");

            }

        }

        BUF_OUT.write("" + dataIn.length());
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
