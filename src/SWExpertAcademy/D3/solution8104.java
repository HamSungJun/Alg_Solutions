import java.io.*;
import java.util.Arrays;

public class solution8104 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {

            int[] NK = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
            bw.write("#"+i+" "+calcGroupAbility(NK)+"\n");
            bw.flush();

        }

        bw.close();

    }
    public static String calcGroupAbility(int[] NK){

        StringBuilder sb = new StringBuilder();

        int acc = 0;
        int addValue = NK[1];

        for (int i = 0; i < NK[0]; i++) {

            //System.out.println((i % 2 == 0) ? NK[1] - (addValue - 1)  : NK[1]);
            acc += (i % 2 == 0) ? NK[1] - (addValue - 1)  : NK[1];
            NK[1] += addValue;

        }

        for (int i = 0; i < addValue; i++) {
            if(NK[0] % 2 == 0){
                sb.append(acc).append(i == addValue -1 ? "" : " ");
            } else {
                sb.append(acc++).append(i == addValue -1 ? "" : " ");
            }

        }
        return sb.toString();

    }
}
