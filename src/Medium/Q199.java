package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 4/25/2017.
 */
public class Q199 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return list;
    }

    private void helper(TreeNode root, int i) {
        if (root == null) return;
        if (list.size() < i+1) list.add(root.val);
        else list.set(i, root.val);
        helper(root.left, i+1);
        helper(root.right, i+1);
    }
}
