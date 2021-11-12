public class FirstandLastOccurancesInfiniteArrays {
    public static void main(String[] args) {
        int[] arr = {-5,2,3,5,9,10,12,14,15,16,17,18,19,20,21,22};
        int key = -5;
        System.out.println(ans(arr, key));

    }

    static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end +1;
            end = end + (end - start +1)*2;
            start = newStart;
        }
        return search(nums, target,start,end);
    }
    static int search(int[] nums, int target,int start, int end){
        while(start<= end){
            int mid = start +(end - start )/2;
            if (nums[mid] > target){
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else{
                return mid;
                }
            }

        return -1;
    }

    }

