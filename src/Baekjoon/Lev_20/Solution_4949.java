package Baekjoon.Lev_20;

import java.io.*;
import java.util.Stack;

public class Solution_4949 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String nextLine = br.readLine();
            if (nextLine.equals(".")) break;

            Stack<Character> myStack = new Stack<>();
            boolean isVPS = true;
            for (int i = 0; i < nextLine.length(); i++) {
                char nextChar = nextLine.charAt(i);
                if (nextChar == '(' || nextChar == '[') {
                    myStack.push(nextChar);
                } else if (nextChar == ')' || nextChar == ']') {
                    if (myStack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        char popChar = myStack.pop();
                        if (!((popChar == '(' && nextChar == ')') || (popChar == '[' && nextChar == ']'))) {
                            isVPS = false;
                            break;
                        }
                    }
                }
            }

            isVPS = myStack.isEmpty() && isVPS;

            bw.write(isVPS ? "yes" : "no");
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
