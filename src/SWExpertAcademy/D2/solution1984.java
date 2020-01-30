import java.util.Arrays;
import java.util.Scanner;

public class solution1984 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int[] numbersIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(String.format("#%d %d",(i+1),getMidAvg(numbersIn)));
        }
    }

    public static int getMidAvg(int[] numbersIn){

        int max = numbersIn[0];
        int min = numbersIn[0];
        int acc = 0;

        for(int number:numbersIn){
            if(number > max){
                max = number;
            }
            if (number < min) {
                min = number;
            }
            acc += number;
        }

        return (int)Math.round((acc - (min + max))/8.0);

    }
}
