public class FirstandLastOccurances {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,228,22,7};
        int key = 3;
        int start = search(arr,key,true);
        int end = search(arr, key , false);
        System.out.println(start+" "+ end);
    }

    static int search(int[] nums, int target,boolean isFirstIndex){
        int start = 0, end = nums.length-1;
        int ans  =-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (nums[mid] > target){
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else{
                ans = mid;
                if (isFirstIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;

    }
}
