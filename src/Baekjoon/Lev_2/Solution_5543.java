package Baekjoon.Lev_2;

import java.io.*;

public class Solution_5543 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int minSet = Integer.MAX_VALUE;
        int[] menus = new int [5];
        for (int i = 0; i < menus.length; i++) {
            menus[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 3; j < menus.length; j++) {

                int nextSet = (menus[i] + menus[j]) - 50;
                if(nextSet < minSet){
                    minSet =  nextSet;
                }

            }

        }

        bw.write(""+minSet);
        bw.flush();
        bw.close();
        br.close();

    }

}
