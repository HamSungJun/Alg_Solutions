import java.util.Scanner;

public class solution1954_Recursive {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {

            int matrixSize = sc.nextInt();
//            sc.nextLine();
            Object [][] matrix = new Object[matrixSize][matrixSize];
            drawSnail(matrix,0,0,1,"EAST");
            System.out.print(String.format("#%d\n%s",(i+1),show2DMatrix(matrix)));

        }

    }

    public static Object[][] drawSnail(Object[][] matrix, int row, int col, int acc, String movingState){

        if(acc > (int)Math.pow(matrix[0].length,2)){

            return matrix;

        }

        matrix[row][col] = acc++;

        if(movingState.equals("EAST")){
            if(hasEmpty(matrix,row,col+1)){
                return drawSnail(matrix, row, col+1, acc, movingState);
            } else {
                return drawSnail(matrix, row+1, col, acc, "SOUTH");
            }
        } else if (movingState.equals("SOUTH")) {
            if(hasEmpty(matrix,row+1,col)){
                return drawSnail(matrix, row+1, col, acc, movingState);
            }
            else {
                return drawSnail(matrix, row, col-1, acc, "WEST");
            }
        } else if (movingState.equals("WEST")) {
            if(hasEmpty(matrix,row,col-1)){
                return drawSnail(matrix, row, col-1, acc, movingState);
            }
            else {
                return drawSnail(matrix, row-1, col, acc, "NORTH");
            }
        } else if (movingState.equals("NORTH")){
            if(hasEmpty(matrix,row-1,col)){
                return drawSnail(matrix, row-1, col, acc, movingState);
            }
            else {
                return drawSnail(matrix, row, col+1, acc, "EAST");
            }
        }

        return matrix;

    }

    public static boolean hasEmpty(Object[][] matrix, int row, int col){

        boolean result = false;

        try{
            if(matrix[row][col] == null){
                result = true;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            result = false;
        }

        return result;

    }

    public static String show2DMatrix(Object[][] matrix){

        StringBuilder sBuf = new StringBuilder();

        for (int i = 0; i < matrix[0].length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                sBuf.append(matrix[i][j]).append(j == matrix[0].length - 1 ? "\n" : " ");

            }

        }

        return sBuf.toString();

    }

}
