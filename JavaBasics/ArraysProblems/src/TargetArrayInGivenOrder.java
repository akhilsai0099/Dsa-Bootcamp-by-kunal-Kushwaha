import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] indices = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums,indices)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (result[index[i]] != 0){
                for (int j = nums.length-1; j >index[i]; j--) {
                    result[j] = result[j -1];
                }
                result[index[i]] = nums[i];
            }
            else{
                result[index[i]] = nums[i];
            }
        }
        return result;
    }

        static int[] createTargetArrayusingArraylist(int[] nums, int[] index) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }

}
