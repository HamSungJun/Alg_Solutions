package Jungol.LanguageCoder.Iteration1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_536 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        while(i <= 15){
            bw.write(i+" ");
            i+=1;
        }

        bw.flush();
        bw.close();

    }

}
