package Baekjoon.Lev_21;

import java.io.*;
import java.util.LinkedList;


public class Solution_18258 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> myQueue = new LinkedList<>();

        while (N-- > 0) {

            String[] op = br.readLine().split(" ");
            switch (op[0]) {
                case "push":
                    myQueue.add(Integer.parseInt(op[1]));
                    break;
                case "pop":
                    bw.write(myQueue.isEmpty() ? "" + (-1) : "" + myQueue.poll());
                    bw.newLine();
                    break;
                case "size":
                    bw.write("" + myQueue.size());
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(myQueue.isEmpty() ? "" + 1 : "" + 0);
                    bw.newLine();
                    break;
                case "front":
                    bw.write(myQueue.isEmpty() ? "" + (-1) : "" + myQueue.peek());
                    bw.newLine();
                    break;
                case "back":
                    bw.write(myQueue.isEmpty() ? "" + (-1) : "" + myQueue.getLast());
                    bw.newLine();
                    break;
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
