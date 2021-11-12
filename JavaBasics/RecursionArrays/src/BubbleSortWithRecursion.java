import java.util.Arrays;

public class BubbleSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {15,2,4,3};
        selectionSort(arr,arr.length-1,0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortWithRecursion(int[] arr, int r , int c){
        if (r == 0) return ;

        if (c < r ){

            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubbleSortWithRecursion(arr,r,c+1);
        }
        else  {
            bubbleSortWithRecursion(arr,r-1, 0);
        }

    }

    static void selectionSort(int[] arr, int r, int c,int maxIndex){
        if (r == 0) return ;

        if (c<= r ){
            if (arr[maxIndex] < arr[c]){
                maxIndex = c;
            }

            selectionSort(arr, r,c+1, maxIndex);
        }
        else{
            int temp = arr[r];
            arr[r] = arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }

}

