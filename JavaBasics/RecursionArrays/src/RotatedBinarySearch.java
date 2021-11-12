public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(rotatedBinarySearch(arr,0,arr.length,4));
    }

    static int rotatedBinarySearch(int[] arr,int start, int end, int target){
        int mid = start + (end - start)/2;

        if (start > end ) return -1;

        if (arr[mid] == target) return mid;

        if (arr[start ] < arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return rotatedBinarySearch(arr, start, mid-1, target);
            }
            else return rotatedBinarySearch(arr, mid+1, end, target);
        }

        if (target >= arr[mid] && target<= arr[end]){
            return rotatedBinarySearch(arr,mid+1 , end , target);
        }
        return rotatedBinarySearch(arr, start, mid-1, target);
    }
}
