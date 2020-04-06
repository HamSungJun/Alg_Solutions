package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_555 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] arr = new String[10];
        int pointer = 0;

        while (st.hasMoreTokens()) {
            arr[pointer++] = st.nextToken();
        }

        bw.write(String.join("", arr));
        bw.flush();
        bw.close();
        br.close();

    }

}
