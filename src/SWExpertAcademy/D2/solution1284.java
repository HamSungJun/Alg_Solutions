import java.util.Arrays;
import java.util.Scanner;

public class solution1284 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            // P Q R S W
            int[] varValuesIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(String.format("#%d %d",(i+1),findBetterPrice(varValuesIn)));

        }

    }

    public static int findBetterPrice(int[] varValuesIn){

        int priceA = varValuesIn[0] * varValuesIn[4];
        int priceB = varValuesIn[4] <= varValuesIn[2] ? varValuesIn[1] : varValuesIn[1] + ((varValuesIn[4] - varValuesIn[2]) * varValuesIn[3]);

        return Math.min(priceA,priceB);

    }

}
