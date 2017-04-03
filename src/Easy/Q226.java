package Easy;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
