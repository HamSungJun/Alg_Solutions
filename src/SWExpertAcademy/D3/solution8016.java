import java.io.*;

public class solution8016 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            long prmdHeight = Long.parseLong(br.readLine());
            long right = 2 * prmdHeight * prmdHeight - 1;
            long left = right - 4 * (prmdHeight - 1);
            bw.write(String.format("#%d %d %d\n", i, left, right));
            bw.flush();
        }

        br.close();
        bw.close();

    }

}
