import java.util.Arrays;
import java.util.Scanner;

public class solution2050 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Arrays.stream(sc.next().split(""))
                .mapToInt(el -> ((int)el.charAt(0)) - 64)
                .forEach(el -> System.out.print(String.format("%d ",el)));

    }

}
