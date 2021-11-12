import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
// Amazon Interview question

public class AllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> answer = new ArrayList<Integer>();
        sort(arr);
        for(int i=0 ; i<arr.length; i++ ){
            if(arr[i]-1 != i){
                answer.add(i+1);
            }
        }
        System.out.println(answer);
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
