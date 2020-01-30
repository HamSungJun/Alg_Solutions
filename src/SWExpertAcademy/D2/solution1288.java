import java.util.Arrays;
import java.util.Scanner;

public class solution1288 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int K = 1;
            boolean[] visited = new boolean[10];
            Arrays.fill(visited,false);

            while (!isAllVisited(visited)){

                String[] nton = (""+(N*K++)).split("");
                System.out.println(Arrays.toString(nton));
                for (String n : nton){
                    visited[Integer.parseInt(n)] = true;
                }

            }

            System.out.format("#%d %d",(i+1),(N*(K-1)));

        }

    }

    public static boolean isAllVisited(boolean[] visited){
        for(boolean b:visited){
            if(!b){
                return false;
            }
        }
        return true;
    }

}
