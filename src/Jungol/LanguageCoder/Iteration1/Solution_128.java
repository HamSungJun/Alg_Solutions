package Jungol.LanguageCoder.Iteration1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_128 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int notThreeFiveAcc = 0;
        while (st.hasMoreTokens()){

            int nextInt = Integer.parseInt(st.nextToken());

            if(nextInt == 0) break;

            if(nextInt % 3 != 0 && nextInt % 5 != 0){
                notThreeFiveAcc += 1;
            }

        }

        bw.write(""+notThreeFiveAcc);
        bw.flush();
        bw.close();
        br.close();

    }

}
