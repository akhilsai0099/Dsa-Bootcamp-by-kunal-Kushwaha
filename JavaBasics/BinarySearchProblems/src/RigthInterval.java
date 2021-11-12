import java.util.Arrays;

public class RigthInterval {
    public static void main(String[] args) {
        int[][] arr = {{3,4},{2,3},{1,2} };
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];

        for(int i = 0; i< intervals.length ;i++){
            int temp = Integer.MAX_VALUE;

            for(int j = 0; j < intervals.length ;j++){
                if(intervals[i][1] <= intervals[j][0]){
                    if (intervals[j][0]<=temp){
                        temp = intervals[j][0];
                        ans[i] = j;
                    }
                }

            }if(temp == Integer.MAX_VALUE){
                ans[i] = -1;
            }
        }
        return ans;
    }
}
