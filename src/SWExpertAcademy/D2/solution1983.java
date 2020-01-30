import java.util.Arrays;
import java.util.Scanner;

public class solution1983 {

    public static final String[] GRADE_MARKS= {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int lenStudent = sc.nextInt();
            int targetStdNum = sc.nextInt();
//            System.out.println(String.format("%d || %d",lenStudent,targetStdNum));
            sc.nextLine();
            double[] stdGrades = new double[lenStudent];

            for (int j = 0; j < lenStudent; j++) {
                double[] gradeValues = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
                stdGrades[j] = gradeValues[0] * (0.35) + gradeValues[1] * (0.45) + gradeValues[2] * (0.20);
            }

//            System.out.println(Arrays.toString(stdGrades));

            double targetGrade = stdGrades[targetStdNum-1];
            int rankCounter = 0;
            for (int k = 0; k < lenStudent; k++) {
                if(targetGrade < stdGrades[k]){
                    rankCounter++;
                }
            }

//            System.out.println(rankCounter);
            System.out.println(String.format("#%d %s",(i+1),GRADE_MARKS[lenStudent > 10 ? rankCounter/(lenStudent/10) : rankCounter]));

        }

    }
}
