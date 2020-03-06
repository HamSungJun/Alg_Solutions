package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2609 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int bigger = Math.max(A, B);
        int smaller = bigger == A ? B : A;

        bw.write("" + gcd(bigger, smaller));
        bw.newLine();
        bw.write("" + lcm(bigger, smaller, bigger));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int gcd(int A, int B) {

        if (A % B == 0) return B;
        return gcd(B, (A % B));

    }

    public static int lcm(int A, int B, int origin) {

        if(A % B == 0){
            return A;
        }
        return lcm((A+origin), B, origin);

    }

}
