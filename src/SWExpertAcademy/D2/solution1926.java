import java.util.Arrays;
import java.util.Scanner;

public class solution1926 {

    public static void main(String[] args){

        int Range = new Scanner(System.in).nextInt();

        String[] Array369 = new String[Range];
        for (int i = 0; i < Range; i++) {
            Array369[i] = ""+(i+1);
        }

        String Result = Arrays.stream(Array369).reduce("",(acc,curr) -> {

            if(curr.contains("3") || curr.contains("6") || curr.contains("9")){

                curr = curr.replaceAll("[^369]","").replaceAll("[369]","-");

            }

            return acc.concat(" "+curr);

        });

        System.out.println(Result.substring(1));

    }

}
