import java.util.Arrays;
import java.util.Scanner;

public class solution1940 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int numCmd = sc.nextInt();
            sc.nextLine();
            int distance = 0;
            int speed = 0;

            for (int j = 0; j < numCmd; j++) {

                int[] cmd = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                switch (cmd[0]){
                    case 0:
                        break;
                    case 1:
                        speed += cmd[1];
                        break;
                    case 2:
                        speed = speed <= cmd[1] ? 0 : speed - cmd[1];
                        break;
                }

                distance += speed;

            }

            System.out.format("#%d %d\n",(i+1),distance);

        }

    }

}
