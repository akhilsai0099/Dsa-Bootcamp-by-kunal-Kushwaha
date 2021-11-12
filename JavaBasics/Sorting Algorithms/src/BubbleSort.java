import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i;   j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    static int[] bubbleSortInWhile(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            int j = 1;
            while (j< arr.length-i){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = false;
                }
                j++;
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 -i;
            int maxIndex = getMaxIndex(arr,0,last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
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
    // Insertion sort
    // used for smaller for smaller value of n
    // good for sorting partially sorted arrays
    // Mostly used in hybrid sorting algorithms

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


    // When numbers are given in a range (0, n) then use cycleSort
    static int[] cyclicSort(int[] arr){
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

        return arr;
    }
}
