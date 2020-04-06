package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int mulFiveCounter = 0;
        double mulFiveSum = 0;

        while (st.hasMoreTokens()){

            int nextInt = Integer.parseInt(st.nextToken());

            if(nextInt != 0 && nextInt % 5 == 0){
                mulFiveCounter += 1;
                mulFiveSum += nextInt;
            }

        }

        StringBuilder sBuf = new StringBuilder();
        sBuf.append("Multiples of 5 : ").append(mulFiveCounter).append("\n");
        sBuf.append("sum : ").append((int)mulFiveSum).append("\n");
        sBuf.append(String.format("avg : %.1f",mulFiveSum/mulFiveCounter));

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
