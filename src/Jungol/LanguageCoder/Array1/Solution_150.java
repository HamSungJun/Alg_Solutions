package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_150 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
