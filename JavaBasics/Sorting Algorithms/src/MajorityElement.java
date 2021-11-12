import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int maxCount = 0;
        int current = 1;
        int ans = 0;
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                current ++;
            }
            else{
                if (current > maxCount){
                    maxCount = current;
                    ans = arr[i];
                    current = 1;
                }
                current = 1;
            }
        }
        System.out.println(ans);
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 -i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,last, maxIndex);
        }
    }

    private static int getMaxIndex(int[] arr,int start ,int last) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = start  ; i <= last; i++) {
            if (arr[i]> max){
                max = arr[i];
                index = i;
            }
        }
        return index;

    }

    static void swap(int[] arr, int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
