import java.util.Arrays;
import java.util.Scanner;

public class solution1285 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            sc.nextLine();
            int[] throwHistory = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(throwHistory));
            int bestThrowPos = Math.abs(throwHistory[0]);
            int equalThrowerCount = 1;

            for (int j = 1; j < throwHistory.length; j++) {

                int throwPos = Math.abs(throwHistory[j]);

                if(throwPos < bestThrowPos){
                    bestThrowPos = throwPos;
                    equalThrowerCount = 1;
                } else if (throwPos == bestThrowPos){
                    equalThrowerCount++;
                }

            }

            System.out.format("#%d %d %d",(i+1),bestThrowPos,equalThrowerCount);

        }

    }
}
