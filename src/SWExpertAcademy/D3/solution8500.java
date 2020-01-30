import java.util.Arrays;
import java.util.Scanner;

public class solution8500 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {
            int people = sc.nextInt();
            sc.nextLine();
            int[] seatCases = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(seatCases);
            int pointer = seatCases.length-1;
            System.out.format("#%d %d\n",i,calcMinSeatNum(seatCases,seatCases[pointer],seatCases[pointer],pointer-1,people+(2*seatCases[pointer])));
        }

    }

    public static int calcMinSeatNum(int[] seatCases, int leftSeat, int rightSeat, int pointer, int seatAcc){
//        System.out.format("%d | %d | %d | %d\n",leftSeat,rightSeat,pointer,seatAcc);
        if(pointer < 0){
            return seatAcc;
        }

        if(leftSeat >= rightSeat){
            leftSeat = seatCases[pointer];
            seatAcc += leftSeat;
        } else {
            rightSeat = seatCases[pointer];
            seatAcc += rightSeat;
        }

        return calcMinSeatNum(seatCases,leftSeat,rightSeat,pointer-1,seatAcc);

    }

}
