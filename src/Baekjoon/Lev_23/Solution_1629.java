package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1629 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bw.write(""+(pow(A,B,C)));
        bw.flush();
        bw.close();
        br.close();

    }

    public static long pow(int A, int B, int C){

        A = A % C;

        if(B == 0) return 1;
        else if(B == 1) return A;
        else if(B % 2 == 0){
            long subPow = pow(A, B/2, C);
            return subPow * subPow % C;
        } else return A*pow(A, B-1, C)%C;

    }

}
