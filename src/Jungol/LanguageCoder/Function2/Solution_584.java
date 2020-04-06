package Jungol.LanguageCoder.Function2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution_584 {

    static boolean[] visited = new boolean[4];
    static Stack<Integer> myStack = new Stack<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        DFS();
        bw.close();

    }

    public static void DFS() throws IOException {

        if(myStack.size() == 2){
            int a = myStack.get(0);
            int b = myStack.get(1);
            bw.write(String.format("%d + %d = %d",a,b,(a+b)));
            bw.newLine();
            bw.flush();
            return;
        }

        for (int i = 1; i <= 3; i++) {

            if(!visited[i]){

//                visited[i] = true;
                myStack.push(i);
                DFS();
                myStack.pop();
//                visited[i] = false;

            }

        }


    }

}
