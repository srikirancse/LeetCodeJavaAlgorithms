package Easy;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
