import java.util.Scanner;

public class solution2071 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            float sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += sc.nextInt();
            }
            System.out.println(String.format("#%d %d",(i+1),Math.round(sum/10)));
        }

    }

}
