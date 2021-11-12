import javax.naming.PartialResultException;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1,7,5,44,39,33,3};
        int target = 1;
        int[] range = {3,6};
        System.out.println(Search(arr,target,range));
    }

    static int Search (int[] array, int target ,int[] range){
        if (array.length == 0){
            return -1;
        }

        for (int i = range[0]; i <= range[1]; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return -1;

    }
}
