package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_560 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE;

        while (st.hasMoreTokens()){
            int nextInt = Integer.parseInt(st.nextToken());
            if(min > nextInt){
                min = nextInt;
            }
        }

        bw.write(""+min);
        bw.flush();
        bw.close();
        br.close();

    }

}
