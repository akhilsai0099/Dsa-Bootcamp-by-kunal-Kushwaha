import java.util.Arrays;

public class ReverseStrin {
    public static void main(String[] args) {
        char[] arr = {'h','a','n','n','a','a'};
        reverseString(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseString(char[] arr, int n ){
        if (n == arr.length/2) return;
        char temp = arr[n];
        arr[n] = arr[arr.length - n -1];
        arr[arr.length - n -1] = temp;
        reverseString(arr,n+1);
    }
}
