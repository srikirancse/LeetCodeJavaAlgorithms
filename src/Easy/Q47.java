package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 2/17/2017.
 */
public class Q47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        backtrack(list, tempList, nums, new boolean[nums.length]);

        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, new boolean[nums.length]);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Q47 q47 = new Q47();
        System.out.println(q47.permuteUnique(new int[] {1,1,2}).toString());
    }
}
