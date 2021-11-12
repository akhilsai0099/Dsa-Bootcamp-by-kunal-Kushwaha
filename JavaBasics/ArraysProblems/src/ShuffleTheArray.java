import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr,n)));

    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int pt1 = 0,pt2 = n;
        int i = 0;
        while(pt1<= n && pt2 < 2*n){
            if (i%2 == 0){
                ans[i] = nums[pt1];
                pt1++;
            }
            else{
                ans[i] = nums[pt2];
                pt2++;
            }
            i++;
        }
        return ans;
    }
}

