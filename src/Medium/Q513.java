package Medium;

/**
 * Created by Srikiran Sistla on 4/22/2017.
 * Leftmost element of a binary tree
 */
public class Q513 {
    int ans = 0, max = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root,0);
        return ans;
    }

    private int helper(TreeNode root, int i) {
        if (root == null) return i;
        if (root.right == null && root.left == null) {
            i++;
            if (i > max){
                max = i;
                ans = root.val;
            }
            return i;
        }
        i++;
        helper(root.left, i);
        helper(root.right, i);
        return i;
    }
}
