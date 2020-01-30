import java.io.*;
import java.util.StringTokenizer;

/*
    For better I/O Performance [Scanner -> Buffered(Reader/Writer)]
 */

public class solution8338 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= T; i++) {
            int caseLen = Integer.parseInt(bf.readLine());
            String numbersIn = bf.readLine();
            StringTokenizer st = new StringTokenizer(numbersIn);

            int acc = 0;
            int end = st.countTokens();
            for (int j = 0; j < end; j++) {
                if(j == 0){
                    acc = Integer.parseInt(st.nextToken());
                } else {
                    int nextToken = Integer.parseInt(st.nextToken());
                    acc = Math.max(acc * nextToken, acc + nextToken);
                }

            }

            bw.write("#"+i+" "+acc+"\n");
            bw.flush();

        }

        bw.close();

    }

}
