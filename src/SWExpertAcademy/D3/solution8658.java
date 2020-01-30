import java.util.Arrays;
import java.util.Scanner;

public class solution8658 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            int maxDigitSum = 0;
            int minDigitSum = -1;

            int[] digitSums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(solution8658::toDigitSum).toArray();

            for (int digitSum:digitSums) {
                maxDigitSum = Math.max(maxDigitSum, digitSum);
                minDigitSum = minDigitSum == -1 ? digitSum : Math.min(minDigitSum,digitSum);
            }

            System.out.format("#%d %d %d",(i+1),maxDigitSum,minDigitSum);

        }

    }

    public static int toDigitSum(String numIn){

        return Arrays.stream(numIn.split("")).mapToInt(Integer::parseInt).reduce(0,(acc,curr)->acc+=curr);

    }

}
