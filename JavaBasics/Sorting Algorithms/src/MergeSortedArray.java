import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        for (int i = 0; i < nums2.length; i++) {
            nums1[i+m] = nums2[i];
        }
        insertionSort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    static void swap(int[] arr, int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i+1;
            while ((j>0) && (j < arr.length)){
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                    j--;
                }
                else{
                    break;
                }

            }
        }
        return arr;
    }
}
