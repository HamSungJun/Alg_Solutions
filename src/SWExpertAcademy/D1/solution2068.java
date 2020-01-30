import java.util.Scanner;

public class solution2068 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            int maxIn = 0;
            for (int j = 0; j < 10; j++) {
                int numberIn = sc.nextInt();
                if(maxIn < numberIn){
                    maxIn = numberIn;
                }
            }
            System.out.println(String.format("#%d %d",(i+1),maxIn));
        }

    }

}
