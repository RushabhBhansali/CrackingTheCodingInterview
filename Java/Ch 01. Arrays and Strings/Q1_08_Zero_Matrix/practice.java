package Q1_08_Zero_Matrix;

import CtCILibrary.AssortedMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static void setZeros(int[][] matrix) {
        ArrayList<Integer> zr = new ArrayList<>();
        ArrayList<Integer> zc = new ArrayList<>();

        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
                if(matrix[i][j] == 0){
                    zr.add(i);
                    zc.add(j);
                }
            }
        }

        for(Integer r: zr){
            for(int col =0;col<=matrix[0].length-1;col++){
                matrix[r][col] = 0;
            }
        }

        for(Integer c: zc){
            for(int row =0;row<=matrix.length-1;row++){
                matrix[row][c] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int nrows = 10;
        int ncols = 15;
        int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

        AssortedMethods.printMatrix(matrix);

        setZeros(matrix);

        System.out.println();

        AssortedMethods.printMatrix(matrix);
    }
}
