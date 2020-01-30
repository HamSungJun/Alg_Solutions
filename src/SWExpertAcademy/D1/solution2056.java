import java.util.Arrays;
import java.util.Scanner;

public class solution2056 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();

        String[] dateIn = new String[lines];
        int i = 0;
        for (i = 0; i < lines; i++) {
            dateIn[i] = sc.nextLine();
        }


        Object[] mapResults = Arrays.stream(dateIn).map(el -> isDateValid(
                el.substring(0,4),
                el.substring(4,6),
                el.substring(6)
        )).toArray();

        i = 1;
        for (Object mapResult:mapResults) {
            System.out.println(String.format("#%d %s",i++,mapResult.toString()));
        }

    }


    public static String isDateValid(String year, String month, String day){

        String [] to30 = {"04","06","09","11"};
        String [] to28 = {"02"};
        String [] to31 = {"01","03","05","07","08","12"};

        int dayToInt = Integer.parseInt(day);
        String result = String.join("/",new String[]{year,month,day});

        if(Arrays.asList(to30).contains(month)){

            return 1 <= dayToInt && dayToInt <= 30 ? result  : "-1";

        } else if(Arrays.asList(to28).contains(month)){

            return 1<= dayToInt && dayToInt <= 28 ? result : "-1";

        } else if(Arrays.asList(to31).contains(month)){

            return 1<= dayToInt && dayToInt <= 31 ? result : "-1";

        } else {

            return "-1";

        }

    }

}
