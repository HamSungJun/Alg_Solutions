import java.util.Arrays;
import java.util.Scanner;

public class solution2058 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] In = sc.next().split("");

        int sum = Arrays.stream(In).map(Integer::parseInt).reduce(0,(acc,curr) -> acc += curr);;

        System.out.println(sum);

    }

}
