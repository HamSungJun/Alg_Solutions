package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_557 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
            switch (i){
                case 0:
                case 3:
                case 6:
                    bw.write(arr[i]+" ");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
