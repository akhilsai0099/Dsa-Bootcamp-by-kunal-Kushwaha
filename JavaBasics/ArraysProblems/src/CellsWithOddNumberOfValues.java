public class CellsWithOddNumberOfValues {
    public static void main(String[] args) {
        int m= 2,n=3;
        int[][] indices  = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int [m][n];
        for(int i = 0 ; i < indices.length;i++){
            int rowNum = indices[i][0];
            int columnNum = indices[i][1];

            int[] row = result[rowNum];
            for(int j = 0; j < row.length;j++){
                row[j] += 1;
            }
            for(int k = 0; k < m;k++){
                result[k][columnNum] += 1;

            }



        }
        int counter = 0;
        for(int i = 0; i < result.length; i++){
            for(int k = 0; k < result[i].length;k++){
                if(result[i][k] % 2 != 0){
                    counter++;
                }
            }
        }
        return counter;
    }



}
