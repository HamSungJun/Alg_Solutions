package Baekjoon.Lev_21;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_11866 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Queue<Integer> myQueue = new LinkedList<>();
        StringBuilder sBuf = new StringBuilder();

        for (int i = 1; i <= K; i++) {
            myQueue.add(i);
        }

        int loopIdx = 1;
        while (!myQueue.isEmpty()) {

            int nextPoll = myQueue.poll();

            if (loopIdx % N == 0) {
                loopIdx = 0;
                sBuf.append(nextPoll + (myQueue.isEmpty() ? "" : ", "));
            } else {
                myQueue.add(nextPoll);
            }

            loopIdx++;

        }

        bw.write("<" + sBuf.toString() + ">");
        bw.flush();
        bw.close();
        br.close();

    }

}
