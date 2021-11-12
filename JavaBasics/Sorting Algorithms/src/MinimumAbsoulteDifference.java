import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoulteDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));

    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minimum = Integer.MAX_VALUE;
        int[] possible = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            possible[i-1] = arr[i] - arr[i-1];
            minimum = Integer.min(minimum, arr[i] - arr[i-1]);
        }
        for (int i = 0; i < possible.length; i++) {
            if (possible[i] == minimum){
                List<Integer> sublist = new ArrayList<>();
                sublist.add(arr[i]);
                sublist.add(arr[i+1]);
                list.add(sublist);
            }
        }
        return list;
    }
}
