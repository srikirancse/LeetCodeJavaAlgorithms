package Medium;

/**
 * Created by Srikiran Sistla on 4/27/2017.
 * Count number of nodes in complete binary tree
 */
public class Q222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == rightHeight) return (1<<leftHeight) + countNodes(root.left);
        else return (1<<rightHeight) + countNodes(root.right);
    }
    int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + height(root.left);
    }

    public static void main(String[] args) {
        System.out.println(1<<6);
    }
}
