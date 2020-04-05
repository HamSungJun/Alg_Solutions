package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_540 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = 0;
        while((nextInt = Integer.parseInt(br.readLine())) != -1){

            if(nextInt % 3 == 0){
                bw.write("" + (nextInt / 3));
                bw.newLine();
                bw.flush();
            }

        }

        bw.close();
        br.close();

    }

}
