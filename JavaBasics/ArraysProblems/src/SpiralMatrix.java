import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rowStart = 0, rowEnd = matrix.length -1;
        int colStart = 0, colEnd = matrix[0].length -1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            if (colStart!=colEnd) {
                for (int col = colStart; col <= colEnd; col++) {
                    result.add(matrix[rowStart][col]);
                }
                rowStart++;
            }
            if (rowStart!=rowEnd) {
                for (int row = rowStart; row <= rowEnd; row++) {
                    result.add(matrix[row][colEnd]);
                }
                colEnd--;
            }
            if (colStart!=colEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    result.add(matrix[rowEnd][col]);
                }
                rowEnd--;

            }

                for (int row = rowEnd; row >= rowStart; row--) {
                    result.add(matrix[row][colStart]);
                }
                colStart++;

        }

        return result;
    }
}
