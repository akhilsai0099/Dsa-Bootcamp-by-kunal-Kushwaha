public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr =  {7,6,5,4,3,2,1};
        int key = 7;
        System.out.println(orderagnosticSearch(arr, key));
    }

    static int orderagnosticSearch(int[] arr, int key){
        int start = 0, end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start )/2;
            if (arr[mid] == key){
                // answer found;
                return mid;
            }
            if (arr[0]< arr[arr.length -1]){
                if (arr[mid] > key){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if (arr[mid] < key){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }


        }
        return -1;

    }
}
