import java.util.Scanner;

public class solution2029 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lines; i++) {
            int value = sc.nextInt();
            int divider = sc.nextInt();

            System.out.println(String.format("#%d %d %d",(i+1),(value/divider),(value%divider)));
        }

    }
}
