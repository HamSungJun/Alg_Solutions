import java.util.Arrays;
import java.util.Scanner;

public class solution1204 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < TestLines; i++) {

            int testNum = sc.nextInt();
            sc.nextLine();

            int[] testGrades = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] testGradeCounter = new int[101];

            for (int j = 0; j < testGrades.length; j++) {
                testGradeCounter[testGrades[j]] += 1;
            }

            System.out.println(String.format("#%d %d",(i+1),getMaxFreqNumber(testGradeCounter)));

        }

    }

    public static int getMaxFreqNumber(int[] testGradeCounter){

        int maxFreqIdx = 0;

        for (int i = 0; i < testGradeCounter.length; i++) {
            if(testGradeCounter[maxFreqIdx] <= testGradeCounter[i]){
                maxFreqIdx = i;
            }
        }

        return maxFreqIdx;

    }

}
