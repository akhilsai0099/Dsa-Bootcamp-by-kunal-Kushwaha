public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findingThePivot(nums);

        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if (nums[pivot] == target){
            return pivot;
        }
        if (nums[0] <= target){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }

    static int binarySearch(int[] arr, int key,int start, int end){

        while(start<= end){
            int mid = start +(end - start )/2;
            if (arr[mid] > key){
                end = mid-1;
            }
            else if (arr[mid] < key){
                start = mid+1;
            }
            else{
                // answer found;
                return mid;
            }
        }
        return -1;

    }

    static int findingThePivot(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
            if (arr[mid] <arr[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;

    }
}
