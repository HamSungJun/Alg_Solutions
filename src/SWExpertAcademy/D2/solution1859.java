import java.util.*;

public class solution1859 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testLines = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testLines; i++) {
            int caseLength = sc.nextInt();
            sc.nextLine();
            int[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(String.format("#%d %d",(i+1),processPropit(prices)));
        }

        return;
    }

    public static long processPropit(int[] prices){

        long profit = 0;
        long maxPrice = 0;

        for (int i = prices.length - 1; i >= 0; i--) {

           if(maxPrice > prices[i]){
               profit += maxPrice - prices[i];
           } else {
               maxPrice = prices[i];
           }

        }

        return profit;

    }

}
