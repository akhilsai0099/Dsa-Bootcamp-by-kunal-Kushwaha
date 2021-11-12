import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] ans = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(ans, target));
    }

    static List<List<Integer>> combinationSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        comb(arr,0, target, new ArrayList<>(), ans);
        return ans;
    }

    static void comb (int[] candidates, int start, int target, List<Integer> cur, List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(cur));
        }
        for (int i = start; i < candidates.length; i++) {
            int cand = candidates[i];
            if (cand<= target){
                cur.add(cand);

                comb(candidates, i, target-cand,cur, res);
                cur.remove(cur.size() -1);

            }
        }
    }
}
