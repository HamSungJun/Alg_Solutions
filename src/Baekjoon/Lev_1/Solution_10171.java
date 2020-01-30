package Baekjoon.Lev_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_10171 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sBuf = new StringBuilder();
        sBuf.append("\\    /\\\n");
        sBuf.append(" )  ( ')\n");
        sBuf.append("(  /  )\n");
        sBuf.append(" \\(__)|");
        BUF_OUT.write(sBuf.toString());
        BUF_OUT.flush();
        BUF_OUT.close();

    }

}
