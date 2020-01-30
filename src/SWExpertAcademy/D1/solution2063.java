import java.util.Arrays;
import java.util.Scanner;

public class solution2063 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();

        String[] numbersIn = sc.nextLine().split(" ");
        int[] numbersToInt = Arrays.stream(numbersIn).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbersToInt);
        System.out.println(numbersToInt[numbersToInt.length/2]);

    }

}
