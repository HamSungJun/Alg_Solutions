import java.util.Scanner;
        import java.lang.Math;

public class solution2019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sBuf = new StringBuilder("1");
        int numberIn = sc.nextInt();
        for (int j = 1; j <= numberIn; j++) {
            sBuf.append(String.format(" %d",(int)Math.pow(2,j)));
        }
        System.out.print(sBuf);
    }
}
