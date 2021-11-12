public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int count = 1;
        int j = 1;
        boolean isBreak = false;
        while(count< 2 && j < arr.length){
            if (arr[j] == arr[j-1] ){
                count++;
                isBreak  = true;
            }
            j++;
        }
        if (isBreak){
//            return true;
        }
//        return false;
    }

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
    static void swap(int[] arr, int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
