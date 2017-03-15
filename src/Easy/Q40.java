package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 2/18/2017.
 */
public class Q40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            list.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < candidates.length; i++) {
            if (tempList.isEmpty() && i>0 && candidates[i] == candidates[i-1]) {
                continue;
            }
            tempList.add(candidates[i]);
            backtrack(list, tempList, candidates, target - candidates[i], i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
