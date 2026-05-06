package recursion;

import java.util.*;

class combinationalSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates,target,0,temp,result);

        return result;

    }

    public void solve(int[] candidates,int target,int index,List<Integer> temp, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }

            temp.add(candidates[i]);
            solve(candidates, target-candidates[i], i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}