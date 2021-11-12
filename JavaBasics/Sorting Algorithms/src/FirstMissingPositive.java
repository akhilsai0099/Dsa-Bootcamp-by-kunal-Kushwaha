import java.net.Inet4Address;
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[]arr =  {3,4,-1,1};
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                System.out.println(index + 1);
            }
        }

        // case 2
        System.out.println(arr.length + 1);
    }

    static void swap(int[] arr, int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}
