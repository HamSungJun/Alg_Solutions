import java.util.Arrays;
import java.util.Scanner;

public class solution1966 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int numbersLen = sc.nextInt();
            sc.nextLine();

            int[] numbersIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            StringBuilder sBuf = new StringBuilder();
            for (int j = 0; j < numbersIn.length; j++) {
                sBuf.append(" ").append(numbersIn[j]);
            }

            System.out.println(String.format("#%d%s", (i+1), sBuf));
        }

    }

}
