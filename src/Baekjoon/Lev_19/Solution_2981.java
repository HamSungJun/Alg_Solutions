package Baekjoon.Lev_19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_2981 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        int n = numbers[1] - numbers[0];

        for (int i = 2; i < numbers.length; i++) {
            n = gcd(n, numbers[i] - numbers[i - 1]);
        }

        List<Integer> myList = new ArrayList<>();
        for (int i = 2; i <= (int) Math.ceil(Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                myList.add(i);
                myList.add((n / i));
            }
        }

        myList.add(n);
        Collections.sort(myList);

        StringBuilder sBuf = new StringBuilder();
        int aim = myList.get(0);
        sBuf.append(aim);
        for (int i = 1; i < myList.size(); i++) {
            if (aim != myList.get(i)) {
                aim = myList.get(i);
                sBuf.append(" " + myList.get(i));
            }
        }

        bw.write(sBuf.toString().trim());
        bw.flush();
        bw.close();
        br.close();

    }

    public static int gcd(int a, int b) {

        if (b == 0) return a;
        else return gcd(b, a % b);

    }

}
