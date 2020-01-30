import java.util.Scanner;

public class solution2001 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestCases; i++) {

            int pariAreaSize = sc.nextInt();
            int pariChaeSize = sc.nextInt();
            int[][] pariArea = new int[pariAreaSize][pariAreaSize];

            for(int row = 0; row < pariAreaSize; row++){
                for (int col = 0; col < pariAreaSize; col++) {
                    pariArea[row][col] = sc.nextInt();
                }
                sc.nextLine();
            }

            System.out.println(String.format("#%d %d",(i+1),getMaxKillCount(pariArea, pariAreaSize, pariChaeSize)));

        }

    }

    public static int getMaxKillCount(int[][] pariArea, int pariAreaSize, int pariChaeSize){

        int maxKillCount = 0;

        for (int i = 0; i <= pariAreaSize - pariChaeSize; i++) {
            for (int j = 0; j <= pariAreaSize - pariChaeSize; j++) {
                int killCount = 0;
                for (int k = 0; k < pariChaeSize; k++) {
                    for (int l = 0; l < pariChaeSize; l++) {
                        killCount += pariArea[i+k][j+l];
                    }
                }
                if(maxKillCount < killCount){
                    maxKillCount = killCount;
                }
            }
        }

        return maxKillCount;

    }

}
