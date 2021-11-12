// https://leetcode.com/problems/missing-number/
// Amazon Question;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {5,4,2,1,3,0};
        sort(nums);
        for(int i=0 ; i<nums.length; i++ ){
            if(nums[i] != i){
                System.out.println(i);
            }
        }
        System.out.println(nums.length);
    }

    static void sort (int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] == arr.length){
                i++;
            }
            else if (i != arr[i]){
                swap(arr,i,arr[i]);
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
