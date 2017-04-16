package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 4/3/2017.
 */
public class Q46 {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(res, tempList, num);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] num) {
        if (tempList.size() == num.length) res.add(new ArrayList<>(tempList));
        else {
            for (int n : num){
                if (tempList.contains(n)) continue;
                tempList.add(n);
                backtrack(res, tempList, num);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
