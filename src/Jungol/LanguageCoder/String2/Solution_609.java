package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_609 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[3];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        bw.write(arr[0]);
        bw.flush();
        bw.close();
        br.close();

    }

}
