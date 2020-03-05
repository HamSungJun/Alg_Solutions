package Baekjoon.Lev_18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1931 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Time[] confTimes = new Time[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            confTimes[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(confTimes, (a, b) -> {
            if (a.end == b.end) {
                return a.start - b.start;
            } else {
                return a.end - b.end;
            }
        });

        int acc = 0;
        int lastEndTime = 0;
        for (int i = 0; i < confTimes.length; i++) {
            if (lastEndTime <= confTimes[i].start) {
                lastEndTime = confTimes[i].end;
                acc++;
            }
        }

        bw.write("" + acc);
        bw.flush();
        bw.close();
        br.close();

    }

}
