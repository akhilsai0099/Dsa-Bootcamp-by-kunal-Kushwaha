public class NegativeNumbersinMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,-1},{-1,-1}};
        System.out.println(countNegatives(arr));
    }
    static int countNegatives(int[][] arr) {
        int counter =0;
        int sum =0;
        for(int[] num : arr){
            int ans = search(num);

            if(ans == -1){
                sum =0;
            }else{
                sum = num.length - ans;

            }
            counter += sum;
        }

        return counter;
    }

    static int search(int[] arr){
        int ans=-1;
        int start = 0, end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (arr[mid] < 0){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
