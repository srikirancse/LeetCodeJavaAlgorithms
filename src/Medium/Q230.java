package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 3/4/2017.
 */
public class Q230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) break;
            root = root.right;
        }
        return root.val;
    }
}
