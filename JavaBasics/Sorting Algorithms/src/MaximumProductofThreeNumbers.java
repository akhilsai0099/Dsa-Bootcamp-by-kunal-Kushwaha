import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {-5,-4,1,3,7};
        maximumProduct(arr);
    }

    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sumFirst = 1;
        int sumLast = 1;
        int j = 0;
        for(int i=nums.length-1; i>=nums.length-3; i--){

            sumLast*=nums[i];
            if(j<=1){
                sumFirst*=nums[j++];
            }
        }
        sumFirst *= nums[nums.length-1];



        return sumFirst >= sumLast ? sumFirst:sumLast;
    }
}
