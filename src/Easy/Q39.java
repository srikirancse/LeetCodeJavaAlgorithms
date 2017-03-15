package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 2/17/2017.
 */
public class Q39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        int sum = 0;
        backtrack(list, new ArrayList<>(), candidates, target, sum, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> objects, int[] candidates, int target, int sum, int index) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            list.add(new ArrayList<>(objects));
        }
        for (int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            objects.add(candidates[i]);
            backtrack(list, objects, candidates, target, sum, i);
            sum -= candidates[i];
            objects.remove(objects.size() - 1);
        }
    }
}
