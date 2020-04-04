package Jungol.LanguageCoder.Control;

import java.io.*;

public class Solution_124 {

    public static void main(String[] args) throws IOException {

        /*
         * 선택 제어문을 통해 해결했어야 하는 문제이므로 switch , if 문을 통해 해결하는 것이 올바른 풀이입니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dayMap = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int A = Integer.parseInt(br.readLine());

        bw.write(""+ dayMap[A-1]);
        bw.flush();
        bw.close();
        br.close();

    }

}
