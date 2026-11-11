package arrays_strings;

import java.util.Arrays;

public class MatrixAndOperations {
    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // Transpose of matrix
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        System.out.println(Arrays.deepToString(mat));
    }
}
