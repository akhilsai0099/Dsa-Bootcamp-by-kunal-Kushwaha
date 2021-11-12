public class RecursionBasics {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        int target = 78;
        System.out.println(binarySearchWithRecursion(arr, start, end, target));
    }

    static void printnum(int n ){
        System.out.println(n);
        if (n<5) printnum(n+1);
    }
    static int fibonacci(int n){

        if (n<2) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int binarySearchWithRecursion(int[] arr, int start, int end, int target){
        if (start > end ) return -1;


        int mid = end - (end - start )/2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearchWithRecursion(arr, mid+1, end, target);
        else return binarySearchWithRecursion(arr, start, mid-1, target);


    }
}
