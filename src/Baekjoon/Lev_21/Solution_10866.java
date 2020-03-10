package Baekjoon.Lev_21;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_10866 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> myDeque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] op = br.readLine().split(" ");
            switch (op[0]) {
                case "push_back":
                    myDeque.addLast(Integer.parseInt(op[1]));
                    break;
                case "push_front":
                    myDeque.addFirst(Integer.parseInt(op[1]));
                    break;
                case "pop_back":
                    bw.write(myDeque.isEmpty() ? "" + (-1) : "" + myDeque.pollLast());
                    bw.newLine();
                    break;
                case "pop_front":
                    bw.write(myDeque.isEmpty() ? "" + (-1) : "" + myDeque.pollFirst());
                    bw.newLine();
                    break;
                case "size":
                    bw.write("" + myDeque.size());
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(myDeque.isEmpty() ? "" + 1 : "" + 0);
                    bw.newLine();
                    break;
                case "front":
                    bw.write(myDeque.isEmpty() ? "" + (-1) : "" + myDeque.getFirst());
                    bw.newLine();
                    break;
                case "back":
                    bw.write(myDeque.isEmpty() ? "" + (-1) : "" + myDeque.getLast());
                    bw.newLine();
                    break;

            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
