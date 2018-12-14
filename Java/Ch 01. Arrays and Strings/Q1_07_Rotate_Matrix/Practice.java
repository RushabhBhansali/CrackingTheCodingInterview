package Q1_07_Rotate_Matrix;

import CtCILibrary.AssortedMethods;

public class Practice {
    public static boolean rotate(int[][] matrix) {
        if(matrix.length <=1) return true;

        //flippig the matrix along the row
        int rl = matrix.length/2;

        for(int r = 0; r<=rl; r++){
            int cr = matrix.length-1-r;
            for(int c = 0; c<=matrix[0].length-1; c++){
                int temp = matrix[cr][c];
                matrix[cr][c] = matrix[r][c];
                matrix[r][c] = temp;
            }
        }

        //matrix transpose
        for(int i=0; i<=matrix.length-1; i++){
            for(int j = 0; j<=matrix[0].length-1; j++){
                if(j>i){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
        AssortedMethods.printMatrix(matrix);
        rotate(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
