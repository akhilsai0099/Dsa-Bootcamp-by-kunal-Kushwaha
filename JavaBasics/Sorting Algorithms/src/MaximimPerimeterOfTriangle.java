import java.util.Arrays;

public class MaximimPerimeterOfTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println((largestPerimeter(nums)));
    }

    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i <= (nums.length - 3); i++) {
            if (isTrianglePossible(nums[i],nums[i+1],nums[i+2] )){
                currentSum = nums[i]+nums[i+1]+nums[i+2];
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
    static boolean isTrianglePossible(int side1, int side2, int side3){
        if (side1+side2 > side3 && side2+ side3 > side1 && side1+side3> side2){
            return true;
        }
        return false;
    }
}
