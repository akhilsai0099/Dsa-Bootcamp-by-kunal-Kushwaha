public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }

    static int diagonalSum(int[][] mat) {
        int Psum = 0;
        int Ssum = 0;
        for (int i = 0; i < mat.length; i++) {
            Psum+= mat[i][i];
            Ssum += mat[i][mat.length-i-1];
        }

        if (mat.length %2 != 0){
            Ssum -= mat[mat.length / 2][mat.length / 2];
        }
        return (Psum+Ssum);
    }
}
