import java.util.Arrays;
import java.util.Scanner;

public class solution1976 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {
            int[] timeIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            System.out.println(Arrays.toString(timeIn));
            System.out.println(String.format("#%d %s",(i+1),parseTime(timeIn)));
        }

    }

    public static String parseTime(int[] timeIn){

        int rawMinValue = timeIn[1] + timeIn[3];
        int rawHourValue = timeIn[0] + timeIn[2];

        int minCarry = rawMinValue / 60;
        rawMinValue = rawMinValue % 60;
        rawHourValue = (rawHourValue + minCarry) % 12;

        return String.format("%s %s",""+(rawHourValue == 0 ? 12 : rawHourValue),""+rawMinValue);

    }

}
