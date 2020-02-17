package Baekjoon.Lev_14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_1181 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int N = Integer.parseInt(br.readLine());
        List<String> wordList = new ArrayList<>();

        while (N-- > 0) {
            wordList.add(br.readLine());
        }

        Collections.sort(wordList, new Comparator<String>() {

            @Override
            public int compare(String word_1, String word_2) {

                int wordLen_1 = word_1.length();
                int wordLen_2 = word_2.length();

                if (wordLen_1 > wordLen_2) {
                    return 1;
                } else if (wordLen_1 < wordLen_2) {
                    return -1;
                }

                return word_1.compareTo(word_2);

            }

        });

        String checker = "";
        for (int i = 0; i < wordList.size(); i++) {
            String nextString = wordList.get(i);
            if (!checker.equals(nextString)) {
                checker = nextString;
            } else {
                continue;
            }
            bw.write(nextString);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
