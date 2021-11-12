import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XorsumAndsum {
    public static void main(String[] args) {
        int[] arr1 = {12};
        int[] arr2 = {4};
        System.out.println(getXORSum(arr1,arr2));
    }

    static int getXORSum(int[] arr1, int[] arr2) {
        int xorSum1 = 0, xorSum2 = 0;

        for (int val : arr1) xorSum1 ^= val;
        for (int val : arr2) xorSum2 ^= val;

        return (xorSum1 & xorSum2);
    }
}
