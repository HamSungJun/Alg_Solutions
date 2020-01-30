import java.util.Scanner;

public class solution2070 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            String outOp = a == b ? "=" : a < b ? "<" : ">";
            System.out.println(String.format("#%d %s",(i+1),outOp));

        }

    }

}
