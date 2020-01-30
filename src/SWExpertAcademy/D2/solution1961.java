import java.util.Arrays;
import java.util.Scanner;

public class solution1961 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {
            int matrixSize = sc.nextInt();
            sc.nextLine();
            int[][] matrixIn = new int[matrixSize][matrixSize];
            for (int j = 0; j < matrixSize; j++) {
                int[] numbersIn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < matrixSize; k++) {
                    matrixIn[j][k] = numbersIn[k];
                }
            }

            System.out.println(String.format("#%d\n",(i+1)));

            StringBuilder[] sBufs = new StringBuilder[matrixSize];
            for (int j = 0; j < matrixSize; j++) {
                sBufs[j] = new StringBuilder();
            }

            for (int j = 0; j < 3; j++) {

                matrixIn = rotateMatrix(matrixIn, matrixSize);

                for (int k = 0; k < matrixIn[0].length; k++) {
                    for (int l = 0; l < matrixIn[0].length; l++) {
                        sBufs[l].append(matrixIn[l][k]);
                    }
                }

                for (int k = 0; k < matrixSize; k++) {
                    sBufs[k].append(j == 2 ? "" : " ");
                }

            }

            for (int j = 0; j < matrixSize; j++) {
                System.out.println(sBufs[j].toString());
            }

        }
    }

    public static int[][] rotateMatrix(int[][] matrixIn, int matrixSize){

        int[][] rotatedMatrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                rotatedMatrix[i][j] = matrixIn[matrixSize-1-j][i];
            }
            System.out.println(Arrays.toString(rotatedMatrix[i]));
        }

        return rotatedMatrix;

    }

}

