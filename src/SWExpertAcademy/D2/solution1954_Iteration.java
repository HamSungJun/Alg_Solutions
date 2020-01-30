import java.util.Scanner;

public class solution1954_Iteration {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int TestLines = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < TestLines; i++) {
            int matrixSize = sc.nextInt();
//            sc.nextLine();
            System.out.print(String.format("#%d\n%s",(i+1),printSnail(matrixSize)));
        }

    }

    public static String printSnail(int matrixSize){

        String movingState = "E";
        Object[][] snailMatrix = new Object[matrixSize][matrixSize];
        int acc = 1;
        int row = 0;
        int col = 0;

        snailMatrix[row][col] = acc++;

        while(acc <= (int)Math.pow(matrixSize,2)){

            if(movingState.equals("E")){
                if(isNullPos(snailMatrix,row,col+1)){
                    snailMatrix[row][++col] = acc++;
                } else {
                    movingState = "S";
                }
            } else if(movingState.equals("S")){
                if(isNullPos(snailMatrix,row+1,col)){
                    snailMatrix[++row][col] = acc++;
                } else {
                    movingState = "W";
                }
            } else if(movingState.equals("W")){
                if(isNullPos(snailMatrix,row,col-1)){
                    snailMatrix[row][--col] = acc++;
                } else {
                    movingState = "N";
                }
            } else if(movingState.equals("N")){
                if (isNullPos(snailMatrix,row-1,col)){
                    snailMatrix[--row][col] = acc++;
                } else {
                    movingState = "E";
                }
            }

        }

        StringBuilder sBuf = new StringBuilder();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                sBuf.append(snailMatrix[i][j]).append(j == matrixSize - 1 ? "\n" : " ");
            }
        }

        return sBuf.toString();

    }

    public static boolean isNullPos(Object[][] matrix, int row, int col){

        boolean isNull = false;

        try{
            if(matrix[row][col] == null){
                isNull = true;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            isNull = false;
        }

        return isNull;

    }

}
