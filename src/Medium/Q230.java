package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 3/4/2017.
 */
public class Q230 {
    int res = 0, count;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root.left != null) helper(root.left);
        count--;
        if (count == 0) res = root.val;
        if (root.right != null) helper(root.right);
    }
}
