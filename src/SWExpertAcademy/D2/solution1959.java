import java.util.Arrays;
import java.util.Scanner;

public class solution1959 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();
        int i = 0;
        while(i < TestLines){
            sc.nextLine();
            int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(String.format("#%d %d",(i+1),findMaxMultiPair(A,B)));
            i++;
        }

    }

    public static int findMaxMultiPair(int[] A, int[] B) {

        int maxPairSum = 0;

        for (int i = 0; i < Math.abs(B.length - A.length) + 1; i++) {

            int pairSum = 0;

            for (int j = 0; j < Math.min(B.length, A.length); j++) {

                pairSum += A.length <= B.length ? (B[i + j] * A[j]) : (A[i + j] * B[j]);

            }

            if (maxPairSum < pairSum) {

                maxPairSum = pairSum;

            }

        }

        return maxPairSum;

    }
}

