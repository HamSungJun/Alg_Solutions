import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class solution8673 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            int K = sc.nextInt();
            sc.nextLine();
            int[] scores = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Stack<Integer> scoresIn = new Stack<>();
            for (int score:scores) {
                scoresIn.add(score);
            }

            System.out.format("#%d %d",(i+1),calculateBoredom(scoresIn,0));

        }

    }

    public static int calculateBoredom(Stack<Integer> scoresIn, int boredom){

        if (scoresIn.size() == 1){
            return boredom;
        }

        Stack<Integer> nextRound = new Stack<>();

        while (scoresIn.size() >= 2){

            int personA = scoresIn.pop();
            int personB = scoresIn.pop();

            nextRound.push(personA == personB ? personA : Math.max(personA,personB));
            boredom += Math.abs(personA-personB);

        }

        return calculateBoredom(nextRound, boredom);

    }

}
