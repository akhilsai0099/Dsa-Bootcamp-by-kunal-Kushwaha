public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 7;
        System.out.println(search(arr,key));
    }

    static int search(int[] arr, int key){
        int start = 0, end = arr.length-1;
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
}
