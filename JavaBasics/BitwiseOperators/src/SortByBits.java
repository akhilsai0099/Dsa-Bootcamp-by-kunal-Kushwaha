import java.util.ArrayList;
import java.util.HashMap;

public class SortByBits {
    public static void main(String[] args) {
        System.out.println(numOfBits(7));
    }

//    static int[] sortByBits(int[] arr) {
//
//    }

    static int numOfBits(int n){
        int counter = 0;
        while(n != 0){
            counter ++;
            n = n & (n-1);
        }
        return counter;
    }

}
