package Baekjoon.Lev_20;

import java.io.*;
import java.util.Stack;

public class Solution_10828 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] op = br.readLine().split(" ");
            switch (op[0]) {
                case "push":
                    myStack.push(Integer.parseInt(op[1]));
                    break;
                case "pop":
                    if (myStack.isEmpty()) {
                        bw.write("" + (-1));
                    } else {
                        bw.write("" + myStack.pop());
                    }
                    bw.newLine();
                    break;
                case "size":
                    bw.write("" + myStack.size());
                    bw.newLine();
                    break;
                case "empty":
                    if (myStack.isEmpty()) {
                        bw.write("" + 1);
                    } else {
                        bw.write("" + 0);
                    }
                    bw.newLine();
                    break;
                case "top":
                    if (myStack.isEmpty()) {
                        bw.write("" + (-1));
                    } else {
                        bw.write("" + myStack.peek());
                    }
                    bw.newLine();
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
