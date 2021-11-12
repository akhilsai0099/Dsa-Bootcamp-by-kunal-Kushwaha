// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon interview Question

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        sort(arr);
        System.out.println(arr[arr.length-1]);

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
