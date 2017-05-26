package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 4/22/2017.
 * Find Largest Value in Each Tree Row
 */
public class Q515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res, int index) {
        if (root == null) return;
        else if (res.size() < index+1) res.add(index, root.val);
        else if (root.val > res.get(index)) res.add(index, root.val);
        helper(root.left, res, index+1);
        helper(root.right, res, index+1);
    }
}
