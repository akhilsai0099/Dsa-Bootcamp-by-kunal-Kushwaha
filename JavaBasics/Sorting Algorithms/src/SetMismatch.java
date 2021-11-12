import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
// Amazon Question;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        sort(nums);
        int[] ans = new int[2];
        int i = 0;
        while(i<nums.length){
            int current = nums[i] -1;
            if(i != current){
                ans[0] = nums[i];
                ans[1] = i+1;
                break;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static void sort (int[] arr){
        int i = 0;
        while (i < arr.length){
            if (i != arr[i]-1){
                if (arr[arr[i]-1] == arr[i]){
                    i++;
                }
                else {
                    swap(arr, i, arr[i] - 1);
                }
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
