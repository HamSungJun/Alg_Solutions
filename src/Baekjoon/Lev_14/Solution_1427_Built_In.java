package Baekjoon.Lev_14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_1427_Built_In {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        List<Integer> numberList = new ArrayList<>();
        int dataIn = Integer.parseInt(br.readLine());

        while (dataIn > 0) {
            numberList.add(dataIn % 10);
            dataIn /= 10;
        }

        Collections.sort(numberList, Collections.reverseOrder());

        for (int i = 0; i < numberList.size(); i++) {
            bw.write("" + numberList.get(i));
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
