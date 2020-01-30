import java.util.Scanner;

public class solution1945 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int numIn = sc.nextInt();
            int a,b,c,d,e;

            a = 0;
            while (numIn % 2 == 0){
                a++;
                numIn /= 2;
            }

            b = 0;
            while (numIn % 3 == 0){
                b++;
                numIn /= 3;
            }

            c = 0;
            while (numIn % 5 == 0){
                c++;
                numIn /= 5;
            }

            d = 0;
            while (numIn % 7 == 0){
                d++;
                numIn /= 7;
            }

            e = 0;
            while (numIn % 11 == 0){
                e++;
                numIn /= 11;
            }

            System.out.format("#%d %d %d %d %d %d",(i+1),a,b,c,d,e);

        }

    }

}
