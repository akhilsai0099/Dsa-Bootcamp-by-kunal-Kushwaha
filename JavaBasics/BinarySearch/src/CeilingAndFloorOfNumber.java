public class CeilingAndFloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,11,12};
        int target = 1;
        System.out.println(floor(arr,target));
    }

    static int ceiling( int[] arr , int target){
        int start = 0, end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (arr[mid] > target){
                end = mid-1;

            }
            else if (arr[mid] < target){
                start = mid+1;

            }
            else{
                // answer found;
                return mid;
            }
        }
        return start;
    }

    static int floor( int[] arr , int target){
        int start = 0, end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (arr[mid] > target){
                end = mid-1;

            }
            else if (arr[mid] < target){
                start = mid+1;

            }
            else{
                // answer found;
                return mid;
            }
        }
        return end;

    }
}
