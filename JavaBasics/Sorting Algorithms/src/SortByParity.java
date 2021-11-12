import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {3,5,7,10,12,14};
        System.out.println(Arrays.toString((sortArrayByParityII(nums))));
    }

    static int[] sortArrayByParity(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]%2 == 0){
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
        return nums;
    }

    static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i<nums.length){
            if (nums[i]%2 != 0){
                while(j<nums.length){
                    if(nums[j]%2 != 1){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    j+= 2;
                }

            }
            i+= 2;
        }
        return nums;
    }
}
