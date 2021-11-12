import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int [] nums = {1,2,2,5,3,5};
        sort(nums);
        int count = 1;
        boolean flag = true;

        for (int i = nums.length -1; i >0; i--) {
            if (nums[i] != nums[i-1]){
                count ++ ;
            }
            if (count== 3){
                System.out.println(nums[i-1]);
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(nums[nums.length-1]);
        }
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while(j>0 && j<arr.length ){
                if (arr[j]< arr[j-1]){
                    swap(arr, j,j-1);
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
