//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

public class MinMax {
    public static void main(String[] args) {
        int[] arr ={1, 4, 45, 6, -50, 10, 2};
        int n = arr.length;
        System.out.println(Fmax(arr, n));
    }

    static int Fmin(int[] arr, int n){
        if (n == 1) return arr[0];
        return Math.min(arr[n-1], Fmin(arr, n-1));
    }
    static int Fmax(int[] arr, int n){
        if (n == 1) return arr[0];
        return Math.max(arr[n-1], Fmax(arr, n-1));
    }
}
