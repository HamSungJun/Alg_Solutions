package Baekjoon.Lev_20;

import java.io.*;
import java.util.Stack;

public class Solution_9012 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            Stack<Character> myStack = new Stack<>();
            String nextString = br.readLine();
            boolean isVPS = true;
            for (int i = 0; i < nextString.length(); i++) {
                if (nextString.charAt(i) == '(') {
                    myStack.push('(');
                } else {
                    if (myStack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        myStack.pop();
                    }
                }
            }

            isVPS = myStack.isEmpty() && isVPS;
            bw.write(isVPS ? "YES" : "NO");
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
