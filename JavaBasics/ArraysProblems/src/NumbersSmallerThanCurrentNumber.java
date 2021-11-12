import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        // Creating an array for the frequency of the numbers;
        int[] frequency = new int[101];
        for (int num: nums){
            frequency[num]++;
        }
        // adding the frequencies so that we can get the smaller numbers than current;
        int sum =0;
        int[] prevsum = new int[101];
        for (int i = 0; i < 101; i++) {
            prevsum[i]  = sum;
            sum += frequency[i];
        }
        // Creating an ans array and storing the numbers
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prevsum[nums[i]]; // Eg: nums[0] = 8; prevsum[8] = 4; so answer is four
        }

        return ans;
    }
}
