import java.util.Scanner;

public class solution2072 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            int oddSum = 0;
            for (int j = 0; j < 10; j++) {
                int numberIn = sc.nextInt();
                if(numberIn % 2 != 0){
                    oddSum += numberIn;
                }
            }
            System.out.println("#" + (i+1) + " " + oddSum);
        }
        return;
    }
}
