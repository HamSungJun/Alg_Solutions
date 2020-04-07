package Jungol.LanguageCoder.Function3;

import java.io.*;
import java.util.Stack;

public class Solution_590 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Stack<Integer> myStack = new Stack<>();
    static boolean[] visited = new boolean[7];
    static int N = 0;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        DFS();

        bw.close();
        br.close();

    }

    public static void DFS() throws IOException {

        if (myStack.size() == N) {
            if (isAscending()) {
                for (int i = 0; i < myStack.size(); i++) {
                    bw.write(myStack.get(i) + " ");
                }
                bw.newLine();
                bw.flush();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {

            if (!visited[i]) {
//                visited[i] = true;
                myStack.push(i);
                DFS();
                myStack.pop();
//                visited[i] = false;
            }

        }

    }

    public static boolean isAscending() {

        if (myStack.size() == 1) {
            return true;
        }

        int first = myStack.get(0);
        for (int i = 1; i < myStack.size(); i++) {
            if (first <= myStack.get(i)) {
                first = myStack.get(i);
            } else {
                return false;
            }
        }

        return true;

    }

}
