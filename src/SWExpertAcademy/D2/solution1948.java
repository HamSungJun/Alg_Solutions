import java.util.Arrays;
import java.util.Scanner;

public class solution1948 {

    public static int[] mTod = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {
            int[] dateIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(String.format("#%d %d",(i+1),calculateDayDiff(dateIn)));
        }

    }

    public static int calculateDayDiff(int[] dateIn){

        if(dateIn[0] == dateIn[2]){
            return dateIn[3] - dateIn[1] + 1;
        }

        int diffSum = (mTod[dateIn[0]-1] - dateIn[1]) + dateIn[3] + 1;

        for (int i = dateIn[0]+1; i < dateIn[2]; i++) {
            System.out.println(i);
            diffSum += mTod[i-1];
        }

        return diffSum;

    }

}
