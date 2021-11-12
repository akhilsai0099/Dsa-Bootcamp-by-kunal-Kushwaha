import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {

    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1;
            int r = nums.length -1;

            while(l<r){
                int ans = nums[i] + nums[l] + nums[r];
                if (ans == 0){
                    List<Integer> zeroSums =  Arrays.asList(nums[i] , nums[l] , nums[r]);
                    result.add(zeroSums);
                    l++;
                    r--;
                } else if (ans > 0) {
                    r--;
                }else{
                    l++;
                }
            }

        }
        return new ArrayList<>(result);
    }

}
