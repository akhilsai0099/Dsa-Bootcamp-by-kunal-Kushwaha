import java.util.Arrays;

public class DoubleofN {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        int div = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                div = arr[i] /2;
                if(search(arr, div) != -1){
                    return true;
                }
            }
        }
        return false;
    }

    static int search(int[] nums, int n){
        if(n==0)
        {
            int count = 0;
            for(int i=0; i<nums.length; i++)
            {
                if (nums[i] == 0)
                {
                    count++;
                }
            }
            if(count <= 1)
            {return -1;}
        }
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
}
