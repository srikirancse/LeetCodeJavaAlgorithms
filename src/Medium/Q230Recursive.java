package Medium;

/**
 * Created by Srikiran Sistla on 3/4/2017.
 */
public class Q230Recursive {
    int kGlobal;
    int answer;
    boolean kFound = false;
    public int kthSmallest(TreeNode root, int k){
        kGlobal = k;
        helper(root);
        return answer;
    }

    private void helper(TreeNode root) {
        if (root != null && !kFound){
            helper(root.left);
            if (--kGlobal == 0) {
                kFound = true;
                answer = root.val;
                return;
            }
            helper(root.right);
        }

    }
}
