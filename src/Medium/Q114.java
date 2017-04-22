package Medium;

/**
 * Created by Srikiran Sistla on 4/18/2017.
 * Flatten Binary tree
 */
public class Q114 {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
