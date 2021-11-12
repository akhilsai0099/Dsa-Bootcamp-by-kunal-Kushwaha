import java.util.Arrays;

public class ArrayBuildFromPermutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[temp[i]] ;
        }
        return nums;
    }
}
