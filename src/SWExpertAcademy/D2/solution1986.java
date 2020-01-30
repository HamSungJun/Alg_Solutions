import java.util.Scanner;

public class solution1986 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int numberIn = sc.nextInt();
            System.out.println(String.format("#%d %d",(i+1),getOddEvenAcc(numberIn)));

        }


    }

    public static int getOddEvenAcc(int numberIn){

        if(numberIn % 2 == 0){
            return numberIn / 2 * (-1);
        } else {
            return (int)Math.ceil(numberIn/2.0);
        }

    }
}
