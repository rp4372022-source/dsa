package arrays_strings;

public class A48_RotateImage {
    // rotate (clockwise)-> take transpose + reverse the rows
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int left = 0;
            int right = matrix[i].length-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;

        int x = 0;
        int y = 0;
    }
}
// rotate (anticlockwise)-> reverse the rows + take transpose
