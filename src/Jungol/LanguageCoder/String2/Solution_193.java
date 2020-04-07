package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.*;

public class Solution_193 {

    static Scanner sc = new Scanner(System.in);
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        Stack<String> searchStack = new Stack<>();
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine().trim();
            searchStack.push(nextLine);
        }

        boolean isMatched = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < searchStack.size(); j++) {
                if (arr[i].contains(searchStack.get(j))) {
                    bw.write(arr[i] + "\n");
                    isMatched = true;
                    break;
                }
            }
        }

        if (!isMatched) {
            bw.write("none");
        }

        bw.close();
        sc.close();

    }

}
