public class isSorted {
    public static void main(String[] args) {
        int[] arr = {20,20,78,98,99};
        int n = 0;
        System.out.println(isSortedRecursive(arr,n));
    }
    static boolean isSortedRecursive(int[] arr, int n){
        if (n == arr.length-1) return true;
        if (arr[n] >  arr[n+1]) return false;
        else return isSortedRecursive(arr,n+1);

    }
}
