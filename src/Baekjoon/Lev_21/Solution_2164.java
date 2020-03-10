package Baekjoon.Lev_21;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_2164 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> myQueue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while (myQueue.size() != 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        bw.write("" + myQueue.peek());
        bw.flush();
        bw.close();
        br.close();

    }

}
