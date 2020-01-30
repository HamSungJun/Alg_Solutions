import java.util.Arrays;
import java.util.Scanner;

public class solution1989 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int TestLines = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < TestLines; i++) {
            String[] word = sc.nextLine().split("");
            System.out.println(String.format("#%d %d",(i+1),isRevEq(word)));
        }

    }
    public static int isRevEq(String[] word){

        String[] wordRev = new String[word.length];

        for (int i = 0; i < word.length; i++) {
            wordRev[i] = word[(word.length - 1) - i];
        }

        if(Arrays.equals(word,wordRev)){
            return 1;
        }
        return 0;

    }
}
