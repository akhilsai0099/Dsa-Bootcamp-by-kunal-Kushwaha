public class SumSetXorSum {
    static int ans = 0;
    public static void main(String[] args) {
        int[] nums = {1,3};
        subsetXORSumHelper(nums, 0, 0);
        System.out.println(ans);
    }

    static void subsetXORSumHelper(int[] nums, int start, int xor) {
        ans += xor;
        if (start == nums.length) {
            return;  // base case
        }
        for (int i = start; i < nums.length; i++) {
            xor ^= nums[i];         // updating xor while using every number of subset
            subsetXORSumHelper(nums, i + 1, xor);
            xor ^= nums[i];        // undoing xor once the number is used.
        }
    }
}
