package Easy;

/**
 * Created by Srikiran Sistla on 2/11/2017.
 */


public class Q513 {
    int ans = 0;
    int depth = 0;
    int maxDepth = 0;

    public int findLeftMostNode(TreeNode root) {
        depth++;
        if (root.left == null && root.right == null && depth == 1) return root.val;
        if (root.left == null && root.right == null && depth > maxDepth) {
            maxDepth = depth;
            ans = root.val;
            depth--;
            return 0;
        }
        if (root.left != null) findLeftMostNode(root.left);
        if (root.right != null) findLeftMostNode(root.right);
        depth--;
        return ans;
    }
}
