package Medium;

/**
 * Created by Srikiran Sistla on 4/29/2017.
 * Find the inorder successor of a BST
 */
public class Q285 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (p.right!=null) return helper(p.right);
        TreeNode succ = null;

        while (root!=null){
            if (root.val <= p.val) root = root.right;
            else {
                succ = root;
                root = root.left;
            }
        }
        return succ;
    }

    private TreeNode helper(TreeNode p) {
        if (p.left==null) return p;
        return helper(p.left);
    }
}
