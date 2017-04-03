package Easy;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || !(p == null || q == null) && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
