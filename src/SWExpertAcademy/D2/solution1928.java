import java.util.Base64;
import java.util.Scanner;

public class solution1928 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            String encoded = sc.nextLine();
            System.out.format("#%d %s",(i+1), new String(Base64.getDecoder().decode(encoded)));

        }

    }

}
