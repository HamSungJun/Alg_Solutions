import java.util.Arrays;
import java.util.Scanner;

public class solution8457 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {

            int[] NBE = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] sandTimers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.format("#%d %d\n",i,countFitTimer(NBE,sandTimers));

        }

    }

    public static int countFitTimer(int[] NBE, int[] sandTimers){

        int fitTimerCount = 0;

        for (int i = 0; i < sandTimers.length; i++) {

            int mulAcc = 1;
            int sandTime = sandTimers[i];

            while (sandTime*mulAcc <= NBE[1]+NBE[2]){
                if(NBE[1] - NBE[2] <= sandTime*mulAcc && sandTime*mulAcc <= NBE[1] + NBE[2]){
                    fitTimerCount++;
                    break;
                }
                mulAcc++;
            }

        }

        return fitTimerCount;

    }

}
