import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumTriangle(arr);
    }

    static void sumTriangle(int[] arr){
        if (arr.length <1 ) return;
        int[] recurarr = new int[arr.length-1];
        for (int i = 0; i < recurarr.length; i++) {
            recurarr[i] = arr[i] + arr[i+1];
        }

        sumTriangle(recurarr);
        System.out.println(Arrays.toString(arr));
    }
}
