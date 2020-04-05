package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_537 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = 1;
        int end = Integer.parseInt(br.readLine());
        int acc = 0;
        while(start <= end){
            acc += start;
            start+=1;
        }

        bw.write(""+acc);
        bw.flush();
        bw.close();

    }

}
