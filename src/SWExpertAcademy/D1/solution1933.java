import java.util.Scanner;

public class solution1933 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numberIn = sc.nextInt();
        StringBuffer sBuf = new StringBuffer("1");

        for (int i = 2; i <= numberIn; i++) {
            if(numberIn%i == 0){
                sBuf.append(String.format(" %d",i));
            }
        }

        System.out.print(sBuf);

    }

}
