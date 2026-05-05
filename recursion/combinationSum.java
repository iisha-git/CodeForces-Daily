package recursion;

import java.util.*;
public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(candidates , 0 , target , temp, result);
        return result;
    }

    public void solve(int[]candidates , int index, int target, List<Integer> temp,       List<List<Integer>> result){
    if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || index == candidates.length) return;

        // TAKE
        temp.add(candidates[index]);
        solve(candidates, index, target - candidates[index], temp, result);
        temp.remove(temp.size() - 1);

        // SKIP (you missed this)
        solve(candidates, index + 1, target, temp, result);

}
}