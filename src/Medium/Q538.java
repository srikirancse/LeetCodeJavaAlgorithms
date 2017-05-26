package Medium;

/**
 * Created by Srikiran Sistla on 5/9/2017.
 * Convert BST to Greater Tree
 */
public class Q538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val += sum;
        sum+=root.val;
        convertBST(root.left);
        return root;
    }
}
