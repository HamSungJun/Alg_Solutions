import java.util.Arrays;
import java.util.Scanner;

public class solution1974 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int[][] sudoku = new int[9][9];
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = sc.nextInt();
                }
//                System.out.println(Arrays.toString(sudoku[j]));
                sc.nextLine();
            }

            System.out.println(String.format("#%d %d",(i+1),isValidSudoku(sudoku)));

        }

    }

    public static int isValidSudoku(int[][] sudoku){

        Boolean[][] fpRowColArea = new Boolean[3][9];
        int[] areaPoint = {0,3,6};

        for (int i = 0; i < fpRowColArea.length; i++) {
            Arrays.fill(fpRowColArea[i],false);
        }

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                fpRowColArea[0][sudoku[row][col]-1] = true;
                fpRowColArea[1][sudoku[col][row]-1] = true;

            }

            if(Arrays.stream(fpRowColArea[0]).anyMatch(bool-> bool == false)){
                return 0;
            }

            if(Arrays.stream(fpRowColArea[1]).anyMatch(bool-> bool == false)){
                return 0;
            }

            for (int i = 0; i < 2; i++) {
                Arrays.fill(fpRowColArea[i],false);
            }

        }

        for (int i = 0; i < areaPoint.length; i++) {
            for (int j = 0; j < areaPoint.length; j++) {
//                System.out.println(String.format("%d - %d",i,j));
                checkArea(areaPoint[i],areaPoint[j],fpRowColArea[2],sudoku);
                if(Arrays.stream(fpRowColArea[2]).anyMatch(bool-> bool == false)){
                    return 0;
                }
                Arrays.fill(fpRowColArea[2],false);
            }
        }

        return 1;

    }

    public static void checkArea(int rowPoint, int colPoint, Boolean[] fpArea, int[][] sudoku){

        for (int i = rowPoint; i <= rowPoint+2; i++) {
            for (int j = colPoint; j <= colPoint+2; j++) {
                fpArea[(sudoku[i][j] - 1)] = true;
            }
        }

    }

}

