import java.util.Scanner;

public class solution1545 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberIn = sc.nextInt();
        StringBuilder sBuf = new StringBuilder(""+numberIn);
        for (int i = numberIn-1; i >= 0; i--) {
            sBuf.append(" ").append(i);
        }
        System.out.print(sBuf);
    }
}
