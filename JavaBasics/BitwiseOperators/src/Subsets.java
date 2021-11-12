import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        subsetsWithDup(nums);
    }

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        subsetHelper(nums,0, new ArrayList<>(), subset );
        return subset;
    }

    static void subsetHelper(int[] nums, int start, List<Integer> curr, List<List<Integer>> ans) {
        //base pending
        boolean flag = false;
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
            if ((ans.get(i) == new ArrayList<>(curr))) flag = true; break;
        }

        if (!flag) ans.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            subsetHelper(nums,i+1, curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}
