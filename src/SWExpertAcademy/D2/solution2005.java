import java.util.Scanner;

public class solution2005 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < TestCases; i++) {
            int pascalSize = sc.nextInt();
            System.out.println(String.format("#%d\n%s",(i+1),getPascal(pascalSize)));
        }
    }

    public static String getPascal(int pascalSize){

        StringBuilder sBuf = new StringBuilder();
        int[] before = {1};

        for (int i = 0; i < pascalSize; i++) {

            int[] row = new int[i+1];

            for(int j = 0; j < row.length; j++){

                if(j == 0 || j == row.length - 1){
                    row[j] = 1;
                } else {
                    row[j] = before[j-1] + before[j];
                }

                sBuf.append(row[j]).append(" ");

            }

            if(i != pascalSize - 1){
                sBuf.append("\n");
            }
            before = row;

        }

        return sBuf.toString();
    }
}
