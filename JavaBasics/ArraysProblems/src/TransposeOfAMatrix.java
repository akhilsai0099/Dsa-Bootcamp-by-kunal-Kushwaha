import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int[] ints : transpose) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
