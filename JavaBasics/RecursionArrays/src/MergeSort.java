import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,1,6,7,99};
        mergeSortInplace(arr1,0,arr1.length);
        System.out.println(Arrays.toString(arr1));
    }

//    static int[] merge(int[] arr1, int[] arr2){
//        int[] merged = new int[arr1.length+ arr2.length];
//        int i = 0,j = 0,k = 0;
//        while (i <arr1.length && j < arr2.length){
//                if (arr1[i] < arr2[j]) {
//                    merged[k] = arr1[i];
//                    i++;
//                } else {
//                    merged[k] = arr2[j];
//                    j++;
//                }
//            k++;
//        }
//
//        while(i<arr1.length){
//            merged[k] = arr1[i];
//            i++;
//            k++;
//        }
//
//        while(j<arr2.length){
//            merged[k] = arr2[j];
//            j++;
//            k++;
//        }
//
//        return merged;
//    }
//
//    static int[] mergeSort(int[] arr){
//        if (arr.length == 1 ) return arr;
//
//        int mid = arr.length /2;
//        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
//        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));
//
//        return merge(left, right);
//    }
//

    static void mergeInplace(int[] arr, int start , int mid, int end){
        int[] merged = new int[end - start];
        int i = start,j = mid,k = 0;
        while (i <mid && j < end){
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            merged[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }


    }

    static void mergeSortInplace(int[] arr,int start, int end){
        if (end - start == 1) return;

        int mid = start + (end - start)/2;
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr,mid , end);

        mergeInplace(arr,start,mid,end);
    }

}
