import java.util.Scanner;
import java.util.regex.Pattern;

public class solution2007 {

    public static final int MAX_PATTERN_LENGTH = 10;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {
            String patternIn = sc.nextLine();
            System.out.println(String.format("#%d %d",(i+1),checkPatternLength(patternIn)));
        }

    }
    public static int checkPatternLength(String patternIn){

        int i;

        for (i = 1; i < MAX_PATTERN_LENGTH; i++) {
            if(patternIn.substring(0,i).equals(patternIn.substring(i,i+i))){
                break;
            }
        }

        return i;
    }
}
