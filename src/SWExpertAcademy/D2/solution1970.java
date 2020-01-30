import java.util.Arrays;
import java.util.Scanner;

public class solution1970 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        int[] payBackVarious = {50000,10000,5000,1000,500,100,50,10};

        for (int i = 0; i < TestLines; i++) {

            int payRemaining = sc.nextInt();
            int [] result = new int[8];
            Arrays.fill(result,0);
            doPayBack(payRemaining,0,payBackVarious,result);

            StringBuilder sBuf = new StringBuilder(""+result[0]);
            for (int j = 1; j < result.length; j++) {
                sBuf.append(" ").append(result[j]);
            }

            System.out.println(String.format("#%d\n%s",(i+1),sBuf));
            Arrays.fill(result,0);

        }

    }

    public static int[] doPayBack(int payRemaining, int variousPointer,int[] payBackVarious,int[] payBackState){

        if(variousPointer == payBackVarious.length){
            return payBackState;
        }

        if(payRemaining >= payBackVarious[variousPointer]){
            payBackState[variousPointer] = payRemaining/payBackVarious[variousPointer];
            payRemaining = payRemaining % (payBackVarious[variousPointer] * payBackState[variousPointer]);
            return doPayBack(payRemaining,++variousPointer,payBackVarious,payBackState);
        }

        return doPayBack(payRemaining,++variousPointer,payBackVarious,payBackState);

    }

}
