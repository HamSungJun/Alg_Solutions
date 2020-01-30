import java.util.Arrays;
import java.util.Scanner;

public class solution1936 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numberA = sc.nextInt();
        int numberB = sc.nextInt();

        String compare = String.format("%s %s",""+numberA,""+numberB);
        String[] AwinCase = {"3 2","2 1","1 3"};

        System.out.print(Arrays.asList(AwinCase).contains(compare) ? "A" : "B");

    }
}
