import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MatrixcolInDistanceOrder {
    public static void main(String[] args) {
        int rows = 1, cols = 2, rCenter = 0, cCenter = 0;
        System.out.println(Arrays.toString((allCellsDistOrder(rows,cols,rCenter,cCenter))));
    }

    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int dist = Math.abs(rCenter - i) + Math.abs(cCenter - j);
                if (map.containsKey(dist) == false){
                    ArrayList<String> list = new ArrayList<>();
                    list.add(i + "#" + j);
                    map.put(dist, list);
                }
                else{
                    ArrayList<String> list=map.get(dist);
                    list.add(i + "#" + j);
                }
            }
        }
        
        int k = 0;
        for (int dist : map.keySet()) {
            for (int i = 0; i < ans.length; i++) {
                String[] parts = map.get(dist).get(i).split("#");
                ans[k][0] = Integer.parseInt(parts[0]);
                ans[k][1] = Integer.parseInt(parts[1]);
                k++;
            }
        }
        return ans;
    }
}