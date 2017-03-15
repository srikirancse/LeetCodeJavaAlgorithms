package Easy;

/**
 * Created by Srikiran Sistla on 3/5/2017.
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : helper(root, 1);
    }

    private int helper(TreeNode root, int i) {
        if (root == null) return i;
        else{
            i++;
            return Math.max(helper(root.left, i), helper(root.right, i));
        }
    }
}
