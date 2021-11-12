import java.util.Arrays;


public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int target = 0;
        System.out.println(threeSumClosest(arr, target));
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans  = target <= 0 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1;
            int r = nums.length-1;
            while(r>l){
                int sum = nums[i]+ nums[l]+ nums[r];
                if (sum == target){
                    l++;
                    r--;
                    return sum;
                }
                else if (sum<target && target >0) {
                    ans = Integer.max(sum, ans);
                    l++;
                }
                else if (sum > target && target >0){
                    ans = Integer.max(sum, ans);
                    r--;
                }
                else if(sum < target && target < 0){
                    ans = Integer.min(sum, ans);
                    l++;
                }
                else{
                    ans = Integer.min(sum, ans);
                    r--;
                }
            }
        }
        return ans;
    }
}
