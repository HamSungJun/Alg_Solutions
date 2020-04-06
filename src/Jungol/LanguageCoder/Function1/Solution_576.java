package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_576 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String origin = br.readLine();
        StringTokenizer st = new StringTokenizer(origin, " ");

        bw.write(origin + " = " + calc(st));
        bw.flush();
        bw.close();
        br.close();

    }

    public static String calc(StringTokenizer st) {

        double calcAcc = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {

            String op = st.nextToken();
            int nextInt = Integer.parseInt(st.nextToken());

            switch (op) {
                case "+":
                    calcAcc += nextInt;
                    break;
                case "-":
                    calcAcc -= nextInt;
                    break;
                case "*":
                    calcAcc *= nextInt;
                    break;
                case "/":
                    calcAcc = (int) (calcAcc / nextInt);
                    break;
                default:
                    calcAcc = 0;
                    break;
            }

        }

        return (int) calcAcc + "";

    }

}
