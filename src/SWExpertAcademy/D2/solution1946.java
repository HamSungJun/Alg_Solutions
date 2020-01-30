import java.util.Scanner;

public class solution1946 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int alphaCases = sc.nextInt();
            sc.nextLine();

            StringBuilder sBuf = new StringBuilder();

            for (int j = 0; j < alphaCases; j++) {
                String nextLine = sc.nextLine();
                sBuf.append(nextLine).append(" ");
            }

            System.out.println(String.format("#%d\n%s",(i+1),makeUnzipString(sBuf.toString())));

        }

    }

    public static String makeUnzipString(String zipIn){

        StringBuilder Result = new StringBuilder();
        String[] Ops = zipIn.split(" ");
        String charNow = "";

        int appendAcc = 0;
        int i = 0;

        while(i < Ops.length){

            if(i % 2 == 0){
                charNow = Ops[i];
            } else {
                for (int j = 0; j < Integer.parseInt(Ops[i]); j++) {
                    appendAcc++;
                    Result.append(charNow).append(appendAcc % 10 == 0 ? "\n" : "");
                }
            }

            i++;

        }

        return Result.toString();

    }

}
