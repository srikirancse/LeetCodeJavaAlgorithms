package Medium;

public class Q98 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer min, Integer max) {
        return root == null || !((min != null && root.val <= min) || (max != null && root.val >= max)) && helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
